import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();


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
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                //
            }
            automation.decision();
            automation.gettingListOfWeights();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                //
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
