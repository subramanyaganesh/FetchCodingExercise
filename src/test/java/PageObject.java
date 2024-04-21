import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

    protected WebDriver driver;

    //page object model to ensure that the several pages can be automated using the same template
    public PageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
