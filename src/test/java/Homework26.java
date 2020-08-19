import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework26 {
        public static WebDriver driver;
        @Test
        public void BugRedProfile () throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://users.bugred.ru/user/login/index.html");
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("zaikakaterina@yahoo.com");
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("123456");
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input")).click();

        Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[4]/td/input")).sendKeys("katie");
            driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[5]/td[1]/button")).click();

        Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[3]/p[1]/a")).click();
            driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Аленушка");
            driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("olienka@yahoo.com");
            driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("igogo");
            driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[9]/td[2]/input")).sendKeys("Аленушка");
            driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[10]/td[2]/input")).sendKeys("Мамаева");
            driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[14]/td[2]/input")).sendKeys("Тимоша");
            driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[18]/td[2]/input")).sendKeys("нИскажу");

        Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[21]/td[2]/input")).click();

        Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/a")).click();
            driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/ul/li[1]/a")).click();

        Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).clear();
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Катерина");
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[3]/td[2]/select")).click();
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[3]/td[2]/select/option[3]")).click();
            driver.findElement(By.name("birthday")).sendKeys( "2121980");
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("Music");
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("456878912");


        }


}
