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
            driver.get("https://sv.wikipedia.org/");

            //maximize window
            driver.manage().window().maximize();
            //read current url
            System.out.println(driver.getCurrentUrl());
            //read current page title
            System.out.println(driver.getTitle());
            driver.getTitle();

            //applied wait time
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
            Thread.sleep(5 * 1000);

            WebElement searchBox = driver.findElement(By.name("search"));
            WebElement searchButton = driver.findElement(By.name("go"));

            // Skriv något i textrutan
            searchBox.sendKeys("hello world");
            searchButton.click();

            //applied wait time
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
            Thread.sleep(2 * 1000);

            //pressing browser back button
            driver.navigate().back();

            //applied wait time
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
            Thread.sleep(2 * 1000);

            //pressing browser forward button
            driver.navigate().forward();

            //applied wait time
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
            Thread.sleep(2 * 1000);

            //refresh the current page
            driver.navigate().refresh();

            //searchBox.sendKeys(Keys.RETURN);
            //searchBox.sendKeys(Keys.ARROW_DOWN);

            //applied wait time
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
            Thread.sleep(5 * 1000);

            driver.quit();
        }
    }

