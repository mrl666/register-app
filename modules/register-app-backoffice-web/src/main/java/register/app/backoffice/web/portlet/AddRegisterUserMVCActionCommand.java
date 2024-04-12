package register.app.backoffice.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import register.app.backend.model.RegisterUser;
import register.app.backend.service.RegisterUserLocalServiceUtil;
import register.app.backoffice.web.constants.MVCCommandNames;
import register.app.backoffice.web.constants.RegisterAppBackofficeWebPortletKeys;

/**
 * MVC Action Command for adding assignments.
 * 
 * @author liferay
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + RegisterAppBackofficeWebPortletKeys.REGISTERAPPBACKOFFICEWEB,
		"mvc.command.name=" + MVCCommandNames.ADD_REGISTERUSER
	},
	service = MVCActionCommand.class
)
public class AddRegisterUserMVCActionCommand extends BaseMVCActionCommand {
	
    @Override
    protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
    	
    	try {
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
		
    	} catch (Exception e) {
    		e.printStackTrace();
			actionResponse.setRenderParameter(
					"mvcRenderCommandName", MVCCommandNames.ERROR_PAGE);
    	}
    }

}
