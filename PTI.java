import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.net.URL;

public class JavaSample {

  public static final String USERNAME = "xxxxxxxxxx";
  public static final String AUTOMATE_KEY = "gqzxib7a1Gwg8bbNAyNm";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
private static int bin;
private static int local;
private static int usr;
private static int chromedriver;

  public static void main(String[] args) throws Exception {

	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("browser", "Firefox");
	caps.setCapability("browser_version", "62.0 beta");
	caps.setCapability("os", "OS X");
	caps.setCapability("os_version", "High Sierra");
	caps.setCapability("resolution", "1024x768");
    caps.setCapability("browserstack.debug", "true");
    caps.setCapability("project", "PTI");
    DesiredCapabilities capsIOS = new DesiredCapabilities();
    capsIOS.setCapability("browserName", "iPhone");
    capsIOS.setCapability("device", "iPhone 7");
    capsIOS.setCapability("realMobile", "true");
    capsIOS.setCapability("os_version", "10.3");
    capsIOS.setCapability("browserstack.debug", "true");
    capsIOS.setCapability("project", "PTI");
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    //WebDriver driver = new FirefoxDriver();
    //WebDriver driver = new ChromeDriver();
    Date date = new Date();
    System.out.println(date);
    LocalDateTime date1 = LocalDateTime.now();
    int secondsStart = date1.toLocalTime().toSecondOfDay();
    //System.out.println(secondsStart);
    System.out.println( "Start: " + secondsStart );
    driver.get("https://uat.my-canopy.com/#/operations/kpi-dashboard");
    int secondsEnd = date1.toLocalTime().toSecondOfDay();
    int TimeElapsed = secondsStart - secondsEnd;
    driver.get("https://uat.my-canopy.com/#/operations/kpi-dashboard");
    driver.findElement(By.xpath("html/body/div/ui-view/div/div/div/div[1]/form/div[1]/input")).clear();
    driver.findElement(By.xpath("html/body/div/ui-view/div/div/div/div[1]/form/div[1]/input")).sendKeys("xxxx@ptisecurity.com"); //USERNAME
    driver.findElement(By.xpath("html/body/div/ui-view/div/div/div/div[1]/form/div[2]/input")).clear();
    driver.findElement(By.xpath("html/body/div/ui-view/div/div/div/div[1]/form/div[2]/input")).sendKeys("XXXXXXXX");  //PASSWORD
    driver.findElement(By.xpath("html/body/div/ui-view/div/div/div/div[1]/form/p[1]/button")).click();  //LOGIN
    Thread.sleep(4000);
    driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[2]/div/ul/li[2]/a/div/i")).click();  //LOCATIONS
    Thread.sleep(4000);
    driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[2]/div/ul/li[3]/a/div/i")).click();  //DEVICES
    Thread.sleep(4000);
    driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[2]/div/ul/li[4]/a/div/i")).click();  //INCIDENTS
    Thread.sleep(4000);		
    //System.out.println(secondsEnd);
    System.out.println( "End: " + secondsEnd );
    //System.out.println(TimeElapsed);
    System.out.println( "TimeElapsed: " + TimeElapsed );
    System.out.println(driver.getTitle());
    driver.quit();

  }
}
