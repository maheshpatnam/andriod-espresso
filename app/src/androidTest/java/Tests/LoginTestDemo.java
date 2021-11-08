package Tests;

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import com.applitools.eyes.android.espresso.Eyes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import Base.TestBase;
import PageObjects.LoginPage;

@RunWith(AndroidJUnit4ClassRunner.class)
public class LoginTestDemo extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void login(){
        loginPage.enterUserId("maheshpatnam");
        loginPage.closeKeyBoard();
        loginPage.enterPassword("maheshpatnam");
        loginPage.closeKeyBoard();
        loginPage.clickSignButton();
    }
}
