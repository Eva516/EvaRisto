package com.example.evaristo.repositories;

import android.view.Menu;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ClienteRepository {

    public static String TOKEN = "";

    private final OkHttpClient mClient;
    private final String HOST = "https://risto-eva-test.herokuapp.com";
    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    public ClienteRepository() {
        mClient = new OkHttpClient();
    }

    public String login(String username, String password) throws IOException, JSONException {
        RequestBody body = RequestBody.create("{\"username\":\"" + username + "\",\"password\":\"" + password + "\"}", JSON);
        Request request = new Request.Builder()
                .url(HOST + "/api/v1/login").post(body)
                .build();

        Response response = this.mClient.newCall(request).execute();
        String json = response.body().string();

        JSONObject jsonObject = new JSONObject(json);
        return jsonObject.getString("token");
    }

    public Menu[] loadCliente() throws IOException {
        Response response = this.mClient.newCall(this.buildRequest("/api/v1/cliente")).execute();
        String json = response.body().string();
        Gson gson = new Gson();
        return gson.fromJson(json, Menu[].class);
    }

    private Request buildRequest(String path) {
        return new Request.Builder()
                .url(HOST + path)
                .addHeader("Authorization", "Bearer " + TOKEN)
                .build();
    }
}
