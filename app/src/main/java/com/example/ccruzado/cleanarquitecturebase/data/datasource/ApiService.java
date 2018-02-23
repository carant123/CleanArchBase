package com.example.ccruzado.cleanarquitecturebase.data.datasource;

import com.example.ccruzado.cleanarquitecturebase.domain.model.Usuario;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by ccruzado on 22/02/2018.
 */

public interface ApiService {

    @GET("rest/v2/region/Americas")
    Observable<Usuario> UsuarioInfo();

    @GET("rest/v2/region/Americas")
    Observable<List<Usuario>> ListaUsuario();

}
