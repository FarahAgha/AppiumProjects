package step_definitions;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import cucumber.api.java.en.Given;

public class LaunchPage {
	@Given("^I want to launch Get Pro Stars Native Application$")
    public void I_want_to_launch_Get_Pro_Stars_Native_Application() throws MalformedURLException {
		AndroidDriver<AndroidElement>  driver = BaseClass.capabilities();
		driver.findElementByXPath("//tagname[@attribute = 'value']") ;
    }

}
