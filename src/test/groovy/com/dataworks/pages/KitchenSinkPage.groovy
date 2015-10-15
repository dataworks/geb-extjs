package com.dataworks.pages

import geb.Page

class KitchenSinkPage extends Page {

	static url = 'http://examples.sencha.com/extjs/6.0.1/examples/kitchensink/#all'
	
	static at = {
		title == 'Ext JS Kitchen Sink - All'
	}
	
	static content = {
		thumbnail { label -> $("div.thumbnail-text", text: label).parent() }
	}
}