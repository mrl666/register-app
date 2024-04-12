create table RegisterApp_RegisterUser (
	uuid_ VARCHAR(75) null,
	registerUserId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	surname VARCHAR(75) null,
	lastname VARCHAR(75) null,
	nationalId VARCHAR(75) null,
	email VARCHAR(75) null,
	questionType VARCHAR(75) null,
	description VARCHAR(75) null
);