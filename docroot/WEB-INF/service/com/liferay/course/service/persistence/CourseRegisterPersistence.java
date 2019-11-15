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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the course register service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ces
 * @see CourseRegisterPersistenceImpl
 * @see CourseRegisterUtil
 * @generated
 */
public interface CourseRegisterPersistence extends BasePersistence<CourseRegister> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CourseRegisterUtil} to access the course register persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the course registers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.course.model.CourseRegister> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.course.model.CourseRegister> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.course.model.CourseRegister> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first course register in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course register
	* @throws com.liferay.course.NoSuchCourseRegisterException if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.course.model.CourseRegister findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first course register in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.course.model.CourseRegister fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last course register in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course register
	* @throws com.liferay.course.NoSuchCourseRegisterException if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.course.model.CourseRegister findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last course register in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.course.model.CourseRegister fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.course.model.CourseRegister[] findByUuid_PrevAndNext(
		long courseRegisterId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the course registers where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course registers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the course register where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.course.NoSuchCourseRegisterException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching course register
	* @throws com.liferay.course.NoSuchCourseRegisterException if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.course.model.CourseRegister findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the course register where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.course.model.CourseRegister fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the course register where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.course.model.CourseRegister fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the course register where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the course register that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.course.model.CourseRegister removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course registers where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the course registers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.course.model.CourseRegister> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.course.model.CourseRegister> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.course.model.CourseRegister> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.course.model.CourseRegister findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first course register in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.course.model.CourseRegister fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.course.model.CourseRegister findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last course register in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.course.model.CourseRegister fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.course.model.CourseRegister[] findByUuid_C_PrevAndNext(
		long courseRegisterId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the course registers where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course registers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the course registers where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.course.model.CourseRegister> findBystatus(
		long userId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.course.model.CourseRegister> findBystatus(
		long userId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.course.model.CourseRegister> findBystatus(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.course.model.CourseRegister findBystatus_First(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first course register in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.course.model.CourseRegister fetchBystatus_First(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.course.model.CourseRegister findBystatus_Last(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last course register in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.course.model.CourseRegister fetchBystatus_Last(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.course.model.CourseRegister[] findBystatus_PrevAndNext(
		long courseRegisterId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the course registers where userId = &#63; and status = &#63; from the database.
	*
	* @param userId the user ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeBystatus(long userId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course registers where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the number of matching course registers
	* @throws SystemException if a system exception occurred
	*/
	public int countBystatus(long userId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the course register in the entity cache if it is enabled.
	*
	* @param courseRegister the course register
	*/
	public void cacheResult(
		com.liferay.course.model.CourseRegister courseRegister);

	/**
	* Caches the course registers in the entity cache if it is enabled.
	*
	* @param courseRegisters the course registers
	*/
	public void cacheResult(
		java.util.List<com.liferay.course.model.CourseRegister> courseRegisters);

	/**
	* Creates a new course register with the primary key. Does not add the course register to the database.
	*
	* @param courseRegisterId the primary key for the new course register
	* @return the new course register
	*/
	public com.liferay.course.model.CourseRegister create(long courseRegisterId);

	/**
	* Removes the course register with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param courseRegisterId the primary key of the course register
	* @return the course register that was removed
	* @throws com.liferay.course.NoSuchCourseRegisterException if a course register with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.course.model.CourseRegister remove(long courseRegisterId)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.course.model.CourseRegister updateImpl(
		com.liferay.course.model.CourseRegister courseRegister)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the course register with the primary key or throws a {@link com.liferay.course.NoSuchCourseRegisterException} if it could not be found.
	*
	* @param courseRegisterId the primary key of the course register
	* @return the course register
	* @throws com.liferay.course.NoSuchCourseRegisterException if a course register with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.course.model.CourseRegister findByPrimaryKey(
		long courseRegisterId)
		throws com.liferay.course.NoSuchCourseRegisterException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the course register with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param courseRegisterId the primary key of the course register
	* @return the course register, or <code>null</code> if a course register with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.course.model.CourseRegister fetchByPrimaryKey(
		long courseRegisterId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the course registers.
	*
	* @return the course registers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.course.model.CourseRegister> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.course.model.CourseRegister> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.course.model.CourseRegister> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the course registers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of course registers.
	*
	* @return the number of course registers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}