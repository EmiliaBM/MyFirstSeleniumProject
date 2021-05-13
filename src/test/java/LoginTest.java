import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void loginTestOne(){

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".skip-account.skip-link > .label")).click();
        driver.findElement(By.cssSelector("a[title='Log In']")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("emilia_ali@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("parola17");
        driver.findElement(By.cssSelector("#send2")).click();
        WebElement Welcome = driver.findElement(By.cssSelector(".hello strong"));
        Assert.assertEquals("Hello, Em BM!", Welcome.getText());
        driver.quit();
    }
}
