package com.example.bd.Database;

import com.example.bd.Entities.Asignatura;
import com.example.bd.Interfaces.AsignaturaDao;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database (entities = {Asignatura.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AsignaturaDao asignaturaDao();

    private static  AppDatabase sInstace;
}
