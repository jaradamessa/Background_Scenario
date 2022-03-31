package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Test_Steps {
    private WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();

    }
    @Given("Set SkyBlue Background button exists")
    public void set_sky_blue_background_button_exists() {
    driver.get("https://techfios.com/test/101/");
    }
    @When("I click on the button")
    public void i_click_on_the_button() {
        driver.findElement(By.xpath("//button[contains(text(),'Set SkyBlue Background')]")).click();
    }
    @Then("The background color will change to sky blue")
    public void the_background_color_will_change_to_sky_blue() {
        //getting background color attribute with getCssValue()
        System.out.println(driver.findElement(By.cssSelector("body"))
                .getAttribute("style"));


    }

    @Given("Set SkyWhite Background button exists")
    public void set_sky_white_background_button_exists() {
        driver.get("https://techfios.com/test/101/");

    }

    @When("I click on the Set White Background button")
    public void iClickOnTheSetWhiteBackgroundButton() {
        driver.findElement(By.xpath("//button[contains(text(),'Set White Background')]")).click();
    }
    @Then("the background color will change to white")
    public void the_background_color_will_change_to_white() {
        //getting background color attribute with getCssValue()
        System.out.println(driver.findElement(By.cssSelector("body"))
                .getAttribute("style"));


    }



}

