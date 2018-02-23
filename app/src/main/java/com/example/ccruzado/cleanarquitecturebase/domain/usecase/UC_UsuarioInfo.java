package com.example.ccruzado.cleanarquitecturebase.domain.usecase;

import com.example.ccruzado.cleanarquitecturebase.data.Repository;
import com.example.ccruzado.cleanarquitecturebase.domain.model.Usuario;
import com.example.ccruzado.cleanarquitecturebase.domain.usecase.base.UseCase;

import javax.inject.Inject;
import javax.inject.Named;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

/**
 * Created by ccruzado on 22/02/2018.
 */

public class UC_UsuarioInfo extends UseCase<Usuario> {

    private final Repository repository;
    private int id;


    @Inject public UC_UsuarioInfo(@Named("executor_thread")Scheduler executorThread,
                                  @Named("ui_thread") Scheduler uiThread,
                                  Repository repository) {
        super(executorThread, uiThread);
        this.repository = repository;
    }

    public void setIdValue(int id) {
        this.id = id;
    }

    @Override
    protected Observable<Usuario> createObservableUseCase() {
        return this.repository.user(id);
    }


}
