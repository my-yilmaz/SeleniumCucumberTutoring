package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {
    public AutomationExercisePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='logo pull-left']")
    public WebElement logo;
    @FindBy(xpath = "//*[@class='fa fa-lock']")
    public WebElement signUPLoginHomePage;
    @FindBy(xpath = "//*[text()='New User Signup!']")
    public WebElement newUserSignup;
    @FindBy(xpath = "//*[@data-qa='signup-name']")
    public WebElement nameBox;
    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement emailBox;
    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement signupButton;
    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement enterAccountInformation;
    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement titleGenderMR;
    @FindBy(xpath = "//*[@id='newsletter']")
    public WebElement newsletterCheckBox;
    @FindBy(xpath = "//*[@id='optin']")
    public WebElement specialOffersCheckBox;
    @FindBy(xpath = "//*[@id='first_name']")
    public WebElement firstnameBox;
    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createAccount;
    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreated;
    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement continueButton;
    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedInAs;
    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteAccount;
    @FindBy(xpath = "//*[text()='Account Deleted!']")
    public WebElement accountDeleted;
    @FindBy(xpath = "//*[@id='dismiss-button']")
    public WebElement reklamKapat;
    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement loginToYourAccount;
    @FindBy(xpath = "//*[@data-qa='login-email']")
    public WebElement loginEmailBox;
    @FindBy(xpath = "//*[@data-qa='login-password']")
    public WebElement loginPasswordBox;
    @FindBy(xpath = "//*[@data-qa='login-button']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[text()=' Logout']")
    public WebElement logOutHomePage;
    @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement incorrectEmailAndPassMessage;




}
