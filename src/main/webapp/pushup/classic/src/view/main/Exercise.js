Ext.define('pushup.view.main.Exercise', {
     extend     : 'Ext.form.Panel'
    ,xtype      : 'exercise'
    //,controller : 'exercise'
    ,viewModel  : 'exercise'
    
    //-------------------------------------------
    // 제목
    //-------------------------------------------
    ,title    : '오늘의 운동'
    ,header   : { titleAlign: 'center' }    
    ,layout   : { type:'vbox' , pack:'top' , align:'middle'}   
    ,defaults : {
         bodyPadding: '20 20'
        ,margin : '10, 0, 0, 0'
        ,border : true
     }    
    ,autoSize : true
    ,items :
     [
      //-------------------------------------------
      // 금일 현황
      //-------------------------------------------
      {
          xtype : 'panel'
         ,layout: {
              type : 'hbox'
             ,pack : 'center'
             ,align : 'middle'
          }         
         ,width:'95%'
         ,items : 
          [
            {bind:{html:'목표 : 일 {goalCnt}회',margin: '0 50 0 0'}}
           ,{bind:{html:'금일 : 총 {dailyTotalCnt}회'}}
          ] 
     //-------------------------------------------
     // 현재 수행 횟수
     //-------------------------------------------
      },{
          xtype : 'panel'
         ,layout: {
               type : 'hbox'
              ,pack : 'center'
              ,align : 'middle'
           }         
          ,width:'95%'
          ,bodyPadding: '50 50'
          ,items : 
           [
             {html:['수행수'],margin: '0 20 0 0'}
            ,{xtype:'textfield' , name:'searchValue2', margin: '0 20 0 0'}
            ,{xtype:'button' , text:'저장' , id:'saveBtn' , iconCls:'x-fa fa-save'}
           ] 
     //-------------------------------------------
     // 금일 수행 현황
     //-------------------------------------------
      },{
           xtype : 'panel'
          ,flex : 1
          ,width:'95%'
          //,height :'95%'
          //, margin: '0 0 0 0'
          ,layout: 'fit'
          ,items : 
           [
             //{xtype:'mainlist'}
              //-------------------------------------------
              // Grid
              //-------------------------------------------
              {
                  xtype      : 'grid'
                 ,reference  : 'exerciseGrid'
                 ,height     :'95%'
                 ,autoScroll : true
                 ,columns    :
                  [
                    {text:'순번' , dataIndex:'CD_ID_NM'       , style:'text-align:center' , align:'center' , flex:1}
                   ,{text:'일시' , dataIndex:'CD'             , style:'text-align:center' , align:'center' , flex:1}
                   ,{text:'횟수' , dataIndex:'CD_PARAM1_DESC' , style:'text-align:center' , align:'center' , flex:1}
                  ]
                 ,bind:{store:'{codeExtList}'}
              }
           ] 
      }      
     ]
});

