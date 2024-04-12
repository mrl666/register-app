package register.app.backoffice.web.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.text.DateFormat;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import register.app.backend.model.RegisterUser;
import register.app.backend.service.RegisterUserLocalServiceUtil;
import register.app.backoffice.web.constants.MVCCommandNames;
import register.app.backoffice.web.constants.RegisterAppBackofficeWebPortletKeys;

@Component(immediate = true, property = {
		"javax.portlet.name=" + RegisterAppBackofficeWebPortletKeys.REGISTERAPPBACKOFFICEWEB,
		"mvc.command.name=" + MVCCommandNames.VIEW_REGISTERUSER }, service = MVCRenderCommand.class)
public class ViewSingleRegisterUserMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		long registerUserId = ParamUtil.getLong(renderRequest, "registerUserId", 0);

		try {

			// Call the service to get the registerUser.

			RegisterUser registerUser = RegisterUserLocalServiceUtil.getRegisterUser(registerUserId);

			DateFormat dateFormat = DateFormatFactoryUtil.getSimpleDateFormat("EEEEE, MMMMM dd, yyyy");

			// Set attributes to the request.

			renderRequest.setAttribute("registerUser", registerUser);
			renderRequest.setAttribute("createDate", dateFormat.format(registerUser.getCreateDate()));

			// Set back icon visible.
			PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();

			String redirect = renderRequest.getParameter("redirect");

			portletDisplay.setShowBackIcon(true);
			portletDisplay.setURLBack(redirect);

			return "/view_registerUser.jsp";

		} catch (PortalException pe) {
			throw new PortletException(pe);
		}
	}

}
