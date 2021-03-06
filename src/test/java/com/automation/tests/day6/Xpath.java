package com.automation.tests.day6;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createADriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        BrowserUtils.wait(3);
        WebElement btn1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        btn1.click();

        WebElement result = driver.findElement(By.id("result"));
        System.out.println(result.getText());

        WebElement btn2 = driver.findElement(By.xpath("//button[text()='Button 2']"));
        btn2.click();
        System.out.println(result.getText());

        WebElement btn3 = driver.findElement(By.xpath("//button[starts-with(@id,'button_'[1]"));
        btn3.click();
        System.out.println(result.getText());


        WebElement btn4 = driver.findElement(By.xpath("//button[contains(text(),'5')]"));
        btn4.click();
        System.out.println(result.getText());




        /*
        //button[@class=‘btn btn-primary’]   or  //*[@class=‘btn btn-primary’]
        //button[@onclick=‘button4()’]
        //button[@id=‘btnbtn_button’]
        //button[text()=‘Button 4’]
        //tag[@attribute=‘value’]
        //button[starts-with(@id,‘button_‘)] -- to match beginning of attribute
        //tag[starts-with(@attribute,‘button_‘)]
         */



        BrowserUtils.wait(3);
        driver.quit();
    }
}
