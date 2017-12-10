package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestBase {
  public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
  public WebDriver driver;
  public WebDriverWait wait;

  public boolean isElementPresent(By locator){
    try {
      driver.findElement(locator);
      return  true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }

  public boolean areElementsPresent(By locator) {
    try {
      return driver.findElements(locator).size() > 0;
    } catch (InvalidSelectorException ex) {
      return false;
    }
  }

  @Before
  public void start() {
    if (tlDriver.get() != null) {
      driver = tlDriver.get();
      wait = new WebDriverWait(driver, 10);
      return;
    }
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    //DesiredCapabilities caps = new DesiredCapabilities();
    //caps.setCapability(FirefoxDriver.MARIONETTE, false);
    //driver = new FirefoxDriver(caps);
    tlDriver.set(driver);
    System.out.println(((HasCapabilities) driver).getCapabilities());
    wait = new WebDriverWait(driver, 10);

    Runtime.getRuntime().addShutdownHook(
            new Thread(() -> { driver.quit(); driver = null; }));
  }

  @After
  public void stop() {
    //driver.quit();
    //driver = null;
  }
}
