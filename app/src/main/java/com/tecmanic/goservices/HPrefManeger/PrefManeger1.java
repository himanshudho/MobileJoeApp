package com.tecmanic.goservices.HPrefManeger;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.HashMap;

public class PrefManeger1 {
    // Shared Preferences
    SharedPreferences pref;
    // Editor for Shared preferences
    SharedPreferences.Editor editor;
    // Context
    Context _context;
    // Shared pref mode
    int PRIVATE_MODE = 0;
    // Shared preferences file name
    private static final String PREF_NAME = "SaonVendor";
    // All Shared Preferences Keys
    private static final String KEY_IS_LOGGED_IN = "isLoggedIn";

    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_MOBILE = "mobile";

    private  static  final  String KEY_ABOUTME="aboutme";
    private static final String KEY_ADDRESS="address";
    private static final String KEY_GENDER="gender";
    private static final String KEY_CITY="city";


    private  static  final String OWNER_NAME="owner_name";
    private static  final String MOBILE="mobile";


    public void stepFirst(String owner_name,String mobile) {
        editor.putString(OWNER_NAME,owner_name);
        editor.putString(MOBILE,mobile);

        editor.commit();
    }

    public HashMap<String, String> getStepFirst()
    {
        HashMap<String, String> updateProfile = new HashMap<>();
        updateProfile.put("owner_name", pref.getString(OWNER_NAME, null));
        updateProfile.put("mobile", pref.getString(MOBILE, null));
        return updateProfile;

    }


    private  static  final String RNAME="name";
    private static  final String REMAIL="email";
    private  static  final String RCITY="city";
    private static  final String RPASSWORD="password";
    private static  final String RMOBILE="mobile";
    private  static  final String RID="id";




    public void stepRagistration(String name, String mobile, String email, String city, String password, String id) {

        editor.putString(RNAME,name);
        editor.putString(REMAIL,email);
        editor.putString(RMOBILE,mobile);
        editor.putString(RCITY, city);
        editor.putString(RPASSWORD, password);
        editor.putString(RID,id);
        editor.commit();

    }

    public HashMap<String, String> getRagistration()

    {
        HashMap<String, String> updateProfile = new HashMap<>();
        updateProfile.put("name", pref.getString(RNAME, null));
        updateProfile.put("email", pref.getString(REMAIL, null));
        updateProfile.put("mobile", pref.getString(RMOBILE, null));
        updateProfile.put("password", pref.getString(RPASSWORD, null));
        updateProfile.put("id", pref.getString(RID, null));
        updateProfile.put("city", pref.getString(RCITY, null));
        return updateProfile;

    }

    private  static  final String LOCATION="location";

    public void stepthird(String location) {
        editor.putString(LOCATION, location);
        editor.commit();

    }

    public HashMap<String, String> getstepthird()
    {
        HashMap<String, String> updateProfile = new HashMap<>();
        updateProfile.put("location", pref.getString(LOCATION, null));
        return updateProfile;

    }

    private  static  final String IMAGE="image";
    public void setImage(ArrayList<String> image)
    {
        editor.putString(IMAGE, String.valueOf(image));
        editor.commit();
    }

    public HashMap<String, String> getImage()
    {
        HashMap<String, String> updateProfile = new HashMap<>();
        updateProfile.put("image", pref.getString(IMAGE, null));

        return updateProfile;

    }
    private  static  final String EXPERINCE="exp";




    public void setExperince(String exp) {

        editor.putString(EXPERINCE, exp);
        editor.commit();
    }

    public HashMap<String, String> getExperience()
    {

        HashMap<String, String> updateProfile = new HashMap<>();
        updateProfile.put("exp", pref.getString(EXPERINCE, null));
        return updateProfile;

    }

    private  static  final String ANMITIES="ani";




    public void setAnimities(ArrayList<String> ani) {

        editor.putString(ANMITIES, String.valueOf(ani));
        editor.commit();
    }

    public HashMap<String, String> getAnimities()
    {
        HashMap<String, String> updateProfile = new HashMap<>();
        updateProfile.put("ani", pref.getString(ANMITIES, null));

        return updateProfile;

    }

    private  static  final String PAYMENT="payment";




    public void setPayment(ArrayList<String> payment) {

        editor.putString(ANMITIES, String.valueOf(payment));
        editor.commit();
    }

    public HashMap<String, String> getPayment()
    {
        HashMap<String, String> updateProfile = new HashMap<>();
        updateProfile.put("payment", pref.getString(PAYMENT, null));

        return updateProfile;

    }
    private  static  final String ID="id";
    private  static  final String ETNAME="name";
    private  static  final String ETMOBE="mobile";
    private  static  final String ETEMAIL="email";
    private  static  final String ETGENER="gender";


    public void setNormalProfile(String name,String mobile,String email,String gender) {

        editor.putString(ETNAME, name);
        editor.putString(ETMOBE, mobile);
        editor.putString(ETEMAIL, email);
        editor.putString(ETGENER, gender);
        editor.commit();
    }

    public HashMap<String, String> getNormalProfile()

    {

        HashMap<String, String> updateProfile = new HashMap<>();
        updateProfile.put("name", pref.getString(ETNAME, null));
        updateProfile.put("mobile", pref.getString(ETMOBE, null));
        updateProfile.put("email", pref.getString(ETEMAIL, null));
        updateProfile.put("gender", pref.getString(ETGENER, null));
        return updateProfile;

    }





























    public PrefManeger1(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }
    public void loggedIn(){
        editor.putBoolean(KEY_IS_LOGGED_IN, true);
        editor.commit();
    }
    public void createLogin(String id,String name, String mobile) {
        editor.putString(KEY_ID, id);
        editor.putString(KEY_NAME, name);
        editor.putString(KEY_MOBILE, mobile);
        editor.putBoolean(KEY_IS_LOGGED_IN, true);
        editor.commit();
    }
    public HashMap<String, String> getUserDetails()
    {
        HashMap<String, String> profile = new HashMap<>();
        profile.put("id", pref.getString(KEY_ID, null));
        profile.put("name", pref.getString(KEY_NAME, null));
        profile.put("mobile", pref.getString(KEY_MOBILE, null));
        profile.put("aboutme", pref.getString(KEY_ABOUTME, null));
        profile.put("address",pref.getString(KEY_ADDRESS,null));
        profile.put("gender", pref.getString(KEY_GENDER, null));
        profile.put("city",pref.getString(KEY_CITY,null));
        return profile;
    }

    public boolean isLoggedIn() {
        return pref.getBoolean(KEY_IS_LOGGED_IN, false);
    }
    public void clearSession() {
        editor.clear();
        editor.commit();
    }
}

