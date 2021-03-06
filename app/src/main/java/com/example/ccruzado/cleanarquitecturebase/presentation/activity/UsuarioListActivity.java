package com.example.ccruzado.cleanarquitecturebase.presentation.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.ccruzado.cleanarquitecturebase.R;
import com.example.ccruzado.cleanarquitecturebase.StartApplication;
import com.example.ccruzado.cleanarquitecturebase.domain.model.Usuario;
import com.example.ccruzado.cleanarquitecturebase.presentation.base.BaseActivity;
import com.example.ccruzado.cleanarquitecturebase.presentation.presenter.UsuarioListPresenter;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by ccruzado on 22/02/2018.
 */

public class UsuarioListActivity extends BaseActivity implements UsuarioListPresenter.View {

    @Inject UsuarioListPresenter presenter;
    @BindView(R.id.rvUsuarios) RecyclerView usuarioList;
    //private TeamsAdapter adapter;
    private static final String TAG = UsuarioListActivity.class.getSimpleName();

    @Override
    protected void init() {
        presenter.setView(this);
        disableTitleFromToolbar();
        initializeRecyclerView();
        initializeAdapter();
        presenter.initialize();
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        presenter.destroy();
    }


    @Override
    protected int getLayoutId() {
        return R.layout.main_layout;
    }

    private void disableTitleFromToolbar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
    }


    @Override
    public void showLoading() {
        Log.i(TAG, "showing loader");
        usuarioList.setVisibility(View.GONE);
    }

    @Override
    public void hideLoading() {
        Log.i(TAG, "hiding loader");
        usuarioList.setVisibility(View.VISIBLE);
    }

    private void initializeAdapter() {
        //adapter = new TeamsAdapter(presenter);
    }

    private void initializeRecyclerView() {
        usuarioList.setLayoutManager(new LinearLayoutManager(this));
        usuarioList.addItemDecoration(new android.support.v7.widget.DividerItemDecoration(this,
                android.support.v7.widget.DividerItemDecoration.VERTICAL));
        usuarioList.setHasFixedSize(true);
        //usuarioList.setAdapter(adapter);
    }

    @Override
    public void MuestraListaUsuarios(List<Usuario> userList) {

    }

    @Override
    public void SeleccionUsuario(Usuario user) {

    }
}
