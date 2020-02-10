package Automation.tasks.pages;



import net.serenitybdd.core.pages.PageObject;


public class NavigatingUserPage extends PageObject {
	
	private static final String signin="//div[@class='header_user_info']/descendant::a[contains(text(),'Sign in')]";
	private static final String email="//input[@id='email']";
	private static final String password= "//input[@id='passwd']";
	private static final String signInButton= "//p[@class='submit']//span[1]";
	private static final String searchbox="//input[@id='search_query_top']";
	private static final String selectproduct="//li[@class='clearfix']//a[@class='product-name'][contains(text(),'Blouse')]";
	private static final String proceedsCheckout= "//div[@class='button-container']/a[contains(@title,'Proceed to checkout')]";
	private static final String bank="//a[@class='bankwire']"; 
	private static final String confirmOrder="//span[contains(text(),'I confirm my order')]";
	private static final String addToCart="//span[contains(text(),'Add to cart')]";
	
	public void clicksOnSignIN()
	{
		waitForTextToAppear("Sign in").$(signin).click();
		
	}

	public void enterCredentials() {
		// TODO Auto-generated method stub
		waitForTextToAppear("ALREADY REGISTERED?").$(email).type("vaseemhussain26@gmail.com");
		$(password).type("qwerty");
		$(signInButton).click();
	}

	public void search() {
		// TODO Auto-generated method stub
		$(searchbox).typeAndEnter("Summer dress");
		
		
	}

	public void addsProduct()  {
		// TODO Auto-generated method stub
		
		$(selectproduct).click();
		$(addToCart).click();
		
		
		
	}

	public void proceedsCheckout() {
		// TODO Auto-generated method stub
		waitForTextToAppear("Blouse").$(proceedsCheckout).click();
		waitForTextToAppear("SHOPPING-CART SUMMARY").$("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]").click();
		waitForTextToAppear("ADDRESSES").$("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]").click();
		waitForTextToAppear("SHIPPING").$("//input[@id='cgv']").click();
		$("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]").click();
		
		
		
	}

	public void choosesBank() {
		// TODO Auto-generated method stub
		waitForTextToAppear("PLEASE CHOOSE YOUR PAYMENT METHOD").$(bank).click();
		
		
	}

	public void confirmOrder() {
		// TODO Auto-generated method stub
		waitForTextToAppear("ORDER SUMMARY").$(confirmOrder).click();
		
		
	}

}
