import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerTest {

    public void registerTestOne (){

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Bogdan");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("N");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("BM");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("bogdan.n.babalau@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("parola17");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("parola17");
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();

        driver.quit();

    }
}
