Ext.define('pushup.view.main.Goal', {
     extend     : 'Ext.form.Panel'
    ,xtype      : 'goal'
    ,requires: [
           'pushup.view.main.GoalModel'
          ,'pushup.view.main.GoalController'
       ]
    ,controller : 'goal'
    ,viewModel  : 'goal'
    //-------------------------------------------
    // 제목
    //-------------------------------------------
    ,title    : '목표설정'
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
    // 목표수 설정
    //-------------------------------------------
     {
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
            {html:['일일 목표수'],margin: '0 20 0 0'}
           ,{xtype:'textfield' , name:'searchValue2', margin: '0 20 0 0'}
           ,{xtype:'button' , text:'저장' , id:'goalCntSaveBtn' , iconCls:'x-fa fa-gift'}
          ] 
    //-------------------------------------------
    // 목표수 이력
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
                ,reference  : 'goalGrid'
                ,height     :'95%'
                ,autoScroll : true
                ,columns    :
                 [
                   {text:'순번' , dataIndex:'CD_ID_NM'       , style:'text-align:center' , align:'center' , flex:1}
                  ,{text:'일시' , dataIndex:'CD'             , style:'text-align:center' , align:'center' , flex:1}
                  ,{text:'목표수' , dataIndex:'CD_PARAM1_DESC' , style:'text-align:center' , align:'center' , flex:1}
                 ]
                //,bind:{store:'{codeExtList}'}
             }
          ] 
     }      
    ]
});

