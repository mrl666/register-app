<%@ include file="/init.jsp" %>

<portlet:resourceURL id="<%=MVCCommandNames.GET_USERS_RESOURCE%>" var="getUsersResourceURL">
    <portlet:param name="searchTerm" value="" />
</portlet:resourceURL>

<div class="container-fluid-1280">
	<p>
		<b><liferay-ui:message key="registerappbackofficeweb.caption"/></b>
	</p>
	
	<%-- search field --%>

	<div class="row">
	  <div class="col-md-8">
	    <div class="input-group mb-2">
	    <input type="text" class="form-control" id="searchInput" placeholder="Search...">
	    </div>
	  </div>
	  <div class="col-md-1 text-right">
	    <button class="btn btn-outline-primary" type="button" id="searchButton">Search</button>
	  </div>
	  <div class="col-md-1 text-right">
	    <button class="btn btn-outline-primary" type="button" id="clearButton">Clear</button>
	  </div>
	  
	<div class="col-md-2 text-right">
	  <button class="btn btn-outline-primary" type="button" id="addUserButton" data-href="/web/guest/home">Add user</button>
	</div>

	</div>
	
	<clay:management-toolbar
		disabled="${registerUserCount eq 0}"
		displayContext="${registerUsersManagementToolbarDisplayContext}"
		itemsTotal="${registerUserCount}"
		searchContainerId="registerUserEntries"
		selectable="false"
	/>	
	
	<%@ include file="/search_box.jspf" %>
	
	<%-- Search container. --%>

	<liferay-ui:search-container 
		emptyResultsMessage="no-users"
		id="registerUserEntries"
		iteratorURL="${portletURL}" 
		total="${registerUserCount}">

		<liferay-ui:search-container-results results="${registerUsers}" />

		<liferay-ui:search-container-row
			className="register.app.backend.model.RegisterUser"
			modelVar="entry">

			<%@ include file="/entry_search_columns.jspf" %>

		</liferay-ui:search-container-row>
		
		<%-- Iterator / Paging --%>

		<liferay-ui:search-iterator 
			displayStyle="${registerUsersManagementToolbarDisplayContext.getDisplayStyle()}"
			markupView="lexicon" 
		/>
	</liferay-ui:search-container>
		
</div>

<script>
	//Perform AJAX request to server resource with the search term

	$(document).ready(function() {
		$('#searchButton').click(function() {
	        var url = '${getUsersResourceURL}';
	        var urlObj = new URL(url);
	        urlObj.searchParams.set("searchTerm", $('#searchInput').val());
	        var modifiedUrl = urlObj.toString();
	        console.log(modifiedUrl);
			$.ajax({
				url : modifiedUrl,
				method : 'GET',
				success : function(data) {
					// Update the UI with the search results
					console.log('Success!');

					var registerUsers = JSON.parse(data);
					registerUsers.forEach(function(user) {

						console.log('User ID:', user.userId);
						console.log('Name:', user.name);
						console.log('National ID:', user.nationalId);
					});

					$("#registerUsersResults").attr("results", registerUsers);

					//Liferay.Util.getSearchContainer("registerUserEntries").refresh();
				}
			});
		});
	});

	$(document).ready(function() {
		
		$('#addUserButton').click(function() {
			var href = $(this).data('href');
			if (href) {
				window.location.href = href;
			}
		});
		
	    $('#clearButton').on('click', function() {
	        $('#searchInput').val('');
	    });
	});
</script>