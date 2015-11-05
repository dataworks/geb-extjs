package com.dataworks

import com.dataworks.pages.KitchenSinkPage
import geb.spock.GebReportingSpec
import spock.lang.*

@Stepwise
class KitchenSinkSpec extends GebReportingSpec {
	
	def "going to kitchen sink page"() {
		when:
		to KitchenSinkPage
		then:
		thumbnail('Panels').click()
		thumbnail('Basic Panel').click()
		
		// No header panel
		def noHeaderPanel = $('.x-panel').hasNot('.x-title-text')
		assert noHeaderPanel
		assert noHeader
		
		def titlePanel = panel('Title')
		assert titlePanel.panel
		assert titlePanel.bodyText =~ /Lorem ipsum dolor/
		
		def collapsiblePanel = panel('Collapsible')
		assert collapsiblePanel.panel
		assert collapsiblePanel.bodyText =~ /Lorem ipsum dolor/
		assert collapsiblePanel.tool('collapse-top')
		collapsiblePanel.tool('collapse-top').click()
		assert !(collapsiblePanel.bodyText =~ /Lorem ipsum dolor/)
		assert collapsiblePanel.tool('expand-bottom')
		collapsiblePanel.tool('expand-bottom').click()
		assert collapsiblePanel.bodyText =~ /Lorem ipsum dolor/
		
		def toolsPanel = panel('Tools')
		assert toolsPanel.panel
		assert toolsPanel.tool('pin')
		assert toolsPanel.tool('refresh')
		assert toolsPanel.tool('search')
		assert collapsiblePanel.tool('save')
	}
}