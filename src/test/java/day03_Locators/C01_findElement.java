package day03_Locators;

import net.bytebuddy.jar.asm.MethodTooLargeException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C01_findElement {
  /* Web sayfasında kullanilan etkilesimli olan veya olmayan herseye "webelement"  denir
     Herbir webelementin kendine gore hashcode'lari vardir

    ○Button,
    ○Search box(arama kutusu),
    ○Text box(metin kutusu),
    ○Headers( başlıklar),
    ○Tables(tablolar)  vb...

    ●Farklı türde WebElement tag’ları(etiketleri)vardır.
    <html>,<body>,<form>,<label>,<input>,<a> vb.

    ●Otomasyon için unique(tek) web öğelerini(element) tanımlamak üzere HTML kodunu inceleyeceğiz

    Web elementleri birlikte kullanıcı arayüzünde (UI) bir web sayfası oluştururlar
    UI: UserInterface
     */


    /* ********************************************************************************
    amazona gittik
    sag tikla-->incele dedik
    ve bize hangi elementi secersek secelim onun "html" kodunu verir
    elementin uzerine gelip "incele" dedikten sonra hangi bolumde oldugunu mavi yanarak gosterir bize

    *********************************************************************************** */
                   /* LOCATORLAR:Yer bulucu-Konum belirleyici

       ❖Selenium LOCATORS, web sayfasındaki web öğelerini
    tanımlamak için kullanılır.

       ❖Selenium’da; metin kutuları, onay kutuları, linkler, radyo
    butonları,  liste kutuları ve diğer tum web öğeler üzerinde
    eylemler  gerçekleştirmek için LOCATORS’a ihtiyacımız vardır.

       ❖Konum belirleyiciler bize nesneleri tanımlamada yardımcı olur.

       ❖Web Elementlerine ulasmak icin tag veya bazi attribute’ler
    kullanilir, bunlarla ulasilamayan webelementleri icin ozel
    olarak tanimlanan Xpath ve css locator’lari kullanilir */

    /***********************************************************************************
                INTERWIEV SORUSU

     Bir web elementini tanimlamak için 8 tane selenium locator  vardır.
             1.id
             2.name
             3.className
             4.tagName
             5.linkText
             6.partialLinkText
             7.xpath => xpath yazmanın birden fazla yolu vardır
             8.cssSelector => css yazmanın birden fazla yolu vardır

     **********************************************************************************/ /*

                LOCATORS BULMAK ICIN KULLANILAN METHODLAR
       1.) Tanimladigimiz web elementin yerini driver’in bulabilmesi icin findElement (Locator)
           method’unu kullaniriz.
           driver.findElement(Locator);

       2.) findElement (Locator) method’unun icine parameter olarak yazacagimiz Locator’in 8
           locator’dan hangisi oldugunu belirtmek icin de By.LocatorTuru(“LocateBilgisi”); kullanilir

           driver.findElement(By.id("twotabsearchtexbox"));

       3.) Locate ettigimiz Web Elementini kullanabilmek icin bir variable’a atama yapariz

           WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtexbox"));

     **************************************************************************************** */

    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasinda kaç tane link oldugunu konsolda yazdiralim
        driver.get("https://amazon.com");
        List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));
        System.out.println("Linklerin Sayisi = "+linklerListesi.size());
        //Linkleri yazdiralim
    }
}
