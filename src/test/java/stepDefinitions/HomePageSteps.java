package stepDefinitions;


import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;

public class HomePageSteps {
	WebDriver driver;
	public HomePageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
	}



	@Then("^Home page is displayed update$")
	public void homePageIsDisplayedUpdate(){
	   
	   
	}

}