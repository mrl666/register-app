package register.app.backoffice.web.portlet;

import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Logger;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import org.osgi.service.component.annotations.Component;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCResourceCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import register.app.backend.model.RegisterUser;
import register.app.backend.service.RegisterUserLocalServiceUtil;
import register.app.backoffice.web.constants.MVCCommandNames;
import register.app.backoffice.web.constants.RegisterAppBackofficeWebPortletKeys;


@Component(immediate = true,
    property = {
        "javax.portlet.name=" + RegisterAppBackofficeWebPortletKeys.REGISTERAPPBACKOFFICEWEB,
        "mvc.command.name=" + MVCCommandNames.GET_USERS_RESOURCE},
    service = MVCResourceCommand.class)
public class GetRegisterUsersByKeywordsAppMVCResourceCommand extends BaseMVCResourceCommand {

  private static final Logger logger =
      Logger.getLogger(GetRegisterUsersByKeywordsAppMVCResourceCommand.class.getName());

  @Override
  protected void doServeResource(ResourceRequest resourceRequest,
      ResourceResponse resourceResponse) {
    try {

      ThemeDisplay themeDisplay =
          (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);

      HttpServletRequest httprequest = PortalUtil.getHttpServletRequest(resourceRequest);
      String searchTerm = PortalUtil.getOriginalServletRequest(httprequest).getParameter("searchTerm");

      String orderByCol =
          ParamUtil.getString(resourceRequest, "orderByCol", "name");
      String orderByType =
          ParamUtil.getString(resourceRequest, "orderByType", "asc");

      // Create comparator
      OrderByComparator<RegisterUser> comparator =
          OrderByComparatorFactoryUtil.create(
              "RegisterUser", orderByCol, !("asc").equals(orderByType));

      // Call the service to get the list of RegisterUser.
      List<RegisterUser> registerUsers =
          RegisterUserLocalServiceUtil.getRegisterUsersByKeywords(themeDisplay.getScopeGroupId(), searchTerm, 0, 20,
              comparator);
      logger.info(registerUsers.get(0).getNationalId());
      
      // Convert data to JSON
      JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
      for (RegisterUser user : registerUsers) {
          JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
          jsonObject.put("userId", user.getUserId());
          jsonObject.put("name", user.getName());
          jsonObject.put("nationalId", user.getNationalId());
          jsonArray.put(jsonObject);
      }

      // Write JSON response
      PrintWriter writer = resourceResponse.getWriter();
      writer.print(jsonArray.toString());

    } catch (Exception ex) {
      ex.printStackTrace();
    }

  }
  

}
