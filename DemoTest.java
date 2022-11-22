import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DemoTest {

//
//    @Test
//    void testOne() {
//
//
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Desktop\\DRIVER\\chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//
//        driver.manage().window().maximize();
//
//        driver.get(" http://www.google.com");
//
//        driver.close();
//
//
//    }
//
//    @Test
//    void testTwo() {
//
//
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Desktop\\DRIVER\\chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//
//        driver.manage().window().maximize();
//
//        driver.get("https://www.saucedemo.com/");
//
//        WebElement login = driver.findElement(By.id("user-name"));    // id="user-name"
//
//        login.sendKeys("hello");
//
//
//    }
//
//
//    @Test
//    void testThree() {
//
//
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Desktop\\DRIVER\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//        driver.get("https://www.saucedemo.com/");
//
//        WebElement login = driver.findElement(By.id("user-name"));    // id="user-name"
//        login.sendKeys("standard_user");
//
//
//        WebElement password = driver.findElement(By.id("password"));    // id="password"
//        password.sendKeys("secret_sauce");
//
//        WebElement button = driver.findElement(By.id("login-button"));
//        button.click();
//
//
//        //driver.close();
//        //driver.quit();
//
//
//    }
//
//
////                                        //                           CLASS   WITH   AMI
//
//
//    // @BeforeEach
//
//
//    @Test
//        //     1
//
//    void testFouerGpsUrl() {
//
//
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Desktop\\DRIVER\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//
//        driver.get("https://W3Schools.com");
//
//        Assertions.assertEquals("https://W3Schools.com", driver.getCurrentUrl());
//
//
//    }
//
//    @Test                                          //         2
//
//    public void titelTest() {
//
//
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Desktop\\DRIVER\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//
//        driver.get("https://W3Schools.com");
//        WebElement titel = driver.findElement(By.className("learntocodeh1"));
//
//
//        Assertions.assertEquals("W3Schools", titel.getText());
//
//
//    }
//
//
//    @Test                                          //         3
//
//    public void googleTextboxTest () throws InterruptedException {
//
//
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Desktop\\DRIVER\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//
//        driver.get(" http://www.google.com");    //   gLFyf gsfi"
//        WebElement  searchButton  = driver.findElement(By.name("q"));
//         searchButton.sendKeys("Hello world");
//        //
//        //searchButton.sendKeys(By.CssSelector("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[1]/div/span/svg"));
//        searchButton.click();
//
//        //Thread.sleep(5000);
//    }
//


    //                                         new   new   new    new


    @Test                                          //         3

    public void titel() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Desktop\\DRIVER\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //  driver.get(" http://www.google.com");
        driver.get(" http://www.w3schools.com");

        // String titel = driver.getTitle();                       //   opechin1
        // System.out.println("page titel is : " + titel);

        System.out.println("page titel is :" + driver.getTitle());  // opechin2


        Assertions.assertEquals("W3Schools Online Web Tutorials", driver.getTitle());


        Thread.sleep(2000);
        driver.quit();
    }

    @Test


    public void url() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Desktop\\DRIVER\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //  driver.get(" http://www.google.com");
        driver.get(" http://www.w3schools.com");


        //  String url = driver.getCurrentUrl();                       //   opechin1
        //  System.out.println("page url is : " + url);

        // System.out.println("page url is :" + driver.getCurrentUrl());  // opechin2

        Assertions.assertEquals(" https://www.w3schools.com/", driver.getCurrentUrl());


        Thread.sleep(2000);
        driver.quit();


    }


    @Test


    public void googleTextboxTest() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Desktop\\DRIVER\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(" http://www.google.com");

        WebElement q = driver.findElement(By.name("q"));
        Assertions.assertNotEquals(q, null);

        q.sendKeys("Hello World ");

        WebElement clic = driver.findElement(By.name("btnK"));
        clic.click();

        //Thread.sleep(3000);
        // System.out.println(list);

        // Assertions.assertEquals("","");

        Thread.sleep(3000);
        driver.quit();


    }


    @Test


    public void addRemoveElements() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Desktop\\DRIVER\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://lambdatest.github.io/sample-todo-app/");


        var addNameBatun = driver.findElement(By.id("sampletodotext"));
        addNameBatun.sendKeys("six item  hello ");

        var adding = driver.findElement(By.id("addbutton"));
        adding.click();


        var del = driver.findElement(By.name("li6"));
        del.click();


        var titelList = "5 of 6 remaining";


        String list = driver.findElement(By.xpath("/html/body/div/div/div/span")).getText();

        System.out.println(list);
        Assertions.assertEquals(titelList, list);


        Thread.sleep(4000);
        driver.quit();


    }


    @Test


    public void exNew() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Desktop\\DRIVER\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        var addButen = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));

        for (int i = 0; i < 5; i++) {
            addButen.click();


        }

        Thread.sleep(2000);

        var delButen = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/button[5]"));

        for (int d = 5; d > 2; d--) {

            delButen.click();
        }

        Thread.sleep(2000);

        // var remainingButen = driver.findElement(By.xpath("/html/body/div[2]/div/div/div"));

        // var remainingButen = driver.findElement(By.id("/html/body/div[2]/div/div/div"));

        //Assertions.assertEquals(2 ,remainingButen );


        // driver.quit();


    }


    //      test     test     test      test     test   //


