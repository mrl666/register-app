package register.app.backoffice.web.portlet;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import register.app.backend.model.RegisterUser;
import register.app.backend.service.RegisterUserLocalServiceUtil;
import register.app.backoffice.web.constants.MVCCommandNames;
import register.app.backoffice.web.constants.RegisterAppBackofficeWebPortletKeys;

@Component(
		immediate = true, 
		property = {
			"javax.portlet.name=" + RegisterAppBackofficeWebPortletKeys.REGISTERAPPBACKOFFICEWEB, 
			"mvc.command.name=/",
			"mvc.command.name=" + MVCCommandNames.VIEW_REGISTERUSERS
		}, 
		service = MVCRenderCommand.class
	)
public class ViewRegisterUserMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(
		RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {

		// Add registeruser list related attributes.

		addRegisterUserListAttributes(renderRequest);

		// Add Clay management toolbar related attributes.

		addManagementToolbarAttributes(renderRequest, renderResponse);

		return "/view.jsp";
	}

	/**
	 * Adds assigment list related attributes to the request.
	 * 
	 * @param renderRequest
	 */
	private void addRegisterUserListAttributes(RenderRequest renderRequest) {

		ThemeDisplay themeDisplay =
			(ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		// Resolve start and end for the search.

		int currentPage = ParamUtil.getInteger(
			renderRequest, SearchContainer.DEFAULT_CUR_PARAM,
			SearchContainer.DEFAULT_CUR);

		int delta = ParamUtil.getInteger(
			renderRequest, SearchContainer.DEFAULT_DELTA_PARAM,
			SearchContainer.DEFAULT_DELTA);

		int start = ((currentPage > 0) ? (currentPage - 1) : 0) * delta;
		int end = start + delta;

		// Get sorting options.
		// Notice that this doesn't really sort on name because the field is
		// stored in XML. In real world this search would be integrated to the
		// search engine  to get localized sort options.

		String orderByCol =
			ParamUtil.getString(renderRequest, "orderByCol", "nationalId");
		String orderByType =
			ParamUtil.getString(renderRequest, "orderByType", "asc");

		// Create comparator

		OrderByComparator<RegisterUser> comparator =
			OrderByComparatorFactoryUtil.create(
				"RegisterUser", orderByCol, !("asc").equals(orderByType));

		// Get keywords.
		// Notice that cleaning keywords is not implemented.

		String keywords = ParamUtil.getString(renderRequest, "keywords");

		// Call the service to get the list of RegisterUser.

		List<RegisterUser> registerUsers =
			RegisterUserLocalServiceUtil.getRegisterUsersByKeywords(themeDisplay.getScopeGroupId(), keywords, start, end,
				comparator);

		// Set request attributes.
		renderRequest.setAttribute("registerUsers", registerUsers);
		renderRequest.setAttribute(
			"RegisterUserCount", RegisterUserLocalServiceUtil.getRegisterUsersCountByKeywords(
				themeDisplay.getScopeGroupId(), keywords));

	}

	/**
	 * Adds Clay management toolbar context object to the request.
	 * 
	 * @param renderRequest
	 * @param renderResponse
	 */
	private void addManagementToolbarAttributes(
		RenderRequest renderRequest, RenderResponse renderResponse) {

		LiferayPortletRequest liferayPortletRequest =
			_portal.getLiferayPortletRequest(renderRequest);

		LiferayPortletResponse liferayPortletResponse =
			_portal.getLiferayPortletResponse(renderResponse);

		RegisterUsersManagementToolbarDisplayContext registerUsersManagementToolbarDisplayContext =
			new RegisterUsersManagementToolbarDisplayContext(
				liferayPortletRequest, liferayPortletResponse,
				_portal.getHttpServletRequest(renderRequest));

		renderRequest.setAttribute(
			"registerUsersManagementToolbarDisplayContext",
			registerUsersManagementToolbarDisplayContext);

	}

	@Reference
	private Portal _portal;

}
