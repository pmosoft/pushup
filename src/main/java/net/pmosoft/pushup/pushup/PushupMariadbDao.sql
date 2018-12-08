        SELECT A.EXER_GOAL_CNT -- 운동목표횟수    
        FROM   PUSH.TPUSH00020 A
        WHERE  A.USR_ID   = 'lifedomy@gmail.com'
        AND    A.START_DT = (SELECT MAX(START_DT) FROM PUSH.TPUSH00020 WHERE USR_ID = 'lifedomy@gmail.com' AND EXER_CD = '01')
        AND    A.EXER_CD  = '01'
        
        SELECT * FROM   PUSH.TPUSH00020 A
        