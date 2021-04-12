package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class Frame extends Basepage {
    public Frame(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "/html/frameset/frame[1]")
   WebElement MiddleFrame;


    public void Test() {
       MiddleFrame.click();
       String title= MiddleFrame.getText();
       System.out.println(title);



    }

}
