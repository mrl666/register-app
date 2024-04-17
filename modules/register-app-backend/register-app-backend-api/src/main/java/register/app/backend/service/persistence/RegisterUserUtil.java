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

package register.app.backend.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import register.app.backend.model.RegisterUser;

/**
 * The persistence utility for the register user service. This utility wraps <code>register.app.backend.service.persistence.impl.RegisterUserPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegisterUserPersistence
 * @generated
 */
public class RegisterUserUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(RegisterUser registerUser) {
		getPersistence().clearCache(registerUser);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, RegisterUser> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RegisterUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RegisterUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RegisterUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RegisterUser> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RegisterUser update(RegisterUser registerUser) {
		return getPersistence().update(registerUser);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RegisterUser update(
		RegisterUser registerUser, ServiceContext serviceContext) {

		return getPersistence().update(registerUser, serviceContext);
	}

	/**
	 * Returns all the register users where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching register users
	 */
	public static List<RegisterUser> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the register users where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterUserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of register users
	 * @param end the upper bound of the range of register users (not inclusive)
	 * @return the range of matching register users
	 */
	public static List<RegisterUser> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the register users where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterUserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of register users
	 * @param end the upper bound of the range of register users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching register users
	 */
	public static List<RegisterUser> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<RegisterUser> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the register users where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterUserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of register users
	 * @param end the upper bound of the range of register users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching register users
	 */
	public static List<RegisterUser> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<RegisterUser> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first register user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching register user
	 * @throws NoSuchRegisterUserException if a matching register user could not be found
	 */
	public static RegisterUser findByUuid_First(
			String uuid, OrderByComparator<RegisterUser> orderByComparator)
		throws register.app.backend.exception.NoSuchRegisterUserException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first register user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching register user, or <code>null</code> if a matching register user could not be found
	 */
	public static RegisterUser fetchByUuid_First(
		String uuid, OrderByComparator<RegisterUser> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last register user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching register user
	 * @throws NoSuchRegisterUserException if a matching register user could not be found
	 */
	public static RegisterUser findByUuid_Last(
			String uuid, OrderByComparator<RegisterUser> orderByComparator)
		throws register.app.backend.exception.NoSuchRegisterUserException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last register user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching register user, or <code>null</code> if a matching register user could not be found
	 */
	public static RegisterUser fetchByUuid_Last(
		String uuid, OrderByComparator<RegisterUser> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the register users before and after the current register user in the ordered set where uuid = &#63;.
	 *
	 * @param registerUserId the primary key of the current register user
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next register user
	 * @throws NoSuchRegisterUserException if a register user with the primary key could not be found
	 */
	public static RegisterUser[] findByUuid_PrevAndNext(
			long registerUserId, String uuid,
			OrderByComparator<RegisterUser> orderByComparator)
		throws register.app.backend.exception.NoSuchRegisterUserException {

		return getPersistence().findByUuid_PrevAndNext(
			registerUserId, uuid, orderByComparator);
	}

	/**
	 * Removes all the register users where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of register users where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching register users
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the register user where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchRegisterUserException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching register user
	 * @throws NoSuchRegisterUserException if a matching register user could not be found
	 */
	public static RegisterUser findByUUID_G(String uuid, long groupId)
		throws register.app.backend.exception.NoSuchRegisterUserException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the register user where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching register user, or <code>null</code> if a matching register user could not be found
	 */
	public static RegisterUser fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the register user where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching register user, or <code>null</code> if a matching register user could not be found
	 */
	public static RegisterUser fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the register user where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the register user that was removed
	 */
	public static RegisterUser removeByUUID_G(String uuid, long groupId)
		throws register.app.backend.exception.NoSuchRegisterUserException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of register users where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching register users
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the register users where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching register users
	 */
	public static List<RegisterUser> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the register users where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterUserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of register users
	 * @param end the upper bound of the range of register users (not inclusive)
	 * @return the range of matching register users
	 */
	public static List<RegisterUser> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the register users where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterUserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of register users
	 * @param end the upper bound of the range of register users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching register users
	 */
	public static List<RegisterUser> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<RegisterUser> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the register users where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterUserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of register users
	 * @param end the upper bound of the range of register users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching register users
	 */
	public static List<RegisterUser> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<RegisterUser> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first register user in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching register user
	 * @throws NoSuchRegisterUserException if a matching register user could not be found
	 */
	public static RegisterUser findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<RegisterUser> orderByComparator)
		throws register.app.backend.exception.NoSuchRegisterUserException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first register user in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching register user, or <code>null</code> if a matching register user could not be found
	 */
	public static RegisterUser fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<RegisterUser> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last register user in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching register user
	 * @throws NoSuchRegisterUserException if a matching register user could not be found
	 */
	public static RegisterUser findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<RegisterUser> orderByComparator)
		throws register.app.backend.exception.NoSuchRegisterUserException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last register user in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching register user, or <code>null</code> if a matching register user could not be found
	 */
	public static RegisterUser fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<RegisterUser> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the register users before and after the current register user in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param registerUserId the primary key of the current register user
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next register user
	 * @throws NoSuchRegisterUserException if a register user with the primary key could not be found
	 */
	public static RegisterUser[] findByUuid_C_PrevAndNext(
			long registerUserId, String uuid, long companyId,
			OrderByComparator<RegisterUser> orderByComparator)
		throws register.app.backend.exception.NoSuchRegisterUserException {

		return getPersistence().findByUuid_C_PrevAndNext(
			registerUserId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the register users where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of register users where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching register users
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the register users where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching register users
	 */
	public static List<RegisterUser> findByName(String name) {
		return getPersistence().findByName(name);
	}

	/**
	 * Returns a range of all the register users where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterUserModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of register users
	 * @param end the upper bound of the range of register users (not inclusive)
	 * @return the range of matching register users
	 */
	public static List<RegisterUser> findByName(
		String name, int start, int end) {

		return getPersistence().findByName(name, start, end);
	}

	/**
	 * Returns an ordered range of all the register users where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterUserModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of register users
	 * @param end the upper bound of the range of register users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching register users
	 */
	public static List<RegisterUser> findByName(
		String name, int start, int end,
		OrderByComparator<RegisterUser> orderByComparator) {

		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the register users where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterUserModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of register users
	 * @param end the upper bound of the range of register users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching register users
	 */
	public static List<RegisterUser> findByName(
		String name, int start, int end,
		OrderByComparator<RegisterUser> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByName(
			name, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first register user in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching register user
	 * @throws NoSuchRegisterUserException if a matching register user could not be found
	 */
	public static RegisterUser findByName_First(
			String name, OrderByComparator<RegisterUser> orderByComparator)
		throws register.app.backend.exception.NoSuchRegisterUserException {

		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	 * Returns the first register user in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching register user, or <code>null</code> if a matching register user could not be found
	 */
	public static RegisterUser fetchByName_First(
		String name, OrderByComparator<RegisterUser> orderByComparator) {

		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	 * Returns the last register user in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching register user
	 * @throws NoSuchRegisterUserException if a matching register user could not be found
	 */
	public static RegisterUser findByName_Last(
			String name, OrderByComparator<RegisterUser> orderByComparator)
		throws register.app.backend.exception.NoSuchRegisterUserException {

		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the last register user in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching register user, or <code>null</code> if a matching register user could not be found
	 */
	public static RegisterUser fetchByName_Last(
		String name, OrderByComparator<RegisterUser> orderByComparator) {

		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the register users before and after the current register user in the ordered set where name = &#63;.
	 *
	 * @param registerUserId the primary key of the current register user
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next register user
	 * @throws NoSuchRegisterUserException if a register user with the primary key could not be found
	 */
	public static RegisterUser[] findByName_PrevAndNext(
			long registerUserId, String name,
			OrderByComparator<RegisterUser> orderByComparator)
		throws register.app.backend.exception.NoSuchRegisterUserException {

		return getPersistence().findByName_PrevAndNext(
			registerUserId, name, orderByComparator);
	}

	/**
	 * Removes all the register users where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public static void removeByName(String name) {
		getPersistence().removeByName(name);
	}

	/**
	 * Returns the number of register users where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching register users
	 */
	public static int countByName(String name) {
		return getPersistence().countByName(name);
	}

	/**
	 * Caches the register user in the entity cache if it is enabled.
	 *
	 * @param registerUser the register user
	 */
	public static void cacheResult(RegisterUser registerUser) {
		getPersistence().cacheResult(registerUser);
	}

	/**
	 * Caches the register users in the entity cache if it is enabled.
	 *
	 * @param registerUsers the register users
	 */
	public static void cacheResult(List<RegisterUser> registerUsers) {
		getPersistence().cacheResult(registerUsers);
	}

	/**
	 * Creates a new register user with the primary key. Does not add the register user to the database.
	 *
	 * @param registerUserId the primary key for the new register user
	 * @return the new register user
	 */
	public static RegisterUser create(long registerUserId) {
		return getPersistence().create(registerUserId);
	}

	/**
	 * Removes the register user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param registerUserId the primary key of the register user
	 * @return the register user that was removed
	 * @throws NoSuchRegisterUserException if a register user with the primary key could not be found
	 */
	public static RegisterUser remove(long registerUserId)
		throws register.app.backend.exception.NoSuchRegisterUserException {

		return getPersistence().remove(registerUserId);
	}

	public static RegisterUser updateImpl(RegisterUser registerUser) {
		return getPersistence().updateImpl(registerUser);
	}

	/**
	 * Returns the register user with the primary key or throws a <code>NoSuchRegisterUserException</code> if it could not be found.
	 *
	 * @param registerUserId the primary key of the register user
	 * @return the register user
	 * @throws NoSuchRegisterUserException if a register user with the primary key could not be found
	 */
	public static RegisterUser findByPrimaryKey(long registerUserId)
		throws register.app.backend.exception.NoSuchRegisterUserException {

		return getPersistence().findByPrimaryKey(registerUserId);
	}

	/**
	 * Returns the register user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param registerUserId the primary key of the register user
	 * @return the register user, or <code>null</code> if a register user with the primary key could not be found
	 */
	public static RegisterUser fetchByPrimaryKey(long registerUserId) {
		return getPersistence().fetchByPrimaryKey(registerUserId);
	}

	/**
	 * Returns all the register users.
	 *
	 * @return the register users
	 */
	public static List<RegisterUser> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the register users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterUserModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of register users
	 * @param end the upper bound of the range of register users (not inclusive)
	 * @return the range of register users
	 */
	public static List<RegisterUser> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the register users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterUserModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of register users
	 * @param end the upper bound of the range of register users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of register users
	 */
	public static List<RegisterUser> findAll(
		int start, int end, OrderByComparator<RegisterUser> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the register users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterUserModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of register users
	 * @param end the upper bound of the range of register users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of register users
	 */
	public static List<RegisterUser> findAll(
		int start, int end, OrderByComparator<RegisterUser> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the register users from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of register users.
	 *
	 * @return the number of register users
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RegisterUserPersistence getPersistence() {
		return _persistence;
	}

	private static volatile RegisterUserPersistence _persistence;

}