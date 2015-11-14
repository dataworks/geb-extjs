package com.dataworks

import com.dataworks.pages.KitchenSinkPage
import geb.spock.GebReportingSpec
import spock.lang.*

@Stepwise
class PanelsSpec extends GebReportingSpec {
	
	def "going to kitchen sink page"() {
		when:
		to KitchenSinkPage
		then:
		panelsThumbnail.navigate()
		basicPanelsThumbnail.navigate()
		
		assert noHeaderPanel.panel
		assert noHeaderPanel.bodyText =~ /Lorem ipsum dolor/
		
		assert titlePanel.panel
		assert titlePanel.bodyText =~ /Lorem ipsum dolor/
		
		assert collapsiblePanel.panel
		assert collapsiblePanel.bodyText =~ /Lorem ipsum dolor/
		assert collapsiblePanel.tool('collapse-top')
		collapsiblePanel.tool('collapse-top').click()
		assert !(collapsiblePanel.bodyText =~ /Lorem ipsum dolor/)
		assert collapsiblePanel.tool('expand-bottom')
		collapsiblePanel.tool('expand-bottom').click()
		assert collapsiblePanel.bodyText =~ /Lorem ipsum dolor/
		
		assert toolsPanel.panel
		assert toolsPanel.tool('pin')
		assert toolsPanel.tool('refresh')
		assert toolsPanel.tool('search')
		assert toolsPanel.tool('save')
	}
}