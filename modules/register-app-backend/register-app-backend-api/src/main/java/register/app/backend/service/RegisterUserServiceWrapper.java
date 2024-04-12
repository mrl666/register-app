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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RegisterUserService}.
 *
 * @author Brian Wing Shun Chan
 * @see RegisterUserService
 * @generated
 */
public class RegisterUserServiceWrapper
	implements RegisterUserService, ServiceWrapper<RegisterUserService> {

	public RegisterUserServiceWrapper(RegisterUserService registerUserService) {
		_registerUserService = registerUserService;
	}

	@Override
	public register.app.backend.model.RegisterUser addRegisterUser(
			long scopeGroupId, String nameInput, String surnameInput,
			String lastnameInput, String nationalIdInput, String email,
			String questionTypeInput, String descriptionInput,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerUserService.addRegisterUser(
			scopeGroupId, nameInput, surnameInput, lastnameInput,
			nationalIdInput, email, questionTypeInput, descriptionInput,
			serviceContext);
	}

	@Override
	public register.app.backend.model.RegisterUser addRegisterUser(
			register.app.backend.model.RegisterUser registerUser)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerUserService.addRegisterUser(registerUser);
	}

	@Override
	public register.app.backend.model.RegisterUser deleteRegisterUser(
			long registerUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerUserService.deleteRegisterUser(registerUserId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _registerUserService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<register.app.backend.model.RegisterUser>
		getRegisterUsersByKeywords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<register.app.backend.model.RegisterUser> orderByComparator) {

		return _registerUserService.getRegisterUsersByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	@Override
	public long getRegisterUsersCountByKeywords(long groupId, String keywords) {
		return _registerUserService.getRegisterUsersCountByKeywords(
			groupId, keywords);
	}

	@Override
	public register.app.backend.model.RegisterUser updateRegisterUser(
			long registerUserId, long scopeGroupId, String nameInput,
			String surnameInput, String lastnameInput, String nationalIdInput,
			String email, String questionTypeInput, String descriptionInput,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerUserService.updateRegisterUser(
			registerUserId, scopeGroupId, nameInput, surnameInput,
			lastnameInput, nationalIdInput, email, questionTypeInput,
			descriptionInput, serviceContext);
	}

	@Override
	public RegisterUserService getWrappedService() {
		return _registerUserService;
	}

	@Override
	public void setWrappedService(RegisterUserService registerUserService) {
		_registerUserService = registerUserService;
	}

	private RegisterUserService _registerUserService;

}