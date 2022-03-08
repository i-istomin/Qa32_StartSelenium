import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IAttributes;
import org.testng.annotations.Test;

import java.util.List;

public class StartPhoneBook {
    WebDriver wd;

    @Test //posle togo kak mi vpisivaem test, to poyavitsia vozmojnost zapuskat testi
    public void startPhoneBook() {
        wd = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/home/i-istomin/TelRan/SYSTEMS/Qa32_StartSelenium/chromedriver");// vsegda vstavliat system i meniat path

        //  wd.get("https://contacts-app.tobbymarshall815.vercel.app/");//open without history
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");//open www+history[refresh/back/forward]
        wd.manage().window().maximize();

        //steps of test login
        //1. open login form-->find login btn+click --> opened form login
        // WebElement el=wd.findElement(By.id("idel"));
        List<WebElement> elements = wd.findElements(By.tagName("a")); //web driver naydi vse elementy po imeni "a"
        WebElement login = elements.get(2);//ukazivaem kakoy imenno po schety u nas element "a"---> #2
        login.click();

        WebElement element = wd.findElement(By.id("root")); //<a href="/home" style="">HOME</a> --> v elemente a est atribut"href"+znachenie"home"
        WebElement element1 = wd.findElement(By.className("container")); //<h1>PHONEBOOK</h1> --> v h1 net atributa//pervoe slovo posle "<" nazivaetsia atribut


        //2. fill email -->  find email element+click+clear+type email
        //3. fill password--> find password element+click+clear+type password
        //5. click login btn-->find login btn element+click


        //assert
        //  wd.close();//close 1 tab
        // wd.quit();//close all tabs // vremenno mojno zakrit etot metod chtob posmotret chto proishodit do nego

    }

    @Test
    public void home() {
        wd = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/home/i-istomin/TelRan/SYSTEMS/Qa32_StartSelenium/chromedriver");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");//open www+history[refresh/back/forward]
        wd.manage().window().maximize();

        // wd.findElement(By.tagName());
        WebElement element1 = wd.findElement(By.tagName("body"));
        WebElement element2 = wd.findElement(By.tagName("div"));
        WebElement element3 = wd.findElement(By.tagName("h1"));
        WebElement element4 = wd.findElement(By.tagName("a"));
        WebElement element5 = wd.findElement(By.tagName("input"));
        WebElement element6 = wd.findElement(By.tagName("br"));
        WebElement element7 = wd.findElement(By.tagName("button"));

        // WebElement element8=wd.findElement(By.tagName("script"));--> script ne elemant

        //wd.findElement(By.id());
        WebElement element9 = wd.findElement(By.id("root"));

        //wd.findElement(By.className());
        WebElement element10 = wd.findElement(By.className("container"));
        WebElement element11 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element12 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement element13 = wd.findElement(By.className("active"));
        // v devtools 'selectorshub' ishem class cherez tochku : ".active"

        // wd.findElement(By.linkText()); //tam gde est lonk i mohno najat na stranizu i uvidim kak meniaetsa ee URL
        WebElement element14 = wd.findElement(By.linkText("HOME"));
        WebElement element15 = wd.findElement(By.linkText("ABOUT"));
        WebElement element16 = wd.findElement(By.linkText("LOGIN"));

        WebElement element17 = wd.findElement(By.partialLinkText("HO"));//ishet chast elementa, no eto ochen dolgiy poisk
        //beret vse slova nachonausieshia na bukvu h,potom vse sk=lova na bujvi ho... i tak dalee


    }


    @Test
    public void cssLocatorsTest() {
        wd = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/home/i-istomin/TelRan/SYSTEMS/Qa32_StartSelenium/chromedriver");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");//open www+history[refresh/back/forward]
        wd.manage().window().maximize();


        wd.findElement(By.cssSelector(""));

        //byTagName
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.cssSelector("a"));//byTagName

        wd.findElement(By.xpath("//div"));
        wd.findElement(By.xpath("//a"));//   /html/body/div/div/a

        //byClassName
        wd.findElement(By.cssSelector(".login_login__3EHKB"));// -> cherez tochku : ".login_login__3EHKB"
        wd.findElement(By.cssSelector(".container"));

        wd.findElement(By.xpath("//*[@class='login_login__3EHKB']")); //class:attribute


        //byID
        wd.findElement(By.cssSelector("#root")); //  -> cherz reshetku: "$#root"
        // attribut pishetsia cherez kvadratnye skobki [...]
        // ID & class toje attributy i ih tohno mojno iskat cherez [...]--> [id="root"]


        wd.findElement(By.xpath("//*[@id='root']"));




        //Attributes
        wd.findElement(By.cssSelector("[placeholder]"));
        wd.findElement(By.cssSelector("[placeholder='Password']"));
        wd.findElement(By.cssSelector("[placeholder *='ss']"));
        wd.findElement(By.cssSelector("[placeholder $='rd']"));
        wd.findElement(By.cssSelector("[placeholder ^='Pa']"));

        // ^*= nachinaetsia
        // $=zakanchivaetisia
        // *= soderjit

        wd.findElement(By.xpath("//*[contains(@placeholder,'ss')]"));//attribute=@placeholder    znachenie='ss'
        wd.findElement(By.xpath("//*[starts-with(@placeholder,'Pa')]"));



        wd.findElement(By.xpath("//*[@placeholder]"));
        wd.findElement(By.xpath("//*[@placeholder='Email']"));
        wd.findElement(By.xpath("//*[@placeholder='Password']"));

        wd.findElement(By.xpath("//button[text()=' Login']")); //vizivam funkziu kak text// tut proveriaet tolko button s tekstom login
        wd.findElement(By.xpath("//*[text()=' Login']")); //tut budet iskatsia login vezde



    }
}
