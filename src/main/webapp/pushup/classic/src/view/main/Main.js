Ext.define('pushup.view.main.Main', {
    extend     : 'Ext.tab.Panel',
    xtype      : 'app-main'
   ,controller : 'main'
   ,viewModel  : 'main'
   ,tabBarPosition: 'bottom'
   ,defaults: {
        tab: { iconAlign:'top' }
       ,styleHtmlContent: true
    }
   ,items: 
    [
     {
         title: '운동'
        ,iconCls: 'x-fa fa-home'
        ,layout: 'fit'
        ,items: [{
             xtype: 'exercise'
         }]
     },{
         title: '목표',
         iconCls: 'x-fa fa-user',
         bind: {
             html: '{loremIpsum}'
         }
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
