import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wishListTest {

    @Test
public void AddProductToWishlist (){
    System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://testfasttrackit.info/selenium-test/");
    driver.findElement(By.cssSelector(".level0.nav-5.parent > .has-children.level0")).click();
    driver.findElement(By.cssSelector(".product-info  a[title='Slim fit Dobby Oxford Shirt']")).click();
    driver.findElement(By.cssSelector(".link-wishlist")).click();
    driver.findElement(By.cssSelector("#email")).sendKeys("emilia_ali@yahoo.com");
    driver.findElement(By.cssSelector("#pass")).sendKeys("parola17");
    driver.findElement(By.cssSelector("#send2")).click();
    driver.findElement(By.cssSelector(".level0.nav-5.parent > .has-children.level0")).click();
    driver.findElement(By.cssSelector(".product-info  a[title='Slim fit Dobby Oxford Shirt']")).click();
    driver.findElement(By.cssSelector(".link-wishlist")).click();
    WebElement AddedToWishlist = driver.findElement(By.cssSelector("h1"));
    Assert.assertEquals("MY WISHLIST", AddedToWishlist.getText());

    driver.quit();
}
}
