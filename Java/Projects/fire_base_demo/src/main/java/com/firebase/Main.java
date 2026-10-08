package com.firebase;
import javafx.application.Application;
import com.firebase.view.Homepage;

public class Main {
    public static void main(String[] args) {
        try{
            Class.forName("com.firebase.config.Firebaseconfig");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        Application.launch(Homepage.class,args);
    }
}