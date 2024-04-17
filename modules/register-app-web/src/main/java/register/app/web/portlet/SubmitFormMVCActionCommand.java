package register.app.web.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;
import javax.portlet.PortletSession;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import org.osgi.service.component.annotations.Component;
import com.liferay.captcha.util.CaptchaUtil;
import com.liferay.portal.kernel.captcha.Captcha;
import com.liferay.portal.kernel.captcha.CaptchaConfigurationException;
import com.liferay.portal.kernel.captcha.CaptchaException;
import com.liferay.portal.kernel.captcha.CaptchaTextException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portlet.LiferayPortletUtil;
import register.app.backend.model.RegisterUser;
import register.app.backend.service.RegisterUserLocalServiceUtil;
import register.app.web.constants.MVCCommandNames;
import register.app.web.constants.RegisterAppWebPortletKeys;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;

@Component(immediate = true,
    property = {"javax.portlet.name=" + RegisterAppWebPortletKeys.REGISTERAPPWEB,
        "mvc.command.name=" + MVCCommandNames.SUBMIT_FORM},
    service = MVCActionCommand.class)
public class SubmitFormMVCActionCommand extends BaseMVCActionCommand {

  @Override
  protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse)
      throws Exception {
    
    try {
      // captcha validation
      String captchaTextUser = ParamUtil.getString(actionRequest, "captchaText");
//      PortletSession session = actionRequest.getPortletSession();
//      String captchaTextValid = (String) session
//          .getAttribute("_register_app_web_RegisterAppWebPortlet_INSTANCE_qnll_CAPTCHA_TEXT");
//      if (!captchaTextUser.equals(captchaTextValid)) {
//        actionRequest.setAttribute("errorCaptchaMessage", "Incorrect captcha! Please try again.");
//        throw new CaptchaTextException();
//      }
      
      String captchaText = (String) actionRequest.getPortletSession().getAttribute(WebKeys.CAPTCHA_TEXT);
      Captcha c = CaptchaUtil.getCaptcha();
      c.check(actionRequest);

      // get form values
      String nameInput = ParamUtil.getString(actionRequest, "name");
      String surnameInput = ParamUtil.getString(actionRequest, "surname");
      String lastnameInput = ParamUtil.getString(actionRequest, "lastname");
      String nationalIdInput = ParamUtil.getString(actionRequest, "nationalId");
      String emailInput = ParamUtil.getString(actionRequest, "email");
      String questionTypeInput = ParamUtil.getString(actionRequest, "questionType");
      String descriptionInput = ParamUtil.getString(actionRequest, "description");
      actionRequest.setAttribute("name", nameInput);

      ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

      ServiceContext serviceContext =
          ServiceContextFactory.getInstance(RegisterUser.class.getName(), actionRequest);

      RegisterUserLocalServiceUtil.addRegisterUser(themeDisplay.getScopeGroupId(), nameInput,
          surnameInput, lastnameInput, nationalIdInput, emailInput, questionTypeInput,
          descriptionInput, serviceContext);

      // Success message
      SessionMessages.add(actionRequest, "successMessage");

      actionResponse.getRenderParameters().setValue("mvcRenderCommandName", MVCCommandNames.SUCCESS_PAGE);

    } catch (CaptchaConfigurationException cte) {
      // Error message
      actionRequest.setAttribute("errorCaptchaMessage", "Captcha Configuration Exception! Please try again.");
      cte.printStackTrace();
    } catch (CaptchaTextException cte) {
      // Error message
      actionRequest.setAttribute("errorCaptchaMessage", "Incorrect captcha! Please try again.");
      cte.printStackTrace();
   } catch (CaptchaException cte) {
     // Error message
     actionRequest.setAttribute("errorCaptchaMessage", "Captcha Exception! Please try again.");
     cte.printStackTrace();
    } catch (Exception e) {
      // Error message
      SessionErrors.add(actionRequest, "errorMessage");
      e.printStackTrace();
      actionResponse.getRenderParameters().setValue("mvcRenderCommandName", MVCCommandNames.ERROR_PAGE);
    }
  }

}
