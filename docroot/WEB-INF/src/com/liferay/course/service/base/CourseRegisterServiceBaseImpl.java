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

package com.liferay.course.service.base;

import com.liferay.course.model.CourseRegister;
import com.liferay.course.service.CourseRegisterService;
import com.liferay.course.service.persistence.CoursePersistence;
import com.liferay.course.service.persistence.CourseRegisterPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the course register remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.course.service.impl.CourseRegisterServiceImpl}.
 * </p>
 *
 * @author ces
 * @see com.liferay.course.service.impl.CourseRegisterServiceImpl
 * @see com.liferay.course.service.CourseRegisterServiceUtil
 * @generated
 */
public abstract class CourseRegisterServiceBaseImpl extends BaseServiceImpl
	implements CourseRegisterService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.course.service.CourseRegisterServiceUtil} to access the course register remote service.
	 */

	/**
	 * Returns the course local service.
	 *
	 * @return the course local service
	 */
	public com.liferay.course.service.CourseLocalService getCourseLocalService() {
		return courseLocalService;
	}

	/**
	 * Sets the course local service.
	 *
	 * @param courseLocalService the course local service
	 */
	public void setCourseLocalService(
		com.liferay.course.service.CourseLocalService courseLocalService) {
		this.courseLocalService = courseLocalService;
	}

	/**
	 * Returns the course remote service.
	 *
	 * @return the course remote service
	 */
	public com.liferay.course.service.CourseService getCourseService() {
		return courseService;
	}

	/**
	 * Sets the course remote service.
	 *
	 * @param courseService the course remote service
	 */
	public void setCourseService(
		com.liferay.course.service.CourseService courseService) {
		this.courseService = courseService;
	}

	/**
	 * Returns the course persistence.
	 *
	 * @return the course persistence
	 */
	public CoursePersistence getCoursePersistence() {
		return coursePersistence;
	}

	/**
	 * Sets the course persistence.
	 *
	 * @param coursePersistence the course persistence
	 */
	public void setCoursePersistence(CoursePersistence coursePersistence) {
		this.coursePersistence = coursePersistence;
	}

	/**
	 * Returns the course register local service.
	 *
	 * @return the course register local service
	 */
	public com.liferay.course.service.CourseRegisterLocalService getCourseRegisterLocalService() {
		return courseRegisterLocalService;
	}

	/**
	 * Sets the course register local service.
	 *
	 * @param courseRegisterLocalService the course register local service
	 */
	public void setCourseRegisterLocalService(
		com.liferay.course.service.CourseRegisterLocalService courseRegisterLocalService) {
		this.courseRegisterLocalService = courseRegisterLocalService;
	}

	/**
	 * Returns the course register remote service.
	 *
	 * @return the course register remote service
	 */
	public com.liferay.course.service.CourseRegisterService getCourseRegisterService() {
		return courseRegisterService;
	}

	/**
	 * Sets the course register remote service.
	 *
	 * @param courseRegisterService the course register remote service
	 */
	public void setCourseRegisterService(
		com.liferay.course.service.CourseRegisterService courseRegisterService) {
		this.courseRegisterService = courseRegisterService;
	}

	/**
	 * Returns the course register persistence.
	 *
	 * @return the course register persistence
	 */
	public CourseRegisterPersistence getCourseRegisterPersistence() {
		return courseRegisterPersistence;
	}

	/**
	 * Sets the course register persistence.
	 *
	 * @param courseRegisterPersistence the course register persistence
	 */
	public void setCourseRegisterPersistence(
		CourseRegisterPersistence courseRegisterPersistence) {
		this.courseRegisterPersistence = courseRegisterPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return CourseRegister.class;
	}

	protected String getModelClassName() {
		return CourseRegister.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = courseRegisterPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.course.service.CourseLocalService.class)
	protected com.liferay.course.service.CourseLocalService courseLocalService;
	@BeanReference(type = com.liferay.course.service.CourseService.class)
	protected com.liferay.course.service.CourseService courseService;
	@BeanReference(type = CoursePersistence.class)
	protected CoursePersistence coursePersistence;
	@BeanReference(type = com.liferay.course.service.CourseRegisterLocalService.class)
	protected com.liferay.course.service.CourseRegisterLocalService courseRegisterLocalService;
	@BeanReference(type = com.liferay.course.service.CourseRegisterService.class)
	protected com.liferay.course.service.CourseRegisterService courseRegisterService;
	@BeanReference(type = CourseRegisterPersistence.class)
	protected CourseRegisterPersistence courseRegisterPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private CourseRegisterServiceClpInvoker _clpInvoker = new CourseRegisterServiceClpInvoker();
}