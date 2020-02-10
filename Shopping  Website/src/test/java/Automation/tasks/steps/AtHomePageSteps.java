package Automation.tasks.steps;

import Automation.tasks.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AtHomePageSteps extends ScenarioSteps {

	private HomePage onHomePage() {
		return pages().get(HomePage.class);
	}

	@Step
	public void visitsHomePage() {
		onHomePage().open();
	}
}
