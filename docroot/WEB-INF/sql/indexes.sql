create index IX_35FC2D65 on COURSE_Course (groupId);
create index IX_F497D52F on COURSE_Course (uuid_);
create index IX_2CB86B99 on COURSE_Course (uuid_, companyId);
create unique index IX_DC69045B on COURSE_Course (uuid_, groupId);

create index IX_F1EBC508 on COURSE_CourseRegister (userId, status);
create index IX_1C611CCC on COURSE_CourseRegister (uuid_);
create index IX_7A1F2FDC on COURSE_CourseRegister (uuid_, companyId);
create unique index IX_9629FD5E on COURSE_CourseRegister (uuid_, groupId);