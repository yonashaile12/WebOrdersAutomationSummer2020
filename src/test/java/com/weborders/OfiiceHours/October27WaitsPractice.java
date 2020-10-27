package com.weborders.OfiiceHours;

import com.weborders.utils.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class October27WaitsPractice {

    @Test
    public void test(){
        WebDriver driver = Driver.getDriver();
        driver.get("http://practice.cybertekschool.com/dynamic_loading/3");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //element is present but not visible means it is not intractable
        //driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("input[type='checkbox']"))));
        checkbox.click();

        driver.quit();
    }
}
