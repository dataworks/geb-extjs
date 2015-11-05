package com.dataworks.pages

import geb.Page

import com.dataworks.modules.PanelModule

class KitchenSinkPage extends Page {

	static url = 'http://examples.sencha.com/extjs/6.0.1/examples/kitchensink/#all'
	
	static at = {
		title == 'Ext JS Kitchen Sink - All'
	}
	
	static content = {
		thumbnail { label -> $('div.thumbnail-text', text: label).parent() }
		panel { header -> module(new PanelModule(header: header)) }
		//noHeaderPanel { module(new NoHeaderPanelModule()) }
	}
}