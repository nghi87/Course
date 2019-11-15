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

import com.liferay.course.service.ClpSerializer;
import com.liferay.course.service.CourseRegisterLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ces
 */
public class CourseRegisterClp extends BaseModelImpl<CourseRegister>
	implements CourseRegister {
	public CourseRegisterClp() {
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
	public long getPrimaryKey() {
		return _courseRegisterId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCourseRegisterId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _courseRegisterId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_courseRegisterRemoteModel != null) {
			try {
				Class<?> clazz = _courseRegisterRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_courseRegisterRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCourseRegisterId() {
		return _courseRegisterId;
	}

	@Override
	public void setCourseRegisterId(long courseRegisterId) {
		_courseRegisterId = courseRegisterId;

		if (_courseRegisterRemoteModel != null) {
			try {
				Class<?> clazz = _courseRegisterRemoteModel.getClass();

				Method method = clazz.getMethod("setCourseRegisterId",
						long.class);

				method.invoke(_courseRegisterRemoteModel, courseRegisterId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_courseRegisterRemoteModel != null) {
			try {
				Class<?> clazz = _courseRegisterRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_courseRegisterRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_courseRegisterRemoteModel != null) {
			try {
				Class<?> clazz = _courseRegisterRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_courseRegisterRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_courseRegisterRemoteModel != null) {
			try {
				Class<?> clazz = _courseRegisterRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_courseRegisterRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_courseRegisterRemoteModel != null) {
			try {
				Class<?> clazz = _courseRegisterRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_courseRegisterRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_courseRegisterRemoteModel != null) {
			try {
				Class<?> clazz = _courseRegisterRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_courseRegisterRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_courseRegisterRemoteModel != null) {
			try {
				Class<?> clazz = _courseRegisterRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_courseRegisterRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCourseId() {
		return _courseId;
	}

	@Override
	public void setCourseId(long courseId) {
		_courseId = courseId;

		if (_courseRegisterRemoteModel != null) {
			try {
				Class<?> clazz = _courseRegisterRemoteModel.getClass();

				Method method = clazz.getMethod("setCourseId", long.class);

				method.invoke(_courseRegisterRemoteModel, courseId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;

		if (_courseRegisterRemoteModel != null) {
			try {
				Class<?> clazz = _courseRegisterRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_courseRegisterRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				CourseRegister.class.getName()));
	}

	public BaseModel<?> getCourseRegisterRemoteModel() {
		return _courseRegisterRemoteModel;
	}

	public void setCourseRegisterRemoteModel(
		BaseModel<?> courseRegisterRemoteModel) {
		_courseRegisterRemoteModel = courseRegisterRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _courseRegisterRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_courseRegisterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CourseRegisterLocalServiceUtil.addCourseRegister(this);
		}
		else {
			CourseRegisterLocalServiceUtil.updateCourseRegister(this);
		}
	}

	@Override
	public CourseRegister toEscapedModel() {
		return (CourseRegister)ProxyUtil.newProxyInstance(CourseRegister.class.getClassLoader(),
			new Class[] { CourseRegister.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CourseRegisterClp clone = new CourseRegisterClp();

		clone.setUuid(getUuid());
		clone.setCourseRegisterId(getCourseRegisterId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCourseId(getCourseId());
		clone.setStatus(getStatus());

		return clone;
	}

	@Override
	public int compareTo(CourseRegister courseRegister) {
		long primaryKey = courseRegister.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CourseRegisterClp)) {
			return false;
		}

		CourseRegisterClp courseRegister = (CourseRegisterClp)obj;

		long primaryKey = courseRegister.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", courseRegisterId=");
		sb.append(getCourseRegisterId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", courseId=");
		sb.append(getCourseId());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.liferay.course.model.CourseRegister");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>courseRegisterId</column-name><column-value><![CDATA[");
		sb.append(getCourseRegisterId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>courseId</column-name><column-value><![CDATA[");
		sb.append(getCourseId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _courseRegisterId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _courseId;
	private int _status;
	private BaseModel<?> _courseRegisterRemoteModel;
}