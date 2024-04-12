/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package register.app.backend.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

import register.app.backend.service.RegisterUserServiceUtil;

/**
 * Provides the SOAP utility for the
 * <code>RegisterUserServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>register.app.backend.model.RegisterUserSoap</code>. If the method in the
 * service utility returns a
 * <code>register.app.backend.model.RegisterUser</code>, that is translated to a
 * <code>register.app.backend.model.RegisterUserSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegisterUserServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RegisterUserServiceSoap {

	public static register.app.backend.model.RegisterUserSoap addRegisterUser(
			long scopeGroupId, String nameInput, String surnameInput,
			String lastnameInput, String nationalIdInput, String email,
			String questionTypeInput, String descriptionInput,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			register.app.backend.model.RegisterUser returnValue =
				RegisterUserServiceUtil.addRegisterUser(
					scopeGroupId, nameInput, surnameInput, lastnameInput,
					nationalIdInput, email, questionTypeInput, descriptionInput,
					serviceContext);

			return register.app.backend.model.RegisterUserSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static register.app.backend.model.RegisterUserSoap addRegisterUser(
			register.app.backend.model.RegisterUserSoap registerUser)
		throws RemoteException {

		try {
			register.app.backend.model.RegisterUser returnValue =
				RegisterUserServiceUtil.addRegisterUser(
					register.app.backend.model.impl.RegisterUserModelImpl.
						toModel(registerUser));

			return register.app.backend.model.RegisterUserSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static long getRegisterUsersCountByKeywords(
			long groupId, String keywords)
		throws RemoteException {

		try {
			long returnValue =
				RegisterUserServiceUtil.getRegisterUsersCountByKeywords(
					groupId, keywords);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static register.app.backend.model.RegisterUserSoap[]
			getRegisterUsersByKeywords(
				long groupId, String keywords, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<register.app.backend.model.RegisterUser> orderByComparator)
		throws RemoteException {

		try {
			java.util.List<register.app.backend.model.RegisterUser>
				returnValue =
					RegisterUserServiceUtil.getRegisterUsersByKeywords(
						groupId, keywords, start, end, orderByComparator);

			return register.app.backend.model.RegisterUserSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static register.app.backend.model.RegisterUserSoap
			deleteRegisterUser(long registerUserId)
		throws RemoteException {

		try {
			register.app.backend.model.RegisterUser returnValue =
				RegisterUserServiceUtil.deleteRegisterUser(registerUserId);

			return register.app.backend.model.RegisterUserSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static register.app.backend.model.RegisterUserSoap
			updateRegisterUser(
				long registerUserId, long scopeGroupId, String nameInput,
				String surnameInput, String lastnameInput,
				String nationalIdInput, String email, String questionTypeInput,
				String descriptionInput,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			register.app.backend.model.RegisterUser returnValue =
				RegisterUserServiceUtil.updateRegisterUser(
					registerUserId, scopeGroupId, nameInput, surnameInput,
					lastnameInput, nationalIdInput, email, questionTypeInput,
					descriptionInput, serviceContext);

			return register.app.backend.model.RegisterUserSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		RegisterUserServiceSoap.class);

}