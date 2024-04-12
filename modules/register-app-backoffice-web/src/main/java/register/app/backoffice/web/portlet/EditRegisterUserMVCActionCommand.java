package register.app.backoffice.web.portlet;

import com.liferay.captcha.simplecaptcha.SimpleCaptchaImpl;
import com.liferay.captcha.util.CaptchaUtil;
import com.liferay.portal.kernel.captcha.CaptchaTextException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletSession;

import org.osgi.service.component.annotations.Component;

import register.app.backend.model.RegisterUser;
import register.app.backend.service.RegisterUserLocalServiceUtil;
import register.app.backoffice.web.constants.MVCCommandNames;
import register.app.backoffice.web.constants.RegisterAppBackofficeWebPortletKeys;

/**
 * MVC Action Command for editing assignments.
 * 
 * @author liferay
 *
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + RegisterAppBackofficeWebPortletKeys.REGISTERAPPBACKOFFICEWEB,
		"mvc.command.name=" + MVCCommandNames.EDIT_REGISTERUSER
	},
	service = MVCActionCommand.class
)
public class EditRegisterUserMVCActionCommand extends BaseMVCActionCommand {
	
	@Override
	protected void doProcessAction(
		ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {
		
		//captcha validation
		String captchaTextUser = ParamUtil.getString(actionRequest, "captchaText");    		
		PortletSession session = actionRequest.getPortletSession();
		String captchaTextValid = (String) session.getAttribute("_register_app_backoffice_web_RegisterAppBackofficeWebPortlet_INSTANCE_udsl_CAPTCHA_TEXT");

		ThemeDisplay themeDisplay =
				(ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		//CaptchaUtil.check(actionRequest);

//		if (!captchaTextUser.equals(captchaTextValid)) {
//			actionRequest.setAttribute("errorCaptchaMessage", "Incorrect captcha! Please try again.");
//			throw new CaptchaTextException();
//		}
		
		// Get parameters from the request.
    	try {
		String nameInput = ParamUtil.getString(actionRequest, "name");
		String surnameInput = ParamUtil.getString(actionRequest, "surname");
		String lastnameInput = ParamUtil.getString(actionRequest, "lastname");
		String nationalIdInput = ParamUtil.getString(actionRequest, "nationalId");
		String emailInput = ParamUtil.getString(actionRequest, "email");
		String questionTypeInput = ParamUtil.getString(actionRequest, "questionType");
		String descriptionInput = ParamUtil.getString(actionRequest, "description");
		// Get RegisterUser id from request.
		long registerUserId = ParamUtil.getLong(actionRequest, "registerUserId");
		actionRequest.setAttribute("name", nameInput);
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				RegisterUser.class.getName(), actionRequest);
		
		RegisterUserLocalServiceUtil.updateRegisterUser(registerUserId, themeDisplay.getScopeGroupId(), nameInput, surnameInput, lastnameInput, nationalIdInput,
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
