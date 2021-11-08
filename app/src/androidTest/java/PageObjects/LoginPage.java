package PageObjects;

import com.example.loginapp.R;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class LoginPage {
    private final int signId = R.id.login;
    private final int username = R.id.username;
    private final int password = R.id.password;
    private final int loginId = R.id.login;
    private final String sucessfulloginId = "Successful Login";

    public void enterUserId(String usernameValue){
        onView(withId(signId)).check(matches(withText("Sign in or register")));
        onView(withId(username)).perform(typeText(usernameValue));
    }
    public void enterPassword(String pwdValue){
        onView(withId(password)).perform(typeText(pwdValue));
    }
    public void closeKeyBoard(){
        closeSoftKeyboard();
    }
    public void clickSignButton(){
        onView(withId(loginId)).perform(click());
    }
    public void isSuccessfulLogin(){
        onView(withText(sucessfulloginId)).check(matches(isDisplayed())).check(matches(withText(sucessfulloginId)));
    }

}
