Ext.define('pushup.view.main.GoalModel', {
    extend: 'Ext.app.ViewModel'
   ,alias: 'viewmodel.goal'
   ,data: {
        goalCnt       : '105'
       ,dailyTotalCnt : '49'
       ,curExeCnt     : '10'
    }
   ,stores : {
        goalGrid : {
            fields : [
                       'CD_ID_NM'      
                      ,'CD'            
                      ,'CD_PARAM1_DESC'
                     ]
           ,proxy : {
                type : 'ajax'
               ,url : '/dams/code/selectCodeExtList'
               ,reader : {
                    type : 'json'
                   ,rootProperty : 'data'
                   ,totalProperty : 'total'    
                }
            }
        }
    }
});
