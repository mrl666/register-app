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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

import register.app.backend.model.RegisterUser;

/**
 * Provides the local service utility for RegisterUser. This utility wraps
 * <code>register.app.backend.service.impl.RegisterUserLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RegisterUserLocalService
 * @generated
 */
public class RegisterUserLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>register.app.backend.service.impl.RegisterUserLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static RegisterUser addRegisterUser(
			long scopeGroupId, String nameInput, String surnameInput,
			String lastnameInput, String nationalIdInput, String emailInput,
			String questionTypeInput, String descriptionInput,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addRegisterUser(
			scopeGroupId, nameInput, surnameInput, lastnameInput,
			nationalIdInput, emailInput, questionTypeInput, descriptionInput,
			serviceContext);
	}

	/**
	 * Adds the register user to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RegisterUserLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param registerUser the register user
	 * @return the register user that was added
	 */
	public static RegisterUser addRegisterUser(RegisterUser registerUser) {
		return getService().addRegisterUser(registerUser);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new register user with the primary key. Does not add the register user to the database.
	 *
	 * @param registerUserId the primary key for the new register user
	 * @return the new register user
	 */
	public static RegisterUser createRegisterUser(long registerUserId) {
		return getService().createRegisterUser(registerUserId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the register user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RegisterUserLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param registerUserId the primary key of the register user
	 * @return the register user that was removed
	 * @throws PortalException if a register user with the primary key could not be found
	 */
	public static RegisterUser deleteRegisterUser(long registerUserId)
		throws PortalException {

		return getService().deleteRegisterUser(registerUserId);
	}

	/**
	 * Deletes the register user from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RegisterUserLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param registerUser the register user
	 * @return the register user that was removed
	 * @throws PortalException
	 */
	public static RegisterUser deleteRegisterUser(RegisterUser registerUser)
		throws PortalException {

		return getService().deleteRegisterUser(registerUser);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>register.app.backend.model.impl.RegisterUserModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>register.app.backend.model.impl.RegisterUserModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static RegisterUser fetchRegisterUser(long registerUserId) {
		return getService().fetchRegisterUser(registerUserId);
	}

	/**
	 * Returns the register user matching the UUID and group.
	 *
	 * @param uuid the register user's UUID
	 * @param groupId the primary key of the group
	 * @return the matching register user, or <code>null</code> if a matching register user could not be found
	 */
	public static RegisterUser fetchRegisterUserByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchRegisterUserByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the register user with the primary key.
	 *
	 * @param registerUserId the primary key of the register user
	 * @return the register user
	 * @throws PortalException if a register user with the primary key could not be found
	 */
	public static RegisterUser getRegisterUser(long registerUserId)
		throws PortalException {

		return getService().getRegisterUser(registerUserId);
	}

	/**
	 * Returns the register user matching the UUID and group.
	 *
	 * @param uuid the register user's UUID
	 * @param groupId the primary key of the group
	 * @return the matching register user
	 * @throws PortalException if a matching register user could not be found
	 */
	public static RegisterUser getRegisterUserByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getRegisterUserByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the register users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>register.app.backend.model.impl.RegisterUserModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of register users
	 * @param end the upper bound of the range of register users (not inclusive)
	 * @return the range of register users
	 */
	public static List<RegisterUser> getRegisterUsers(int start, int end) {
		return getService().getRegisterUsers(start, end);
	}

	public static List<RegisterUser> getRegisterUsersByKeywords(
		long groupId, String keywords, int start, int end,
		OrderByComparator<RegisterUser> orderByComparator) {

		return getService().getRegisterUsersByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	/**
	 * Returns all the register users matching the UUID and company.
	 *
	 * @param uuid the UUID of the register users
	 * @param companyId the primary key of the company
	 * @return the matching register users, or an empty list if no matches were found
	 */
	public static List<RegisterUser> getRegisterUsersByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getRegisterUsersByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of register users matching the UUID and company.
	 *
	 * @param uuid the UUID of the register users
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of register users
	 * @param end the upper bound of the range of register users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching register users, or an empty list if no matches were found
	 */
	public static List<RegisterUser> getRegisterUsersByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<RegisterUser> orderByComparator) {

		return getService().getRegisterUsersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of register users.
	 *
	 * @return the number of register users
	 */
	public static int getRegisterUsersCount() {
		return getService().getRegisterUsersCount();
	}

	public static long getRegisterUsersCountByKeywords(
		long groupId, String keywords) {

		return getService().getRegisterUsersCountByKeywords(groupId, keywords);
	}

	public static RegisterUser updateRegisterUser(
			long registerUserId, long scopeGroupId, String nameInput,
			String surnameInput, String lastnameInput, String nationalIdInput,
			String emailInput, String questionTypeInput,
			String descriptionInput,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateRegisterUser(
			registerUserId, scopeGroupId, nameInput, surnameInput,
			lastnameInput, nationalIdInput, emailInput, questionTypeInput,
			descriptionInput, serviceContext);
	}

	/**
	 * Updates the register user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RegisterUserLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param registerUser the register user
	 * @return the register user that was updated
	 */
	public static RegisterUser updateRegisterUser(RegisterUser registerUser) {
		return getService().updateRegisterUser(registerUser);
	}

	public static RegisterUserLocalService getService() {
		return _service;
	}

	private static volatile RegisterUserLocalService _service;

}