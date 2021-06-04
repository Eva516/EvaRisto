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
        list.add(new PiattoDto("A0123B50", "Riso e verza", "Riso con verdura", 10.0f, "Attivo ", "primo", true, true, false));
        list.add(new PiattoDto("A0123B51", "Fettuccine con la mollica", "Pasta in bianco con mollica di pane arrostita", 10.0f, "Attivo ", "primo", true, false, false));
        list.add(new PiattoDto("A0123B52", "Cavatelli al sugo di maiale", "Pasta con sugo di maiale", 10.0f, "Attivo ", "primo", false, false, false));
        list.add(new PiattoDto("A0123B53", "Tagliolini di Campobasso", "Sugo al pomodoro", 10.0f, "Attivo ", "primo", true, false, false));
        list.add(new PiattoDto("A0123B54", "Crioli con le noci", "Pasta con le noci", 10.0f, "Attivo ", "primo", true, false, false));
        list.add(new PiattoDto("A0123B55", "Spaghetti con le alici", "Pasta con pesce", 10.0f, "Attivo ", "primo", false, true, false));
        list.add(new PiattoDto("A0123B56", "Taccozze e fagioli", "Pasta all'uovo con fagioli", 10.0f, "Attivo ", "primo", true, false, false));
        list.add(new PiattoDto("A0123B57", "Segntell", "Pasta all'uovo", 10.0f, "Attivo ", "primo", true, false, false));
        list.add(new PiattoDto("A0123B58", "Fusilli al pomodoro", "Pasta all'uovo", 10.0f, "Attivo ", "primo", true, false, false));
        list.add(new PiattoDto("A0123B59", "Ciabotta", "zuppa di peperoni, uova, melanzane, zucchine", 10.0f, "Attivo ", "primo", true, false, false));
        list.add(new PiattoDto("A0123B60", "Triglie alla 'ngorda", "Triglie con mollica di pane", 20.0f, "Attivo ", "secondo", false, true, false));
        list.add(new PiattoDto("A0123B61", "Affunniatelle", "Peperoni e uova fritti", 10.0f, "Attivo ", "secondo", true, false, false));
        list.add(new PiattoDto("A0123B62", "Polpette di casce e ov", "Polpette con formaggio e uovo", 10.0f, "Attivo ", "secondo", true, false, false));
        list.add(new PiattoDto("A0123B63", "Baccalà arrecanato", "Baccalà al sugo", 10.0f, "Attivo ", "secondo", false, false, false));
        list.add(new PiattoDto("A0123B64", "Coda di rospo al limone", "Pescein guazzetto", 10.0f, "Attivo ", "secondo", false, false, false));
        list.add(new PiattoDto("A0123B65", "Coscia di agnello ripiena", "Carne di agnello ripiena con lardo di maiale", 10.0f, "Attivo ", "secondo", false, false, false));
        list.add(new PiattoDto("A0123B66", "coda di rospo al pomodoro", "Pesce al pomodoro", 10.0f, "Attivo ", "secondo", false, false, false));
        list.add(new PiattoDto("A0123B67", "Agnello e piselli", "Carne di agnello con piselli", 10.0f, "Attivo ", "secondo", false, false, false));
        list.add(new PiattoDto("A0123B68", "Trippa al sugo", "Carne al sugo", 10.0f, "Attivo ", "secondo", false, true, false));
        list.add(new PiattoDto("A0123B69", "Baccalà fritto", "Pesce con pastella", 10.0f, "Attivo ", "secondo", false, false, false));
        list.add(new PiattoDto("A0123B70", "Capra alla molisana", "Carne", 10.0f, "Attivo ", "secondo", false, false, false));
        list.add(new PiattoDto("A0123B66", "insalata verde", "Insalata di lattuga", 10.0f, "Attivo ", "contorno", true, true, false));
        list.add(new PiattoDto("A0123B67", "Insalata mista", "Insalata", 10.0f, "Attivo ", "contorno", true, true, false));
        list.add(new PiattoDto("A0123B68", "Insalata di tortoli", "Insalata", 10.0f, "Attivo ", "contorno", true, true, false));
        list.add(new PiattoDto("A0123B69", "Insalata di cetrioli", "Insalata", 10.0f, "Attivo ", "contorno", true, true, false));
        list.add(new PiattoDto("A0123B70", "Insalata di pomodorini gialli", "Insalata", 10.0f, "Attivo ", "contorno", true, true, false));


        com.example.evaristo.adapters.MenuAdapter.CustomAdapter adapter = new com.example.evaristo.adapters.MenuAdapter.CustomAdapter(this, R.layout.activity_menu, list);
        listViewMenu.setAdapter(adapter);

    }
}

