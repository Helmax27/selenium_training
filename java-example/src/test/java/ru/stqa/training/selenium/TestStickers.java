package ru.stqa.training.selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class TestStickers extends TestBase {

  @Test
  public void checkStickers() {
    driver.navigate().to("http://localhost/litecart/en/");
    wait.until(titleIs("Online Store | My Store"));

    List<WebElement> links=driver.findElements(By.tagName("li.product.column.shadow.hover-light"));
    for (int i=0; i<links.size(); i++) {
      links.get(i).findElements(By.xpath("//div[contains(@class,'sticker')]"));
      Assert.assertTrue(isElementPresent(By.xpath("//div[contains(@class,'sticker')]")));
    }

  }
}