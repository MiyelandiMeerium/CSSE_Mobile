package com.example.myapplication.activity;

public class ActivityTestRule<MainActivity> {

    public ActivityTestRule(Class<MainActivity> mainActivityClass) {
    }

    public com.example.myapplication.activity.MainActivity getActivity() {
        return null;
    }
}
