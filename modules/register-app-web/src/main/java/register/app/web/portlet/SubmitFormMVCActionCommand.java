package register.app.web.portlet;

import com.liferay.portal.kernel.captcha.CaptchaTextException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.spring.extender.service.ServiceReference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletSession;
import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import register.app.backend.model.RegisterUser;
import register.app.backend.service.RegisterUserLocalService;
import register.app.backend.service.RegisterUserLocalServiceUtil;
import register.app.backend.service.persistence.RegisterUserPersistence;
import register.app.web.constants.MVCCommandNames;
import register.app.web.constants.RegisterAppWebPortletKeys;

import com.liferay.captcha.util.CaptchaUtil;
import com.liferay.counter.kernel.service.CounterLocalService;

@Component(
    immediate = true,
    property = {
	    "javax.portlet.name=" + RegisterAppWebPortletKeys.REGISTERAPPWEB,
        "mvc.command.name="  + MVCCommandNames.SUBMIT_FORM
    },
    service = MVCActionCommand.class
)
public class SubmitFormMVCActionCommand extends BaseMVCActionCommand {
	
    @Override
    protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
    	
    	try {
    		//captcha validation
    		String captchaTextUser = ParamUtil.getString(actionRequest, "captchaText");    		
    		PortletSession session = actionRequest.getPortletSession();
    		String captchaTextValid = (String) session.getAttribute("_register_app_web_RegisterAppWebPortlet_INSTANCE_qnll_CAPTCHA_TEXT");   		
    		if (!captchaTextUser.equals(captchaTextValid)) {
    			actionRequest.setAttribute("errorCaptchaMessage", "Incorrect captcha! Please try again.");
    			throw new CaptchaTextException();
    		}
    		
    		//get form values
			String nameInput = ParamUtil.getString(actionRequest, "name");
			String surnameInput = ParamUtil.getString(actionRequest, "surname");
			String lastnameInput = ParamUtil.getString(actionRequest, "lastname");
			String nationalIdInput = ParamUtil.getString(actionRequest, "nationalId");
			String emailInput = ParamUtil.getString(actionRequest, "email");
			String questionTypeInput = ParamUtil.getString(actionRequest, "questionType");
			String descriptionInput = ParamUtil.getString(actionRequest, "description");
			actionRequest.setAttribute("name", nameInput);
			
			ThemeDisplay themeDisplay =
					(ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					RegisterUser.class.getName(), actionRequest);
			
			RegisterUserLocalServiceUtil.addRegisterUser(themeDisplay.getScopeGroupId(), nameInput, surnameInput, lastnameInput, nationalIdInput,
					emailInput, questionTypeInput, descriptionInput, serviceContext);
			
			actionResponse.setRenderParameter(
					"mvcRenderCommandName", MVCCommandNames.SUCCESS_PAGE);
		
    	} catch (CaptchaTextException cte) {
    		cte.printStackTrace();
    	} catch (Exception e) {
    		e.printStackTrace();
			actionResponse.setRenderParameter(
					"mvcRenderCommandName", MVCCommandNames.ERROR_PAGE);
    	}
    }
    
}
