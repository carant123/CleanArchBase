package com.example.ccruzado.cleanarquitecturebase.di.component;

import com.example.ccruzado.cleanarquitecturebase.data.datasource.ApiService;
import com.example.ccruzado.cleanarquitecturebase.di.PerActivityScope;
import com.example.ccruzado.cleanarquitecturebase.di.module.NetModule;
import com.example.ccruzado.cleanarquitecturebase.presentation.activity.UsuarioListActivity;

import dagger.Component;

/**
 * Created by ccruzado on 22/02/2018.
 */

@PerActivityScope
@Component(dependencies = AppComponent.class, modules = { NetModule.class})
public interface ActivityComponent {

    void inject(UsuarioListActivity activity);


    // todo lo que se expone a los modulos
    // tiene como dependencia el aplication componente

    ApiService getApiService();

}