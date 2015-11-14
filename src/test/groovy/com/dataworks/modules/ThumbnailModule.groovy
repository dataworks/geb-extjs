package com.dataworks.modules

import geb.Browser
import geb.Module
import geb.navigator.factory.NavigatorFactory

class ThumbnailModule extends Module {
	String label
	def page
	
	static content = {
		thumbnail(to: page) { $('div.thumbnail-text', text: label).parent() }
	}
	
	def navigate() {
		thumbnail.click()
	}
}
