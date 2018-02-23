package com.example.ccruzado.cleanarquitecturebase.data.Room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created by ccruzado on 23/02/2018.
 */

@Entity(tableName = "usuario")
public class UsuarioEntity implements Serializable {

    @ColumnInfo(name = "nombre")
    private String nombre;

    @ColumnInfo(name = "apellido")
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}