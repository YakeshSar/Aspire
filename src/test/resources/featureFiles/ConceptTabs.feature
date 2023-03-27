Feature: User Should validate the ReactJs Applications

	Background: User navigate to application
		Given User should launch the application
		When User should click on Docs Tab
		
	Scenario: User should validate MainConceptTab
		When User should click on Main Concept Tab
		Then User should verify the text and save main Concept file
		
	Scenario: User should validate AdvancedGuideTab
		When User should click on Advanced Guide Tab
		Then User should verify the text and save advancedguide Concept file