package JavaforQA;

import JavaforQA.ChromeRegister;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeRegister().registerDriver();
//        driver.get("https://qa-faculty.github.io/feedback_form/");
        driver.get("https://qa-faculty.github.io/tariff-plan/");

//        WebElement editboxName = driver.findElement(By.id("name"));
//        editboxName.sendKeys("newName");
//        driver.get("https://qa-faculty.github.io/tariff-plan/");
//        driver.findElement(By.id("email")).sendKeys("tui34@gmail.com");
//        driver.findElement(By.xpath(".//button[text()=\"Подписаться\"]")).click();

            driver.findElement(By.id("name")).sendKeys("Team Number2");
            driver.findElement(By.id("email")).sendKeys("jkhjhgj@gmail.com");
            driver.findElement(By.id("phone")).sendKeys("+5446787");
            driver.findElement(By.xpath("//input[@onclick=\"validatePersonalInfo(event)\"]")).click();




    }
}