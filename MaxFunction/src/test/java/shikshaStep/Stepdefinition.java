package shikshaStep;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import shikshaDriver.DriverSetup;
import shikshaPage.MaxFunctionPage;

public class Stepdefinition {
	static WebDriver driver;
	MaxFunctionPage mf;
	
	@Given("user is on Shiksha home page")
	public void user_is_on_shiksha_home_page() throws InterruptedException, AWTException {
		driver = DriverSetup.chromedriver();
	    mf = new MaxFunctionPage(driver);
	    mf.background();
	}

	@When("user selects the shiksha online drop down")
	public void user_selects_the_shiksha_online_drop_down() throws InterruptedException {
		mf.shikshaOnline();
		
	}

	@And("user selects on max\\()Function in Python")
	public void user_selects_on_max_function_in_python() throws InterruptedException {
		mf.maxFunction();
	
	}
	@And("user scrolls to download pdf")
	public void user_scrolls_to_download_pdf() {
		 mf.scroll2();
	}
	@And("clicks on download as pdf")
	public void clicks_on_download_as_pdf() throws InterruptedException {
		mf.pdf();
        mf.down(); 
	}
	@Then("user downloads pdf successfully")
	public void user_downloads_pdf_successfully() {
	    Assert.assertEquals("https://images.shiksha.com/mediadata/articleCtaPdf/140863.pdf?v=1698785347",driver.getCurrentUrl());
	}

//======================Scenario2======================================================================================================

	@Given("user is on max\\()Function page")
	public void user_is_on_max_function_page() throws InterruptedException, AWTException {
		 driver = DriverSetup.chromedriver();
		    mf = new MaxFunctionPage(driver);
		    mf.background(); 
		    mf.shikshaOnline();
		    mf.maxFunction();
	}
	
	@When("user scrolls")
	public void user_scrolls() {
		mf.scroll();
	}

	@When("user clicks the rating option")
	public void user_clicks_the_rating_option() throws InterruptedException {
		
	    mf.maxFunctionRating();
	}
	
	@And("user is redirected to feedback form")
	public void user_is_redirected_to_feedback_form() {
	    
	}
	
	@And("user selects one of the available options")
	public void user_selects_one_of_the_available_options() throws InterruptedException{
	     mf.buttonRating();
	}
	@And("user enters Suggestions")
	public void user_enters_suggestions(DataTable dt) throws InterruptedException {
		
		List<List<String>> cells=dt.cells();
		mf.textarea(cells.get(0).get(0));
		
	}
	@Then("user clicks the submit button")
	public void user_clicks_the_submit_button() throws InterruptedException { 
		mf.clkbtn();
	}
	@Then("user submits the feedback form successfully")
	public void user_submits_the_feedback_form_successfully() {
		String feed3 = mf.fd();
		Assert.assertTrue(feed3.contains("Feedback Received"));
	}
	
//=======================Scenario3==========================================================================================================	
	
	@Given("user is on the max\\()Function page")
	public void user_is_on_the_max_function_page() throws InterruptedException, AWTException {
		driver = DriverSetup.chromedriver();
	    mf = new MaxFunctionPage(driver);
	    mf.background(); 
	    mf.shikshaOnline();
	    mf.maxFunction();
	}
	@When("user clicks on popular")
	public void user_clicks_on_popular() throws InterruptedException {
	    mf.popular();
	}
	@And("user clicks on python training")
	public void user_clicks_on_python_training() {
	    mf.python();
	}
	@And("user is redirected to the python programming page")
	public void user_is_redirected_to_the_python_programming_page() {
	   
	}
	@And("user clicks the enquire now button")
	public void user_clicks_the_enquire_now_button() throws InterruptedException {
	    mf.enquire();
	}
	@Then("user is redirected to the enquired page successfully")
	public void user_is_redirected_to_the_enquired_page_successfully() {
		Assert.assertEquals("https://www.shiksha.com/online-courses/thankyou?cid=iibol2",driver.getCurrentUrl());
	}
		
//====================Scenario4=============================================================================================================

	@Given("user is in max\\() function in python page")
	public void user_is_in_max_function_in_python_page() throws InterruptedException, AWTException {
		driver = DriverSetup.chromedriver();
		 mf = new MaxFunctionPage(driver);
	     mf.background();
	     mf.shikshaOnline();
		 mf.maxFunction();
		 mf.scroll1(); 
	}
	@When("user scrolls through the page")
	public void user_scrolls_through_the_page() {
		mf.scroll1();
	}
	@And("enters their comment")
	public void enters_their_comment(DataTable dt) throws InterruptedException {
		List<List<String>> cells=dt.cells();
        mf.commenttxt(cells.get(0).get(0));
	}
	@And("user clicks the post button")
	public void user_clicks_the_post_button() throws InterruptedException {
		mf.postbtn();
	}
	@Then("user is able to see the posted comment below")
	public void user_is_able_to_see_the_posted_comment_below() {
		Assert.assertEquals("https://www.shiksha.com/online-courses/articles/max-function-in-python/",driver.getCurrentUrl());
	}
	
//==================Scenario5================================================================================================================
	
	@Given("user is on ask a question page")
	public void user_is_on_ask_a_question_page() throws InterruptedException, AWTException {
		driver = DriverSetup.chromedriver();
		 mf = new MaxFunctionPage(driver);
	     mf.background();
	}
	@When("user wants to click whats app magnifying icon")
	public void user_wants_to_click_whats_app_magnifying_icon() {
		mf.chover();
		mf.clickAsk();
	    
	}
	@Then("user finds the search bar on whats app magnifying icon")
	public void user_finds_the_search_bar_on_whats_app_magnifying_icon() {
        boolean isOverlapping = mf.micon();
        Assert.assertTrue(isOverlapping, "Search bar is not overlapping WhatsApp icon");

	}

	@AfterStep

	public static void takeScreendown(Scenario scenerio) {

		TakesScreenshot ts= (TakesScreenshot) driver;

		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);

	   scenerio.attach(src, "image/png",scenerio.getName());

	
  } 
}
