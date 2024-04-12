<%@ include file="/init.jsp" %>


<div class="container-fluid-1280">
	<p>
		<b><liferay-ui:message key="registerappbackofficeweb.caption"/></b>
	</p>
	
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