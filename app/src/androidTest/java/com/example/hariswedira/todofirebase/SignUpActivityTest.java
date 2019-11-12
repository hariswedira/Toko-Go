package com.example.hariswedira.todofirebase;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class SignUpActivityTest {

    @Rule
    public ActivityTestRule<SignUpActivity> mSignUpActivityActivityTestRule = new ActivityTestRule<SignUpActivity>(SignUpActivity.class);

    private String nama = "dodo";
    private String namaToko = "dodo store";
    private String username = "yuiiii";
    private String password = "uiiii";
    private String kode = "dokes";
    private String namaBarang = "mie";
    private String jenisBarang = "makanan";
    private int hargaBarang = 2000;
    private String name = "yoi";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testSignUpSceneraio() throws InterruptedException {
        // input text
        Espresso.onView(withId(R.id.edt_nama)).perform(typeText(nama));
        Espresso.onView(withId(R.id.edt_nama_toko)).perform(typeText(namaToko));
        Espresso.onView(withId(R.id.edt_username_sign)).perform(typeText(username));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.edt_password_sign)).perform(typeText(password));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.edt_confirm_password)).perform(typeText(password));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.edt_kode_akun)).perform(typeText(kode));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.btn_daftar)).perform(click());
        Thread.sleep(2000);

//        Espresso.onView(withId(R.id.edt_username_login)).perform(typeText(username));
//        Espresso.closeSoftKeyboard();
//        Espresso.onView(withId(R.id.edt_password_login)).perform(typeText(password));
//        Espresso.closeSoftKeyboard();
//        Espresso.onView(withId(R.id.btn_login)).perform(click());
//        Thread.sleep(2000);
//
//        Espresso.onView(withId(R.id.nav_link)).perform(click());
//        Espresso.onView(withId(R.id.btnAdd)).perform(click());
//        Espresso.onView(withId(R.id.edt_nama_hutang)).perform(typeText(namaBarang));
//        Espresso.closeSoftKeyboard();
//        Espresso.onView(withId(R.id.hrg_brg)).perform(typeText(jenisBarang));
//        Espresso.closeSoftKeyboard();
//        Espresso.onView(withId(R.id.edt_harga_barang)).perform(typeText(Integer.toString(hargaBarang)));
//        Espresso.closeSoftKeyboard();
//        Espresso.onView(withId(R.id.btnCreate)).perform(click());
//        Thread.sleep(2000);
//
//        Espresso.onView(withId(R.id.nav_profile)).perform(click());
//        Espresso.onView(withId(R.id.edt_nama_profile)).perform(clearText());
//        Espresso.onView(withId(R.id.edt_nama_profile)).perform(typeText(nama));
//        Espresso.closeSoftKeyboard();
//        Espresso.onView(withId(R.id.btnUpdate3)).perform(click());
//        Thread.sleep(3000);
    }

    @After
    public void tearDown() throws Exception {
    }
}