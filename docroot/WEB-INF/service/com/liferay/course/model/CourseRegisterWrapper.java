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

package com.liferay.course.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CourseRegister}.
 * </p>
 *
 * @author ces
 * @see CourseRegister
 * @generated
 */
public class CourseRegisterWrapper implements CourseRegister,
	ModelWrapper<CourseRegister> {
	public CourseRegisterWrapper(CourseRegister courseRegister) {
		_courseRegister = courseRegister;
	}

	@Override
	public Class<?> getModelClass() {
		return CourseRegister.class;
	}

	@Override
	public String getModelClassName() {
		return CourseRegister.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("courseRegisterId", getCourseRegisterId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("courseId", getCourseId());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long courseRegisterId = (Long)attributes.get("courseRegisterId");

		if (courseRegisterId != null) {
			setCourseRegisterId(courseRegisterId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long courseId = (Long)attributes.get("courseId");

		if (courseId != null) {
			setCourseId(courseId);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this course register.
	*
	* @return the primary key of this course register
	*/
	@Override
	public long getPrimaryKey() {
		return _courseRegister.getPrimaryKey();
	}

	/**
	* Sets the primary key of this course register.
	*
	* @param primaryKey the primary key of this course register
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_courseRegister.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this course register.
	*
	* @return the uuid of this course register
	*/
	@Override
	public java.lang.String getUuid() {
		return _courseRegister.getUuid();
	}

	/**
	* Sets the uuid of this course register.
	*
	* @param uuid the uuid of this course register
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_courseRegister.setUuid(uuid);
	}

	/**
	* Returns the course register ID of this course register.
	*
	* @return the course register ID of this course register
	*/
	@Override
	public long getCourseRegisterId() {
		return _courseRegister.getCourseRegisterId();
	}

	/**
	* Sets the course register ID of this course register.
	*
	* @param courseRegisterId the course register ID of this course register
	*/
	@Override
	public void setCourseRegisterId(long courseRegisterId) {
		_courseRegister.setCourseRegisterId(courseRegisterId);
	}

	/**
	* Returns the group ID of this course register.
	*
	* @return the group ID of this course register
	*/
	@Override
	public long getGroupId() {
		return _courseRegister.getGroupId();
	}

	/**
	* Sets the group ID of this course register.
	*
	* @param groupId the group ID of this course register
	*/
	@Override
	public void setGroupId(long groupId) {
		_courseRegister.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this course register.
	*
	* @return the company ID of this course register
	*/
	@Override
	public long getCompanyId() {
		return _courseRegister.getCompanyId();
	}

	/**
	* Sets the company ID of this course register.
	*
	* @param companyId the company ID of this course register
	*/
	@Override
	public void setCompanyId(long companyId) {
		_courseRegister.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this course register.
	*
	* @return the user ID of this course register
	*/
	@Override
	public long getUserId() {
		return _courseRegister.getUserId();
	}

	/**
	* Sets the user ID of this course register.
	*
	* @param userId the user ID of this course register
	*/
	@Override
	public void setUserId(long userId) {
		_courseRegister.setUserId(userId);
	}

	/**
	* Returns the user uuid of this course register.
	*
	* @return the user uuid of this course register
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _courseRegister.getUserUuid();
	}

	/**
	* Sets the user uuid of this course register.
	*
	* @param userUuid the user uuid of this course register
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_courseRegister.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this course register.
	*
	* @return the user name of this course register
	*/
	@Override
	public java.lang.String getUserName() {
		return _courseRegister.getUserName();
	}

	/**
	* Sets the user name of this course register.
	*
	* @param userName the user name of this course register
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_courseRegister.setUserName(userName);
	}

	/**
	* Returns the create date of this course register.
	*
	* @return the create date of this course register
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _courseRegister.getCreateDate();
	}

	/**
	* Sets the create date of this course register.
	*
	* @param createDate the create date of this course register
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_courseRegister.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this course register.
	*
	* @return the modified date of this course register
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _courseRegister.getModifiedDate();
	}

	/**
	* Sets the modified date of this course register.
	*
	* @param modifiedDate the modified date of this course register
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_courseRegister.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the course ID of this course register.
	*
	* @return the course ID of this course register
	*/
	@Override
	public long getCourseId() {
		return _courseRegister.getCourseId();
	}

	/**
	* Sets the course ID of this course register.
	*
	* @param courseId the course ID of this course register
	*/
	@Override
	public void setCourseId(long courseId) {
		_courseRegister.setCourseId(courseId);
	}

	/**
	* Returns the status of this course register.
	*
	* @return the status of this course register
	*/
	@Override
	public int getStatus() {
		return _courseRegister.getStatus();
	}

	/**
	* Sets the status of this course register.
	*
	* @param status the status of this course register
	*/
	@Override
	public void setStatus(int status) {
		_courseRegister.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _courseRegister.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_courseRegister.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _courseRegister.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_courseRegister.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _courseRegister.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _courseRegister.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_courseRegister.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _courseRegister.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_courseRegister.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_courseRegister.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_courseRegister.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CourseRegisterWrapper((CourseRegister)_courseRegister.clone());
	}

	@Override
	public int compareTo(CourseRegister courseRegister) {
		return _courseRegister.compareTo(courseRegister);
	}

	@Override
	public int hashCode() {
		return _courseRegister.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<CourseRegister> toCacheModel() {
		return _courseRegister.toCacheModel();
	}

	@Override
	public CourseRegister toEscapedModel() {
		return new CourseRegisterWrapper(_courseRegister.toEscapedModel());
	}

	@Override
	public CourseRegister toUnescapedModel() {
		return new CourseRegisterWrapper(_courseRegister.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _courseRegister.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _courseRegister.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_courseRegister.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CourseRegisterWrapper)) {
			return false;
		}

		CourseRegisterWrapper courseRegisterWrapper = (CourseRegisterWrapper)obj;

		if (Validator.equals(_courseRegister,
					courseRegisterWrapper._courseRegister)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _courseRegister.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CourseRegister getWrappedCourseRegister() {
		return _courseRegister;
	}

	@Override
	public CourseRegister getWrappedModel() {
		return _courseRegister;
	}

	@Override
	public void resetOriginalValues() {
		_courseRegister.resetOriginalValues();
	}

	private CourseRegister _courseRegister;
}