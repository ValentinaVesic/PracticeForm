package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormTest extends BaseTest {


    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");

    }

    @Test
    public void successfulFormSubmitWithValidInput() {

        String firstName = "Valentina";
        String lastName = "Vesic";
        String email = "valentina.vesic2@gmail.com";
        String mobile = "1234567890";
        String address = "Beogradska";
        String state = "Haryana";
        String city = "Karnal";

        String[] subjects = {"English", "Biology"};

        scrollToElement(homepagePage.elementsButton.get(1));
        homepagePage.clickOnCard("Forms");
        scrollToElement(sidebarPage.Button.get(1));
        sidebarPage.clickOnButton("Practice Form");
        scrollToElement(practiceFormPage.firstNameField);
        practiceFormPage.inputFirstName(firstName);
        practiceFormPage.inputLastName(lastName);
        practiceFormPage.inputEmail(email);
        practiceFormPage.clickOnGender("Female");
        practiceFormPage.inputPhoneNumber(mobile);
        practiceFormPage.selectDateOfBirth("1996", "June", "2");
        scrollToElement(practiceFormPage.subjectsField);
        practiceFormPage.AddMultipleSubjects(subjects);
        practiceFormPage.clickOnHobbies("Sports");
        practiceFormPage.uploadPicture("C:\\Users\\PC\\Desktop\\geteriseteri.png");
        practiceFormPage.inputCurrentAddress(address);
        practiceFormPage.selectStateAndCity(state, city);
        practiceFormPage.clickOnSubmitButton();
        Assert.assertTrue(practiceFormPage.studentInformation.isDisplayed());
        Assert.assertTrue(practiceFormPage.tableAfterSubmit.getText().contains(firstName));
        Assert.assertTrue(practiceFormPage.tableAfterSubmit.getText().contains(lastName));
        Assert.assertTrue(practiceFormPage.tableAfterSubmit.getText().contains(email));


    }
}
