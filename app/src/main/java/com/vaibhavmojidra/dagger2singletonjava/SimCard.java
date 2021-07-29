package com.vaibhavmojidra.dagger2singletonjava;

import android.util.Log;

import javax.inject.Inject;

public class SimCard {
    private ServiceProvider serviceProvider;

    @Inject
    public SimCard(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
        Log.i("MyInfo","ServiceProvider initialized via constructor");
    }

    protected void getConnected(){
        serviceProvider.getServiceProvider();
        Log.i("MyInfo","Got connected to network");
    }
}
