<%@ include file="/init.jsp" %>

<c:choose>
	<c:when test="${not empty registerUser}">
		<portlet:actionURL var="registerUserActionURL" name="<%=MVCCommandNames.EDIT_REGISTERUSER %>">
			<portlet:param name="redirect" value="${param.redirect}" />
			<portlet:param name="registerUserId" value="${registerUser.registerUserId}" />
		</portlet:actionURL>

		<c:set var="editTitle" value="edit-registerUser"/>
	</c:when>
	<c:otherwise>
		<portlet:actionURL var="registerUserActionURL" name="<%=MVCCommandNames.ADD_REGISTERUSER %>">
			<portlet:param name="redirect" value="${param.redirect}" />
		</portlet:actionURL>

		<c:set var="editTitle" value="add-assignment"/>
	</c:otherwise>
</c:choose>

<div class="container-fluid-1280">
       <div class="form-container">
           <h2>Register Form</h2>
           
           <h3><liferay-ui:message key="${editTitle}" /></h3>
           
           	<aui:model-context bean="${registerUser}" model="${registerUserClass}" />
		   
           <aui:form action="${registerUserActionURL}" method="post" name="registerForm">
           
               <div class="form-group">
                   <aui:input type="text" class="form-control" id="name" name="name"
                 		label="register.web.form.name.label"
						placeholder="register.web.form.name.placeholder">
                   	<aui:validator name="required" errorMessage="Please enter your name" />
                   </aui:input>
               </div>
               
               <div class="form-group">
                   <aui:input type="text" class="form-control" id="surname" name="surname" 
                 		label="register.web.form.surname.label"
						placeholder="register.web.form.surname.placeholder">
                   	<aui:validator name="required" errorMessage="Please enter your surname" />
                   </aui:input>
               </div>
               
               <div class="form-group">
                   <aui:input type="text" class="form-control" id="lastname" name="lastname" 
                 		label="register.web.form.lastname.label"
						placeholder="register.web.form.lastname.placeholder">
                   	<aui:validator name="required" errorMessage="Please enter your lastname" />
                   </aui:input>
               </div>
               
               <div class="form-group">
                   <aui:input type="text" class="form-control" id="nationalId" name="nationalId" 
                 		label="register.web.form.nationalId.label"
						placeholder="register.web.form.nationalId.placeholder">
                   	<aui:validator name="required" errorMessage="Please enter your nationalId" />
                	<aui:validator name="custom"
                         errorMessage="Please enter your correct nationalId">
                                 function validateDni(dni) {
                                     if (dni.trim() === '') {
                                         return true;
                                     }
                                     let reg = /^\d{8}[a-zA-Z]$/;
                                     if (reg.test(dni) === true) {
                                         let numero = dni.substr(0, dni.length - 1);
                                         let letr = dni.substr(dni.length - 1, 1);
                                         numero = numero % 23;
                                         let letra = 'TRWAGMYFPDXBNJZSQVHLCKET';
                                         letra = letra.substring(numero, numero + 1);
                                         return (letra !== letr.toUpperCase()) ? false : true;
                                     } else {
                                         return reg.test(dni);
                                     }
                                 }
                     </aui:validator>
                   </aui:input>
               </div>
               
               <div class="form-group">
                   <aui:input type="text" class="form-control" id="email" name="email" 
                 		label="register.web.form.email.label"
						placeholder="register.web.form.email.placeholder">
                   	<aui:validator name="email" errorMessage="Please enter a correct email address" />
                   	<aui:validator name="required" errorMessage="Please enter your email address" />
                   </aui:input>
               </div>
               
				<div class="form-group">
				    <aui:select class="form-control" id="questionType" name="questionType" 
				        label="register.web.form.questionType.label">
				        <option value="">Select Option</option>
				        <option value="Query" <c:if test="${registerUser.questionType eq 'Query'}">selected</c:if>>Query</option>
				        <option value="Complaint" <c:if test="${registerUser.questionType eq 'Complaint'}">selected</c:if>>Complaint</option>
				        <option value="Suggestion" <c:if test="${registerUser.questionType eq 'Suggestion'}">selected</c:if>>Suggestion</option>
				        <aui:validator name="required" errorMessage="Please enter your question type" />
				    </aui:select>
				</div>
				               
               <div class="form-group">
                   <aui:input class="form-control" id="description" name="description" rows="3" 
                 		label="register.web.form.description.label"
						placeholder="register.web.form.description.placeholder">
                   	<aui:validator name="required" errorMessage="Please enter one description" />
                   </aui:input>
               </div>
               
               <div class="form-group">
					<liferay-captcha:captcha url="${captchaResourceURL}" />
					<c:if test="${not empty fn:trim(errorCaptchaMessage)}">
						<div class="alert alert-danger" role="alert">
						    <liferay-ui:message key="${errorCaptchaMessage}" />
						</div>
					</c:if>
               </div>
               
               <button type="submit" class="btn btn-primary">Send</button>
               
           </aui:form>
       </div>
</div>