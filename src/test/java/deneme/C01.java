package deneme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class C01 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        System.out.println( System.getProperty("chromeDriver","src/resources/drivers/chromedriver.exe"));


        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.get("https://techproeducation.com");//

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());



}






    }




