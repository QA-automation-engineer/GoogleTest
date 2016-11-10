package test1;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;



/**
 * Created by Sergey on 11/6/2016.
 */
public class webtest {

    public static void main(String[] args) throws Exception
    {

        System.setProperty("webdriver.chrome.driver", "D://Tester/GoogleDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.name("q")).sendKeys("Кононенко Сергей Владимирович");
        driver.findElement(By.name("btnG")).click();
        driver.manage().timeouts().implicitlyWait(3, SECONDS);
        WebElement searchResult1 = driver.findElement(By.xpath("(//div[@id='rso']//a)[1]"));
        String searchResult1Text = searchResult1.getText();
        System.out.println(searchResult1Text);
        driver.close();
        if (searchResult1Text.contains("КОНОНЕНКО СЕРГЕЙ ВЛАДИМИРОВИЧ"))
            System.out.println("true");
        else System.out.println("false");
    }
}
