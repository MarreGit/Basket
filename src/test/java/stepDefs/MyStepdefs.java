package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class MyStepdefs {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");
        driver.manage().window().maximize();
    }

    @Given("I enter day of birth {string}")
    public void iEnterDayOfBirth(String text) throws InterruptedException {
        driver.findElement(By.id("dp")).sendKeys(text);
        driver.findElement(By.id("dp")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @And("I enter firstname {string}")
    public void iEnterFirstname(String text) throws InterruptedException {
        driver.findElement(By.id("member_firstname")).sendKeys(text);
        Thread.sleep(1000);
    }

    @And("I enter lastname {string}")
    public void iEnterLastname(String text) throws InterruptedException {
        driver.findElement(By.id("member_lastname")).sendKeys(text);
        Thread.sleep(1000);
    }

    @And("I enter email {string}")
    public void iEnterEmail(String text) throws InterruptedException {
        driver.findElement(By.id("member_emailaddress")).sendKeys(text);
        Thread.sleep(1000);
    }

    @And("I confirm email {string}")
    public void iConfirmEmail(String text) throws InterruptedException {
        driver.findElement(By.id("member_confirmemailaddress")).sendKeys(text);
        Thread.sleep(1000);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String text) throws InterruptedException {
        driver.findElement(By.id("signupunlicenced_password")).sendKeys(text);
        Thread.sleep(1000);
    }

    @And("I confirm password {string}")
    public void iConfirmPassword(String text) throws InterruptedException {
        driver.findElement(By.id("signupunlicenced_confirmpassword")).sendKeys(text);
        Thread.sleep(1000);
    }

    @And("I tick Account confirmation I have read {string}")
    public void iTickAccountConfirmationIHaveRead(String arg0) throws InterruptedException {
        driver.findElement(By.cssSelector(".md-checkbox > .md-checkbox:nth-child(1) .box")).click();
        Thread.sleep(1000);
    }

    @And("I tick Account confirmation I am aged {string}")
    public void iTickAccountConfirmationIAmAged(String arg0) throws InterruptedException {
        driver.findElement(By.cssSelector(".md-checkbox:nth-child(2) > label > .box")).click();
        Thread.sleep(1000);
    }

    @And("I tick Code of ethics {string}")
    public void iTickCodeOfEthics(String arg0) throws InterruptedException {
        driver.findElement(By.cssSelector(".md-checkbox:nth-child(7) .box")).click();
        Thread.sleep(1000);
    }

    @When("I click Confirm and join {string}")
    public void iClickConfirmAndJoin(String arg0) throws InterruptedException {
        driver.findElement(By.name("join")).click();
        Thread.sleep(1000);
    }

    @Then("I confirm account {string}")
    public void iConfirmAccount(String text) throws InterruptedException {
        String actual = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/h5")).getText();
        String expected = text;
        assertEquals(expected, actual);
        Thread.sleep(1000);
    }

    @And("I enter No lastname {string}")
    public void iEnterNoLastname(String arg0) {
    }

    @And("I confirm password No match {string}")
    public void iConfirmPasswordNoMatch(String arg0) {
    }

    @And("I tick Code of ethics Not ticked {string}")
    public void iTickCodeOfEthicsNotTicked(String arg0) {
    }

    @After
    public void closeTest() {
        System.out.println(" Test ends");

        driver.quit();
    }

    @Then("I confirm account password dont match{string}")
    public void iConfirmAccountPasswordDontMatch(String arg0) {

    }

    @Then("I confirm account no surname{string}")
    public void iConfirmAccountNoSurname(String arg0) {
    }

    @Then("I confirm account terms not valid {string}")
    public void iConfirmAccountTermsNotValid(String arg0) {
    }
}
