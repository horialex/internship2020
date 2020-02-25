package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.dev.evozon.com/customer/account/")
public class HeaderPage extends AbstractPage{

    @FindBy(css="p.welcome-msg")
    private WebElementFacade greetMessage;


    public String getGreetMessage(){
        return greetMessage.getText();
    }

}
