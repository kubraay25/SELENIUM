package deneme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_getTagNameGetAttribute {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://Amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        String gunceltagname= aramaKutusu.getTagName();
        String gercektagname="input";

        if(gunceltagname.equals(gercektagname)){
            System.out.println("passsed");

        }else System.out.println("failled");


        String guncelatribute= aramaKutusu.getAttribute("name");
        String gercekakrıbut= "field-keywords";
        if(gunceltagname.equals(gercektagname)){
            System.out.println("passed");
        }else System.out.println("failled");

    }




}
