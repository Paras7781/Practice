package com.ui.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class PizzaPage implements Runnable {

    @Override
    public void run() {

        // Title
        Text title = new Text("Cheese Pizza");
        title.setFont(new Font("Arial", 28));

        // Pizza Image
        Image image = new Image("file:images/pizza.png");
        ImageView imageView = new ImageView(image);

        imageView.setFitWidth(220);
        imageView.setFitHeight(220);

        // Price
        Text price = new Text("Price : ₹299");
        price.setFont(new Font("Arial", 20));

        // Buttons
        Button toppingsButton = new Button("View Toppings");
        toppingsButton.setPrefWidth(180);
        toppingsButton.setPrefHeight(40);

        Button backButton = new Button("Back");
        backButton.setPrefWidth(180);
        backButton.setPrefHeight(40);

        // Toppings Button Action
        toppingsButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                Toppings toppingPage = new Toppings();
                toppingPage.run();

            }

        });

        // Back Button Action
        backButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                Homepage home = new Homepage();

                try {
                    home.start(Homepage.homeStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        });

        // Layout
        VBox root = new VBox();

        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);

        root.getChildren().add(title);
        root.getChildren().add(imageView);
        root.getChildren().add(price);
        root.getChildren().add(toppingsButton);
        root.getChildren().add(backButton);

        // Scene
        Scene scene = new Scene(root, 700, 500);

        Homepage.homeStage.setScene(scene);

    }

}