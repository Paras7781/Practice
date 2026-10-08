package com.ui.view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class BurgerPage {

    private Scene burgerScene;

    public Scene getBurgerScene(Runnable callbackAction) {

        Text title = new Text("Burger Details");
        title.setFont(new Font("Arial",30));

        Text name = new Text("Name : Veg Burger");
        name.setFont(new Font("Arial",20));

        Text price = new Text("Price : ₹199");
        price.setFont(new Font("Arial",20));

        Button extrasButton = new Button("View Extras");
        extrasButton.setPrefWidth(180);
        extrasButton.setPrefHeight(40);

        Button backButton = new Button("Back");
        backButton.setPrefWidth(180);
        backButton.setPrefHeight(40);

        VBox root = new VBox();

        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);

        root.getChildren().addAll(
                title,
                name,
                price,
                extrasButton,
                backButton
        );

        burgerScene = new Scene(root,700,500);

        BurgerExtras extras = new BurgerExtras();

        Runnable backToBurger = new Runnable() {

            @Override
            public void run() {

                backToBurgerPage();

            }
        };

        extrasButton.setOnAction(event -> {
            Homepage.homeStage.setScene(
                    extras.getExtrasScene(backToBurger)
            );
        });

        backButton.setOnAction(event -> callbackAction.run());

        return burgerScene;
    }

    public void backToBurgerPage() {

        Homepage.homeStage.setScene(burgerScene);

    }

}