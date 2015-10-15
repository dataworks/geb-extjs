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
	}
}