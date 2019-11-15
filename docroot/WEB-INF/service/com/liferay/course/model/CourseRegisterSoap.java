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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.course.service.http.CourseRegisterServiceSoap}.
 *
 * @author ces
 * @see com.liferay.course.service.http.CourseRegisterServiceSoap
 * @generated
 */
public class CourseRegisterSoap implements Serializable {
	public static CourseRegisterSoap toSoapModel(CourseRegister model) {
		CourseRegisterSoap soapModel = new CourseRegisterSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCourseRegisterId(model.getCourseRegisterId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCourseId(model.getCourseId());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static CourseRegisterSoap[] toSoapModels(CourseRegister[] models) {
		CourseRegisterSoap[] soapModels = new CourseRegisterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CourseRegisterSoap[][] toSoapModels(CourseRegister[][] models) {
		CourseRegisterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CourseRegisterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CourseRegisterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CourseRegisterSoap[] toSoapModels(List<CourseRegister> models) {
		List<CourseRegisterSoap> soapModels = new ArrayList<CourseRegisterSoap>(models.size());

		for (CourseRegister model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CourseRegisterSoap[soapModels.size()]);
	}

	public CourseRegisterSoap() {
	}

	public long getPrimaryKey() {
		return _courseRegisterId;
	}

	public void setPrimaryKey(long pk) {
		setCourseRegisterId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCourseRegisterId() {
		return _courseRegisterId;
	}

	public void setCourseRegisterId(long courseRegisterId) {
		_courseRegisterId = courseRegisterId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getCourseId() {
		return _courseId;
	}

	public void setCourseId(long courseId) {
		_courseId = courseId;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private String _uuid;
	private long _courseRegisterId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _courseId;
	private int _status;
}