import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.Keys;
import java.util.List;

public class HelloSelenium {
        public static void main(String[] args) throws InterruptedException{
            WebDriverManager.chromedriver().setup();
            WebDriverManager.edgedriver().setup();

            //starting session
            WebDriver driver = new ChromeDriver();

            //navigating to a webpage
            driver.get("https://google.com");

            //maximize window
            driver.manage().window().maximize();
            //read current url
            System.out.println(driver.getCurrentUrl());
            //read current page title
            System.out.println(driver.getTitle());
            driver.getTitle();
            //pressing browser back button
            //driver.navigate().back();
            //pressing browser forward button
            //driver.navigate().forward();
            //refresh the current page
            //driver.navigate().refresh();

            //searchBox.sendKeys(Keys.RETURN);
            //searchBox.sendKeys(Keys.ARROW_DOWN);

            //applied wait time
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
            Thread.sleep(5 * 1000);

            WebElement searchBox = driver.findElement(By.name("q"));
            WebElement searchButton = driver.findElement(By.name("btnK"));

            // Skriv något i textrutan
            searchBox.sendKeys("kanelbulle");
            searchButton.click();


            //String urlValue = driver.getCurrentUrl();
            System.out.println(searchBox.getAttribute("value"));
            searchButton.getText();
            searchBox = driver.findElement(By.name("q"));
            searchBox.getAttribute("value"); // => "Selenium"

            driver.quit();
        }
    }

