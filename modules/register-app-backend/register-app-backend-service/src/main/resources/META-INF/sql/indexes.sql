create index IX_6774ACD5 on RegisterApp_RegisterUser (groupId);
create index IX_898AFF74 on RegisterApp_RegisterUser (name[$COLUMN_LENGTH:75$]);
create index IX_A3812996 on RegisterApp_RegisterUser (nationalId[$COLUMN_LENGTH:75$]);
create index IX_71804A29 on RegisterApp_RegisterUser (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_BBB746EB on RegisterApp_RegisterUser (uuid_[$COLUMN_LENGTH:75$], groupId);