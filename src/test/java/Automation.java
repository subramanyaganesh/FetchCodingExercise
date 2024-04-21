import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Automation extends PageObject {


    public Automation(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"left_0\"]")
    private WebElement left_0;

    @FindBy(xpath = "//*[@id=\"left_1\"]")
    private WebElement left_1;

    @FindBy(xpath = "//*[@id=\"left_2\"]")
    private WebElement left_2;


    @FindBy(xpath = "//*[@id=\"right_0\"]")
    private WebElement right_0;


    @FindBy(xpath = "//*[@id=\"right_1\"]")
    private WebElement right_1;


    @FindBy(xpath = "//*[@id=\"right_2\"]")
    private WebElement right_2;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[5]/ol")
    private WebElement orderedList;

    @FindBy(xpath = "//*[@id=\"weigh\"]")
    private WebElement weigh;


    @FindBy(xpath = "/html/body/div/div/div[1]/div[4]/button[1]")
    //the result of conditions has id as reset so we cannot use the id or xpath to access this value
    private WebElement reset;

    @FindBy(xpath = "/html/body/div/div/div[1]/div[2]/button")
    private WebElement result;


    //c. filling out the bowls grids with bar numbers (0 to 8)
    public void fillingBowles(List<String> left, List<String> right) {
        if (left.size() >= 1) this.left_0.sendKeys(left.get(0));
        if (left.size() >= 2) this.left_1.sendKeys(left.get(1));
        if (left.size() >= 3) this.left_2.sendKeys(left.get(2));
        if (right.size() >= 1) this.right_0.sendKeys(right.get(0));
        if (right.size() >= 2) this.right_1.sendKeys(right.get(1));
        if (right.size() >= 3) this.right_2.sendKeys(right.get(2));
    }

    //a. clicks on buttons (“Weigh”, “Reset”)
    public void clickButtons(String val) {
        if (val.equals("weigh"))
            this.weigh.click();
        else if (val.equals("reset"))
            this.reset.click();

    }

    public void spread(List<String> temp) {
        int splitSize = temp.size() / 3;
        Utils.group1.clear();
        Utils.group2.clear();
        Utils.group3.clear();
        for (int i = 0; i < temp.size(); i++) {
            if (i < splitSize) {
                Utils.group1.add(temp.get(i));
            } else if (i < 2 * splitSize) {
                Utils.group2.add(temp.get(i));
            } else Utils.group3.add(temp.get(i));
        }
    }

    //d. getting a list of weighing
    public void gettingListOfWeights() {
        List<WebElement> a = orderedList.findElements(By.tagName("li"));
        Utils.weighingMade.add(a.get(a.size() - 1).getText());
    }

    //b. Getting the measurement results (field between the 'bowls')
    public String getMeasurementResult() {
        return this.result.getText();
    }

    public void decision() {
        String decisionFromApp = getMeasurementResult();
        if (decisionFromApp.contains("=")) {
            spread(new ArrayList<>(Utils.group3));
        } else if (decisionFromApp.contains(">")) {
            spread(new ArrayList<>(Utils.group2));
        } else {
            spread(new ArrayList<>(Utils.group1));
        }
        if (Utils.group2.isEmpty() && Utils.group1.isEmpty() && Utils.group3.size() == 1) {
            Utils.answer = Utils.group3.get(0);
        }
    }

    //e. Clicking on the gold bar number at the bottom of the website and checking for the alert message
    //3. Code the algorithm from step 1 which uses a set of actions from step 2 to find the fake gold bar
    public void clickGoldBarNumber() {
        System.out.println("The defective gold Bar is bar number::" + Utils.answer);
        driver.findElement(By.id("coin_" + Utils.answer)).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        System.out.println("Alert message: " + alertMessage);
        alert.accept();
        Assert.assertEquals(alertMessage, "Yay! You find it!");
        System.out.println("The number of iterations are = " + Utils.weighingMade.size());
        System.out.println("The list of comparison results are = " + Utils.weighingMade);
    }


}
