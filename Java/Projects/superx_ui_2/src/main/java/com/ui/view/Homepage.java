package com.ui.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Homepage extends Application {

    @Override
    public void start(Stage stage) {

        stage.setTitle("Homepage");
        stage.setScene(getScene());
        stage.show();
    }

    public Scene getScene() {

        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color:white;");

        VBox container = new VBox(30);
        container.setPadding(new Insets(35));

        //-----------------------------------------------------
        // Title
        //-----------------------------------------------------

        Label title = new Label("Programming Languages & Frameworks");
        title.setFont(Font.font("Segoe UI", FontWeight.BOLD, 42));
        title.setTextFill(Color.web("#173A63"));

        //-----------------------------------------------------
        // Outer Card
        //-----------------------------------------------------

        VBox card = new VBox(25);
        card.setPadding(new Insets(25));

        card.setStyle(
                "-fx-background-color:white;" +
                "-fx-border-color:#E6E6E6;" +
                "-fx-border-radius:15;" +
                "-fx-background-radius:15;"
        );

        //-----------------------------------------------------
        // Header
        //-----------------------------------------------------

        GridPane header = new GridPane();
        header.setHgap(25);

        ColumnConstraints c1 = new ColumnConstraints();
        c1.setPercentWidth(50);

        ColumnConstraints c2 = new ColumnConstraints();
        c2.setPercentWidth(50);

        header.getColumnConstraints().addAll(c1, c2);

        Label lang = new Label("Language");
        lang.setFont(Font.font("Segoe UI", FontWeight.BOLD, 28));

        Label frame = new Label("Framework");
        frame.setFont(Font.font("Segoe UI", FontWeight.BOLD, 28));

        header.add(lang, 0, 0);
        header.add(frame, 1, 0);

        GridPane.setHalignment(frame, javafx.geometry.HPos.CENTER);
        GridPane.setHalignment(lang, javafx.geometry.HPos.CENTER);

        //-----------------------------------------------------
        // Rows
        //-----------------------------------------------------

        VBox rows = new VBox(18);

        String[][] data = {
                {"java.png", "Java", "spring-boot.png", "Spring Boot"},
                {"python.png", "Python", "django.png", "Django"},
                {"js.png", "JavaScript", "react.png", "React"},
                {"Csharp.png", "C#", "Net.png", ".NET"}
        };

        for (String[] r : data) {
            rows.getChildren().add(createRow(r[0], r[1], r[2], r[3]));
        }

        card.getChildren().addAll(header, rows);

        container.getChildren().addAll(title, card);

        root.setCenter(container);

        return new Scene(root, 1280, 820);
    }

    //========================================================

    private GridPane createRow(String leftImg,
                               String leftText,
                               String rightImg,
                               String rightText) {

        GridPane row = new GridPane();
        row.setHgap(25);

        ColumnConstraints c1 = new ColumnConstraints();
        c1.setPercentWidth(50);

        ColumnConstraints c2 = new ColumnConstraints();
        c2.setPercentWidth(50);

        row.getColumnConstraints().addAll(c1, c2);

        HBox left = createBox(leftImg, leftText);
        HBox right = createBox(rightImg, rightText);

        row.add(left, 0, 0);
        row.add(right, 1, 0);

        return row;
    }

    //========================================================

    private HBox createBox(String imageName, String text) {

        Image image = new Image(getClass().getResourceAsStream("/images/" + imageName));

        ImageView imageView = new ImageView(image);

        imageView.setFitWidth(72);
        imageView.setFitHeight(72);
        imageView.setPreserveRatio(true);

        Label label = new Label(text);
        label.setFont(Font.font("Segoe UI", FontWeight.SEMI_BOLD, 23));

        HBox box = new HBox(28);

        box.setAlignment(Pos.CENTER_LEFT);

        box.setPadding(new Insets(20));

        box.setPrefHeight(110);

        box.setMaxWidth(Double.MAX_VALUE);

        GridPane.setHgrow(box, Priority.ALWAYS);

        box.setStyle(
                "-fx-background-color:white;" +
                "-fx-border-color:#E5E5E5;" +
                "-fx-border-radius:12;" +
                "-fx-background-radius:12;"
        );

        box.getChildren().addAll(imageView, label);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}