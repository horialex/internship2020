package steps;


import models.User;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import page.HeaderPage;
import page.RegisterPage;

public class RegisterSteps{

    RegisterPage registerPage;
    HeaderPage headerPage;

    @Step
    public void fillRegisterData(User user){
        registerPage.typeFirstName(user.getFirstName());
        registerPage.typeLastName(user.getLastName());
        registerPage.typeEmailAdress(user.getEmail());
        registerPage.typePassword(user.getPass());
        registerPage.typeConfirmPassword(user.getConfirmPass());
    }

    @Step
    public void navigateToRegisterPage(){
        registerPage.open();
    }
    @Step
    public void confirmRegister(){
        registerPage.clickRegisterButton();
    }

    @Step
    public void registerUser(User user){
        fillRegisterData(user);
        confirmRegister();
    }

    @Step
    public void verifyUserIsRegistered(String fName, String lName){
        String greetMessage = headerPage.getGreetMessage().toLowerCase();
        Assert.assertTrue(greetMessage.contains(fName.toLowerCase()));
        Assert.assertTrue(greetMessage.contains(lName.toLowerCase()));
    }



}
