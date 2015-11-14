package com.dataworks.pages.panels

import geb.Page

import com.dataworks.modules.ThumbnailModule

class PanelsPage extends Page {

	static url = 'http://examples.sencha.com/extjs/6.0.1/examples/kitchensink/#panels'
	
	static at = {
		title == 'Ext JS Kitchen Sink - Panels'
	}
	
	static content = {
		basicPanelsThumbnail { module(new ThumbnailModule(label: 'Basic Panel', page: BasicPanelsPage)) }
		framedPanelsThumbnail { module(new ThumbnailModule(label: 'Framed Panel', page: FramedPanelsPage)) }
		headerPositionPanelsThumbnail { module(new ThumbnailModule(label: 'Header Positioning', page: HeaderPositionPanelsPage)).thumbnail }
	}
}