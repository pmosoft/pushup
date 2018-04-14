Ext.define('pushup.view.main.Main', {
    extend     : 'Ext.tab.Panel',
    xtype      : 'app-main'
   ,controller : 'main'
   ,viewModel  : 'main'
   ,defaults: {
        tab: { iconAlign:'top' }
       ,styleHtmlContent: true
    }
   ,tabBarPosition: 'bottom'
   ,items: 
    [
     {
         title: '운동11111'
        ,iconCls: 'x-fa fa-home'
        ,layout: 'fit'
        ,items: [{
             xtype: 'exercise'
         }]
     },{
         title: '목표'
        ,iconCls: 'x-fa fa-user'
        ,layout: 'fit'
        ,items: [{
             xtype: 'goal'
         }]
     },{
         title: '리뷰',
         iconCls: 'x-fa fa-users',
         bind: {
             html: '{loremIpsum}'
         }
     },{
         title: '세팅',
         iconCls: 'x-fa fa-cog',
         bind: {
             html: '{loremIpsum}'
         }
         }
    ]
});
