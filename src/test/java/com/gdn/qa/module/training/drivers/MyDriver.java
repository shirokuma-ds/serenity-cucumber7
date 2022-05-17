package com.gdn.qa.module.training.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver implements DriverSource {
    @Override
    public WebDriver newDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}
