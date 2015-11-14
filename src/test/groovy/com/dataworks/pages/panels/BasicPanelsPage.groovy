package com.dataworks.pages.panels

import geb.Page

import com.dataworks.modules.PanelModule

class BasicPanelsPage extends Page {

	static url = 'http://examples.sencha.com/extjs/6.0.1/examples/kitchensink/#basic-panels'
	
	static at = {
		title == 'Ext JS Kitchen Sink - Basic Panel'
	}
	
	static content = {
		noHeaderPanel { module(new PanelModule(selector: $('.x-panel').hasNot('.x-title-text'))) }
		titlePanel { module(new PanelModule(header: 'Title')) }
		collapsiblePanel { module(new PanelModule(header: 'Collapsible')) }
		toolsPanel { module(new PanelModule(header: 'Tools')) }
	}
}