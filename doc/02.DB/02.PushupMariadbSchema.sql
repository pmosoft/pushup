------------------------------
-- 운동실시이력
------------------------------

SELECT * FROM FFRAME.TDACM00010
;

DROP TABLE PUSH.TPUSH00010
;

CREATE TABLE PUSH.TPUSH00010 (
 USR_ID       VARCHAR(40)    NOT NULL COMMENT '유저아이디'
,EXEC_DTM     VARCHAR(14)    NOT NULL COMMENT '운동일시'
,EXEC_CD      CHAR(2)            NULL COMMENT '운동코드' -- 01:PUSHUP
,EXEC_DT      CHAR(8)            NULL COMMENT '운동일자'
,EXEC_CNT     INT                NULL COMMENT '운동횟수'
,REG_DTM      TIMESTAMP          NULL COMMENT '등록일시'
,REG_USR_ID   VARCHAR(40)        NULL COMMENT '등록자'
,UPD_DTM      TIMESTAMP          NULL COMMENT '변경일시'
,UPD_USR_ID   VARCHAR(40)        NULL COMMENT '변경자'
,PRIMARY KEY(USR_ID,EXEC_DTM)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='운동실시이력';
;

------------------------------
-- 운동목표이력
------------------------------

DROP TABLE PUSH.TPUSH00020
;

CREATE TABLE PUSH.TPUSH00020 (
 USR_ID        VARCHAR(40)   NOT NULL COMMENT '유저아이디'
,EXEC_CD       CHAR(2)       NOT NULL COMMENT '운동코드' -- 01:PUSHUP
,START_DT      CHAR(8)       NOT NULL COMMENT '시작일자'
,END_DT        CHAR(8)           NULL COMMENT '종료일자' -- 종료일자 >= 시작일자, 99991231는 하나만 존재하고, 신규 시작일자생성시 이전 종료일자을 반드시 세팅
,EXEC_GOAL_CNT INT               NULL COMMENT '운동목표횟수'
,REG_DTM      TIMESTAMP          NULL COMMENT '등록일시'
,REG_USR_ID   VARCHAR(40)        NULL COMMENT '등록자'
,UPD_DTM      TIMESTAMP          NULL COMMENT '변경일시'
,UPD_USR_ID   VARCHAR(40)        NULL COMMENT '변경자'
,PRIMARY KEY(USR_ID,EXEC_CD,START_DT)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='운동목표이력';
;

------------------------------
-- 유저
------------------------------

﻿DROP TABLE PUSH.TSYUR00010;

CREATE TABLE PUSH.TSYUR00010 (
 USR_EMAIL    VARCHAR(40)    NOT NULL comment '사용자이메일'    
,USR_ID       VARCHAR(40)        NULL COMMENT '사용자아이디'    
,USR_PW       VARCHAR(100)       NULL comment '사용자암호'      
,USR_NM       VARCHAR(40)        NULL comment '사용자명'        
,USR_AGE      INT                NULL comment '사용자나이'      
,USE_YN       CHAR(1)            NULL comment '사용여부'        
,REG_DTM      TIMESTAMP          NULL COMMENT '등록일시'
,REG_USR_ID   VARCHAR(40)        NULL COMMENT '등록자'
,UPD_DTM      TIMESTAMP          NULL COMMENT '변경일시'
,UPD_USR_ID   VARCHAR(40)        NULL COMMENT '변경자'
,PRIMARY KEY (USR_EMAIL)
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='사용자';
;

