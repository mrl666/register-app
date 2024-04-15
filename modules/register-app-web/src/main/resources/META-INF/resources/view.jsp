<%@ include file="/init.jsp" %>

    <script type="text/javascript">
	console.log('Executing script...');
	console.log(Liferay.Browser.isChrome());
	console.log(Liferay.Util.Session);
</script>

<portlet:actionURL var="submitFormActionURL" name="<%=MVCCommandNames.SUBMIT_FORM%>" />
<portlet:resourceURL id="<%=MVCCommandNames.RESOURCE_CAPTCHA%>" var="captchaResourceURL" />
		
<div class="container-fluid-1280">
       <div class="form-container">
           <h2>Register Form</h2>
		   
		   <aui:model-context bean="${registerUser}" model="${registerUserClass}" />
           <aui:form action="${submitFormActionURL}" method="post" name="registerForm">
           
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
						<p class="font-bold font-15 color-error mb-0 mt-15">
							<liferay-ui:message key="${errorCaptchaMessage}" />
						</p>
					</c:if>
               </div>
               
               <button type="submit" class="btn btn-primary">Send</button>
               
           </aui:form>
       </div>
</div>