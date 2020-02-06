import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    static WebDriver browser;

    public static void setup(){
        System.setProperty("webdriver.chrome.driver",
                "webdrivers/chromedriver.exe");

        browser = new ChromeDriver();
        browser.get("https://www.bing.com");
    }

    public static void close(){

        browser.close();
    }

    public static void  searchByKeywort(String keywort){
        WebElement searchField = browser.findElement(By.id("sb_form_q"));
        searchField.sendKeys(keywort);
        searchField.sendKeys(Keys.ENTER);
    }

    public static void main(String args[]) {
        System.out.println("Maven+Selenium+JUnit");
           }
}
