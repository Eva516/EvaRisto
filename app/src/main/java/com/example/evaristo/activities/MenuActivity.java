package com.example.evaristo.activities;

import android.os.Bundle;

import com.example.evaristo.R;
import com.example.evaristo.adapters.MenuAdapter;
import com.example.evaristo.models.Menu;
import com.example.evaristo.repositories.MenuRepository;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.gson.Gson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.StrictMode;
import android.view.View;
import android.widget.ListView;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MenuActivity extends AppCompatActivity {

    private MenuRepository menuRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        menuRepository = new MenuRepository();

        StrictMode.ThreadPolicy policy =
                new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ListView listView = findViewById(R.id.menu_list);
        listView.setNestedScrollingEnabled(true);

        MenuAdapter menuAdapter = new MenuAdapter(this, new ArrayList<Menu>());
        listView.setAdapter(menuAdapter);

        try {
            Menu[] menus = menuRepository.loadMenu();
            menuAdapter.addAll(menus);
            menuAdapter.notifyDataSetInvalidated();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
