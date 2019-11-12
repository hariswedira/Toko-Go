package com.example.hariswedira.todofirebase.Fragment;

import com.example.hariswedira.todofirebase.DashboardActivity;
import com.example.hariswedira.todofirebase.InsertBarangActivity;
import com.example.hariswedira.todofirebase.R;

import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.action.ViewActions.swipeUp;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class ProfileFragmentTest {
    private String nama = "petet";

    @Rule
    public ActivityTestRule<DashboardActivity> profile = new ActivityTestRule<DashboardActivity>(DashboardActivity.class);

    @Test
    public void testUpdateSceneraio() throws InterruptedException {
        // input text
        Espresso.onView(withId(R.id.nav_profile)).perform(click());
        Espresso.onView(withId(R.id.edt_nama_profile)).perform(clearText());
        Espresso.onView(withId(R.id.edt_nama_profile)).perform(typeText(nama));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.btnUpdate3)).perform(click());
        Thread.sleep(5000);
    }
}