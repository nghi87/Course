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

package com.liferay.course.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for CourseRegister. This utility wraps
 * {@link com.liferay.course.service.impl.CourseRegisterLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author ces
 * @see CourseRegisterLocalService
 * @see com.liferay.course.service.base.CourseRegisterLocalServiceBaseImpl
 * @see com.liferay.course.service.impl.CourseRegisterLocalServiceImpl
 * @generated
 */
public class CourseRegisterLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.course.service.impl.CourseRegisterLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the course register to the database. Also notifies the appropriate model listeners.
	*
	* @param courseRegister the course register
	* @return the course register that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister addCourseRegister(
		com.liferay.course.model.CourseRegister courseRegister)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCourseRegister(courseRegister);
	}

	/**
	* Creates a new course register with the primary key. Does not add the course register to the database.
	*
	* @param courseRegisterId the primary key for the new course register
	* @return the new course register
	*/
	public static com.liferay.course.model.CourseRegister createCourseRegister(
		long courseRegisterId) {
		return getService().createCourseRegister(courseRegisterId);
	}

	/**
	* Deletes the course register with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param courseRegisterId the primary key of the course register
	* @return the course register that was removed
	* @throws PortalException if a course register with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister deleteCourseRegister(
		long courseRegisterId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCourseRegister(courseRegisterId);
	}

	/**
	* Deletes the course register from the database. Also notifies the appropriate model listeners.
	*
	* @param courseRegister the course register
	* @return the course register that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister deleteCourseRegister(
		com.liferay.course.model.CourseRegister courseRegister)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCourseRegister(courseRegister);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.course.model.impl.CourseRegisterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.course.model.impl.CourseRegisterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.course.model.CourseRegister fetchCourseRegister(
		long courseRegisterId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCourseRegister(courseRegisterId);
	}

	/**
	* Returns the course register with the matching UUID and company.
	*
	* @param uuid the course register's UUID
	* @param companyId the primary key of the company
	* @return the matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister fetchCourseRegisterByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchCourseRegisterByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the course register matching the UUID and group.
	*
	* @param uuid the course register's UUID
	* @param groupId the primary key of the group
	* @return the matching course register, or <code>null</code> if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister fetchCourseRegisterByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCourseRegisterByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the course register with the primary key.
	*
	* @param courseRegisterId the primary key of the course register
	* @return the course register
	* @throws PortalException if a course register with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister getCourseRegister(
		long courseRegisterId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseRegister(courseRegisterId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the course register with the matching UUID and company.
	*
	* @param uuid the course register's UUID
	* @param companyId the primary key of the company
	* @return the matching course register
	* @throws PortalException if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister getCourseRegisterByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseRegisterByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the course register matching the UUID and group.
	*
	* @param uuid the course register's UUID
	* @param groupId the primary key of the group
	* @return the matching course register
	* @throws PortalException if a matching course register could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister getCourseRegisterByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseRegisterByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<com.liferay.course.model.CourseRegister> getCourseRegisters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseRegisters(start, end);
	}

	/**
	* Returns the number of course registers.
	*
	* @return the number of course registers
	* @throws SystemException if a system exception occurred
	*/
	public static int getCourseRegistersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCourseRegistersCount();
	}

	/**
	* Updates the course register in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param courseRegister the course register
	* @return the course register that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.course.model.CourseRegister updateCourseRegister(
		com.liferay.course.model.CourseRegister courseRegister)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCourseRegister(courseRegister);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static CourseRegisterLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CourseRegisterLocalService.class.getName());

			if (invokableLocalService instanceof CourseRegisterLocalService) {
				_service = (CourseRegisterLocalService)invokableLocalService;
			}
			else {
				_service = new CourseRegisterLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CourseRegisterLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CourseRegisterLocalService service) {
	}

	private static CourseRegisterLocalService _service;
}