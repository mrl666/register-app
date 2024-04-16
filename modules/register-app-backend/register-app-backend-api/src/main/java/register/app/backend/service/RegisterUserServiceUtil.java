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

package register.app.backend.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.List;

import register.app.backend.model.RegisterUser;

/**
 * Provides the remote service utility for RegisterUser. This utility wraps
 * <code>register.app.backend.service.impl.RegisterUserServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see RegisterUserService
 * @generated
 */
public class RegisterUserServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>register.app.backend.service.impl.RegisterUserServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static RegisterUser addRegisterUser(
			long scopeGroupId, String nameInput, String surnameInput,
			String lastnameInput, String nationalIdInput, String email,
			String questionTypeInput, String descriptionInput,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addRegisterUser(
			scopeGroupId, nameInput, surnameInput, lastnameInput,
			nationalIdInput, email, questionTypeInput, descriptionInput,
			serviceContext);
	}

	public static RegisterUser addRegisterUser(RegisterUser registerUser)
		throws PortalException {

		return getService().addRegisterUser(registerUser);
	}

	public static RegisterUser deleteRegisterUser(long registerUserId)
		throws PortalException {

		return getService().deleteRegisterUser(registerUserId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static List<RegisterUser> getRegisterUsersByKeywords(
		long groupId, String keywords, int start, int end,
		OrderByComparator<RegisterUser> orderByComparator) {

		return getService().getRegisterUsersByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	public static long getRegisterUsersCountByKeywords(
		long groupId, String keywords) {

		return getService().getRegisterUsersCountByKeywords(groupId, keywords);
	}

	public static RegisterUser updateRegisterUser(
			long registerUserId, long scopeGroupId, String nameInput,
			String surnameInput, String lastnameInput, String nationalIdInput,
			String email, String questionTypeInput, String descriptionInput,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateRegisterUser(
			registerUserId, scopeGroupId, nameInput, surnameInput,
			lastnameInput, nationalIdInput, email, questionTypeInput,
			descriptionInput, serviceContext);
	}

	public static RegisterUserService getService() {
		return _service;
	}

	private static volatile RegisterUserService _service;

}