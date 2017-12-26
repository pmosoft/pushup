------------------------------
-- 운동실시이력
------------------------------

SELECT * FROM FFRAME.TDACM00010
;


DROP TABLE TPUSH001
;

CREATE TABLE TPUSH001 (
 USR_ID     VARCHAR(20)   NOT NULL COMMENT '유저아이디'
,EXEC_DTM   VARCHAR(14)   NOT NULL COMMENT '운동일시'
,EXEC_CD    CHAR(2)           NULL COMMENT '운동코드' -- 01:PUSHUP
,EXEC_DT    CHAR(8)           NULL COMMENT '운동일자'
,EXEC_CNT   INT               NULL COMMENT '운동횟수'
,REG_DTM    VARCHAR(14)       NULL COMMENT '등록일시'
,REG_USR_ID VARCHAR(20)       NULL COMMENT '등록자'
,UPD_DTM    VARCHAR(14)       NULL COMMENT '변경일시'
,UPD_USR_ID VARCHAR(20)       NULL COMMENT '변경자'
,PRIMARY KEY(USR_ID,EXEC_DTM)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='운동실시이력';
;

------------------------------
-- 운동목표이력
------------------------------

DROP TABLE TPUSH002
;

CREATE TABLE TPUSH002 (
 USR_ID        VARCHAR(20)   NOT NULL COMMENT '유저아이디'
,EXEC_CD       CHAR(2)       NOT NULL COMMENT '운동코드' -- 01:PUSHUP
,START_DT      CHAR(8)       NOT NULL COMMENT '시작일자'
,END_DT        CHAR(8)           NULL COMMENT '종료일자' -- 종료일자 >= 시작일자, 99991231는 하나만 존재하고, 신규 시작일자생성시 이전 종료일자을 반드시 세팅
,EXEC_GOAL_CNT INT               NULL COMMENT '운동목표횟수'
,REG_DTM    VARCHAR(14)          NULL COMMENT '등록일시'
,REG_USR_ID VARCHAR(20)          NULL COMMENT '등록자'
,UPD_DTM    VARCHAR(14)          NULL COMMENT '변경일시'
,UPD_USR_ID VARCHAR(20)          NULL COMMENT '변경자'
,PRIMARY KEY(USR_ID,EXEC_CD,START_DT)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='운동목표이력';
;

------------------------------
-- 유저
------------------------------

﻿DROP TABLE TURCM001
;

CREATE TABLE TURCM001 (
 USR_ID      VARCHAR(40)    NOT NULL COMMENT '유저아이디'    
,USR_EMAIL   VARCHAR(40)        NULL COMMENT '유저이메일'    
,PASSWD      VARCHAR(100)       NULL COMMENT '유저암호'      
,USR_NM      VARCHAR(40)        NULL COMMENT '유저명'        
,BIRTH_YY    CHAR(4)            NULL COMMENT '생년'      
,SEX         INT                NULL COMMENT '성별' -- 1:남 2:여      
,USE_YN      CHAR(1)            NULL COMMENT '사용여부'        
,REG_DTM     VARCHAR(14)        NULL COMMENT '등록일시'
,REG_USR_ID  VARCHAR(20)        NULL COMMENT '등록자'
,UPD_DTM     VARCHAR(14)        NULL COMMENT '변경일시'
,UPD_USR_ID  VARCHAR(20)        NULL COMMENT '변경자'
,PRIMARY KEY (USR_ID)
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='유저';
;

INSERT INTO TURCM001 VALUES('lifedomy@gmail.com','lifedomy@gmail.com','1','피승현','1970','1','Y',NOW(),'ADMIN',NOW(),'ADMIN');

SELECT * FROM TURCM001
;
