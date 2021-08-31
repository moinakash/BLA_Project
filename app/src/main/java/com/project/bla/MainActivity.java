package com.project.bla;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new Fragment2()).commit();


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.id1:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment2()).commit();
                break;
            case R.id.id2:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment1()).commit();
                break;
            case R.id.id3:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment2()).commit();
                break;
            case R.id.id4:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment1()).commit();
                break;
            case R.id.id5:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment2()).commit();
                break;
            case R.id.id6:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment1()).commit();
                break;
            case R.id.id7:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment2()).commit();
                break;
            case R.id.id8:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment1()).commit();
                break;
            case R.id.id9:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment2()).commit();
                break;
            case R.id.id10:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment1()).commit();
                break;
            case R.id.id11:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment2()).commit();
                break;
            case R.id.id12:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment1()).commit();
                break;
            case R.id.id13:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment2()).commit();
                break;
            case R.id.id14:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Fragment1()).commit();
                break;

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

}