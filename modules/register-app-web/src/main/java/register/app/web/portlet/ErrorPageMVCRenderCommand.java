package register.app.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import register.app.web.constants.MVCCommandNames;
import register.app.web.constants.RegisterAppWebPortletKeys;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + RegisterAppWebPortletKeys.REGISTERAPPWEB,
			"mvc.command.name=" + MVCCommandNames.ERROR_PAGE
		}, 
		service = MVCRenderCommand.class
	)
public class ErrorPageMVCRenderCommand implements MVCRenderCommand {
	
	@Override
	public String render(
		RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {
		
		return "/error_page.jsp";
	}

}
