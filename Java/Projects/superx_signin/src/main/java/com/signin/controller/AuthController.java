package com.signin.controller;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.*;

public class AuthController {
    private String API_KEY = "AIzaSyD6ZPPmwPJyhmqUSG_0N5gkDSLBTDYtyzE";

    public boolean signUp(String email, String password) {
        JSONObject payload = new JSONObject()
            .put("email", email)
            .put("password", password);

        try {
            HttpClient client = HttpClient.newHttpClient();

            URI uri = URI.create("https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=" + API_KEY);

            HttpRequest req = HttpRequest.newBuilder()
                .uri(uri)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(payload.toString()))
                .build();

            HttpResponse<String> response = client.send(req, HttpResponse.BodyHandlers.ofString());

            System.out.println(response);
            System.out.println(response.statusCode());
            System.out.println(response.body());

            if (response.statusCode() >= 200) {
                JSONObject jsonResponse = new JSONObject(response.body());
                return jsonResponse.has("idToken");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean signin(String email, String password) {
        JSONObject payload = new JSONObject()
            .put("email", email)
            .put("password", password);

        try {
            HttpClient client = HttpClient.newHttpClient();

            URI uri = URI.create("https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=" + API_KEY);

            HttpRequest req = HttpRequest.newBuilder()
                .uri(uri)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(payload.toString()))
                .build();

            HttpResponse<String> response = client.send(req, HttpResponse.BodyHandlers.ofString());

            System.out.println(response);
            System.out.println(response.statusCode());
            System.out.println(response.body());

            if (response.statusCode() >= 200) {
                JSONObject jsonResponse = new JSONObject(response.body());
                return jsonResponse.has("idToken");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return false;
    }
}
