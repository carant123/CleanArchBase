package com.example.ccruzado.cleanarquitecturebase.data;

import com.example.ccruzado.cleanarquitecturebase.StartApplication;
import com.example.ccruzado.cleanarquitecturebase.data.datasource.ApiService;
import com.example.ccruzado.cleanarquitecturebase.di.component.AppComponent;
import com.example.ccruzado.cleanarquitecturebase.di.component.DaggerActivityComponent;
import com.example.ccruzado.cleanarquitecturebase.domain.model.Usuario;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by ccruzado on 23/02/2018.
 */

public class UsuarioApiData implements Repository {

    @Inject
    ApiService apiservice;

    public UsuarioApiData() {
/*        DaggerActivityComponent.builder()
                .appComponent(StartApplication.getAppComponent())
                .build().inject(this);*/
    }

    @Override
    public Observable<List<Usuario>> userList() {
        return null;
    }

    @Override
    public Observable<Usuario> user(int id) {
        return null;
    }
}
