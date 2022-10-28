package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {

	 @Given("^User is on NetBanking landing page$")
	    public void user_is_on_netbanking_landing_page(){
	       //code to navigate to login url
		 System.out.println("New user landed on landing page");
	    }

	 @When("^User login into appication with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_appication_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	        //throw new PendingException();
	        System.out.println(strArg1);
	        System.out.println(strArg2);
	 }

		
		 @Then("^Home page is populated$") public void home_page_is_populated(){
		 //home page validation
		 System.out.println("Home page is showing up correctly"); }
		 

	    @And("^Cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are_something(String strArg1) throws Throwable {
	       // throw new PendingException();
	    	System.out.println(strArg1);
	    }
      
	    @When("^User sign up with following details$")
	    public void user_sugn_up_with_following_details(DataTable data) throws Throwable {
	        //throw new PendingException();
	    List<String>   obj =  data.transpose().asList(String.class);
	    System.out.println(obj.get(0));
	    System.out.println(obj.get(1));
		System.out.println(obj.get(2));
		System.out.println(obj.get(3));
		System.out.println(obj.get(4));
	    }
	    
	    @Given("^Validate the browser$")
		public void validate_the_browser() throws Throwable {
			System.out.println("Deciding the browser to open");

		}
		 
		@When("^Browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
			System.out.println("Browser is triggered");
	    
	    }
		
		
		
		@Then("^Check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
			System.out.println("Browser is Started");
	    }

	}