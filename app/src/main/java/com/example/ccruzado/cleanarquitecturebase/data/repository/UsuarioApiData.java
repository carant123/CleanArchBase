package com.example.ccruzado.cleanarquitecturebase.data.repository;

import com.example.ccruzado.cleanarquitecturebase.StartApplication;
import com.example.ccruzado.cleanarquitecturebase.data.api.ApiService;
import com.example.ccruzado.cleanarquitecturebase.data.model.UsuarioEntity;
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
        DaggerActivityComponent.builder()
                .appComponent(StartApplication.getAppComponent())
                .build().inject(this);
    }

    @Override
    public Observable<List<UsuarioEntity>> userList() {
        return apiservice.ListaUsuario();
    }

    @Override
    public Observable<UsuarioEntity> user(int id) {
        return apiservice.UsuarioInfo(id);
    }
}
