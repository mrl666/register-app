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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

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
	public static register.app.backend.model.RegisterUser addRegisterUser(
			long scopeGroupId, String nameInput, String surnameInput,
			String lastnameInput, String nationalIdInput, String emailInput,
			String questionTypeInput, String descriptionInput,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

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
	public static register.app.backend.model.RegisterUser addRegisterUser(
		register.app.backend.model.RegisterUser registerUser) {

		return getService().addRegisterUser(registerUser);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new register user with the primary key. Does not add the register user to the database.
	 *
	 * @param registerUserId the primary key for the new register user
	 * @return the new register user
	 */
	public static register.app.backend.model.RegisterUser createRegisterUser(
		long registerUserId) {

		return getService().createRegisterUser(registerUserId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

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
	public static register.app.backend.model.RegisterUser deleteRegisterUser(
			long registerUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

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
	public static register.app.backend.model.RegisterUser deleteRegisterUser(
			register.app.backend.model.RegisterUser registerUser)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteRegisterUser(registerUser);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

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
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static register.app.backend.model.RegisterUser fetchRegisterUser(
		long registerUserId) {

		return getService().fetchRegisterUser(registerUserId);
	}

	/**
	 * Returns the register user matching the UUID and group.
	 *
	 * @param uuid the register user's UUID
	 * @param groupId the primary key of the group
	 * @return the matching register user, or <code>null</code> if a matching register user could not be found
	 */
	public static register.app.backend.model.RegisterUser
		fetchRegisterUserByUuidAndGroupId(String uuid, long groupId) {

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
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the register user with the primary key.
	 *
	 * @param registerUserId the primary key of the register user
	 * @return the register user
	 * @throws PortalException if a register user with the primary key could not be found
	 */
	public static register.app.backend.model.RegisterUser getRegisterUser(
			long registerUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

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
	public static register.app.backend.model.RegisterUser
			getRegisterUserByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

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
	public static java.util.List<register.app.backend.model.RegisterUser>
		getRegisterUsers(int start, int end) {

		return getService().getRegisterUsers(start, end);
	}

	public static java.util.List<register.app.backend.model.RegisterUser>
		getRegisterUsersByKeywords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<register.app.backend.model.RegisterUser> orderByComparator) {

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
	public static java.util.List<register.app.backend.model.RegisterUser>
		getRegisterUsersByUuidAndCompanyId(String uuid, long companyId) {

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
	public static java.util.List<register.app.backend.model.RegisterUser>
		getRegisterUsersByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<register.app.backend.model.RegisterUser> orderByComparator) {

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

	public static register.app.backend.model.RegisterUser updateRegisterUser(
			long registerUserId, long scopeGroupId, String nameInput,
			String surnameInput, String lastnameInput, String nationalIdInput,
			String emailInput, String questionTypeInput,
			String descriptionInput,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

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
	public static register.app.backend.model.RegisterUser updateRegisterUser(
		register.app.backend.model.RegisterUser registerUser) {

		return getService().updateRegisterUser(registerUser);
	}

	public static RegisterUserLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<RegisterUserLocalService, RegisterUserLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(RegisterUserLocalService.class);

		ServiceTracker<RegisterUserLocalService, RegisterUserLocalService>
			serviceTracker =
				new ServiceTracker
					<RegisterUserLocalService, RegisterUserLocalService>(
						bundle.getBundleContext(),
						RegisterUserLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}