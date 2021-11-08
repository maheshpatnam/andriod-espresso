package Base;

import androidx.test.rule.ActivityTestRule;

import com.example.loginapp.ui.login.LoginActivity;

import org.junit.Rule;

public class TestBase {
    @Rule
    public ActivityTestRule<LoginActivity> mActivityTestRule = new ActivityTestRule<>(LoginActivity.class);
}
