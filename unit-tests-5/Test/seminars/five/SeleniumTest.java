package seminars.five;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class SeleniumTest {
    WebDriver driver;

    @BeforeEach
    void setUP() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void setDOWN() {
        driver.quit();
    }

    @Test
    void testSeleniumFind() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();
        WebElement seleniumPath = driver.findElement(By.
                xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/cite"));
        // //*[@id="rso"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/cite
        assertThat(seleniumPath).isNotNull();

    }

    @Test
    void checkAuthorization() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        WebElement login = driver.findElement(By.name("user-name"));
        login.sendKeys("standard_user");
        Thread.sleep(2000);


        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");
        Thread.sleep(2000);

        WebElement buttonInput = driver.findElement(By.name("login-button"));
        buttonInput.click(); // Имитация КЛИКА
        //buttonInput.submit(); // Имитация ENTER
        Thread.sleep(2000);

        WebElement product = driver.findElement(By.className("title"));
        assertEquals(product.getText(),"Products");
    }

}
