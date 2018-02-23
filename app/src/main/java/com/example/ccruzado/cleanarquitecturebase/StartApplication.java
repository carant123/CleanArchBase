package com.example.ccruzado.cleanarquitecturebase;

import android.app.Application;

import com.example.ccruzado.cleanarquitecturebase.di.component.AppComponent;
import com.example.ccruzado.cleanarquitecturebase.di.component.DaggerAppComponent;
import com.example.ccruzado.cleanarquitecturebase.di.module.AppModule;

/**
 * Created by ccruzado on 22/02/2018.
 */

public class StartApplication extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        appComponent.inject(this);

    }

    public static AppComponent getAppComponent(){
        return appComponent;
    }



}
