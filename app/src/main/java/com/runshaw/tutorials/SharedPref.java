package com.runshaw.tutorials;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Sharath on 2020/08/14
 **/
public class SharedPref {
    private final SharedPreferences pref;
    private final SharedPreferences.Editor editor;
    private static final String PREF_NAME = "login_data";
    private static final String KEY_USERID = "userID";
    private static final String KEY_USERNAME = "userName";
    private static final String KEY_PASSWORD = "password";

    public SharedPref(Context context){
        int PRIVATE_MODE = 0;
        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setUserID(String userID){
        editor.putString(KEY_USERID, userID);
        editor.commit();
    }

    public String getUserID(){
        return pref.getString(KEY_USERID, "");
    }

    public void setUserName(String userName){
        editor.putString(KEY_USERNAME, userName);
        editor.commit();
    }

    public String getUserName(){
        return pref.getString(KEY_USERNAME, "");
    }

    public void setUserPassword(String password){
        editor.putString(KEY_PASSWORD, password);
        editor.apply();
    }

    public String getUserPassword(){
        return pref.getString(KEY_PASSWORD, "");
    }
}
