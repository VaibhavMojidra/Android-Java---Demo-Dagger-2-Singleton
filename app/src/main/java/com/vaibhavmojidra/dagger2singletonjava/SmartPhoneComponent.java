package com.vaibhavmojidra.dagger2singletonjava;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component
public interface SmartPhoneComponent {
    void inject(MainActivity mainActivity);
}
