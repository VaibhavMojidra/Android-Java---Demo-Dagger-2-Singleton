package com.vaibhavmojidra.dagger2singletonjava;

import android.app.Application;

public class SmartPhoneApplication extends Application {
    SmartPhoneComponent smartPhoneComponent;
    @Override
    public void onCreate() {
        smartPhoneComponent=initDagger();
        super.onCreate();
    }
    SmartPhoneComponent initDagger(){
       return DaggerSmartPhoneComponent.create();
    }
}
