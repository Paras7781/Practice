package com.ui.view;

import javafx.application.Application;
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
import javafx.stage.Stage;

public class Homepage extends Application {

    public static Stage homeStage;

    @Override
    public void start(Stage stage) {

        homeStage = stage;

        // Heading
        Text title = new Text("Welcome To Food App");
        title.setFont(new Font("Arial", 30));

        // Pizza Image
        Image image = new Image("file:images/pizza.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);

        // Pizza Button
        Button pizzaButton = new Button("Pizza");
        pizzaButton.setPrefWidth(180);
        pizzaButton.setPrefHeight(40);

        pizzaButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                PizzaPage pizza = new PizzaPage();
                pizza.run();

            }

        });

        // Layout
        VBox root = new VBox();

        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);

        root.getChildren().add(title);
        root.getChildren().add(imageView);
        root.getChildren().add(pizzaButton);

        // Scene
        Scene scene = new Scene(root, 700, 500);

        stage.setTitle("Food Ordering App");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}