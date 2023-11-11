package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class AutomationExerciseStepDefinitions {
    AutomationExercisePage automationExercisePage = new AutomationExercisePage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    String email = faker.internet().emailAddress();
    String passsifre = faker.internet().password();


    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(automationExercisePage.logo.isDisplayed());
    }

    @Given("Click on Signup Login button")
    public void click_on_signup_login_button() {
        automationExercisePage.signUPLoginHomePage.click();
    }

    @Given("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        Assert.assertTrue(automationExercisePage.newUserSignup.isDisplayed());
    }

    @Given("Enter name")
    public void enter_name() {
        automationExercisePage.nameBox.sendKeys(faker.name().fullName());
    }

    @Given("Enter email adress")
    public void enter_email_adress() {
        System.out.println("email = " + email);
        automationExercisePage.emailBox.sendKeys(email);
    }

    @Given("Click Signup button")
    public void click_signup_button() {
        automationExercisePage.signupButton.click();
    }

    @Given("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_information_is_visible() {
        Assert.assertTrue(automationExercisePage.enterAccountInformation.isDisplayed());
    }

    @Given("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        System.out.println("passsifre = " + passsifre);
        actions.click(automationExercisePage.titleGenderMR)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(passsifre)
                .sendKeys(Keys.TAB)
                .sendKeys("7")
                .sendKeys(Keys.TAB)
                .sendKeys("May")
                .sendKeys(Keys.TAB)
                .sendKeys("2000")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
    }

    @Given("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {
        automationExercisePage.newsletterCheckBox.click();
    }

    @Given("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        automationExercisePage.specialOffersCheckBox.click();
    }

    @Given("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        actions.click(automationExercisePage.firstnameBox)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().secondaryAddress())
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().state())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .perform();

    }

    @Given("Click Create Account button")
    public void click_create_account_button() {
        automationExercisePage.createAccount.click();

    }

    @Given("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        Assert.assertTrue(automationExercisePage.accountCreated.isDisplayed());
    }

    @Given("Click Continue button")
    public void click_continue_button() {
        automationExercisePage.continueButton.click();
        // ReusableMethods.click(automationExercisePage.reklamKapat);
    }

    @Given("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        Assert.assertTrue(automationExercisePage.loggedInAs.isDisplayed());
    }

    @Given("Click Delete Account button")
    public void click_delete_account_button() {
        automationExercisePage.deleteAccount.click();
    }

    @Given("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {
        Assert.assertTrue(automationExercisePage.accountDeleted.isDisplayed());
    }

    // TC02 Login User with correct email and password
    @Then("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        Assert.assertTrue(automationExercisePage.loginToYourAccount.isDisplayed());
    }

    @Then("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        enter_name();
        enter_email_adress();
        click_signup_button();
        fill_details_title_name_email_password_date_of_birth();
        select_checkbox_sign_up_for_our_newsletter();
        select_checkbox_receive_special_offers_from_our_partners();
        fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number();
        click_create_account_button();
        click_continue_button();

        automationExercisePage.logOutHomePage.click();
        automationExercisePage.loginEmailBox.sendKeys(email);
        automationExercisePage.loginPasswordBox.sendKeys(passsifre);

    }

    @Then("Click login button")
    public void click_login_button() {
        automationExercisePage.loginButton.click();
    }

    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {
        Assert.assertTrue(automationExercisePage.accountDeleted.isDisplayed());
    }

    @And("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {
        automationExercisePage.loginEmailBox.sendKeys(ConfigReader.getProperty("fakeEmail"));
        automationExercisePage.loginPasswordBox.sendKeys(ConfigReader.getProperty("fakePassword"));
    }
    @Then("Verify error Your email or password is incorrect! is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertTrue(automationExercisePage.incorrectEmailAndPassMessage.isDisplayed());
    }
}

