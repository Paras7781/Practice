package com.signin.view;
import com.signin.controller.AuthController;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Homepage extends Application {

    public static Stage Homestage;
    private Scene homeScene;
    @Override
    public void start(Stage primaryStage) {
        Homestage=primaryStage;
        TextField email=new TextField();
        email.setPromptText("enter email");
        TextField password=new TextField();
        password.setPromptText("enter password");

        Button signup=new Button("Sign up");
        Text output=new Text();

        AuthController controller=new AuthController();

        signup.setOnAction(e ->{
            boolean flag=controller.signUp(email.getText(),password.getText());
            if(flag){
                System.out.println("Sign up successfully");
                output.setText("Sign up successfully");
                
            }
            else{
                System.out.println("Sign up failed");
                output.setText("Sign up failed");
            }
        });
        
        PizzaPage pizzaPage = new PizzaPage();
        Runnable callbackAction = new Runnable() {

            @Override
            public void run() {
                backToHomePage();
            }

        };               
        Button signin =new Button("Sign in");
        signin.setOnAction(e ->{
            boolean flag=controller.signin(email.getText(),password.getText());
            if(flag){
                System.out.println("Sign in successfully");
                output.setText("Sign in successfully");
                Homestage.setScene(
                    pizzaPage.getPizzaScene(callbackAction)
                );
            }
            else{
                System.out.println("Sign in failed");
                output.setText("Sign in failed");
            }
        });

        VBox rott=new VBox(20);
        rott.getChildren().addAll(
            email,
            password,
            signup,
            signin,
            output
        );
        homeScene = new Scene(rott,700,500);
        primaryStage.setScene(homeScene);
        primaryStage.show();
    }
    public void backToHomePage(){
        Homestage.setScene(homeScene);
    }
}