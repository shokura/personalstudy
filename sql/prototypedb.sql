drop database if exists personalstudy;
create database personalstudy;
use personalstudy;

/*
 * ユーザー情報
 * ログインID login_id
 * ログインパスワード password
 */
create table user(
	login_id varchar(10) not null primary key,
	user_name varchar(32) not null,
	password varchar(255) not null
	);
insert into user(login_id,user_name,password)values
	("user01","ユーザー1",111),
	("user02","ユーザー2",222),
	("user03","ユーザー3",333);
