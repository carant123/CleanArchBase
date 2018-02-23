package com.example.ccruzado.cleanarquitecturebase.data.Room;

import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by ccruzado on 23/02/2018.
 */

public interface Dao {
    @Query("SELECT * FROM usuario")
    public List<UsuarioEntity> GetUsuario();

//    @Query("SELECT * FROM usuario WHERE uid = :userId LIMIT 1")
//    public UsuarioEntity UsuarioInfo(int userId);

}
