import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Acer on 11/14/2016.
 */
public class TestExample {

    @Test
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver;
        WebElement firstName,lastName,emailOrNumber,password,year,mounth,day,manOrWoman,registerButton,two;
        Select select1,select2,select3;


        //open the web site
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Acer\\Desktop\\geckodriver.exe");
        //open mozille firefox
        driver = new FirefoxDriver();
        //open web page
        driver.get("http://www.facebook.com");
        //wait five seconds
        Thread.sleep(5000);

        try{
            // find the elements
            firstName = driver.findElement(By.id("u_0_1"));
            lastName = driver.findElement(By.name("lastname"));
            emailOrNumber = driver.findElement(By.name("reg_email__"));
            two = driver.findElement(By.name("reg_email_confirmation__"));
            password = driver.findElement(By.name("reg_passwd__"));
            manOrWoman = driver.findElement(By.id("u_0_i"));
            registerButton = driver.findElement(By.name("websubmit"));
            year = driver.findElement(By.name("birthday_year"));
            day = driver.findElement(By.name("birthday_day"));
            mounth = driver.findElement(By.name("birthday_month"));

            //add elements on the select
            select1 = new Select(day);
            select2 = new Select(mounth);
            select3 = new Select(year);

            // send keys and click for elements
            firstName.sendKeys("Harut");
            lastName.sendKeys("Antonyan");
            emailOrNumber.sendKeys("+37494702456");
            two.sendKeys("+37494702456");
            password.sendKeys("MyPassword");
            manOrWoman.click();


            //select values
            select1.selectByValue("2");
            select2.selectByValue("4");
            select3.selectByValue("1982");

            //sleep thread
            Thread.sleep(10000);

            //start register
            registerButton.click();

            //sleep thread
            Thread.sleep(10000);
        }catch (Exception e){
            //if test can't find some element name or id
            System.out.println("Something is wrong "+e.toString());
        }


        //close the driver
        driver.quit();
    }
}
