/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.course.service.persistence;

import com.liferay.course.model.CourseRegister;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the course register service. This utility wraps {@link CourseRegisterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ces
 * @see CourseRegisterPersistence
 * @see CourseRegisterPersistenceImpl
 * @generated
 */
public class CourseRegisterUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(CourseRegister courseRegister) {
		getPersistence().clearCache(courseRegister);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CourseRegister> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CourseRegister> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CourseRegister> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CourseRegister update(CourseRegister courseRegister)
		throws SystemException {
		return getPersistence().update(courseRegister);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CourseRegister update(CourseRegister courseRegister,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(courseRegister, serviceContext);
	}

	/**
	* Returns all the course registers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.course.model.CourseRegister> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the course registers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.course.model.impl.CourseRegisterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of course registers
	* @param end the upper bound of the range of course registers (not inclusive)
	* @return the range of matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.course.model.CourseRegister> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the course registers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.course.model.impl.CourseRegisterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of course registers
	* @param end the upper bound of the range of course registers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.course.model.CourseRegister> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first course register in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course register
	* @throws com.liferay.course.NoSuchCourseRegisterException if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first course register in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last course register in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course register
	* @throws com.liferay.course.NoSuchCourseRegisterException if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last course register in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the course registers before and after the current course register in the ordered set where uuid = &#63;.
	*
	* @param courseRegisterId the primary key of the current course register
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next course register
	* @throws com.liferay.course.NoSuchCourseRegisterException if a course register with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister[] findByUuid_PrevAndNext(
		long courseRegisterId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_PrevAndNext(courseRegisterId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the course registers where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of course registers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the course register where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.course.NoSuchCourseRegisterException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching course register
	* @throws com.liferay.course.NoSuchCourseRegisterException if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the course register where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the course register where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the course register where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the course register that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of course registers where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the course registers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.course.model.CourseRegister> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the course registers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.course.model.impl.CourseRegisterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of course registers
	* @param end the upper bound of the range of course registers (not inclusive)
	* @return the range of matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.course.model.CourseRegister> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the course registers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.course.model.impl.CourseRegisterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of course registers
	* @param end the upper bound of the range of course registers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.course.model.CourseRegister> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first course register in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course register
	* @throws com.liferay.course.NoSuchCourseRegisterException if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first course register in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last course register in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course register
	* @throws com.liferay.course.NoSuchCourseRegisterException if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last course register in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the course registers before and after the current course register in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param courseRegisterId the primary key of the current course register
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next course register
	* @throws com.liferay.course.NoSuchCourseRegisterException if a course register with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister[] findByUuid_C_PrevAndNext(
		long courseRegisterId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(courseRegisterId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the course registers where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of course registers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the course registers where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.course.model.CourseRegister> findBystatus(
		long userId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBystatus(userId, status);
	}

	/**
	* Returns a range of all the course registers where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.course.model.impl.CourseRegisterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of course registers
	* @param end the upper bound of the range of course registers (not inclusive)
	* @return the range of matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.course.model.CourseRegister> findBystatus(
		long userId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBystatus(userId, status, start, end);
	}

	/**
	* Returns an ordered range of all the course registers where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.course.model.impl.CourseRegisterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of course registers
	* @param end the upper bound of the range of course registers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.course.model.CourseRegister> findBystatus(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBystatus(userId, status, start, end, orderByComparator);
	}

	/**
	* Returns the first course register in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course register
	* @throws com.liferay.course.NoSuchCourseRegisterException if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister findBystatus_First(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBystatus_First(userId, status, orderByComparator);
	}

	/**
	* Returns the first course register in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister fetchBystatus_First(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBystatus_First(userId, status, orderByComparator);
	}

	/**
	* Returns the last course register in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course register
	* @throws com.liferay.course.NoSuchCourseRegisterException if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister findBystatus_Last(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBystatus_Last(userId, status, orderByComparator);
	}

	/**
	* Returns the last course register in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister fetchBystatus_Last(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBystatus_Last(userId, status, orderByComparator);
	}

	/**
	* Returns the course registers before and after the current course register in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param courseRegisterId the primary key of the current course register
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next course register
	* @throws com.liferay.course.NoSuchCourseRegisterException if a course register with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister[] findBystatus_PrevAndNext(
		long courseRegisterId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBystatus_PrevAndNext(courseRegisterId, userId, status,
			orderByComparator);
	}

	/**
	* Removes all the course registers where userId = &#63; and status = &#63; from the database.
	*
	* @param userId the user ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBystatus(long userId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBystatus(userId, status);
	}

	/**
	* Returns the number of course registers where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the number of matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public static int countBystatus(long userId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBystatus(userId, status);
	}

	/**
	* Caches the course register in the entity cache if it is enabled.
	*
	* @param courseRegister the course register
	*/
	public static void cacheResult(
		com.liferay.course.model.CourseRegister courseRegister) {
		getPersistence().cacheResult(courseRegister);
	}

	/**
	* Caches the course registers in the entity cache if it is enabled.
	*
	* @param courseRegisters the course registers
	*/
	public static void cacheResult(
		java.util.List<com.liferay.course.model.CourseRegister> courseRegisters) {
		getPersistence().cacheResult(courseRegisters);
	}

	/**
	* Creates a new course register with the primary key. Does not add the course register to the database.
	*
	* @param courseRegisterId the primary key for the new course register
	* @return the new course register
	*/
	public static com.liferay.course.model.CourseRegister create(
		long courseRegisterId) {
		return getPersistence().create(courseRegisterId);
	}

	/**
	* Removes the course register with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param courseRegisterId the primary key of the course register
	* @return the course register that was removed
	* @throws com.liferay.course.NoSuchCourseRegisterException if a course register with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister remove(
		long courseRegisterId)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(courseRegisterId);
	}

	public static com.liferay.course.model.CourseRegister updateImpl(
		com.liferay.course.model.CourseRegister courseRegister)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(courseRegister);
	}

	/**
	* Returns the course register with the primary key or throws a {@link com.liferay.course.NoSuchCourseRegisterException} if it could not be found.
	*
	* @param courseRegisterId the primary key of the course register
	* @return the course register
	* @throws com.liferay.course.NoSuchCourseRegisterException if a course register with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister findByPrimaryKey(
		long courseRegisterId)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(courseRegisterId);
	}

	/**
	* Returns the course register with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param courseRegisterId the primary key of the course register
	* @return the course register, or <code>null</code> if a course register with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister fetchByPrimaryKey(
		long courseRegisterId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(courseRegisterId);
	}

	/**
	* Returns all the course registers.
	*
	* @return the course registers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.course.model.CourseRegister> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the course registers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.course.model.impl.CourseRegisterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of course registers
	* @param end the upper bound of the range of course registers (not inclusive)
	* @return the range of course registers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.course.model.CourseRegister> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the course registers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.course.model.impl.CourseRegisterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of course registers
	* @param end the upper bound of the range of course registers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of course registers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.course.model.CourseRegister> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the course registers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of course registers.
	*
	* @return the number of course registers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CourseRegisterPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CourseRegisterPersistence)PortletBeanLocatorUtil.locate(com.liferay.course.service.ClpSerializer.getServletContextName(),
					CourseRegisterPersistence.class.getName());

			ReferenceRegistry.registerReference(CourseRegisterUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CourseRegisterPersistence persistence) {
	}

	private static CourseRegisterPersistence _persistence;
}