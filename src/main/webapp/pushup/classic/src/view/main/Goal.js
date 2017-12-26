Ext.define('pushup.view.main.Goal', {
     extend     : 'Ext.form.Panel'
    ,xtype      : 'goal'
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
});

