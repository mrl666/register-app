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
	
<%-- 	<%@ include file="/search_box.jspf" %> --%>
	
	<%-- Search container. --%>

	<liferay-ui:search-container 
		delta="5"
		deltaConfigurable="true"
		emptyResultsMessage="no-users"
		id="registerUserEntries"
		iteratorURL="${portletURL}" 
		total="${registerUserCount}"
		rowChecker="<%=new RowChecker(renderResponse) %>">

		<liferay-ui:search-container-results results="${registerUsers}" />

		<liferay-ui:search-container-row
			keyProperty = "registerUserId"
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

<aui:script>
	//AJAX request to server resource with the search term
	$(document).ready(function() {
		$('#searchButton').click(function() {
	        var url = '${getUsersResourceURL}';
	        var urlObj = new URL(url);
	        urlObj.searchParams.set("searchTerm", $('#searchInput').val());
	        var modifiedUrl = urlObj.toString();
			$.ajax({
				url : modifiedUrl,
				method : 'GET',
				success : function(data) {
					// Update the UI with the search results
					var registerUsers = JSON.parse(data);

					$("#registerUsersResults").attr("results", registerUsers);

					//Liferay.Util.getSearchContainer("registerUserEntries").refresh();
					$('#_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries').html('');

					var header = `<div id="_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries" class="yui3-widget component searchcontainer">
					    <div id="_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntriesSearchContainer" class="searchcontainer-content">
					        <div class="table-responsive">
					            <table class="show-quick-actions-on-hover table table-autofit table-heading-nowrap table-list" data-searchcontainerid="_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries">
					                <thead>
					                    <tr>
					                        <th class="lfr-name-column content-column name-column title-column" id="_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries_col-name">Name</th>
					                        <th class="lfr-surname-column content-column description-column" id="_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries_col-surname">Surname</th>
					                        <th class="lfr-lastname-column content-column description-column" id="_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries_col-lastname">Lastname</th>
					                        <th class="lfr-email-column content-column email-column" id="_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries_col-email">Email</th>
					                        <th class="lfr-nationalid-column content-column description-column" id="_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries_col-nationalid">NationalId</th>
					                        <th class="lfr-description-column content-column description-column" id="_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries_col-description">Description</th>
					                        <th class="lfr-author-column content-column author-column" id="_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries_col-author">Author</th>
					                        <th class="lfr-create-date-column create-date-column text-column" id="_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries_col-create-date">Create Date</th>
					                        <th class="lfr-entry-action-column entry-action-column" id="_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries_col-9">&nbsp;</th>
					                    </tr>
					                </thead>
					                <tbody>`;
					                
					var rows = '';					                
					registerUsers.forEach(function(registerUser) {
	                   rows = rows + generateUserRow(registerUser);
	                });

					var footer = `</tbody>
			            </table>
				        </div>
				    </div>
				</div><div class="taglib-search-iterator-page-iterator-bottom">
					    <div class="pagination-bar" data-qa-id="paginator" id="_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntriesPageIteratorBottom">

					        <div class="dropdown pagination-items-per-page">
					            <a class="dropdown-toggle page-link" data-toggle="liferay-dropdown" href="javascript:;" role="button">20 Entries <span class="sr-only">Per Page</span> <span id="ffek____"><svg aria-hidden="true" class="lexicon-icon lexicon-icon-caret-double-l" focusable="false"><use href="http://localhost:8080/o/classic-theme/images/clay/icons.svg#caret-double-l"></use></svg></span>
					            </a>
					            <ul class="dropdown-menu dropdown-menu-top">
					                <li><a class="dropdown-icon" href="http://localhost:8080/web/guest/back-office?p_p_id=register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl&amp;p_p_lifecycle=0&amp;p_p_state=normal&amp;p_p_mode=view&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_cur=1&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_resetCur=false&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_delta=4" onclick=""> 4 <span class="sr-only">Entries per Page</span>
					                </a></li>
					                <li><a class="dropdown-icon" href="http://localhost:8080/web/guest/back-office?p_p_id=register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl&amp;p_p_lifecycle=0&amp;p_p_state=normal&amp;p_p_mode=view&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_cur=1&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_resetCur=false&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_delta=8" onclick=""> 8 <span class="sr-only">Entries per Page</span>
					                </a></li>
					                <li><a class="dropdown-icon" href="http://localhost:8080/web/guest/back-office?p_p_id=register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl&amp;p_p_lifecycle=0&amp;p_p_state=normal&amp;p_p_mode=view&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_cur=1&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_resetCur=false&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_delta=20" onclick=""> 20 <span class="sr-only">Entries per Page</span>
					                </a></li>
					                <li><a class="dropdown-icon" href="http://localhost:8080/web/guest/back-office?p_p_id=register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl&amp;p_p_lifecycle=0&amp;p_p_state=normal&amp;p_p_mode=view&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_cur=1&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_resetCur=false&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_delta=40" onclick=""> 40 <span class="sr-only">Entries per Page</span>
					                </a></li>
					                <li><a class="dropdown-icon" href="http://localhost:8080/web/guest/back-office?p_p_id=register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl&amp;p_p_lifecycle=0&amp;p_p_state=normal&amp;p_p_mode=view&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_cur=1&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_resetCur=false&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_delta=60" onclick=""> 60 <span class="sr-only">Entries per Page</span>
					                </a></li>
					            </ul>
					        </div>

					        <p class="pagination-results">Showing 1 to 6 of 6 entries.</p>

					        <ul class="pagination">
					            <li class="page-item disabled"><a class="page-link" href="javascript:;" onclick=""> <span class=" lfr-portal-tooltip" title="Previous Page"> <span id="qcss____"><svg aria-hidden="true" class="lexicon-icon lexicon-icon-angle-left" focusable="false"><use href="http://localhost:8080/o/classic-theme/images/clay/icons.svg#angle-left"></use></svg></span> <span class="taglib-text hide-accessible">Previous Page</span>
					            </span>
					            </a></li>
					            <li class="page-item active"><a class="page-link" href="http://localhost:8080/web/guest/back-office?p_p_id=register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl&amp;p_p_lifecycle=0&amp;p_p_state=normal&amp;p_p_mode=view&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_resetCur=false&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_delta=20&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_cur=1" onclick=""><span class="sr-only">Page</span>1</a></li>
					            <li class="page-item disabled"><a class="page-link" href="javascript:;" onclick=""> <span class=" lfr-portal-tooltip" title="Next Page"> <span id="ztie____"><svg aria-hidden="true" class="lexicon-icon lexicon-icon-angle-right" focusable="false"><use href="http://localhost:8080/o/classic-theme/images/clay/icons.svg#angle-right"></use></svg></span> <span class="taglib-text hide-accessible">Next Page</span>
					            </span>
					            </a></li>
					        </ul>
					    </div>
					</div>

					</div>
					</div>`;
								
					$('#_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries').html(header + rows + footer);
					//AUI().one('#_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries').hmtl(header + rows + footer);					
				} 
			});
		});
	});
	
	// Function to generate HTML row for a user
	function generateUserRow(user) {
	    var html = '<tr class="" data-qa-id="row">';
	    html += '<td class="content-column name-column title-column lfr-name-column" colspan="1">' + user.name + '</td>';
	    html += '<td class="content-column description-column lfr-surname-column" colspan="1">' + user.surname + '</td>';
	    html += '<td class="content-column description-column lfr-lastname-column" colspan="1">' + user.lastname + '</td>';
	    html += '<td class="content-column email-column lfr-email-column" colspan="1">' + user.email + '</td>';
	    html += '<td class="content-column description-column lfr-nationalid-column" colspan="1">' + user.nationalId + '</td>';
	    html += '<td class="content-column description-column lfr-description-column" colspan="1">' + user.description + '</td>';
	    html += '<td class="content-column author-column lfr-author-column" colspan="1">';
	    html += '<div class="user-info">';
	    html += '<span class="sticker sticker-circle sticker-light user-icon-color-7 content-column author-column"><span class="inline-item"><svg class="lexicon-icon"><use href="http://localhost:8080/o/classic-theme/images/clay/icons.svg#user"></use></svg></span></span>';
	    html += '<div class="user-details">';
	    html += '<div class="user-name"></div>';
	    html += '</div>';
	    html += '</div>';
	    html += '</td>';
	    html += '<td class="create-date-column text-column lfr-create-date-column" colspan="1"><span class="lfr-portal-tooltip" title="' + user.createDate + '">1 Day Ago</span></td>';
	    html += '<td class="entry-action-column lfr-entry-action-column" colspan="1">';
	    html += '<div class="dropdown lfr-icon-menu">';
	    html += '<a class="direction-left dropdown-toggle icon-monospaced " href="javascript:;" id="_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries_1_menu" title="Actions"> <span id="qfkd____"><svg aria-hidden="true" class="lexicon-icon lexicon-icon-ellipsis-v" focusable="false"><use href="http://localhost:8080/o/classic-theme/images/clay/icons.svg#ellipsis-v"></use></svg></span></a>';
	    html += '<ul class="dropdown-menu dropdown-menu-left">';
	    html += '<li class="" role="presentation"><a href="http://localhost:8080/web/guest/back-office?p_p_id=register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl&amp;p_p_lifecycle=0&amp;p_p_state=normal&amp;p_p_mode=view&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_mvcRenderCommandName=%2Fview-register-user&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_redirect=%2Fweb%2Fguest%2Fback-office&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserId=2301" target="_self" class=" lfr-icon-item taglib-icon" id="_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries__1__menu__view" role="menuitem"> <span class="taglib-text-icon">View</span></a></li>';
	    html += '<li class="" role="presentation"><a href="http://localhost:8080/web/guest/back-office?p_p_id=register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl&amp;p_p_lifecycle=0&amp;p_p_state=normal&amp;p_p_mode=view&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_mvcRenderCommandName=%2Fedit&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_redirect=%2Fweb%2Fguest%2Fback-office&amp;_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserId=2301" target="_self" class=" lfr-icon-item taglib-icon" id="_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries__1__menu__edit" role="menuitem"> <span class="taglib-text-icon">Edit</span></a></li>';
	    html += '<li class="item-remove" role="presentation"><a href="javascript:if (confirm(\'Are you sure you want to delete this?\')) { submitForm(document.hrefFm, \'http\x3a\x2f\x2flocalhost\x3a8080\x2fweb\x2fguest\x2fback-office\x3fp_p_id\x3dregister_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl\x26p_p_lifecycle\x3d1\x26p_p_state\x3dnormal\x26p_p_mode\x3dview\x26_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_javax\x2eportlet\x2eaction\x3d\x252Fdelete\x26_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_redirect\x3d\x252Fweb\x252Fguest\x252Fback-office\x26_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserId\x3d2301\x26p_auth\x3dKCAzLOHC\'); } else { self.focus(); }" target="_self" class=" lfr-icon-item taglib-icon" id="_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_registerUserEntries__1__menu__delete" role="menuitem"> <span class="taglib-text-icon">Delete</span></a></li>';
	    html += '</ul>';
	    html += '</div>';
	    html += '</td>';
	    html += '</tr>';
	    return html;
	}

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
	
		
</aui:script>