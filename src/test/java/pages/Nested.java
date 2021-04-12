package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Nested extends Basepage {
    public Nested(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='content']/ul/li[34]/a\n")
    WebElement nestedFrame;

    public void test() {
        nestedFrame.click();
        //Reporter.log("navigated to nestedframe window"+driver.getTitle());


    }


}
