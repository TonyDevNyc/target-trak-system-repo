Ext.Loader.setConfig({
	enabled: true,
	disableCaching: false
});

Ext.application({
	name: 'TGT',
	
	views: ['Viewport'],
	
	requires: [],
	
    controllers: [],
	
	autoCreateViewport: true,

	launch: function( args ) { }
});