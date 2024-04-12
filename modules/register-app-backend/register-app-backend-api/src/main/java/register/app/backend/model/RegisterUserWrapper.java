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

package register.app.backend.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RegisterUser}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegisterUser
 * @generated
 */
public class RegisterUserWrapper
	extends BaseModelWrapper<RegisterUser>
	implements ModelWrapper<RegisterUser>, RegisterUser {

	public RegisterUserWrapper(RegisterUser registerUser) {
		super(registerUser);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("registerUserId", getRegisterUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("surname", getSurname());
		attributes.put("lastname", getLastname());
		attributes.put("nationalId", getNationalId());
		attributes.put("email", getEmail());
		attributes.put("questionType", getQuestionType());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long registerUserId = (Long)attributes.get("registerUserId");

		if (registerUserId != null) {
			setRegisterUserId(registerUserId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String surname = (String)attributes.get("surname");

		if (surname != null) {
			setSurname(surname);
		}

		String lastname = (String)attributes.get("lastname");

		if (lastname != null) {
			setLastname(lastname);
		}

		String nationalId = (String)attributes.get("nationalId");

		if (nationalId != null) {
			setNationalId(nationalId);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String questionType = (String)attributes.get("questionType");

		if (questionType != null) {
			setQuestionType(questionType);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	 * Returns the company ID of this register user.
	 *
	 * @return the company ID of this register user
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this register user.
	 *
	 * @return the create date of this register user
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this register user.
	 *
	 * @return the description of this register user
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the email of this register user.
	 *
	 * @return the email of this register user
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the group ID of this register user.
	 *
	 * @return the group ID of this register user
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the lastname of this register user.
	 *
	 * @return the lastname of this register user
	 */
	@Override
	public String getLastname() {
		return model.getLastname();
	}

	/**
	 * Returns the modified date of this register user.
	 *
	 * @return the modified date of this register user
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this register user.
	 *
	 * @return the name of this register user
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the national ID of this register user.
	 *
	 * @return the national ID of this register user
	 */
	@Override
	public String getNationalId() {
		return model.getNationalId();
	}

	/**
	 * Returns the primary key of this register user.
	 *
	 * @return the primary key of this register user
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the question type of this register user.
	 *
	 * @return the question type of this register user
	 */
	@Override
	public String getQuestionType() {
		return model.getQuestionType();
	}

	/**
	 * Returns the register user ID of this register user.
	 *
	 * @return the register user ID of this register user
	 */
	@Override
	public long getRegisterUserId() {
		return model.getRegisterUserId();
	}

	/**
	 * Returns the register user uuid of this register user.
	 *
	 * @return the register user uuid of this register user
	 */
	@Override
	public String getRegisterUserUuid() {
		return model.getRegisterUserUuid();
	}

	/**
	 * Returns the surname of this register user.
	 *
	 * @return the surname of this register user
	 */
	@Override
	public String getSurname() {
		return model.getSurname();
	}

	/**
	 * Returns the user ID of this register user.
	 *
	 * @return the user ID of this register user
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this register user.
	 *
	 * @return the user name of this register user
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this register user.
	 *
	 * @return the user uuid of this register user
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this register user.
	 *
	 * @return the uuid of this register user
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this register user.
	 *
	 * @param companyId the company ID of this register user
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this register user.
	 *
	 * @param createDate the create date of this register user
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this register user.
	 *
	 * @param description the description of this register user
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the email of this register user.
	 *
	 * @param email the email of this register user
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the group ID of this register user.
	 *
	 * @param groupId the group ID of this register user
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the lastname of this register user.
	 *
	 * @param lastname the lastname of this register user
	 */
	@Override
	public void setLastname(String lastname) {
		model.setLastname(lastname);
	}

	/**
	 * Sets the modified date of this register user.
	 *
	 * @param modifiedDate the modified date of this register user
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this register user.
	 *
	 * @param name the name of this register user
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the national ID of this register user.
	 *
	 * @param nationalId the national ID of this register user
	 */
	@Override
	public void setNationalId(String nationalId) {
		model.setNationalId(nationalId);
	}

	/**
	 * Sets the primary key of this register user.
	 *
	 * @param primaryKey the primary key of this register user
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the question type of this register user.
	 *
	 * @param questionType the question type of this register user
	 */
	@Override
	public void setQuestionType(String questionType) {
		model.setQuestionType(questionType);
	}

	/**
	 * Sets the register user ID of this register user.
	 *
	 * @param registerUserId the register user ID of this register user
	 */
	@Override
	public void setRegisterUserId(long registerUserId) {
		model.setRegisterUserId(registerUserId);
	}

	/**
	 * Sets the register user uuid of this register user.
	 *
	 * @param registerUserUuid the register user uuid of this register user
	 */
	@Override
	public void setRegisterUserUuid(String registerUserUuid) {
		model.setRegisterUserUuid(registerUserUuid);
	}

	/**
	 * Sets the surname of this register user.
	 *
	 * @param surname the surname of this register user
	 */
	@Override
	public void setSurname(String surname) {
		model.setSurname(surname);
	}

	/**
	 * Sets the user ID of this register user.
	 *
	 * @param userId the user ID of this register user
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this register user.
	 *
	 * @param userName the user name of this register user
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this register user.
	 *
	 * @param userUuid the user uuid of this register user
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this register user.
	 *
	 * @param uuid the uuid of this register user
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected RegisterUserWrapper wrap(RegisterUser registerUser) {
		return new RegisterUserWrapper(registerUser);
	}

}