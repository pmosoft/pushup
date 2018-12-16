        SELECT SUM(A.EXER_CNT) AS TODAY_EXER_CNT -- 금일누적운동횟수    
        FROM   PUSH.TPUSH00010 A
        WHERE  A.USR_ID   = 'lifedomy@gmail.com'
        AND    A.EXER_DT  = DATE_FORMAT(NOW(),'%Y%m%d')
        AND    A.EXER_CD  = '01'
