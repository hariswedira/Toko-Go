package com.example.hariswedira.todofirebase;


import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Rule;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;



public class LoginActivityTest{

    @Rule
    public ActivityTestRule<LoginActivity> mLoginActivityActivityTestRule= new ActivityTestRule<LoginActivity>(LoginActivity.class);

    public LoginActivityTest() {
    }

    @Test
    public void testLoginSceneraio() {

        InputStream inputStream = mLoginActivityActivityTestRule.getActivity().getResources().openRawResource(R.raw.logindua);
        String[] ids;
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            String csvLine;
            while ((csvLine = reader.readLine()) != null) {
                ids=csvLine.split(";");
                try{
                    Espresso.onView(withId(R.id.edt_username_login)).perform(clearText());
                    Espresso.onView(withId(R.id.edt_password_login)).perform(clearText());
                    Espresso.onView(withId(R.id.edt_username_login)).perform(typeText(ids[0]));
                    Espresso.closeSoftKeyboard();
                    Espresso.onView(withId(R.id.edt_password_login)).perform(typeText(ids[1]));
                    Espresso.closeSoftKeyboard();
                    Espresso.onView(withId(R.id.btn_login)).perform(click());
                    Thread.sleep(3000);
                }catch (Exception e){
                    Log.e("Unknown",e.toString());
                }
            }
        }catch (Exception e){
            throw new RuntimeException("Error in reading CSV file: "+e);
        }

//        throws InterruptedException, JSONException
//        DataJson dataJson = new DataJson();
//        String root = dataJson.getRoot();
//        JSONObject roots = new JSONObject(root);
//        JSONArray users = roots.getJSONArray("user");
//
//        for (int i = 0;i < users.length();i++){
//            JSONObject json = users.getJSONObject(i);
//            String user = json.getString("username");
//            String pass = json.getString("password");
//            Espresso.onView(withId(R.id.edt_username_login)).perform(clearText());
//            Espresso.onView(withId(R.id.edt_password_login)).perform(clearText());
//            Espresso.onView(withId(R.id.edt_username_login)).perform(typeText(user));
//            Espresso.closeSoftKeyboard();
//            Espresso.onView(withId(R.id.edt_password_login)).perform(typeText(pass));
//            Espresso.closeSoftKeyboard();
//            Espresso.onView(withId(R.id.btn_login)).perform(click());
//            Thread.sleep(3000);
//        }

    }

}