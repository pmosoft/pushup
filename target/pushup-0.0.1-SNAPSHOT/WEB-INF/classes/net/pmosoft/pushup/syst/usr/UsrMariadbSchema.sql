﻿DROP TABLE TSYUR00010
;

CREATE TABLE TSYUR00010 (
 USR_ID      VARCHAR(40)    NOT NULL COMMENT '사용자아이디'    
,USR_EMAIL   VARCHAR(40)    NOT NULL comment '사용자이메일'    
,USR_PW      VARCHAR(20)    NOT NULL comment '사용자암호'      
,USR_NM      VARCHAR(40)    NOT NULL comment '사용자명'        
,USR_AGE     INT                NULL comment '사용자나이'      
,USE_YN       CHAR(1)       NOT NULL comment '사용여부'        
,REG_DT       DATE              NULL comment '등록일시'        
,REG_USR_ID  VARCHAR(20)        NULL comment '등록사용자아이디'
,UPD_DT       DATE              NULL comment '변경일시'        
,UPD_USR_ID  VARCHAR(20)        NULL comment '변경사용자아이디'
,PRIMARY KEY (USR_ID)
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='사용자';
;

INSERT INTO TSYUR00010 VALUES('ADMIN','ADMIN@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN',NOW(),'ADMIN');
INSERT INTO TSYUR00010 VALUES('ADMIN2','ADMIN2@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN2',NOW(),'ADMIN2');
INSERT INTO TSYUR00010 VALUES('ADMIN3','ADMIN3@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN3',NOW(),'ADMIN3');
INSERT INTO TSYUR00010 VALUES('ADMIN4','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');


SELECT * FROM TSYUR00010
;

drop table TSYUR00020
;


CREATE TABLE TSYUR00020 (
 USR_ID      VARCHAR(40)    NOT NULL COMMENT '사용자아이디'    
,USR_EMAIL   VARCHAR(40)    NOT NULL comment '사용자이메일'    
,USR_AGE     INT                NULL comment '사용자나이'      
,REG_DT       DATE              NULL comment '등록일시'        
,REG_USR_ID  VARCHAR(20)        NULL comment '등록사용자아이디'
,UPD_DT       DATE              NULL comment '변경일시'        
,UPD_USR_ID  VARCHAR(20)        NULL comment '변경사용자아이디'
,PRIMARY KEY (USR_ID)
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='사용자부가정보';
;

DROP TABLE TSYUR00030;

CREATE TABLE TSYUR00030 (
 USR_ID      VARCHAR(40)    NOT NULL COMMENT '사용자아이디'    
,USR_PRJ_ID  VARCHAR(40)    NOT NULL comment '사용자프로젝트아이디'    
,REG_DT       DATE              NULL comment '등록일시'        
,REG_USR_ID  VARCHAR(20)        NULL comment '등록사용자아이디'
,UPD_DT       DATE              NULL comment '변경일시'        
,UPD_USR_ID  VARCHAR(20)        NULL comment '변경사용자아이디'
,PRIMARY KEY (USR_ID)
) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='사용자프로젝트';
;

select * from TSYUR00010
;

INSERT INTO TSYUR00010 VALUES('CAADMIN41','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CAADMIN42','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CAADMIN43','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CAADMIN44','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CAADMIN45','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CAADMIN46','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CAADMIN47','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CAADMIN48','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CAADMIN49','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CAADMIN51','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CAADMIN52','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CAADMIN53','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CAADMIN54','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CAADMIN55','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CAADMIN56','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CAADMIN57','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CAADMIN58','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CAADMIN59','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN41','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN42','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN43','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN44','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN45','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN46','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN47','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN48','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN49','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN51','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN52','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN53','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN54','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN55','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN56','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN57','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN58','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CABDMIN59','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN41','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN42','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN43','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN44','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN45','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN46','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN47','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN48','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN49','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN51','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN52','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN53','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN54','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN55','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN56','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN57','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN58','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CADMIN59','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN41','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN42','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN43','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN44','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN45','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN46','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN47','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN48','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN49','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN51','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN52','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN53','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN54','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN55','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN56','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN57','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN58','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('CBDMIN59','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN41','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN42','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN43','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN44','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN45','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN46','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN47','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN48','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN49','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN51','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN52','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN53','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN54','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN55','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN56','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN57','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN58','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('AADMIN59','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN41','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN42','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN43','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN44','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN45','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN46','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN47','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN48','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN49','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN51','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN52','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN53','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN54','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN55','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN56','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN57','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN58','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ABDMIN59','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN41','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN42','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN43','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN44','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN45','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN46','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN47','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN48','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN49','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN51','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN52','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN53','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN54','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN55','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN56','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN57','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN58','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('ADMIN59','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN41','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN42','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN43','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN44','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN45','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN46','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN47','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN48','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN49','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN51','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN52','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN53','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN54','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN55','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN56','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN57','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN58','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');
INSERT INTO TSYUR00010 VALUES('BDMIN59','ADMIN4@PMOSOFT.NET','1','ADMIN',50,'Y',NOW(),'ADMIN4',NOW(),'ADMIN4');

COMMIT
;
