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

import com.liferay.course.NoSuchCourseRegisterException;
import com.liferay.course.model.CourseRegister;
import com.liferay.course.model.impl.CourseRegisterImpl;
import com.liferay.course.model.impl.CourseRegisterModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the course register service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ces
 * @see CourseRegisterPersistence
 * @see CourseRegisterUtil
 * @generated
 */
public class CourseRegisterPersistenceImpl extends BasePersistenceImpl<CourseRegister>
	implements CourseRegisterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CourseRegisterUtil} to access the course register persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CourseRegisterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
			CourseRegisterModelImpl.FINDER_CACHE_ENABLED,
			CourseRegisterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
			CourseRegisterModelImpl.FINDER_CACHE_ENABLED,
			CourseRegisterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
			CourseRegisterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
			CourseRegisterModelImpl.FINDER_CACHE_ENABLED,
			CourseRegisterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
			CourseRegisterModelImpl.FINDER_CACHE_ENABLED,
			CourseRegisterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			CourseRegisterModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
			CourseRegisterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the course registers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching course registers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseRegister> findByUuid(String uuid)
		throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<CourseRegister> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<CourseRegister> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<CourseRegister> list = (List<CourseRegister>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CourseRegister courseRegister : list) {
				if (!Validator.equals(uuid, courseRegister.getUuid())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_COURSEREGISTER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CourseRegisterModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<CourseRegister>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CourseRegister>(list);
				}
				else {
					list = (List<CourseRegister>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public CourseRegister findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchCourseRegisterException, SystemException {
		CourseRegister courseRegister = fetchByUuid_First(uuid,
				orderByComparator);

		if (courseRegister != null) {
			return courseRegister;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseRegisterException(msg.toString());
	}

	/**
	 * Returns the first course register in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching course register, or <code>null</code> if a matching course register could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseRegister fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<CourseRegister> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public CourseRegister findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchCourseRegisterException, SystemException {
		CourseRegister courseRegister = fetchByUuid_Last(uuid, orderByComparator);

		if (courseRegister != null) {
			return courseRegister;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseRegisterException(msg.toString());
	}

	/**
	 * Returns the last course register in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching course register, or <code>null</code> if a matching course register could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseRegister fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CourseRegister> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public CourseRegister[] findByUuid_PrevAndNext(long courseRegisterId,
		String uuid, OrderByComparator orderByComparator)
		throws NoSuchCourseRegisterException, SystemException {
		CourseRegister courseRegister = findByPrimaryKey(courseRegisterId);

		Session session = null;

		try {
			session = openSession();

			CourseRegister[] array = new CourseRegisterImpl[3];

			array[0] = getByUuid_PrevAndNext(session, courseRegister, uuid,
					orderByComparator, true);

			array[1] = courseRegister;

			array[2] = getByUuid_PrevAndNext(session, courseRegister, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CourseRegister getByUuid_PrevAndNext(Session session,
		CourseRegister courseRegister, String uuid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COURSEREGISTER_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CourseRegisterModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(courseRegister);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CourseRegister> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the course registers where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (CourseRegister courseRegister : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(courseRegister);
		}
	}

	/**
	 * Returns the number of course registers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching course registers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid(String uuid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COURSEREGISTER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "courseRegister.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "courseRegister.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(courseRegister.uuid IS NULL OR courseRegister.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
			CourseRegisterModelImpl.FINDER_CACHE_ENABLED,
			CourseRegisterImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			CourseRegisterModelImpl.UUID_COLUMN_BITMASK |
			CourseRegisterModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
			CourseRegisterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the course register where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.course.NoSuchCourseRegisterException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching course register
	 * @throws com.liferay.course.NoSuchCourseRegisterException if a matching course register could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseRegister findByUUID_G(String uuid, long groupId)
		throws NoSuchCourseRegisterException, SystemException {
		CourseRegister courseRegister = fetchByUUID_G(uuid, groupId);

		if (courseRegister == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCourseRegisterException(msg.toString());
		}

		return courseRegister;
	}

	/**
	 * Returns the course register where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching course register, or <code>null</code> if a matching course register could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseRegister fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
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
	@Override
	public CourseRegister fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof CourseRegister) {
			CourseRegister courseRegister = (CourseRegister)result;

			if (!Validator.equals(uuid, courseRegister.getUuid()) ||
					(groupId != courseRegister.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_COURSEREGISTER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<CourseRegister> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					CourseRegister courseRegister = list.get(0);

					result = courseRegister;

					cacheResult(courseRegister);

					if ((courseRegister.getUuid() == null) ||
							!courseRegister.getUuid().equals(uuid) ||
							(courseRegister.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, courseRegister);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (CourseRegister)result;
		}
	}

	/**
	 * Removes the course register where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the course register that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseRegister removeByUUID_G(String uuid, long groupId)
		throws NoSuchCourseRegisterException, SystemException {
		CourseRegister courseRegister = findByUUID_G(uuid, groupId);

		return remove(courseRegister);
	}

	/**
	 * Returns the number of course registers where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching course registers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_COURSEREGISTER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "courseRegister.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "courseRegister.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(courseRegister.uuid IS NULL OR courseRegister.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "courseRegister.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
			CourseRegisterModelImpl.FINDER_CACHE_ENABLED,
			CourseRegisterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
			CourseRegisterModelImpl.FINDER_CACHE_ENABLED,
			CourseRegisterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			CourseRegisterModelImpl.UUID_COLUMN_BITMASK |
			CourseRegisterModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
			CourseRegisterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the course registers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching course registers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseRegister> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<CourseRegister> findByUuid_C(String uuid, long companyId,
		int start, int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<CourseRegister> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<CourseRegister> list = (List<CourseRegister>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CourseRegister courseRegister : list) {
				if (!Validator.equals(uuid, courseRegister.getUuid()) ||
						(companyId != courseRegister.getCompanyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_COURSEREGISTER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CourseRegisterModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<CourseRegister>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CourseRegister>(list);
				}
				else {
					list = (List<CourseRegister>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public CourseRegister findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchCourseRegisterException, SystemException {
		CourseRegister courseRegister = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (courseRegister != null) {
			return courseRegister;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseRegisterException(msg.toString());
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
	@Override
	public CourseRegister fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CourseRegister> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public CourseRegister findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchCourseRegisterException, SystemException {
		CourseRegister courseRegister = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (courseRegister != null) {
			return courseRegister;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseRegisterException(msg.toString());
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
	@Override
	public CourseRegister fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CourseRegister> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public CourseRegister[] findByUuid_C_PrevAndNext(long courseRegisterId,
		String uuid, long companyId, OrderByComparator orderByComparator)
		throws NoSuchCourseRegisterException, SystemException {
		CourseRegister courseRegister = findByPrimaryKey(courseRegisterId);

		Session session = null;

		try {
			session = openSession();

			CourseRegister[] array = new CourseRegisterImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, courseRegister, uuid,
					companyId, orderByComparator, true);

			array[1] = courseRegister;

			array[2] = getByUuid_C_PrevAndNext(session, courseRegister, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CourseRegister getByUuid_C_PrevAndNext(Session session,
		CourseRegister courseRegister, String uuid, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COURSEREGISTER_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CourseRegisterModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(courseRegister);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CourseRegister> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the course registers where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (CourseRegister courseRegister : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(courseRegister);
		}
	}

	/**
	 * Returns the number of course registers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching course registers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_COURSEREGISTER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "courseRegister.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "courseRegister.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(courseRegister.uuid IS NULL OR courseRegister.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "courseRegister.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
			CourseRegisterModelImpl.FINDER_CACHE_ENABLED,
			CourseRegisterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBystatus",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
			CourseRegisterModelImpl.FINDER_CACHE_ENABLED,
			CourseRegisterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBystatus",
			new String[] { Long.class.getName(), Integer.class.getName() },
			CourseRegisterModelImpl.USERID_COLUMN_BITMASK |
			CourseRegisterModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
			CourseRegisterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBystatus",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the course registers where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching course registers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseRegister> findBystatus(long userId, int status)
		throws SystemException {
		return findBystatus(userId, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<CourseRegister> findBystatus(long userId, int status,
		int start, int end) throws SystemException {
		return findBystatus(userId, status, start, end, null);
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
	@Override
	public List<CourseRegister> findBystatus(long userId, int status,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { userId, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] {
					userId, status,
					
					start, end, orderByComparator
				};
		}

		List<CourseRegister> list = (List<CourseRegister>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CourseRegister courseRegister : list) {
				if ((userId != courseRegister.getUserId()) ||
						(status != courseRegister.getStatus())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_COURSEREGISTER_WHERE);

			query.append(_FINDER_COLUMN_STATUS_USERID_2);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CourseRegisterModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(status);

				if (!pagination) {
					list = (List<CourseRegister>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CourseRegister>(list);
				}
				else {
					list = (List<CourseRegister>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public CourseRegister findBystatus_First(long userId, int status,
		OrderByComparator orderByComparator)
		throws NoSuchCourseRegisterException, SystemException {
		CourseRegister courseRegister = fetchBystatus_First(userId, status,
				orderByComparator);

		if (courseRegister != null) {
			return courseRegister;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseRegisterException(msg.toString());
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
	@Override
	public CourseRegister fetchBystatus_First(long userId, int status,
		OrderByComparator orderByComparator) throws SystemException {
		List<CourseRegister> list = findBystatus(userId, status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public CourseRegister findBystatus_Last(long userId, int status,
		OrderByComparator orderByComparator)
		throws NoSuchCourseRegisterException, SystemException {
		CourseRegister courseRegister = fetchBystatus_Last(userId, status,
				orderByComparator);

		if (courseRegister != null) {
			return courseRegister;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCourseRegisterException(msg.toString());
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
	@Override
	public CourseRegister fetchBystatus_Last(long userId, int status,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBystatus(userId, status);

		if (count == 0) {
			return null;
		}

		List<CourseRegister> list = findBystatus(userId, status, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public CourseRegister[] findBystatus_PrevAndNext(long courseRegisterId,
		long userId, int status, OrderByComparator orderByComparator)
		throws NoSuchCourseRegisterException, SystemException {
		CourseRegister courseRegister = findByPrimaryKey(courseRegisterId);

		Session session = null;

		try {
			session = openSession();

			CourseRegister[] array = new CourseRegisterImpl[3];

			array[0] = getBystatus_PrevAndNext(session, courseRegister, userId,
					status, orderByComparator, true);

			array[1] = courseRegister;

			array[2] = getBystatus_PrevAndNext(session, courseRegister, userId,
					status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CourseRegister getBystatus_PrevAndNext(Session session,
		CourseRegister courseRegister, long userId, int status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COURSEREGISTER_WHERE);

		query.append(_FINDER_COLUMN_STATUS_USERID_2);

		query.append(_FINDER_COLUMN_STATUS_STATUS_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CourseRegisterModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(courseRegister);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CourseRegister> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the course registers where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBystatus(long userId, int status)
		throws SystemException {
		for (CourseRegister courseRegister : findBystatus(userId, status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(courseRegister);
		}
	}

	/**
	 * Returns the number of course registers where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching course registers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBystatus(long userId, int status) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { userId, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_COURSEREGISTER_WHERE);

			query.append(_FINDER_COLUMN_STATUS_USERID_2);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(status);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_STATUS_USERID_2 = "courseRegister.userId = ? AND ";
	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "courseRegister.status = ?";

	public CourseRegisterPersistenceImpl() {
		setModelClass(CourseRegister.class);
	}

	/**
	 * Caches the course register in the entity cache if it is enabled.
	 *
	 * @param courseRegister the course register
	 */
	@Override
	public void cacheResult(CourseRegister courseRegister) {
		EntityCacheUtil.putResult(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
			CourseRegisterImpl.class, courseRegister.getPrimaryKey(),
			courseRegister);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { courseRegister.getUuid(), courseRegister.getGroupId() },
			courseRegister);

		courseRegister.resetOriginalValues();
	}

	/**
	 * Caches the course registers in the entity cache if it is enabled.
	 *
	 * @param courseRegisters the course registers
	 */
	@Override
	public void cacheResult(List<CourseRegister> courseRegisters) {
		for (CourseRegister courseRegister : courseRegisters) {
			if (EntityCacheUtil.getResult(
						CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
						CourseRegisterImpl.class, courseRegister.getPrimaryKey()) == null) {
				cacheResult(courseRegister);
			}
			else {
				courseRegister.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all course registers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CourseRegisterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CourseRegisterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the course register.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CourseRegister courseRegister) {
		EntityCacheUtil.removeResult(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
			CourseRegisterImpl.class, courseRegister.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(courseRegister);
	}

	@Override
	public void clearCache(List<CourseRegister> courseRegisters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CourseRegister courseRegister : courseRegisters) {
			EntityCacheUtil.removeResult(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
				CourseRegisterImpl.class, courseRegister.getPrimaryKey());

			clearUniqueFindersCache(courseRegister);
		}
	}

	protected void cacheUniqueFindersCache(CourseRegister courseRegister) {
		if (courseRegister.isNew()) {
			Object[] args = new Object[] {
					courseRegister.getUuid(), courseRegister.getGroupId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				courseRegister);
		}
		else {
			CourseRegisterModelImpl courseRegisterModelImpl = (CourseRegisterModelImpl)courseRegister;

			if ((courseRegisterModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						courseRegister.getUuid(), courseRegister.getGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					courseRegister);
			}
		}
	}

	protected void clearUniqueFindersCache(CourseRegister courseRegister) {
		CourseRegisterModelImpl courseRegisterModelImpl = (CourseRegisterModelImpl)courseRegister;

		Object[] args = new Object[] {
				courseRegister.getUuid(), courseRegister.getGroupId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((courseRegisterModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					courseRegisterModelImpl.getOriginalUuid(),
					courseRegisterModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new course register with the primary key. Does not add the course register to the database.
	 *
	 * @param courseRegisterId the primary key for the new course register
	 * @return the new course register
	 */
	@Override
	public CourseRegister create(long courseRegisterId) {
		CourseRegister courseRegister = new CourseRegisterImpl();

		courseRegister.setNew(true);
		courseRegister.setPrimaryKey(courseRegisterId);

		String uuid = PortalUUIDUtil.generate();

		courseRegister.setUuid(uuid);

		return courseRegister;
	}

	/**
	 * Removes the course register with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param courseRegisterId the primary key of the course register
	 * @return the course register that was removed
	 * @throws com.liferay.course.NoSuchCourseRegisterException if a course register with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseRegister remove(long courseRegisterId)
		throws NoSuchCourseRegisterException, SystemException {
		return remove((Serializable)courseRegisterId);
	}

	/**
	 * Removes the course register with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the course register
	 * @return the course register that was removed
	 * @throws com.liferay.course.NoSuchCourseRegisterException if a course register with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseRegister remove(Serializable primaryKey)
		throws NoSuchCourseRegisterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CourseRegister courseRegister = (CourseRegister)session.get(CourseRegisterImpl.class,
					primaryKey);

			if (courseRegister == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCourseRegisterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(courseRegister);
		}
		catch (NoSuchCourseRegisterException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CourseRegister removeImpl(CourseRegister courseRegister)
		throws SystemException {
		courseRegister = toUnwrappedModel(courseRegister);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(courseRegister)) {
				courseRegister = (CourseRegister)session.get(CourseRegisterImpl.class,
						courseRegister.getPrimaryKeyObj());
			}

			if (courseRegister != null) {
				session.delete(courseRegister);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (courseRegister != null) {
			clearCache(courseRegister);
		}

		return courseRegister;
	}

	@Override
	public CourseRegister updateImpl(
		com.liferay.course.model.CourseRegister courseRegister)
		throws SystemException {
		courseRegister = toUnwrappedModel(courseRegister);

		boolean isNew = courseRegister.isNew();

		CourseRegisterModelImpl courseRegisterModelImpl = (CourseRegisterModelImpl)courseRegister;

		if (Validator.isNull(courseRegister.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			courseRegister.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (courseRegister.isNew()) {
				session.save(courseRegister);

				courseRegister.setNew(false);
			}
			else {
				session.merge(courseRegister);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CourseRegisterModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((courseRegisterModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						courseRegisterModelImpl.getOriginalUuid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { courseRegisterModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((courseRegisterModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						courseRegisterModelImpl.getOriginalUuid(),
						courseRegisterModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						courseRegisterModelImpl.getUuid(),
						courseRegisterModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((courseRegisterModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						courseRegisterModelImpl.getOriginalUserId(),
						courseRegisterModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] {
						courseRegisterModelImpl.getUserId(),
						courseRegisterModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}
		}

		EntityCacheUtil.putResult(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
			CourseRegisterImpl.class, courseRegister.getPrimaryKey(),
			courseRegister);

		clearUniqueFindersCache(courseRegister);
		cacheUniqueFindersCache(courseRegister);

		return courseRegister;
	}

	protected CourseRegister toUnwrappedModel(CourseRegister courseRegister) {
		if (courseRegister instanceof CourseRegisterImpl) {
			return courseRegister;
		}

		CourseRegisterImpl courseRegisterImpl = new CourseRegisterImpl();

		courseRegisterImpl.setNew(courseRegister.isNew());
		courseRegisterImpl.setPrimaryKey(courseRegister.getPrimaryKey());

		courseRegisterImpl.setUuid(courseRegister.getUuid());
		courseRegisterImpl.setCourseRegisterId(courseRegister.getCourseRegisterId());
		courseRegisterImpl.setGroupId(courseRegister.getGroupId());
		courseRegisterImpl.setCompanyId(courseRegister.getCompanyId());
		courseRegisterImpl.setUserId(courseRegister.getUserId());
		courseRegisterImpl.setUserName(courseRegister.getUserName());
		courseRegisterImpl.setCreateDate(courseRegister.getCreateDate());
		courseRegisterImpl.setModifiedDate(courseRegister.getModifiedDate());
		courseRegisterImpl.setCourseId(courseRegister.getCourseId());
		courseRegisterImpl.setStatus(courseRegister.getStatus());

		return courseRegisterImpl;
	}

	/**
	 * Returns the course register with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the course register
	 * @return the course register
	 * @throws com.liferay.course.NoSuchCourseRegisterException if a course register with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseRegister findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCourseRegisterException, SystemException {
		CourseRegister courseRegister = fetchByPrimaryKey(primaryKey);

		if (courseRegister == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCourseRegisterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return courseRegister;
	}

	/**
	 * Returns the course register with the primary key or throws a {@link com.liferay.course.NoSuchCourseRegisterException} if it could not be found.
	 *
	 * @param courseRegisterId the primary key of the course register
	 * @return the course register
	 * @throws com.liferay.course.NoSuchCourseRegisterException if a course register with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseRegister findByPrimaryKey(long courseRegisterId)
		throws NoSuchCourseRegisterException, SystemException {
		return findByPrimaryKey((Serializable)courseRegisterId);
	}

	/**
	 * Returns the course register with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the course register
	 * @return the course register, or <code>null</code> if a course register with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseRegister fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CourseRegister courseRegister = (CourseRegister)EntityCacheUtil.getResult(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
				CourseRegisterImpl.class, primaryKey);

		if (courseRegister == _nullCourseRegister) {
			return null;
		}

		if (courseRegister == null) {
			Session session = null;

			try {
				session = openSession();

				courseRegister = (CourseRegister)session.get(CourseRegisterImpl.class,
						primaryKey);

				if (courseRegister != null) {
					cacheResult(courseRegister);
				}
				else {
					EntityCacheUtil.putResult(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
						CourseRegisterImpl.class, primaryKey,
						_nullCourseRegister);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CourseRegisterModelImpl.ENTITY_CACHE_ENABLED,
					CourseRegisterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return courseRegister;
	}

	/**
	 * Returns the course register with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param courseRegisterId the primary key of the course register
	 * @return the course register, or <code>null</code> if a course register with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CourseRegister fetchByPrimaryKey(long courseRegisterId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)courseRegisterId);
	}

	/**
	 * Returns all the course registers.
	 *
	 * @return the course registers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CourseRegister> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<CourseRegister> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<CourseRegister> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<CourseRegister> list = (List<CourseRegister>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_COURSEREGISTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COURSEREGISTER;

				if (pagination) {
					sql = sql.concat(CourseRegisterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CourseRegister>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CourseRegister>(list);
				}
				else {
					list = (List<CourseRegister>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the course registers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CourseRegister courseRegister : findAll()) {
			remove(courseRegister);
		}
	}

	/**
	 * Returns the number of course registers.
	 *
	 * @return the number of course registers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_COURSEREGISTER);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the course register persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.course.model.CourseRegister")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CourseRegister>> listenersList = new ArrayList<ModelListener<CourseRegister>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CourseRegister>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(CourseRegisterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_COURSEREGISTER = "SELECT courseRegister FROM CourseRegister courseRegister";
	private static final String _SQL_SELECT_COURSEREGISTER_WHERE = "SELECT courseRegister FROM CourseRegister courseRegister WHERE ";
	private static final String _SQL_COUNT_COURSEREGISTER = "SELECT COUNT(courseRegister) FROM CourseRegister courseRegister";
	private static final String _SQL_COUNT_COURSEREGISTER_WHERE = "SELECT COUNT(courseRegister) FROM CourseRegister courseRegister WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "courseRegister.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CourseRegister exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CourseRegister exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CourseRegisterPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static CourseRegister _nullCourseRegister = new CourseRegisterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CourseRegister> toCacheModel() {
				return _nullCourseRegisterCacheModel;
			}
		};

	private static CacheModel<CourseRegister> _nullCourseRegisterCacheModel = new CacheModel<CourseRegister>() {
			@Override
			public CourseRegister toEntityModel() {
				return _nullCourseRegister;
			}
		};
}