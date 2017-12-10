package ru.stqa.training.selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Login extends TestBase {

  @Test
  public void myFirstTest() {
    driver.navigate().to("http://localhost/litecart/admin/");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("login")).click();
    wait.until(titleIs("My Store"));

    driver.findElement(By.cssSelector("td#sidebar i.fa.fa-adjust.fa-stack-1x.icon")).click();
    driver.findElement(By.cssSelector("li#doc-template")).click();
    Assert.assertTrue(isElementPresent(By.cssSelector("[name=template_form]")));
    driver.findElement(By.cssSelector("li#doc-logotype")).click();
    Assert.assertTrue(isElementPresent(By.cssSelector("td#content img")));

    driver.findElement(By.cssSelector("td#sidebar i.fa.fa-th.fa-stack-1x.icon")).click();
    driver.findElement(By.cssSelector("li#doc-catalog")).click();
    Assert.assertTrue(isElementPresent(By.cssSelector("[name=catalog_form]")));
    driver.findElement(By.cssSelector("li#doc-product_groups")).click();
    Assert.assertTrue(isElementPresent(By.cssSelector("[name=product_groups_form]")));
    driver.findElement(By.cssSelector("li#doc-option_groups")).click();
    Assert.assertTrue(isElementPresent(By.cssSelector("[name=option_groups_form]")));
    driver.findElement(By.cssSelector("li#doc-manufacturers")).click();
    Assert.assertTrue(isElementPresent(By.cssSelector("[name=manufacturers_form]")));
    driver.findElement(By.cssSelector("li#doc-suppliers")).click();
    Assert.assertTrue(isElementPresent(By.cssSelector("[name=suppliers_form]")));
    driver.findElement(By.cssSelector("li#doc-delivery_statuses")).click();
    Assert.assertTrue(isElementPresent(By.cssSelector("[name=delivery_statuses_form]")));
    driver.findElement(By.cssSelector("li#doc-sold_out_statuses")).click();
    Assert.assertTrue(isElementPresent(By.cssSelector("[name=sold_out_statuses_form]")));
    driver.findElement(By.cssSelector("li#doc-quantity_units")).click();
    Assert.assertTrue(isElementPresent(By.cssSelector("[name=quantity_units_form]")));
    driver.findElement(By.cssSelector("li#doc-csv")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h2[text()='Categories']")));

    driver.findElement(By.cssSelector("td#sidebar i.fa.fa-flag.fa-stack-1x.icon")).click();
    Assert.assertTrue(isElementPresent(By.cssSelector("[name=countries_form]")));

    driver.findElement(By.cssSelector("td#sidebar i.fa.fa-money.fa-stack-1x.icon")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Currencies')]")));

    driver.findElement(By.cssSelector("td#sidebar i.fa.fa-user.fa-stack-1x.icon")).click();
    driver.findElement(By.cssSelector("li#doc-customers")).click();
    Assert.assertTrue(isElementPresent(By.cssSelector("[name=customers_form]")));
    driver.findElement(By.cssSelector("li#doc-csv")).click();
    Assert.assertTrue(isElementPresent(By.cssSelector("[name=import_form]")));
    driver.findElement(By.cssSelector("li#doc-newsletter")).click();
    Assert.assertTrue(isElementPresent(By.cssSelector("ul#service-providers")));

    driver.findElement(By.cssSelector("td#sidebar i.fa.fa-globe.fa-stack-1x.icon")).click();
    Assert.assertTrue(isElementPresent(By.cssSelector("[name=geo_zones_form]")));

    driver.findElement(By.cssSelector("td#sidebar i.fa.fa-comments.fa-stack-1x.icon")).click();
    driver.findElement(By.cssSelector("li#doc-languages")).click();
    Assert.assertTrue(isElementPresent(By.cssSelector("[name=languages_form]")));
    driver.findElement(By.cssSelector("li#doc-storage_encoding")).click();
    Assert.assertTrue(isElementPresent(By.cssSelector("[name=mysql_collation_form]")));

    driver.findElement(By.cssSelector("td#sidebar i.fa.fa-cube.fa-stack-1x.icon")).click();
    driver.findElement(By.cssSelector("li#doc-jobs")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Job Modules')]")));
    driver.findElement(By.cssSelector("li#doc-customer")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Customer Modules')]")));
    driver.findElement(By.cssSelector("li#doc-shipping")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Shipping Modules')]")));
    driver.findElement(By.cssSelector("li#doc-payment")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Payment Modules')]")));
    driver.findElement(By.cssSelector("li#doc-order_total")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Order Total Modules')]")));
    driver.findElement(By.cssSelector("li#doc-order_success")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Order Success Modules')]")));
    driver.findElement(By.cssSelector("li#doc-order_action")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Order Action Modules')]")));

    driver.findElement(By.cssSelector("td#sidebar i.fa.fa-shopping-cart.fa-stack-1x.icon")).click();
    driver.findElement(By.cssSelector("li#doc-orders")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Orders')]")));
    driver.findElement(By.cssSelector("li#doc-order_statuses")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Order Statuses')]")));

    driver.findElement(By.cssSelector("td#sidebar i.fa.fa-file-text.fa-stack-1x.icon")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Pages')]")));

    driver.findElement(By.cssSelector("td#sidebar i.fa.fa-pie-chart.fa-stack-1x.icon")).click();
    driver.findElement(By.cssSelector("li#doc-monthly_sales")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Monthly Sales')]")));
    driver.findElement(By.cssSelector("li#doc-most_sold_products")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Most Sold Products')]")));
    driver.findElement(By.cssSelector("li#doc-most_shopping_customers")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Most Shopping Customers')]")));

    driver.findElement(By.cssSelector("td#sidebar i.fa.fa-cogs.fa-stack-1x.icon")).click();
    driver.findElement(By.cssSelector("li#doc-store_info")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//td[text()='Store Name']")));
    driver.findElement(By.cssSelector("li#doc-defaults")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//td[text()='Default Language']")));
    driver.findElement(By.cssSelector("li#doc-general")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//td[text()='There are no entries in the database.']")));
    driver.findElement(By.cssSelector("li#doc-listings")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//td[text()='Catalog Only Mode']")));
    driver.findElement(By.cssSelector("li#doc-images")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//td[text()='Category Images: Aspect Ratio']")));
    driver.findElement(By.cssSelector("li#doc-checkout")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//td[text()='Register Guests']")));
    driver.findElement(By.cssSelector("li#doc-advanced")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//td[text()='System Cache Enabled']")));
    driver.findElement(By.cssSelector("li#doc-security")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//td[text()='Blacklist']")));

    driver.findElement(By.cssSelector("td#sidebar i.fa.fa-picture-o.fa-stack-1x.icon")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Slides')]")));

    driver.findElement(By.cssSelector("td#sidebar i.fa.fa-university.fa-stack-1x.icon")).click();
    driver.findElement(By.cssSelector("li#doc-tax_classes")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Tax Classes')]")));
    driver.findElement(By.cssSelector("li#doc-tax_rates")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Tax Rates')]")));

    driver.findElement(By.cssSelector("td#sidebar i.fa.fa-book.fa-stack-1x.icon")).click();
    driver.findElement(By.cssSelector("li#doc-search")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Search Translations')]")));
    driver.findElement(By.cssSelector("li#doc-scan")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Scan Files For Translations')]")));
    driver.findElement(By.cssSelector("li#doc-csv")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' CSV Import/Export')]")));

    driver.findElement(By.cssSelector("td#sidebar i.fa.fa-star.fa-stack-1x.icon")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' Users')]")));

    driver.findElement(By.cssSelector("td#sidebar i.fa.fa-plug.fa-stack-1x.icon")).click();
    driver.findElement(By.cssSelector("li#doc-vqmods")).click();
    Assert.assertTrue(isElementPresent(By.xpath("//h1[contains(.,' vQmods')]")));
  }
}
