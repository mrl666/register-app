<%@ include file="/init.jsp" %>

<div class="container-fluid-1280">
	<p>
		We have received your request and will contact you as soon as possible. Thank you.
	</p>
	
	<portlet:renderURL var="viewURL">
		<portlet:param name="mvcPath" value="" />
	</portlet:renderURL>

	<a href="${viewURL}" class="btn btn-primary">List</a>
		
</div>