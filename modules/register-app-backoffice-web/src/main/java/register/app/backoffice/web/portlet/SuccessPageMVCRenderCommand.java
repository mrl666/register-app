package register.app.backoffice.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import register.app.backoffice.web.constants.MVCCommandNames;
import register.app.backoffice.web.constants.RegisterAppBackofficeWebPortletKeys;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + RegisterAppBackofficeWebPortletKeys.REGISTERAPPBACKOFFICEWEB,
			"mvc.command.name=" + MVCCommandNames.SUCCESS_PAGE
		}, 
		service = MVCRenderCommand.class
	)
public class SuccessPageMVCRenderCommand implements MVCRenderCommand {
	
	@Override
	public String render(
		RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {
		
		return "/success_page.jsp";
	}

}
