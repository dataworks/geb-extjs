package com.dataworks.modules

import geb.Module

class PanelModule extends Module {
	String header
	def selector
	
	static content = {
		panel { selector ?: $('.x-title-text', text: header).closest('.x-panel') }
		bodyText { panel.$('.x-panel-body').text() }
		tool { toolClass -> panel.$(".x-tool-${toolClass}").closest('.x-tool') }
	}
}
