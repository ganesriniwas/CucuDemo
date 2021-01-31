package StepDefinition;

import java.io.IOException;

import UseCases.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition{
	Login l = new Login(); 
	@Given("^user is on Home page$")
	public void user_is_on_Home_page() throws IOException {
		l.loginPage();
	}
	@When("^user logins with email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_logins_with_email_and_password(String email, String password) throws IOException {
		l.login(email, password);
	} 
	@Then("^user should not be able to login$")
	public void user_should_not_be_able_to_login() {
		System.out.println("Then code");
	}
}

  
