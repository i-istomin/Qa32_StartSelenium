import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableTest {
    WebDriver wd;

    @Test
    public void tableCss(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        System.setProperty("webdriver.chrome.driver", "/home/i-istomin/TelRan/SYSTEMS/Qa32_StartSelenium/chromedriver");
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");//open www+history[refresh/back/forward]


        //table#customers tr:nth-child(6) td:nth-child(2) - ishem opredelennow imya v tablize
        //table#customers td:nth-child(2) ->imia v tablize
        //table#customers td:last-child -> vse nazvaniya v 3-m stolbike


        //find with xpath & css selector
        wd.findElement(By.xpath("//*[text()='Maria Anders']"));
        wd.findElement(By.cssSelector("#customers tr:nth-child(2) td:nth-child(2)")); // vo vtoroy stroke. esli pomeniaut chutok kod, i maria anders pereydt stroku,
        // to nash locator ne naydet element i programma viletit
        //poetomy xpath luchshe deystvuet


        wd.findElement(By.xpath("//*[@id='customers']/tbody/tr[2]/td[2]"));
        wd.findElement(By.xpath("//*[@id='customers']//tr[2]/td[2]"));//toje samoe kak zapis vishe
        wd.findElement(By.xpath("//input[2]"));

    }

    @Test
    public void xPathTests(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        System.setProperty("webdriver.chrome.driver", "/home/i-istomin/TelRan/SYSTEMS/Qa32_StartSelenium/chromedriver");
        wd.navigate().to("file:///home/i-istomin/Downloads/index.html");

        WebElement item1=wd.findElement(By.xpath("//a[@href='#item1']"));
        String textItem1=item1.getText(); //vizivaem web element, zabiraem text i kladem v peremennuyu textitem1
        System.out.println("Text of element Item1-->" + textItem1); //"sout===syso
        Assert.assertEquals(textItem1,"Item 1"); //testi vsegda budut zakanchivatsia etoy pkudoy



WebElement europe=wd.findElement(By.xpath("//*[text()='Europe']"));
String textEurope= europe.getText();;
Assert.assertEquals(textEurope,"Europe");

item1.click();
WebElement message=wd.findElement(By.xpath("//p[@class='message']"));
String textMessage=message.getText();
Assert.assertEquals(textMessage,"Clicked by Item 1");




    }
    @Test
    public void Homework() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        System.setProperty("webdriver.chrome.driver", "/home/i-istomin/TelRan/SYSTEMS/Qa32_StartSelenium/chromedriver");
        wd.navigate().to("file:///home/i-istomin/Downloads/index.html");


        //item1
        WebElement item1=wd.findElement(By.cssSelector("li:first-child"));
        WebElement item1_1=wd.findElement(By.cssSelector("#nav ul li:first-child a"));
        WebElement item1_2=wd.findElement(By.cssSelector("[href='#item1']"));
        WebElement item1_3=wd.findElement(By.cssSelector("[href $='1']"));
        WebElement item1_4=wd.findElement(By.cssSelector(".nav-item:first-child"));

        //item2
        WebElement item2=wd.findElement(By.cssSelector("li:nth-child(2)"));
       WebElement item2_1=wd.findElement(By.cssSelector("#nav ul li:nth-child(2) a"));
        WebElement item2_2=wd.findElement(By.cssSelector("[href='#item2']"));
        WebElement item2_3=wd.findElement(By.cssSelector("[href $='2']"));

        //item3
        WebElement item3=wd.findElement(By.cssSelector("li:nth-child(3)"));
        WebElement item3_1=wd.findElement(By.cssSelector("#nav ul li:nth-child(3) a"));
        WebElement item3_2=wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement item3_3=wd.findElement(By.cssSelector("[href $='3']"));


        //item4
        WebElement item4=wd.findElement(By.cssSelector("li:last-child"));
        WebElement item4_1=wd.findElement(By.cssSelector("#nav ul li:last-child a"));
        WebElement item4_2=wd.findElement(By.cssSelector("[href='#item2']"));
        WebElement item4_3=wd.findElement(By.cssSelector(".nav-item:last-child"));

        //placeholder
        WebElement placeholder=wd.findElement(By.cssSelector("#form1 input:first-child"));
       WebElement placeholder_1=wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement placeholder_2=wd.findElement(By.cssSelector("[name='name']"));

        //output
        WebElement output_1=wd.findElement(By.cssSelector("[placeholder='Type your surename']"));
        WebElement output_2=wd.findElement(By.cssSelector("[name='surename']"));
        WebElement output_3=wd.findElement(By.cssSelector("#form1 input:nth-child(2)"));

        //button
        WebElement button=wd.findElement(By.cssSelector("#form1 button:last-child"));
       WebElement button_2=wd.findElement(By.cssSelector("#form1 button:nth-child(3)"));
        WebElement button_3=wd.findElement(By.cssSelector(".btn"));


        //table
        WebElement europe=wd.findElement(By.cssSelector("tr:first-child td:first-child"));
       // WebElement europe1=wd.findElement(By.cssSelector("tr:first-child td:'Eurpoe'"));
        WebElement asia=wd.findElement(By.cssSelector("tr:first-child td:nth-child(2)"));
        WebElement america=wd.findElement(By.cssSelector("tr:first-child td:last-child"));
        WebElement ukraine=wd.findElement(By.cssSelector("tr:nth-child(2) td:first-child"));
        WebElement israel=wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        WebElement usa=wd.findElement(By.cssSelector("tr:nth-child(2) td:last-child"));
        WebElement germany=wd.findElement(By.cssSelector("tr:nth-child(3) td:first-child"));
        WebElement russia=wd.findElement(By.cssSelector("tr:nth-child(3) td:nth-child(2)"));
        WebElement canada=wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        WebElement poland=wd.findElement(By.cssSelector("tr:last-child td:first-child"));
        WebElement chine=wd.findElement(By.cssSelector("tr:last-child td:nth-child(2)"));
        WebElement mexico=wd.findElement(By.cssSelector("tr:last-child td:last-child"));


        //alertmessag2
        WebElement square =wd.findElement(By.cssSelector("#alert"));
        WebElement square1 =wd.findElement(By.cssSelector(".message"));
        WebElement square2 =wd.findElement(By.cssSelector("div:nth-child(2)"));



    }


    @Test
    public void HomeworkXPath() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        System.setProperty("webdriver.chrome.driver", "/home/i-istomin/TelRan/SYSTEMS/Qa32_StartSelenium/chromedriver");
        wd.navigate().to("file:///home/i-istomin/Downloads/index.html");

        //item1
        WebElement item1=wd.findElement(By.xpath("//*[@id='nav']//li[1]"));
        WebElement item1_1=wd.findElement(By.xpath("//a[@href='#item1']"));
       WebElement item1_2=wd.findElement(By.xpath("//*[contains(@href,'1')]"));
     //   WebElement item1_3=wd.findElement(By.xpath("//a[contains(@class,'nav-item') and contains(@href='#item1')]"));
      WebElement item1_5=wd.findElement(By.xpath("//*[text()='Item 1']"));

        //item2
        WebElement item2=wd.findElement(By.xpath("//*[@id='nav']//li[2]"));
        WebElement item2_1=wd.findElement(By.xpath("//a[@href='#item2']"));
        WebElement item2_2=wd.findElement(By.xpath("//*[contains(@href,'2')]"));
        WebElement item2_3=wd.findElement(By.xpath("//*[text()='Item 2']"));

        //item3
        WebElement item3=wd.findElement(By.xpath("//*[@id='nav']//li[3]"));
        WebElement item3_1=wd.findElement(By.xpath("//a[@href='#item3']"));
        WebElement item3_2=wd.findElement(By.xpath("//*[contains(@href,'3')]"));
        WebElement item3_3=wd.findElement(By.xpath("//*[text()='Item 3']"));

        //item4
        WebElement item4=wd.findElement(By.xpath("//*[@id='nav']//li[last()]"));
        WebElement item4_1=wd.findElement(By.xpath("//a[@href='#item4']"));
        WebElement item4_2=wd.findElement(By.xpath("//*[contains(@href,'4')]"));
        WebElement item4_3=wd.findElement(By.xpath("//*[text()='Item 4']"));

        //placeholder
        WebElement placeholder=wd.findElement(By.xpath("//*[@id='form1']//input[1]"));
        WebElement placeholder_1=wd.findElement(By.xpath("//*[@placeholder='Type your name']"));
        WebElement placeholder_2=wd.findElement(By.xpath("//*[@name='name']"));


        //output
        WebElement output=wd.findElement(By.xpath("//*[@id='form1']//input[2]"));
        WebElement output_1=wd.findElement(By.xpath("//*[@placeholder='Type your surename']"));
        WebElement output_2=wd.findElement(By.xpath("//*[@name='surename']"));
        WebElement output_3=wd.findElement(By.xpath("//*[contains(@placeholder,'surename')]"));


        //button
        WebElement button=wd.findElement(By.xpath("//*[@id='form1']//input[last()]"));
        WebElement button_2=wd.findElement(By.xpath("//*[@class='btn']"));
        WebElement button_3=wd.findElement(By.xpath("//*[text()='Send']"));


