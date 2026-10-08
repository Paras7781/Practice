package com.ui.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Toppings implements Runnable {

    @Override
    public void run() {

        // Title
        Text title = new Text("Pizza Toppings");
        title.setFont(new Font("Arial", 28));

        // Check Boxes
        CheckBox cheese = new CheckBox("Extra Cheese");
        CheckBox onion = new CheckBox("Onion");
        CheckBox tomato = new CheckBox("Tomato");
        CheckBox mushroom = new CheckBox("Mushroom");
        CheckBox olives = new CheckBox("Olives");

        // Back Button
        Button backButton = new Button("Back");
        backButton.setPrefWidth(180);
        backButton.setPrefHeight(40);

        backButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                PizzaPage pizza = new PizzaPage();
                pizza.run();

            }

        });

        // Layout
        VBox root = new VBox();

        root.setAlignment(Pos.CENTER);
        root.setSpacing(15);

        root.getChildren().add(title);
        root.getChildren().add(cheese);
        root.getChildren().add(onion);
        root.getChildren().add(tomato);
        root.getChildren().add(mushroom);
        root.getChildren().add(olives);
        root.getChildren().add(backButton);

        // Scene
        Scene scene = new Scene(root, 700, 500);

        Homepage.homeStage.setScene(scene);

    }

}