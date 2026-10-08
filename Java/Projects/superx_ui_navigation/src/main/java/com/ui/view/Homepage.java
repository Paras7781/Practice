package com.ui.view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Homepage extends Application {

    public static Stage homeStage;
    private Scene homeScene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        homeStage = stage;

        Text title = new Text("Welcome To Food App");
        title.setFont(new Font("Arial",30));

        Button pizzaButton = new Button("Pizza");
        pizzaButton.setPrefSize(180, 40);

        Button burgerButton = new Button("Burger");
        burgerButton.setPrefSize(180, 40);
        

        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);

        root.getChildren().addAll(
        title,
        pizzaButton,
        burgerButton
        );

        homeScene = new Scene(root,700,500);

        PizzaPage pizzaPage = new PizzaPage();
        BurgerPage burgerPage = new BurgerPage();
        Runnable callbackAction = new Runnable() {

            @Override
            public void run() {

                backToHomePage();

            }

        };

        pizzaButton.setOnAction(event -> {
            homeStage.setScene(
                pizzaPage.getPizzaScene(callbackAction)
            );
        });
        burgerButton.setOnAction(event -> {
            homeStage.setScene(
                burgerPage.getBurgerScene(callbackAction)
            );
        });

        stage.setTitle("Food App");
        stage.setScene(homeScene);
        stage.show();

    }

    public void backToHomePage() {

        homeStage.setScene(homeScene);

    }

}