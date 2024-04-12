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
 * Provides a wrapper for {@link RegisterUserLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RegisterUserLocalService
 * @generated
 */
public class RegisterUserLocalServiceWrapper
	implements RegisterUserLocalService,
			   ServiceWrapper<RegisterUserLocalService> {

	public RegisterUserLocalServiceWrapper(
		RegisterUserLocalService registerUserLocalService) {

		_registerUserLocalService = registerUserLocalService;
	}

	@Override
	public register.app.backend.model.RegisterUser addRegisterUser(
			long scopeGroupId, String nameInput, String surnameInput,
			String lastnameInput, String nationalIdInput, String emailInput,
			String questionTypeInput, String descriptionInput,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerUserLocalService.addRegisterUser(
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
	@Override
	public register.app.backend.model.RegisterUser addRegisterUser(
		register.app.backend.model.RegisterUser registerUser) {

		return _registerUserLocalService.addRegisterUser(registerUser);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerUserLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new register user with the primary key. Does not add the register user to the database.
	 *
	 * @param registerUserId the primary key for the new register user
	 * @return the new register user
	 */
	@Override
	public register.app.backend.model.RegisterUser createRegisterUser(
		long registerUserId) {

		return _registerUserLocalService.createRegisterUser(registerUserId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerUserLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public register.app.backend.model.RegisterUser deleteRegisterUser(
			long registerUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerUserLocalService.deleteRegisterUser(registerUserId);
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
	@Override
	public register.app.backend.model.RegisterUser deleteRegisterUser(
			register.app.backend.model.RegisterUser registerUser)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerUserLocalService.deleteRegisterUser(registerUser);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _registerUserLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _registerUserLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _registerUserLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _registerUserLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _registerUserLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _registerUserLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public register.app.backend.model.RegisterUser fetchRegisterUser(
		long registerUserId) {

		return _registerUserLocalService.fetchRegisterUser(registerUserId);
	}

	/**
	 * Returns the register user matching the UUID and group.
	 *
	 * @param uuid the register user's UUID
	 * @param groupId the primary key of the group
	 * @return the matching register user, or <code>null</code> if a matching register user could not be found
	 */
	@Override
	public register.app.backend.model.RegisterUser
		fetchRegisterUserByUuidAndGroupId(String uuid, long groupId) {

		return _registerUserLocalService.fetchRegisterUserByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _registerUserLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _registerUserLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _registerUserLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _registerUserLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerUserLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the register user with the primary key.
	 *
	 * @param registerUserId the primary key of the register user
	 * @return the register user
	 * @throws PortalException if a register user with the primary key could not be found
	 */
	@Override
	public register.app.backend.model.RegisterUser getRegisterUser(
			long registerUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerUserLocalService.getRegisterUser(registerUserId);
	}

	/**
	 * Returns the register user matching the UUID and group.
	 *
	 * @param uuid the register user's UUID
	 * @param groupId the primary key of the group
	 * @return the matching register user
	 * @throws PortalException if a matching register user could not be found
	 */
	@Override
	public register.app.backend.model.RegisterUser
			getRegisterUserByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerUserLocalService.getRegisterUserByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<register.app.backend.model.RegisterUser>
		getRegisterUsers(int start, int end) {

		return _registerUserLocalService.getRegisterUsers(start, end);
	}

	@Override
	public java.util.List<register.app.backend.model.RegisterUser>
		getRegisterUsersByKeywords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<register.app.backend.model.RegisterUser> orderByComparator) {

		return _registerUserLocalService.getRegisterUsersByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	/**
	 * Returns all the register users matching the UUID and company.
	 *
	 * @param uuid the UUID of the register users
	 * @param companyId the primary key of the company
	 * @return the matching register users, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<register.app.backend.model.RegisterUser>
		getRegisterUsersByUuidAndCompanyId(String uuid, long companyId) {

		return _registerUserLocalService.getRegisterUsersByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<register.app.backend.model.RegisterUser>
		getRegisterUsersByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<register.app.backend.model.RegisterUser> orderByComparator) {

		return _registerUserLocalService.getRegisterUsersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of register users.
	 *
	 * @return the number of register users
	 */
	@Override
	public int getRegisterUsersCount() {
		return _registerUserLocalService.getRegisterUsersCount();
	}

	@Override
	public long getRegisterUsersCountByKeywords(long groupId, String keywords) {
		return _registerUserLocalService.getRegisterUsersCountByKeywords(
			groupId, keywords);
	}

	@Override
	public register.app.backend.model.RegisterUser updateRegisterUser(
			long registerUserId, long scopeGroupId, String nameInput,
			String surnameInput, String lastnameInput, String nationalIdInput,
			String emailInput, String questionTypeInput,
			String descriptionInput,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerUserLocalService.updateRegisterUser(
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
	@Override
	public register.app.backend.model.RegisterUser updateRegisterUser(
		register.app.backend.model.RegisterUser registerUser) {

		return _registerUserLocalService.updateRegisterUser(registerUser);
	}

	@Override
	public RegisterUserLocalService getWrappedService() {
		return _registerUserLocalService;
	}

	@Override
	public void setWrappedService(
		RegisterUserLocalService registerUserLocalService) {

		_registerUserLocalService = registerUserLocalService;
	}

	private RegisterUserLocalService _registerUserLocalService;

}