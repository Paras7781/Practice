package com.signin.view;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class PizzaPage {

    private Scene pizzaScene;

    public Scene getPizzaScene(Runnable callbackAction) {

        Text title = new Text("Cheese Pizza");
        title.setFont(new Font("Arial",30));

        Text price = new Text("Price : ₹299");
        price.setFont(new Font("Arial",20));

        Button backButton = new Button("Back");
        backButton.setPrefWidth(180);
        backButton.setPrefHeight(40);

        VBox root = new VBox();

        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);

        root.getChildren().add(title);
        root.getChildren().add(price);
        root.getChildren().add(backButton);

        pizzaScene = new Scene(root,700,500);

        backButton.setOnAction(event -> callbackAction.run());

        return pizzaScene;
    }

}