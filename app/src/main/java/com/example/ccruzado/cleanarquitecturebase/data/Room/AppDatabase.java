package com.example.ccruzado.cleanarquitecturebase.data.Room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by ccruzado on 23/02/2018.
 */

@Database(entities = {UsuarioEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract Dao databaseDao();
}
