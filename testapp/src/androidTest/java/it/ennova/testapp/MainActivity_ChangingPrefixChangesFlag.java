package it.ennova.testapp;


import android.support.design.widget.TextInputLayout;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class MainActivity_ChangingPrefixChangesFlag {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void ChangingPrefixChangesFlag() {
        ViewInteraction textInputEditText = onView(
                allOf(withId(R.id.cv_phone_number), isDisplayed()));
        textInputEditText.perform(click());

        ViewInteraction textInputEditText2 = onView(
                allOf(withId(R.id.cv_phone_number), isDisplayed()));
        textInputEditText2.perform(replaceText("+"), closeSoftKeyboard());

        ViewInteraction textView = onView(
                allOf(withId(R.id.list_prefix), withText("+39"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.countryView),
                                        0),
                                1),
                        isDisplayed()));
        textView.check(matches(withText("+39")));

        ViewInteraction textInputEditText3 = onView(
                allOf(withId(R.id.cv_phone_number), withText("+"), isDisplayed()));
        textInputEditText3.perform(replaceText("+3312"), closeSoftKeyboard());

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.list_prefix), withText("+33"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.countryView),
                                        0),
                                1),
                        isDisplayed()));
        textView2.check(matches(withText("+33")));

        ViewInteraction editText = onView(
                allOf(withId(R.id.cv_phone_number), withText("12"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(TextInputLayout.class),
                                        0),
                                0),
                        isDisplayed()));
        editText.check(matches(withText("12")));

    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
