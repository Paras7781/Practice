package com.ui.view;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Toppings {

    private Scene toppingsScene;

    public Scene getToppingsScene(Runnable callbackAction) {

        Text title = new Text("Pizza Toppings");
        title.setFont(new Font("Arial", 30));

        Text cheese = new Text("Extra Cheese");
        Text onion = new Text("Onion");
        Text tomato = new Text("Tomato");
        Text mushroom = new Text("Mushroom");
        Text olives = new Text("Olives");

        Button backButton = new Button("Back");
        backButton.setPrefWidth(180);
        backButton.setPrefHeight(40);

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

        toppingsScene = new Scene(root, 700, 500);

        backButton.setOnAction(event -> callbackAction.run());

        return toppingsScene;
    }

}