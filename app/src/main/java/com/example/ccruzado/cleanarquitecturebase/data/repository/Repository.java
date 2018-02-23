package com.example.ccruzado.cleanarquitecturebase.data.repository;

import com.example.ccruzado.cleanarquitecturebase.data.model.UsuarioEntity;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by ccruzado on 22/02/2018.
 */

public interface Repository {

    Observable<List<UsuarioEntity>> userList();

    Observable<UsuarioEntity> user(final int id);
}
