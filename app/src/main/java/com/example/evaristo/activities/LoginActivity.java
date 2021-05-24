package com.example.evaristo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.evaristo.R;
import com.example.evaristo.repositories.MenuRepository;
import com.google.android.material.snackbar.Snackbar;

import org.json.JSONException;

import java.io.IOException;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StrictMode.ThreadPolicy policy =
                new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final TextView username = findViewById(R.id.username);
        final TextView password = findViewById(R.id.username);

        Button loginButton = findViewById(R.id.button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

                MenuRepository menuRepository = new MenuRepository();

                try {
                    String token = menuRepository.login(username.getText().toString(), password.getText().toString());
                    Log.d("EvaRisto", token);

                    MenuRepository.TOKEN = token;

                    Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();

                    View parentLayout = findViewById(android.R.id.content);
                    Snackbar.make(parentLayout, "Credenziali errate", Snackbar.LENGTH_LONG)
                            .show();
                }
            }
        });
    }
}