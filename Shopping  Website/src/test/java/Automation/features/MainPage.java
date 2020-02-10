package Automation.features;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Automation.tasks.ModuleFactoryPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)

public class MainPage extends ModuleFactoryPage {
	@Managed
	WebDriver driver;

	@Test
	public void visitsAutomationPage() {
		homePage.visitsHomePage();
		navigatingUserPage.signInIntoTheWebsite();
		navigatingUserPage.searchProduct();
		navigatingUserPage.addsProductsInTheCart();
		navigatingUserPage.proceedsToCheckOut();
		navigatingUserPage.selectsBankOption();
		navigatingUserPage.confirmsOrder();
	}

}
