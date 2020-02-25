package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


import net.thucydides.core.annotations.Managed;
import utils.Constants;

public class BaseTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Before
	public void setup() {
		System.out.println("Before test!");
		webdriver.get(Constants.URL);
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() {
		System.out.println("After test!");
		webdriver.quit();
	}

}
