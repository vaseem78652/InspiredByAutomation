package Automation.tasks;

import Automation.tasks.steps.AtHomePageSteps;
import Automation.tasks.steps.AtNavigatingUserPageSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class ModuleFactoryPage extends ScenarioSteps {

	@Steps
	public AtNavigatingUserPageSteps navigatingUserPage;
	
	@Steps
	public AtHomePageSteps homePage;
	
	

}
