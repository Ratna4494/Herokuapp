package testScript.NS;

import org.testng.annotations.Test;
import pages.Basepage;
import pages.Frame;
import pages.Nested;
import testScript.BaseTest;

public class TC_0001 extends BaseTest {


    @Test
    public void launching() throws InterruptedException {

        Thread.sleep(3000);
        Nested Ns = new Nested(driver);
        Ns.test();

        Frame FM = new Frame(driver);
        FM.Test();
        Thread.sleep(3000);




    }

}
