package com.vaibhavmojidra.dagger2singletonjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject SmartPhone smartPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((SmartPhoneApplication)getApplication())
                .smartPhoneComponent
                .inject(this);

        smartPhone.startCallRecording();
    }
}