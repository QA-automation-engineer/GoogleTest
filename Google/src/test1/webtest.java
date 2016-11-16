package test1;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

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
        List<WebElement> links=driver.findElements(By.xpath("//h3[@class='r']//a"));
        System.out.println("Total element is "+links.size());
        Iterator<WebElement> i1=links.iterator();
            for (int i=1; i <=5; i++) {
                System.out.println(i+" link: "+i1.next().getAttribute("href"));
            }
        //for (int i=1;i<=10; i++) {
         //System.out.println(driver.findElement(By.xpath("(//h3[@class='r']//a)["+i+"]")).getAttribute("href"));
        //}
        //WebElement searchResult1 = driver.findElement(By.xpath("(//h3[@class='r']//a)[1]"));
        //String searchResult1Text = searchResult1.getAttribute("href");
        //System.out.println(driver.findElement(By.xpath("(//h3[@class='r']//a)[1]")).getAttribute("href"));
        // //h3[@class='r']//a
        driver.close();
        //if (searchResult1Text.contains("КОНОНЕНКО СЕРГЕЙ ВЛАДИМИРОВИЧ"))
            //System.out.println("true");
        //else System.out.println("false");
    }
}
