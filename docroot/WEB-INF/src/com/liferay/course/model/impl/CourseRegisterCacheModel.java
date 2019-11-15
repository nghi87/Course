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

package com.liferay.course.model.impl;

import com.liferay.course.model.CourseRegister;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CourseRegister in entity cache.
 *
 * @author ces
 * @see CourseRegister
 * @generated
 */
public class CourseRegisterCacheModel implements CacheModel<CourseRegister>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", courseRegisterId=");
		sb.append(courseRegisterId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", courseId=");
		sb.append(courseId);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CourseRegister toEntityModel() {
		CourseRegisterImpl courseRegisterImpl = new CourseRegisterImpl();

		if (uuid == null) {
			courseRegisterImpl.setUuid(StringPool.BLANK);
		}
		else {
			courseRegisterImpl.setUuid(uuid);
		}

		courseRegisterImpl.setCourseRegisterId(courseRegisterId);
		courseRegisterImpl.setGroupId(groupId);
		courseRegisterImpl.setCompanyId(companyId);
		courseRegisterImpl.setUserId(userId);

		if (userName == null) {
			courseRegisterImpl.setUserName(StringPool.BLANK);
		}
		else {
			courseRegisterImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			courseRegisterImpl.setCreateDate(null);
		}
		else {
			courseRegisterImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			courseRegisterImpl.setModifiedDate(null);
		}
		else {
			courseRegisterImpl.setModifiedDate(new Date(modifiedDate));
		}

		courseRegisterImpl.setCourseId(courseId);
		courseRegisterImpl.setStatus(status);

		courseRegisterImpl.resetOriginalValues();

		return courseRegisterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		courseRegisterId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		courseId = objectInput.readLong();
		status = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(courseRegisterId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(courseId);
		objectOutput.writeInt(status);
	}

	public String uuid;
	public long courseRegisterId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long courseId;
	public int status;
}