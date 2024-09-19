package CyberBanglaTestNG_WebProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HeadingSection {

    public static WebDriver driver;
    @BeforeMethod
    public void setUp()
    {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://cyberbangla.org/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Test(priority = 0)
    public void home()
    {
        WebElement Home=driver.findElement(By.linkText("Home"));
        Home.click();
        String actualPageTitle=driver.getTitle();
        System.out.println(actualPageTitle);
        String expectedPageTitle="Cyber Bangla - Complete Cyber Security Service Provider";
        System.out.println(expectedPageTitle);
        if(actualPageTitle.contentEquals(expectedPageTitle))
        {
            System.out.println("Passed!!");
        }
        else {
            System.out.println("Failed!!");
        }
    }
    @Test(priority = 1)
    public void Services()
    {
        WebElement services=driver.findElement(By.linkText("Services"));
        services.click();
        String actualPageTitle=driver.getTitle();
        System.out.println(actualPageTitle);
        String expectedPageTitle="Services - Cyber Bangla";
        System.out.println(expectedPageTitle);
        if(actualPageTitle.contentEquals(expectedPageTitle))
        {
            System.out.println("Passed!!");
        }
        else {
            System.out.println("Failed!!");
        }
    }

    @Test(priority = 2)
    public void Courses()
    {
        WebElement courses=driver.findElement(By.linkText("Courses"));
        courses.click();
        String actualPageTitle=driver.getTitle();
        System.out.println(actualPageTitle);
        String expectedPageTitle="Search Results for “” – Cyber Bangla Academy";
        System.out.println(expectedPageTitle);
        if(actualPageTitle.contentEquals(expectedPageTitle))
        {
            System.out.println("Passed!!");
        }
        else {
            System.out.println("Failed!!");
        }
    }

    @Test(priority = 3)
    public void teamMembers()
    {
        WebElement team=driver.findElement(By.linkText("Team Members"));
        team.click();
        String actualPageTitle=driver.getTitle();
        System.out.println(actualPageTitle);
        String expectedPageTitle="Team - Cyber Bangla";
        System.out.println(expectedPageTitle);
        if(actualPageTitle.contentEquals(expectedPageTitle))
        {
            System.out.println("Passed!!");
        }
        else {
            System.out.println("Failed!!");
        }
    }


    @Test(priority = 4)
    public void Contacts()
    {
        WebElement contacts=driver.findElement(By.className("default-btn"));
        contacts.click();
        String actualPageTitle=driver.getTitle();
        System.out.println(actualPageTitle);
        String expectedPageTitle="Contact - Cyber Bangla";
        System.out.println(expectedPageTitle);
        if(actualPageTitle.contentEquals(expectedPageTitle))
        {
            System.out.println("Passed!!");
        }
        else {
            System.out.println("Failed!!");
        }
    }
    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        driver.navigate().refresh();
        driver.quit();
    }
}
