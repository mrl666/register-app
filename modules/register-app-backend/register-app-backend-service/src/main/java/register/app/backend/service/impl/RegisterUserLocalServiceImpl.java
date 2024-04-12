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
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import register.app.backend.model.RegisterUser;
import register.app.backend.model.impl.RegisterUserImpl;
import register.app.backend.service.base.RegisterUserLocalServiceBaseImpl;

/**
 * The implementation of the register user local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>register.app.backend.service.RegisterUserLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegisterUserLocalServiceBaseImpl
 */
@Component(property = "model.class.name=register.app.backend.model.RegisterUser", service = AopService.class)
public class RegisterUserLocalServiceImpl extends RegisterUserLocalServiceBaseImpl {

	@Override
	public RegisterUser addRegisterUser(long scopeGroupId, String nameInput, String surnameInput, String lastnameInput,
			String nationalIdInput, String emailInput, String questionTypeInput, String descriptionInput, ServiceContext serviceContext) throws PortalException {
		
		final Group group = groupLocalService.getGroup(scopeGroupId);
		final long userId = serviceContext.getUserId();
		final User user = userLocalService.getUser(userId);

		long entryId = counterLocalService.increment(RegisterUser.class.getName());
		RegisterUser registerUser = new RegisterUserImpl();

		//userid, companyId, username
		registerUser.setCreateDate(serviceContext.getCreateDate(new Date()));
		registerUser.setCompanyId(group.getCompanyId());
		registerUser.setModifiedDate(serviceContext.getModifiedDate(new Date()));
		registerUser.setUserId(userId);
		registerUser.setUserName(user.getScreenName());
		registerUser.setRegisterUserId(entryId);
		registerUser.setGroupId(scopeGroupId);
		registerUser.setName(nameInput);
		registerUser.setSurname(surnameInput);
		registerUser.setLastname(lastnameInput);
		registerUser.setNationalId(nationalIdInput);
		registerUser.setEmail(emailInput);
		registerUser.setQuestionType(questionTypeInput);
		registerUser.setDescription(descriptionInput);
		registerUser = super.addRegisterUser(registerUser);
		return registerUser;
	}

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>register.app.backend.service.RegisterUserLocalService</code> via
	 * injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use
	 * <code>register.app.backend.service.RegisterUserLocalServiceUtil</code>.
	 */
	public long getRegisterUsersCountByKeywords(long groupId, String keywords) {
		return registerUserLocalService.dynamicQueryCount(getKeywordSearchDynamicQuery(groupId, keywords));
	}

	private DynamicQuery getKeywordSearchDynamicQuery(long groupId, String keywords) {
		DynamicQuery dynamicQuery = dynamicQuery().add(RestrictionsFactoryUtil.eq("groupId", groupId));
		if (Validator.isNotNull(keywords)) {
			Disjunction disjunctionQuery = RestrictionsFactoryUtil.disjunction();
			disjunctionQuery.add(RestrictionsFactoryUtil.like("nationalId", "%" + keywords + "%"));
			disjunctionQuery.add(RestrictionsFactoryUtil.like("description", "%" + keywords + "%"));
			dynamicQuery.add(disjunctionQuery);
		}
		return dynamicQuery;
	}

	public List<RegisterUser> getRegisterUsersByKeywords(long groupId, String keywords, int start, int end,
			OrderByComparator<RegisterUser> orderByComparator) {
		return registerUserLocalService.dynamicQuery(getKeywordSearchDynamicQuery(groupId, keywords), start, end,
				orderByComparator);
	}
	
   @Override
   public RegisterUser deleteRegisterUser(RegisterUser registerUser) throws PortalException {
		// Delete the RegisterUser
		return super.deleteRegisterUser(registerUser);
   }
   
   @Override
	public RegisterUser updateRegisterUser(long registerUserId, long scopeGroupId, String nameInput, String surnameInput,
			String lastnameInput, String nationalIdInput, String emailInput, String questionTypeInput,
			String descriptionInput, ServiceContext serviceContext) throws PortalException {
	   
	    RegisterUser registerUser = getRegisterUser(registerUserId);
		registerUser.setGroupId(scopeGroupId);
		registerUser.setName(nameInput);
		registerUser.setSurname(surnameInput);
		registerUser.setLastname(lastnameInput);
		registerUser.setNationalId(nationalIdInput);
		registerUser.setEmail(emailInput);
		registerUser.setQuestionType(questionTypeInput);
		registerUser.setDescription(descriptionInput);
		registerUser = super.updateRegisterUser(registerUser);
		return registerUser;
		
	}

}