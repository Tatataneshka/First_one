package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1_whole_numbers {

    @Test
    public void test1() {
       System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор");
        driver.findElement(By.cssSelector("input.gNO89b")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div.XRsWPe.MEdqYd")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div.XRsWPe.AOvabd")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div.XRsWPe.MEdqYd")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div.XRsWPe.AOvabd")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("div.XRsWPe.AOvabd")).sendKeys(Keys.ENTER);
    driver.quit();
    }
}
