package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage extends BaseTest {
    public FormPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;
    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(css = "label[for='gender-radio-1']")
    public WebElement maleRadioButton;
    @FindBy(css = "label[for='gender-radio-2']")
    public WebElement femaleRadioButton;
    @FindBy(css = "label[for='gender-radio-3']")
    public WebElement otherRadioButton;

    @FindBy(id = "userNumber")
    public WebElement userPhoneNumber;

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("male")) {
            maleRadioButton.click();
        } else if (gender.equalsIgnoreCase("female")) {
            femaleRadioButton.click();
        } else if (gender.equalsIgnoreCase("other")) {
            otherRadioButton.click();

        }
    }

    public void inputFirstName(String stringFirstName) {
        firstName.clear();
        firstName.sendKeys(stringFirstName);
    }

    public void inputLastName(String stringLastName) {
        lastName.clear();
        lastName.sendKeys(stringLastName);
    }

    public void inputUserEmail(String stringUserEmail) {
        userEmail.clear();
        userEmail.sendKeys(stringUserEmail);
    }

    public void insertPhoneNumber(String phoneNumber) {
        userPhoneNumber.clear();
        userPhoneNumber.sendKeys(phoneNumber);
    }
}
