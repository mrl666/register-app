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

package register.app.backend.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import register.app.backend.model.RegisterUser;

/**
 * The cache model class for representing RegisterUser in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RegisterUserCacheModel
	implements CacheModel<RegisterUser>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RegisterUserCacheModel)) {
			return false;
		}

		RegisterUserCacheModel registerUserCacheModel =
			(RegisterUserCacheModel)object;

		if (registerUserId == registerUserCacheModel.registerUserId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, registerUserId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", registerUserId=");
		sb.append(registerUserId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", surname=");
		sb.append(surname);
		sb.append(", lastname=");
		sb.append(lastname);
		sb.append(", nationalId=");
		sb.append(nationalId);
		sb.append(", email=");
		sb.append(email);
		sb.append(", questionType=");
		sb.append(questionType);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RegisterUser toEntityModel() {
		RegisterUserImpl registerUserImpl = new RegisterUserImpl();

		if (uuid == null) {
			registerUserImpl.setUuid("");
		}
		else {
			registerUserImpl.setUuid(uuid);
		}

		registerUserImpl.setRegisterUserId(registerUserId);
		registerUserImpl.setGroupId(groupId);
		registerUserImpl.setCompanyId(companyId);
		registerUserImpl.setUserId(userId);

		if (userName == null) {
			registerUserImpl.setUserName("");
		}
		else {
			registerUserImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			registerUserImpl.setCreateDate(null);
		}
		else {
			registerUserImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			registerUserImpl.setModifiedDate(null);
		}
		else {
			registerUserImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			registerUserImpl.setName("");
		}
		else {
			registerUserImpl.setName(name);
		}

		if (surname == null) {
			registerUserImpl.setSurname("");
		}
		else {
			registerUserImpl.setSurname(surname);
		}

		if (lastname == null) {
			registerUserImpl.setLastname("");
		}
		else {
			registerUserImpl.setLastname(lastname);
		}

		if (nationalId == null) {
			registerUserImpl.setNationalId("");
		}
		else {
			registerUserImpl.setNationalId(nationalId);
		}

		if (email == null) {
			registerUserImpl.setEmail("");
		}
		else {
			registerUserImpl.setEmail(email);
		}

		if (questionType == null) {
			registerUserImpl.setQuestionType("");
		}
		else {
			registerUserImpl.setQuestionType(questionType);
		}

		if (description == null) {
			registerUserImpl.setDescription("");
		}
		else {
			registerUserImpl.setDescription(description);
		}

		registerUserImpl.resetOriginalValues();

		return registerUserImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		registerUserId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		surname = objectInput.readUTF();
		lastname = objectInput.readUTF();
		nationalId = objectInput.readUTF();
		email = objectInput.readUTF();
		questionType = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(registerUserId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (surname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(surname);
		}

		if (lastname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastname);
		}

		if (nationalId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nationalId);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (questionType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(questionType);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public String uuid;
	public long registerUserId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String surname;
	public String lastname;
	public String nationalId;
	public String email;
	public String questionType;
	public String description;

}