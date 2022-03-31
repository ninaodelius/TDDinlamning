import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;



    public class HelloSelenium {
        public static void main(String[] args) throws InterruptedException{
            WebDriverManager.chromedriver().setup();
            WebDriverManager.edgedriver().setup();


            WebDriver driver = new ChromeDriver();

            driver.get("https://google.com");


            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());

            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
            Thread.sleep(5 * 1000);


            //selenium.focus("name=Valuation"); //name of button
            //selenium.click("Valuation");

            WebElement searchBox = driver.findElement(By.name("q"));
            WebElement searchButton = driver.findElement(By.name("btnK"));


            // Skriv något i textrutan
            searchBox.sendKeys("kanelbulle");
            searchButton.click();

            driver.getTitle();

            String urlValue = driver.getCurrentUrl();



            System.out.println(searchBox.getAttribute("value"));


            searchButton.getText();
            searchBox = driver.findElement(By.name("q"));
            searchBox.getAttribute("value"); // => "Selenium"


            driver.quit();



        }
    }
