<%@ include file="/init.jsp"%>

<div class="container-fluid-1280">

	<h2><liferay-ui:message key="registerUser-information" /></h2>

	<h1>${registerUser.name}</h1>
	
	<div class="registerUser-metadata">

		<dl>
			<dt><liferay-ui:message key="surname" /></dt>
			<dd>${registerUser.surname}</dd>
	
			<dt><liferay-ui:message key="Lastname" /></dt>
			<dd>${registerUser.lastname}</dd>
			
			<dt><liferay-ui:message key="nationalId" /></dt>
			<dd>${registerUser.nationalId}</dd>			
	
			<dt><liferay-ui:message key="questionType" /></dt>
			<dd>${registerUser.questionType}</dd>
			
			<dt><liferay-ui:message key="description" /></dt>
			<dd>${registerUser.description}</dd>
			
			<dt><liferay-ui:message key="created" /></dt>
			<dd>${createDate}</dd>			
		</dl>
	</div>
</div>