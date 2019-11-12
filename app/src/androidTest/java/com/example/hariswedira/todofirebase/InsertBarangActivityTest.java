package com.example.hariswedira.todofirebase;

import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class InsertBarangActivityTest {

    @Rule
    public ActivityTestRule<InsertBarangActivity> mInsertBarangActivityActivityTestRule= new ActivityTestRule<InsertBarangActivity>(InsertBarangActivity.class);

    private String namaBarang = "rendang";
    private String jenisBarang = "makanan";
    private int hargaBarang = 5000;

    @Test
    public void testInsertBarangSceneraio() throws InterruptedException {
        Espresso.onView(withId(R.id.edt_nama_hutang)).perform(typeText(namaBarang));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.hrg_brg)).perform(typeText(jenisBarang));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.edt_harga_barang)).perform(typeText(Integer.toString(hargaBarang)));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.btnCreate)).perform(click());
        Thread.sleep(5000);
    }
}