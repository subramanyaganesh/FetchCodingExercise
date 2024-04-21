import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();


    //using testng's annotations to run tests


    @BeforeSuite
    public static void setClass() {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Find the answer")
    public static void Test() {
        driver.get(Utils.BASE_URL);
        Automation automation = new Automation(driver);

        while (Utils.answer.equals("")) {
            automation.fillingBowles(Utils.group1, Utils.group2);
            automation.clickButtons("weigh");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            automation.decision();
            automation.gettingListOfWeights();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            automation.clickButtons("reset");

        }
        automation.clickGoldBarNumber();
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
