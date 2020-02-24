package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class GoogleTest extends BaseTest{

    @Test
    public void googleTest() {
        webdriver.get("https://google.com");
    }


} 