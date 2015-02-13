Ext.define('TGT.view.Viewport', {
    extend : 'Ext.container.Viewport',
    requires : [ 
        'Ext.layout.container.Border',
        
    ],
    layout : {
        type : 'border'
    },
    items : [ 
        { xtype: 'panel',
          title: 'Hi',
          region: 'center'
        }
       
        
    ]
});