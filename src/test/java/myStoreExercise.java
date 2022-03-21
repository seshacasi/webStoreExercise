import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class myStoreExercise {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.xpath("//*[@title='Log in to your customer account']")).click();
        driver.findElement(By.id("email_create")).sendKeys("johnsnow123@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        driver.findElement(By.xpath("//*[@id='uniform-id_gender1']")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("John");
        driver.findElement(By.id("customer_lastname")).sendKeys("Snow");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("passwd")).sendKeys("iddqdidkfa!2");
        Select dropDownDays = new Select(driver.findElement(By.id("days")));
        dropDownDays.selectByValue("14");
        Select dropDownMonths = new Select(driver.findElement(By.id("months")));
        dropDownMonths.selectByValue("3");
        Select dropDownYears = new Select(driver.findElement(By.id("years")));
        dropDownYears.selectByValue("1969");
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("firstname")).click();
        driver.findElement(By.id("lastname")).click();
        driver.findElement(By.id("address1")).sendKeys("Wall Street 7 - 32, 23233 ");
        driver.findElement(By.id("city")).sendKeys("New - York");
        Select dropDownState = new Select(driver.findElement(By.id("id_state")));
        dropDownState.selectByVisibleText("Alabama");
        driver.findElement(By.id("postcode")).sendKeys("32411");
        driver.findElement(By.id("other")).sendKeys("Selfmotivated person");
        driver.findElement(By.id("phone_mobile")).sendKeys("6346983934945");
        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys("Office");
        driver.findElement(By.id("submitAccount")).click();

        driver.quit();

    }
}
