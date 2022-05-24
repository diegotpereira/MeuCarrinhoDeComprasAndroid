package br.com.meucarrinhodecomprasandroid.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import br.com.meucarrinhodecomprasandroid.R;

public class PaginaPrincipalActivity extends AppCompatActivity implements NavigationView
        .OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);

        drawer = findViewById(R.id.draw_layout);
        navigationView = findViewById(R.id.nav_view);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}