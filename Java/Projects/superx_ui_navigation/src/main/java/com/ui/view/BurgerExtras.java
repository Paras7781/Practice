package com.ui.view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class BurgerExtras {

    private Scene extrasScene;

    public Scene getExtrasScene(Runnable callbackAction) {

        Text title = new Text("Burger Extras");
        title.setFont(new Font("Arial",30));

        Text fries = new Text("French Fries");
        Text cheese = new Text("Cheese Slice");
        Text drink = new Text("Cold Drink");
        Text sauce = new Text("Tomato Sauce");

        Button backButton = new Button("Back");
        backButton.setPrefWidth(180);
        backButton.setPrefHeight(40);

        VBox root = new VBox();

        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);

        root.getChildren().addAll(
                title,
                fries,
                cheese,
                drink,
                sauce,
                backButton
        );

        extrasScene = new Scene(root,700,500);

        backButton.setOnAction(event -> callbackAction.run());

        return extrasScene;
    }

}