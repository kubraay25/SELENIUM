package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


public class C01_Driver {

    /* Selenium'da setProperty metodu, kullanıcının web sürücüsü için bazı özellikler
    belirlemesine olanak tanır. Bu metot, webdriver nesnesi üzerinden çağrılır ve iki
    parametre alır:birinci parametre olarak özelliğin adı ve ikinci parametre olarak da
    özelliğe atanacak değer verilir

    "key", "value" seklinde calisir */

    static ChromeOptions options;
    static WebDriver driver;

    public static void main(String[] args) {

        //parantezin icini "chromedriver.exe"den copy-path yaptik
        //System.setProperty("edgeDriver","src/resources/driver/msedgedriver.exe");
        //System.setProperty java uygulamalarında sistem özelliklerini ayarlamak için kullanılır
        //Bu method ile class'ımıza webdriver'in fiziki yolunu belirtiriz
        //Key, value olarak önce isim sonra driver'imizin yolunu belirtiriz

        //System.out.println(System.getProperty("edgeDriver"));
        //getProperty methodu ile "Key" degerini yazdim "value"ya ulaşabilirim
        // bana yukardaki "src" kismini verecek

        //eger chrome kullanacaksam asagidaki yapiyi olusturmam gerekir
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
// driver.get("https://amazon.com");

 /* driver.get(String Url): --> String olarak girilen Url'e gider
    driver.getTitle(); --> içinde olunan sayfanin basligini String olarak getirir
    driver.getCurrentUrl(): --> icinde olunan sayfanin Url'ini String olarak getirir
    driver.getPageSource(): -->icinde olunan sayfanin kaynak kodlarini String olarak getirir
    driver.getWindowHandle(): -->icinde olunan sayfa ve/veya tab'larin handle degerlerini getirir
  */


        WebDriver driver = new ChromeDriver();//Boş bir browser açar, yani alttakileri yoruma alip gorebilirsin
        driver.get("https://techproeducation.com");//get() methodu ile adresini belittiğimiz sayfaya gideriz
        System.out.println("Sayfa Başlığı = " + driver.getTitle()); // içinde bulunduğumuz sayfanın başlığını verir
        System.out.println("Sayfa Url'i = " + driver.getCurrentUrl()); //içinde bulunduğumuz sayfanın url'i verir
        //System.out.println(driver.getPageSource());//içinde bulunduğumuz sayfanın html kaynak kodlarını verir


    }
}
