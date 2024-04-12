package register.app.web.portlet;

import com.liferay.captcha.util.CaptchaUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCResourceCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import register.app.web.constants.MVCCommandNames;
import register.app.web.constants.RegisterAppWebPortletKeys;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + RegisterAppWebPortletKeys.REGISTERAPPWEB,
			"mvc.command.name=" + MVCCommandNames.RESOURCE_CAPTCHA
		}, 
		service = MVCResourceCommand.class
	)
public class GetCaptchaRegistersAppMVCResourceCommand extends BaseMVCResourceCommand {
	
	  @Override
	  protected void doServeResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
	    try {
	      CaptchaUtil.serveImage(resourceRequest, resourceResponse);
	    } catch (Exception ex) {
	      ex.printStackTrace();
	    }
	    
	  }

}
