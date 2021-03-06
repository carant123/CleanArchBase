package com.example.ccruzado.cleanarquitecturebase.di.component;

import android.app.Application;
import android.content.Context;

import com.example.ccruzado.cleanarquitecturebase.StartApplication;
import com.example.ccruzado.cleanarquitecturebase.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ccruzado on 22/02/2018.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(StartApplication startApplication);

    Application getApplication();

    Context getContext();


}
