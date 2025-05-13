package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WebTest {
    private static WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://kush5948.github.io/Maven-Experiment-02/"); // Replace with your GITHUB-URL if needed
    }

    @Test
    public void titleValidationTest() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Experiment-2 Webpage with a logo";
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println(actualTitle);
        assertTrue(true, "Title should contain Experiment-2 logo");
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
