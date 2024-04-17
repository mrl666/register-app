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

package register.app.backend.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.List;

import org.osgi.service.component.annotations.Component;

import register.app.backend.model.RegisterUser;
import register.app.backend.service.base.RegisterUserServiceBaseImpl;

/**
 * The implementation of the register user remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>register.app.backend.service.RegisterUserService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegisterUserServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=registerapp",
		"json.web.service.context.path=RegisterUser"
	},
	service = AopService.class
)
public class RegisterUserServiceImpl extends RegisterUserServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>register.app.backend.service.RegisterUserServiceUtil</code> to access the register user remote service.
	 */
	public RegisterUser addRegisterUser(long scopeGroupId, String nameInput, String surnameInput, String lastnameInput,
			String nationalIdInput, String email, String questionTypeInput, String descriptionInput, ServiceContext serviceContext) throws PortalException {

			return registerUserLocalService.addRegisterUser(scopeGroupId, nameInput, surnameInput, lastnameInput,
					nationalIdInput, email, questionTypeInput, descriptionInput, serviceContext);
		}
	
	public long getRegisterUsersCountByKeywords(long groupId, String keywords) {

		return registerUserLocalService.getRegisterUsersCountByKeywords(
			groupId, keywords);
	}
	
	public List<RegisterUser> getRegisterUsersByKeywords(
			long groupId, String keywords, int start, int end,
			OrderByComparator<RegisterUser> orderByComparator) {

			return registerUserLocalService.getRegisterUsersByKeywords(
				groupId, keywords, start, end, orderByComparator);
		}
	
	public RegisterUser deleteRegisterUser(long registerUserId)
			throws PortalException {

		RegisterUser registerUser =
				registerUserLocalService.getRegisterUser(registerUserId);

			return registerUserLocalService.deleteRegisterUser(registerUser);
		}

	@Override
	public RegisterUser updateRegisterUser(long registerUserId, long scopeGroupId, String nameInput, String surnameInput, String lastnameInput,
			String nationalIdInput, String email, String questionTypeInput, String descriptionInput, ServiceContext serviceContext)
			throws PortalException {
		
		return registerUserLocalService.updateRegisterUser(registerUserId, scopeGroupId, nameInput, surnameInput, lastnameInput,
				nationalIdInput, email, questionTypeInput, descriptionInput, serviceContext);
	}
	
    @Override
    @JSONWebService
    public List<RegisterUser> findByName(String name) {
      return registerUserLocalService.findByName(name);
    }

}