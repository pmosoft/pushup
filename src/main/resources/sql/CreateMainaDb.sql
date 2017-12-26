---------------------------------
-- root
---------------------------------
mysql -u root -plife200727

---------------------------------
-- database 생성
---------------------------------
create database pushup;

---------------------------------
-- 유저 생성
---------------------------------

-- 모든 ip 허용
create user 'pushup'@'%' identified by 'p1234';
grant all privileges on pushup.* to 'pushup'@'%';

create user 'pushup'@'localhost' identified by 'p1234';
create user 'pushup'@'pmosoft.net' identified by 'p1234';
create user 'pushup'@'182.228.242.133' identified by 'p1234'; -- cafe24 보안서버

grant all privileges on pushup.* to pushup@localhost;
grant all privileges on pushup.* to pushup@pmosoft.net;
grant all privileges on pushup.* to pushup@182.228.242.133;


grant all privileges on fframe.* to pushup@localhost;
grant all privileges on fframe.* to pushup@pmosoft.net;
grant all privileges on fframe.* to pushup@182.228.242.133;
