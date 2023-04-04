package deneme;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C04 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        System.out.println("Sayfa Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları = "+driver.manage().window().getSize());
        driver.manage().window().maximize();//açılan browser'i maximize yapar
        driver.get("https://techproeducation.com");
        System.out.println("Sayfa Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları = "+driver.manage().window().getSize());
        driver.manage().window().minimize();//sayfayı aşağıya indirir
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("Sayfa Konumu = "+driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutları = "+driver.manage().window().getSize());
        driver.manage().window().setPosition(new Point(50,50));//istediğimiz konuma getirir
        driver.manage().window().setSize(new Dimension(600,600));//istediğimiz size'a getirir
        driver.close();

    }
}