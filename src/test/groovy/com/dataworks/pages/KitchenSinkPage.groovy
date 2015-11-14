package com.dataworks.pages

import geb.Page

import com.dataworks.modules.ThumbnailModule
import com.dataworks.pages.panels.PanelsPage

class KitchenSinkPage extends Page {

	static url = 'http://examples.sencha.com/extjs/6.0.1/examples/kitchensink/#all'
	
	static at = {
		title == 'Ext JS Kitchen Sink - All'
	}
	
	static content = {
		panelsThumbnail { module(new ThumbnailModule(label: 'Panels', page: PanelsPage)) }
		gridsThumbnail { module(new ThumbnailModule(label: 'Grids')) }
		pivotGridsThumbnail { module(new ThumbnailModule(label: 'Pivot Grids')) }
		dataBindingThumbnail { module(new ThumbnailModule(label: 'Data Binding')) }
		treesThumbnail { module(new ThumbnailModule(label: 'Trees')) }
		tabsThumbnail { module(new ThumbnailModule(label: 'Tabs')) }
		windowsThumbnail { module(new ThumbnailModule(label: 'Windows')) }
		buttonsThumbnail { module(new ThumbnailModule(label: 'Buttons')) }
		dataViewThumbnail { module(new ThumbnailModule(label: 'DataView')) }
		formFieldsThumbnail { module(new ThumbnailModule(label: 'Form Fields')) }
		formsThumbnail { module(new ThumbnailModule(label: 'Forms')) }
		toolbarsThumbnail { module(new ThumbnailModule(label: 'Toolbars')) }
		layoutsThumbnail { module(new ThumbnailModule(label: 'Layouts')) }
		dragAndDropThumbnail { module(new ThumbnailModule(label: 'Drag & Drop')) }
		extDirectThumbnail { module(new ThumbnailModule(label: 'Ext Direct')) }
		enterpriseThumbnail { module(new ThumbnailModule(label: 'Enterprise')) }
	}
}