<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil"%>

<%@ page import="register.app.backend.model.RegisterUser"%>
<%@ page import="register.app.backoffice.web.constants.MVCCommandNames"%>
<%@ page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@ page import="javax.portlet.WindowState"%>

<%@ taglib uri="http://liferay.com/tld/captcha" prefix="liferay-captcha" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />