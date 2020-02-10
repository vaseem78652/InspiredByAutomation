package Automation.tasks.steps;

import Automation.tasks.pages.NavigatingUserPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AtNavigatingUserPageSteps extends ScenarioSteps {

	private NavigatingUserPage onNavigatingUserPage() {
		return pages().get(NavigatingUserPage.class);
	}

	@Step
	public void searchProduct() {
		onNavigatingUserPage().search();
	}

	@Step
	public void signInIntoTheWebsite() {
		onNavigatingUserPage().clicksOnSignIN();
		onNavigatingUserPage().enterCredentials();
	}

	@Step
	public void addsProductsInTheCart() {
		onNavigatingUserPage().addsProduct();
	}

	@Step
	public void proceedsToCheckOut() {
		onNavigatingUserPage().proceedsCheckout();
	}

	@Step
	public void selectsBankOption() {
		onNavigatingUserPage().choosesBank();
	}

	@Step
	public void confirmsOrder() {
		onNavigatingUserPage().confirmOrder();
	}
}
