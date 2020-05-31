-- schema.sql 파일이 있으면 jpa는 해당 파일을 이용하여 자동으로 데이터베이스 내용을 설정한다.
-- 만약 update나 create-drop이 아닌 validate 상태라 하더라도 schema.sql 파일이 있으면 이걸로 교환해 가며 사용한다.
drop table if exists account cascade;
drop sequence if exists hibernate_sequence;
create sequence hibernate_sequence start 1 increment 1;
create table account (id int8 not null, email varchar(255), password varchar(255), username varchar(255), primary key (id));