package Selenium_Scenarios.ex01_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Test_Selenium_Assert {

    @Test
    public void test_selenium_assert() {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");


        //TestNG
        //Assert.assertEquals(driver.getCurrentUrl(), "Google");
        Assert.assertEquals(driver.getTitle(), "Google");

        //AssertJ
        assertThat(driver.getTitle())
                .isNotEmpty()
                .isNotBlank()
                .isNotNull()
                .isEqualTo("Google");



        driver.quit();
    }
}
