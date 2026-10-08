package com.api.Controller;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class ActivityController {
    public String getActivity(){
        try {
            HttpClient client=HttpClient.newHttpClient();
            URI uri=URI.create("https://bored-api.appbrewery.com/random");
            HttpRequest request=HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();
            System.out.println(request);
            HttpResponse<String> response=client.send(request,HttpResponse.BodyHandlers.ofString());

            System.out.println(response);
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getOrigin(String name){
        try{
            HttpClient client=HttpClient.newHttpClient();
            URI uri=URI.create("https://api.nationalize.io/?name="+name);
            HttpRequest request=HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();
            System.out.println(request);
            HttpResponse<String> response=client.send(request,HttpResponse.BodyHandlers.ofString());

            System.out.println(response);
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        }
    }
