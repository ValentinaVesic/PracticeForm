package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PracticeFormPage extends BaseTest {


    public PracticeFormPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    public WebElement firstNameField;

    @FindBy(id = "lastName")
    public WebElement lastNameField;

    @FindBy(id = "userEmail")
    public WebElement userEmailField;

    @FindBy(className = "custom-control-label")
    public List<WebElement> genderRadio;

    @FindBy(id = "userNumber")
    public WebElement userNumberField;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirthBox;

    @FindBy(className = "react-datepicker__year-select")
    public WebElement yearDropDownMenu;

    @FindBy(className = "react-datepicker__month-select")
    public WebElement monthDropDownMenu;

    @FindBy(id = "subjectsInput")
    public WebElement subjectsField;

    @FindBy(css = ".subjects-auto-complete__menu-list div")
    public List<WebElement> subjectSuggestions;

    @FindBy(className = "custom-control-label")
    public List<WebElement> hobbies;

    @FindBy(id = "uploadPicture")
    public WebElement pictureUpload;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressField;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(id = "example-modal-sizes-title-lg")
    public WebElement studentInformation;

    @FindBy(className = "table-responsive")
    public WebElement tableAfterSubmit;

    @FindBy(id = "closeLargeModal")
    public WebElement closeButtonAfterFormSubmit;


    public void inputFirstName(String firstName) {
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }

    public void inputEmail(String email) {
        userEmailField.clear();
        userEmailField.sendKeys(email);
    }

    public void inputPhoneNumber(String number10digitformat) {
        userNumberField.clear();
        userNumberField.sendKeys(number10digitformat);
    }

    public void clickOnGender(String ChooseGenderMaleFemaleOrOther) {
        String[] genderList = {"male", "female", "other"};
        for (String pol : genderList) {
            if (pol.equalsIgnoreCase(ChooseGenderMaleFemaleOrOther)) {
                for (WebElement webElement : genderRadio) {
                    if (webElement.getText().equalsIgnoreCase(ChooseGenderMaleFemaleOrOther)) {
                        webElement.click();
                    }
                }
            }
        }
    }

    public void selectDateOfBirth(String year, String month, String Day) {
        dateOfBirthBox.click();
        yearDropDownMenu.sendKeys(year);
        monthDropDownMenu.sendKeys(month);
        WebElement day = driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='" + Day + "']"));
        scrollToElement(day);
        day.click();
    }

    public void AddMultipleSubjects(String[] subjects) {
        for (String subject : subjects) {
            subjectsField.sendKeys(subject);
            for (WebElement suggestion : subjectSuggestions) {
                if (suggestion.getText().contains(subject)) {
                    suggestion.click();
                    break;
                }
            }
        }
    }


    public void inputSubjects(String subjects) {
        subjectsField.sendKeys(subjects);
        subjectsField.sendKeys(Keys.ENTER);
    }

    public void clickOnHobbies(String ChooseHobbieSportsReadingOrMusic) {
        String[] hobbieList = {"sports", "reading", "music"};
        for (String hobbie : hobbieList) {
            if (hobbie.equalsIgnoreCase(ChooseHobbieSportsReadingOrMusic)) {
                for (WebElement webElement : hobbies) {
                    if (webElement.getText().equalsIgnoreCase(ChooseHobbieSportsReadingOrMusic)) {
                        webElement.click();
                    }
                }
            }
        }
    }

    public void selectStateAndCity(String state, String city) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement stateDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("state")));
        stateDropdown.click();
        WebElement stateOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'" + state + "')]")));
        stateOption.click();
        WebElement cityDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("city")));
        cityDropdown.click();
        WebElement cityOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'" + city + "')]")));
        cityOption.click();
    }

    public void uploadPicture(String filepath) {
        pictureUpload.sendKeys(filepath);
    }

    public void inputCurrentAddress(String currentAddress) {
        currentAddressField.clear();
        currentAddressField.sendKeys(currentAddress);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    public boolean isElementDisplayed() {
        boolean isDisplayed = false;
        try {
            isDisplayed = tableAfterSubmit.isDisplayed();
        } catch (Exception e) {
        }
        return isDisplayed;
    }


}








