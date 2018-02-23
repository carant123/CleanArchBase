package com.example.ccruzado.cleanarquitecturebase.data;

import com.example.ccruzado.cleanarquitecturebase.domain.model.Usuario;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by ccruzado on 22/02/2018.
 */

public interface Repository {

    Observable<List<Usuario>> userList();

    Observable<Usuario> user(final int id);
}
