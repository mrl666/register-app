package register.app.backoffice.web.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import register.app.backend.service.RegisterUserLocalServiceUtil;
import register.app.backoffice.web.constants.MVCCommandNames;
import register.app.backoffice.web.constants.RegisterAppBackofficeWebPortletKeys;

/**
	* MVC Action Command for deleting assignments.
	* 
	* @author liferay
	*/
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + RegisterAppBackofficeWebPortletKeys.REGISTERAPPBACKOFFICEWEB,
		"mvc.command.name=" + MVCCommandNames.DELETE_REGISTERUSER
	},
	service = MVCActionCommand.class
)
public class DeleteRegisterUserMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
		ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		// Get RegisterUser id from request.
		long registerUserId = ParamUtil.getLong(actionRequest, "registerUserId");

		try {

			RegisterUserLocalServiceUtil.deleteRegisterUser(registerUserId);

			// Set success message.
			SessionMessages.add(actionRequest, "registerUserDeleted");
		}
		catch (PortalException pe) {

			// Set error messages from the service layer.
			SessionErrors.add(actionRequest, "serviceErrorDetails", pe);
		}

	}

}
