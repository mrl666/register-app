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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

import register.app.backend.exception.NoSuchRegisterUserException;
import register.app.backend.model.RegisterUser;

/**
 * The persistence interface for the register user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegisterUserUtil
 * @generated
 */
@ProviderType
public interface RegisterUserPersistence extends BasePersistence<RegisterUser> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RegisterUserUtil} to access the register user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the register users where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching register users
	 */
	public java.util.List<RegisterUser> findByUuid(String uuid);

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
	public java.util.List<RegisterUser> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<RegisterUser> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegisterUser>
			orderByComparator);

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
	public java.util.List<RegisterUser> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegisterUser>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first register user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching register user
	 * @throws NoSuchRegisterUserException if a matching register user could not be found
	 */
	public RegisterUser findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<RegisterUser>
				orderByComparator)
		throws NoSuchRegisterUserException;

	/**
	 * Returns the first register user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching register user, or <code>null</code> if a matching register user could not be found
	 */
	public RegisterUser fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<RegisterUser>
			orderByComparator);

	/**
	 * Returns the last register user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching register user
	 * @throws NoSuchRegisterUserException if a matching register user could not be found
	 */
	public RegisterUser findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<RegisterUser>
				orderByComparator)
		throws NoSuchRegisterUserException;

	/**
	 * Returns the last register user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching register user, or <code>null</code> if a matching register user could not be found
	 */
	public RegisterUser fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<RegisterUser>
			orderByComparator);

	/**
	 * Returns the register users before and after the current register user in the ordered set where uuid = &#63;.
	 *
	 * @param registerUserId the primary key of the current register user
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next register user
	 * @throws NoSuchRegisterUserException if a register user with the primary key could not be found
	 */
	public RegisterUser[] findByUuid_PrevAndNext(
			long registerUserId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<RegisterUser>
				orderByComparator)
		throws NoSuchRegisterUserException;

	/**
	 * Removes all the register users where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of register users where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching register users
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the register user where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchRegisterUserException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching register user
	 * @throws NoSuchRegisterUserException if a matching register user could not be found
	 */
	public RegisterUser findByUUID_G(String uuid, long groupId)
		throws NoSuchRegisterUserException;

	/**
	 * Returns the register user where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching register user, or <code>null</code> if a matching register user could not be found
	 */
	public RegisterUser fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the register user where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching register user, or <code>null</code> if a matching register user could not be found
	 */
	public RegisterUser fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the register user where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the register user that was removed
	 */
	public RegisterUser removeByUUID_G(String uuid, long groupId)
		throws NoSuchRegisterUserException;

	/**
	 * Returns the number of register users where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching register users
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the register users where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching register users
	 */
	public java.util.List<RegisterUser> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<RegisterUser> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<RegisterUser> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegisterUser>
			orderByComparator);

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
	public java.util.List<RegisterUser> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegisterUser>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first register user in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching register user
	 * @throws NoSuchRegisterUserException if a matching register user could not be found
	 */
	public RegisterUser findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<RegisterUser>
				orderByComparator)
		throws NoSuchRegisterUserException;

	/**
	 * Returns the first register user in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching register user, or <code>null</code> if a matching register user could not be found
	 */
	public RegisterUser fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<RegisterUser>
			orderByComparator);

	/**
	 * Returns the last register user in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching register user
	 * @throws NoSuchRegisterUserException if a matching register user could not be found
	 */
	public RegisterUser findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<RegisterUser>
				orderByComparator)
		throws NoSuchRegisterUserException;

	/**
	 * Returns the last register user in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching register user, or <code>null</code> if a matching register user could not be found
	 */
	public RegisterUser fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<RegisterUser>
			orderByComparator);

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
	public RegisterUser[] findByUuid_C_PrevAndNext(
			long registerUserId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<RegisterUser>
				orderByComparator)
		throws NoSuchRegisterUserException;

	/**
	 * Removes all the register users where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of register users where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching register users
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the register user in the entity cache if it is enabled.
	 *
	 * @param registerUser the register user
	 */
	public void cacheResult(RegisterUser registerUser);

	/**
	 * Caches the register users in the entity cache if it is enabled.
	 *
	 * @param registerUsers the register users
	 */
	public void cacheResult(java.util.List<RegisterUser> registerUsers);

	/**
	 * Creates a new register user with the primary key. Does not add the register user to the database.
	 *
	 * @param registerUserId the primary key for the new register user
	 * @return the new register user
	 */
	public RegisterUser create(long registerUserId);

	/**
	 * Removes the register user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param registerUserId the primary key of the register user
	 * @return the register user that was removed
	 * @throws NoSuchRegisterUserException if a register user with the primary key could not be found
	 */
	public RegisterUser remove(long registerUserId)
		throws NoSuchRegisterUserException;

	public RegisterUser updateImpl(RegisterUser registerUser);

	/**
	 * Returns the register user with the primary key or throws a <code>NoSuchRegisterUserException</code> if it could not be found.
	 *
	 * @param registerUserId the primary key of the register user
	 * @return the register user
	 * @throws NoSuchRegisterUserException if a register user with the primary key could not be found
	 */
	public RegisterUser findByPrimaryKey(long registerUserId)
		throws NoSuchRegisterUserException;

	/**
	 * Returns the register user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param registerUserId the primary key of the register user
	 * @return the register user, or <code>null</code> if a register user with the primary key could not be found
	 */
	public RegisterUser fetchByPrimaryKey(long registerUserId);

	/**
	 * Returns all the register users.
	 *
	 * @return the register users
	 */
	public java.util.List<RegisterUser> findAll();

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
	public java.util.List<RegisterUser> findAll(int start, int end);

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
	public java.util.List<RegisterUser> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegisterUser>
			orderByComparator);

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
	public java.util.List<RegisterUser> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegisterUser>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the register users from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of register users.
	 *
	 * @return the number of register users
	 */
	public int countAll();

}