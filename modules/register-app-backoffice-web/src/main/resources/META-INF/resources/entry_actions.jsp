<%@ include file="/init.jsp" %>

<c:set var="registerUser" value="${SEARCH_CONTAINER_RESULT_ROW.object}" />

<liferay-ui:icon-menu markupView="lexicon">

	<%-- View action. --%>

	<portlet:renderURL var="viewRegisterUserURL">
		<portlet:param name="mvcRenderCommandName"
			value="<%=MVCCommandNames.VIEW_REGISTERUSER %>" />
		<portlet:param name="redirect" value="/web/guest/back-office" />
		<portlet:param name="registerUserId" value="${registerUser.registerUserId}" />
	</portlet:renderURL>

	<liferay-ui:icon message="view" url="${viewRegisterUserURL}" />


	<%-- Edit action. --%>

	<portlet:renderURL var="editRegisterUserURL">
		<portlet:param name="mvcRenderCommandName"
			value="<%=MVCCommandNames.EDIT_REGISTERUSER %>" />
		<portlet:param name="redirect" value="/web/guest/back-office" />
		<portlet:param name="registerUserId" value="${registerUser.registerUserId}" />
	</portlet:renderURL>

	<liferay-ui:icon message="edit" url="${editRegisterUserURL}" />

	<%-- Delete action. --%>

	<portlet:actionURL name="<%=MVCCommandNames.DELETE_REGISTERUSER %>"
		var="deleteRegisterUserURL">
		<portlet:param name="redirect" value="/web/guest/back-office" />
		<portlet:param name="registerUserId" value="${registerUser.registerUserId}" />
	</portlet:actionURL>

	<liferay-ui:icon-delete url="${deleteRegisterUserURL}" />

</liferay-ui:icon-menu>