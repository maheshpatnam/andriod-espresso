package com.example.loginapp.ui.login;

import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.rule.ActivityTestRule;

import com.example.loginapp.R;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4ClassRunner.class)
public class AccessbilityTest {
    @BeforeClass
    public static void beforeClassFunction(){
        AccessibilityChecks.enable();
    }
    @Rule
    public ActivityTestRule<LoginActivity> mActivityTestRule = new ActivityTestRule<>(LoginActivity.class);
    @Test
    public void login(){
        onView(ViewMatchers.withId(R.id.login)).check(matches(withText("Sign in or register")));
        onView(withId(R.id.username)).perform(typeText("maheshpatnam"));
        closeSoftKeyboard();
        onView(withId(R.id.password)).perform(typeText("maheshpatnam"));
        closeSoftKeyboard();
        onView(withId(R.id.login)).perform(click());

    }
}