//
//
//
//    @BeforeEach
//
//    public void testSelenium (){
//
//
//
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Desktop\\DRIVER\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//


//                             TEST

//                        ניסיתי  להריץ את הטסטים עם BeforEach@   וזה  לא עבד זה תקע והכשיל את ההרצה של הטסטים
//       כתבתי את הקוד
//
//    public WebDriver driver = null;
//
//    @BeforeEach
//    public void initializeSelenium() throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Desktop\\DRIVER\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }

        @Test
        public void registerTutorialsninja () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Desktop\\DRIVER\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //init driver url
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
            //   הכנסת  נתונים  למשתמש
            var firstName = driver.findElement(By.id("input-firstname"));
            firstName.sendKeys("elad");

            var lastName = driver.findElement(By.id("input-lastname"));
            lastName.sendKeys("vizman");

            var eMail = driver.findElement(By.id("input-email"));
            eMail.sendKeys("ev0535421199@gmail.com");

            var telephone = driver.findElement(By.id("input-telephone"));
            telephone.sendKeys("0535421199");

            var password = driver.findElement(By.id("input-password"));
            password.sendKeys("eladv");

            var confirmPassword = driver.findElement(By.id("input-confirm"));
            confirmPassword.sendKeys("eladv");

            var noSubscribe = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[2]/input"));
            noSubscribe.click();

            var agree = driver.findElement(By.name("agree"));
            agree.click();

            var continu = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]"));
            continu.click();

            //     בדיקה
            Assert.assertEquals("http://tutorialsninja.com/demo/index.php?route=account/success", driver.getCurrentUrl());

        }

        @Test
        public void test2LoginTutorialsninja () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Desktop\\DRIVER\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

            // init driver url
            driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
            //  הכנסת  נתוני  משתמש
            var eMail = driver.findElement(By.id("input-email"));
            eMail.sendKeys("e0534547838@gmail.com");

            var password = driver.findElement(By.id("input-password"));
            password.sendKeys("eladv");

            var loggin = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
            loggin.click();

            //   loggin  בדיקה  ל   url
            Assert.assertEquals("http://tutorialsninja.com/demo/index.php?route=account/account", driver.getCurrentUrl());

        }

        @Test
        public void test3AddToCart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Desktop\\DRIVER\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

            // init driver url 1      עבור  מוצר  1
            driver.get("http://tutorialsninja.com/demo/index.php?route=product/product&product_id=43");
            // בחירת המוצר  והוספה לעגלת  הקניות
            var addToCart = driver.findElement(By.id("button-cart"));
            addToCart.click();

            // init driver url 2       עבור מוצר  2
            driver.get("http://tutorialsninja.com/demo/index.php?route=product/product&product_id=33");
            // בחירת המוצר  והוספה לעגלת  הקניות
            var addCart = driver.findElement(By.id("button-cart"));
            addCart.click();
            Thread.sleep(3000);
            // totalButen
            var totalButen = driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/button"));
            totalButen.click();
            //  הסכום הכספי הסופי עבור  המוצרים
            String totalCost =  driver.findElement(By.cssSelector("#cart > ul > li:nth-child(2) > div > table > tbody > tr:nth-child(4) > td:nth-child(2)")).getText();
            //    בדיקה שהסכום  שווה
            Assert.assertEquals("$844.00", totalCost);
            //  driver.quit();

        }

        @Test
        public void test4ProductReview () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TOSHIBA\\Desktop\\DRIVER\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

            // init driver  url
            driver.get("http://tutorialsninja.com/demo/index.php?route=product/product&product_id=43");
            //   להעברת ביקורת הכפתור   הכנסת  נתונים  לסקירה
            var reviewsButen = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/ul[2]/li[3]/a"));
            reviewsButen.click();

            var name = driver.findElement(By.name("name"));
            name.sendKeys("elad");
            //  הכנסת טקסט  תלונה וביקורת מוצר
            var textReview = driver.findElement(By.id("input-review"));
            textReview.sendKeys("this is a very expensive price we can bay it in another place in price of 300$  we gon to bay it ther and to advertise it  alse youer deliver take too much time");
            //  בחירת  רמת  העברת הביקורת  האפשרויות לפי דרוג מ  1  עד  5    (נבחר  רמה 3  )
            var ratingNumber3 = driver.findElement(By.cssSelector("#form-review > div:nth-child(5) > div > input[type=radio]:nth-child(4)"));
            ratingNumber3.click();
            //  כפתור שליחת הנתונים  על  סקירת / ביקורת  המוצר
            var continuReviewButten = driver.findElement(By.id("button-review"));
            continuReviewButten.click();

            //  אישור המערכת  שהתבצע  בהצלחה
            //    הקוד הזה לפי  המצגת  אבל הוא לא עובד   אין  אפשרות  למצוא עם     className     את  ה   class   לבד
            //     driver.findElements(By.className    ניסיתי לא עובד עם
           // List<WebElement> commentAccepeted = driver.findElements(By.className("alert alert-success alert-dismissible"));
           // Assertions.assertTrue(0 , commentAccepeted.size());


            //      נתתי  4 אפשרויות שונות לאישור שהתבצע  בהצלחה     כל  אלו  האפשרויות  עובדות
            //    אפשרות   1
              List<WebElement> commentAccepeted = driver.findElements(By.cssSelector("alert alert-success alert-dismissible"));
              commentAccepeted.size();
              Assertions.assertNotNull(commentAccepeted.size());


            //       אפשרות  2
          //  var comment = driver.findElements(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[3]/form/div[2]"));
          //  comment.size();
          //  Assertions.assertTrue(comment.size() > 0);


            //    אפשרות   3
          // List<WebElement> commentAccepeted = driver.findElements(By.cssSelector("alert alert-success alert-dismissible"));
          // var ok = commentAccepeted.getClass().toString().length();
          //  Assertions.assertNotNull(ok);
         //    Assertions.assertTrue(ok > 1);

            //   אפשרות   4
         //   List<WebElement> commentAccepeted = driver.findElements(By.cssSelector("alert alert-success alert-dismissible"));
         //    commentAccepeted.stream().count();
         //   Assertions.assertNotNull(commentAccepeted.stream().count());

            //  driver.quit();

        }


}











//  Assert.assertEquals("2 item(s) - $844.00", driver.findElement(By.cssSelector("#cart > ul > li:nth-child(2) > div > table > tbody > tr:nth-child(4) > td:nth-child(2)")).getText());



//   List<WebElement> buttencorrect = driver.findElements(By.tagName("div class col-sm-12"));
//    WebElement thered = buttencorrect.get(2);
//   thered.click();


// WebElement drop = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[3]/form/div[5]/div"));
//Select list = new Select(buttencorrect);
// list.selectByVisibleText("3");
//

//  WebElement drop = (WebElement) driver.findElements(By.cssSelector("#form-review > div:nth-child(5) > div"));
// Select value = new Select(drop);
//value.selectByIndex(3);

