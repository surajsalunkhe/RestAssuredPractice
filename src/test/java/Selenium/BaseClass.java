package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseClass {
    WebDriver driver;

    @BeforeClass
    public void setupApplication()
    {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        //options.addArguments("--incognito");
        //options.addArguments("disable-infobars");
        //options.addArguments("headless");

         driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }
    @AfterClass
    public void closeApplication()
    {
        driver.quit();
    }

}
