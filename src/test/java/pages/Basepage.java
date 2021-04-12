package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Basepage {
    protected WebDriver driver;

    public Basepage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static String getValues(String key) {
        String path = System.getProperty("user.dir") + File.separator + "config.properties";
        String value = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(fis);
            value = prop.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return value;
    }


}
