package Tests;

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import com.applitools.eyes.android.espresso.Eyes;

import Base.TestBase;
import PageObjects.LoginPage;
import utils.E2ETests;
import utils.SmokeTests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4ClassRunner.class)
public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    Eyes eyes;
    @Before
    public void setUp(){
        eyes = new Eyes();
        eyes.setApiKey("o0zsC8QaGShkyRXKa0GDdVsGV1SrijrUfHjd4fK9qPw110");
    }

    @Test
    public void login(){
        eyes.open("espresso login","first test");
        eyes.checkWindow("Login screen");
        loginPage.enterUserId("maheshpatnam");
        loginPage.closeKeyBoard();
        loginPage.enterPassword("maheshpatnam");
        loginPage.closeKeyBoard();

        try
        { loginPage.clickSignButton();
            eyes.checkWindow("Logiin button is clicked");
            eyes.close();
        }
        finally {
            eyes.abortIfNotClosed();
        }
    }
}
