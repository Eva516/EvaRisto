package com.example.evaristo.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.evaristo.R;
import com.example.evaristo.adapters.MenuAdapter;
import com.example.evaristo.dto.PiattoDto;
import com.example.evaristo.models.Menu;
import com.example.evaristo.repositories.MenuRepository;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.StrictMode;
import android.view.View;
import android.widget.ListView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    public String id;
    public String nome;
    public String descrizione;
    public int prezzo;
    public String stato;
    public String tipo;
    public String vegetariano;
    public String vegano;
    public String allergeni;


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



        @SuppressLint("RestrictedApi")
        MenuAdapter menuAdapter = new MenuAdapter(this, new ArrayList<Menu>());
        listView.setAdapter(menuAdapter);

        try {
            Menu[] menus = menuRepository.loadMenu();
            menuAdapter.addAll(menus);
            menuAdapter.notifyDataSetInvalidated();
        } catch (IOException e) {
            e.printStackTrace();
        }

        setContentView(R.layout.activity_main);

        ListView listViewMenu = findViewById(R.id.activity_menu);

        List<PiattoDto> list = new LinkedList<PiattoDto>();
        list.add(new PiattoDto ());
        list.add(new PiattoDto ());
        list.add(new PiattoDto ());

        com.example.evaristo.adapters.MenuAdapter.CustomAdapter adapter = new com.example.evaristo.adapters.MenuAdapter.CustomAdapter(this, R.layout.activity_menu, list);
        listViewMenu.setAdapter(adapter);

    }

    public MenuActivity(String Id, String Nome,String Descrizione, int Prezzo, String Stato, String Tipo, String Vegetariano, String Vegano, String Allergeni) {

        this.id = Id;
        this.nome = Nome;
        this.descrizione = Descrizione;
        this.prezzo = Prezzo;
        this.stato = Stato;
        this.tipo = Tipo;
        this.vegetariano = Vegetariano;
        this.vegano = Vegano;
        this.allergeni = Allergeni;


        /*public String mId;
        public String mNome;
        public String mDescrizione;
        public int mPrezzo;
        public String mStato;
        public String mTipo;
        public String mVegetariano;
        public String mVegano;
        public String mAllergeni; */

    }
}
