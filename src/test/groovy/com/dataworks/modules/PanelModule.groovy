package com.dataworks.modules

import geb.Module

class PanelModule extends Module {
	String header
	
	static content = {
		panel { $('.x-title-text', text: header).closest('.x-panel') }
		bodyText { panel.$('.x-panel-body').text() }
		tool { toolClass -> panel.$(".x-tool-${toolClass}").closest('.x-tool') }
	}
}
