<%@ include file="/init.jsp"%>

<div class="container-fluid-1280">
	<p>We were unable to process your request. Please try again later. We apologize for any inconvenience. Thank you.</p>

	<portlet:renderURL var="viewURL">
		<portlet:param name="mvcPath" value="" />
	</portlet:renderURL>

	<a href="${viewURL}" class="btn btn-primary">List</a>

</div>