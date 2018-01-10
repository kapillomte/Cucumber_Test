package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDef {

    WebDriver driver;
    @Given("^open firefox and start with application$")
    public void openFirefoxAndStartWithApplication() throws Throwable {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\NISUM\\Documents\\Desktop\\Driver\\chromedriver.exe");


         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.gmail.com");

    }


    @When("^i enter valid username and valid password$")
    public void iEnterValidUsernameAndValidPassword() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("kapillomte2017@gmail.com");

        //driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("kapil");


        driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
        Thread.sleep(8000);
       // WebDriverWait wait =new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")));
       // WebDriverWait wait = new WebDriverWait(driver,30);
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='campaignListTable']")));
        driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("7773933935");


    }

    @Then("^then user should be able to login succesfully$")
    public void thenUserShouldBeAbleToLoginSuccesfully() throws Throwable {
        driver.findElement(By.xpath(".//div[@id='passwordNext']")).click();
    }


    @When("^i click on log out it$")
    public void iClickOnLogOutIt() throws Throwable {
        Thread.sleep(8000);


        driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();

    }

    @Then("^it should be log out$")
    public void itShouldBeLogOut() throws Throwable {
        Thread.sleep(8000);

        driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
    }


    @And("^browser should be closed$")
    public void browserShouldBeClosed() throws Throwable {
        //Thread.sleep(5000);
        driver.close();
    }
}
/*
    @When("^i enter valid username and valid password$")
    public void iEnterValidUsernameAndValidPassword() throws Throwable {

        driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("kapillomte2017@gmail.com");
        driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
        driver.findElement(By.xpath(".//*[@id='password']/div[1]")).sendKeys("7773931258");

    }

    @Then("^then user should be able to login succesfully$")
    public void thenUserShouldBeAbleToLoginSuccesfully() throws Throwable {

driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
    }


    @Then("^then user should be able to login successfully$")
    public void thenUserShouldBeAbleToLoginSuccessfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
*/