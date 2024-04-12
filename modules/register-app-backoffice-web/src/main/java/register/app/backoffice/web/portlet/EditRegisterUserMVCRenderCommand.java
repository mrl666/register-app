package register.app.backoffice.web.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import register.app.backend.exception.NoSuchRegisterUserException;
import register.app.backend.model.RegisterUser;
import register.app.backend.service.RegisterUserLocalServiceUtil;
import register.app.backoffice.web.constants.MVCCommandNames;

import register.app.backoffice.web.constants.RegisterAppBackofficeWebPortletKeys;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + RegisterAppBackofficeWebPortletKeys.REGISTERAPPBACKOFFICEWEB,
			"mvc.command.name=" + MVCCommandNames.EDIT_REGISTERUSER
		}, 
		service = MVCRenderCommand.class
	)
public class EditRegisterUserMVCRenderCommand implements MVCRenderCommand {
	
	@Override
	public String render(
		RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {

		RegisterUser registerUser = null;

		long registerUserId = ParamUtil.getLong(renderRequest, "registerUserId");

		if (registerUserId > 0) {
			try {
				
				// Call the service to get the assignment for editing.
				
				registerUser = RegisterUserLocalServiceUtil.getRegisterUser(registerUserId);
			}
			catch (NoSuchRegisterUserException nsre) {
				nsre.printStackTrace();
			}
			catch (PortalException pe) {
				pe.printStackTrace();
			}
		}
		
		ThemeDisplay themeDisplay =
			(ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		// Set back icon visible.
		
		PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();

		portletDisplay.setShowBackIcon(true);

		String redirect = renderRequest.getParameter("redirect");

		portletDisplay.setURLBack(redirect);

		// Set assignment to the request attributes.
		
		renderRequest.setAttribute("registerUser", registerUser);
		renderRequest.setAttribute("registerUserClass", RegisterUser.class);

		return "/edit_registerUser.jsp";
	}

}