//table
       WebElement europe_1=wd.findElement(By.xpath("//*[text()='Europe']"));
        WebElement europe_2=wd.findElement(By.xpath("//*[@id='country-table']//tr[1]//td[1]"));

        WebElement asia=wd.findElement(By.xpath("//*[text()='Asia']"));
        WebElement asia_2=wd.findElement(By.xpath("//*[@id='country-table']//tr[1]//td[2]"));

        WebElement america=wd.findElement(By.xpath("//*[text()='America']"));
        WebElement america_2=wd.findElement(By.xpath("//*[@id='country-table']//tr[1]//td[last()]"));

        WebElement ukraine=wd.findElement(By.xpath("//*[text()='Ukraine']"));
        WebElement ukraine_2=wd.findElement(By.xpath("//*[@id='country-table']//tr[2]//td[1]"));

        WebElement israel=wd.findElement(By.xpath("//*[text()='Israel']"));
        WebElement israel_2=wd.findElement(By.xpath("//*[@id='country-table']//tr[2]//td[2]"));

        WebElement usa=wd.findElement(By.xpath("//*[text()='USA']"));
        WebElement usa_2=wd.findElement(By.xpath("//*[@id='country-table']//tr[2]//td[last()]"));

        WebElement germany=wd.findElement(By.xpath("//*[text()='Germany']"));
        WebElement germany_2=wd.findElement(By.xpath("//*[@id='country-table']//tr[3]//td[1]"));

        WebElement russia=wd.findElement(By.xpath("//*[text()='Russia']"));
        WebElement russia_2=wd.findElement(By.xpath("//*[@id='country-table']//tr[3]//td[2]"));

        WebElement canada=wd.findElement(By.xpath("//*[text()='Canada']"));
        WebElement canada_2=wd.findElement(By.xpath("//*[@id='country-table']//tr[3]//td[last()]"));


        WebElement poland=wd.findElement(By.xpath("//*[text()='Poland']"));
        WebElement poland_2=wd.findElement(By.xpath("//*[@id='country-table']//tr[last()]//td[1]"));

        WebElement china=wd.findElement(By.xpath("//*[text()='Chine']"));
        WebElement china_2=wd.findElement(By.xpath("//*[@id='country-table']//tr[last()]//td[2]"));

        WebElement mexico=wd.findElement(By.xpath("//*[text()='Mexico']"));
        WebElement mexico_2=wd.findElement(By.xpath("//*[@id='country-table']//tr[last()]//td[last()]"));


        //alertmessag2
        WebElement square=wd.findElement(By.xpath("//*[@id='alert']"));
        WebElement square_1=wd.findElement(By.xpath("//*[@class='message']"));


    }

}
