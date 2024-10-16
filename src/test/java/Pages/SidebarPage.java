package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SidebarPage extends BaseTest {

    public SidebarPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "text")
    public List<WebElement> Button;


    public void clickOnButton(String buttonName) {
        for (int i = 0; i < Button.size(); i++) {
            if (Button.get(i).getText().equals(buttonName)) {
                Button.get(i).click();
                break;
            }
        }
    }


}