package com.ui.view;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
public class Homepage extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Red", "Green", "Blue", "Yellow", "Orange");
        Label label = new Label();
        label.setTextFill(Color.WHITE);
        label.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        HBox color= new HBox(label);
        color.setAlignment(Pos.CENTER);
        root.setCenter(color);
        root.setLeft(listView);
        listView.setOnMouseClicked(event -> {
            String selectedColor = listView.getSelectionModel().getSelectedItem();
                if (selectedColor.equals("Red")) {
                    label.setText("Red");
                    color.setStyle("-fx-background-color: red;");
                } else if (selectedColor.equals("Green")) {
                    label.setText("Green");
                    color.setStyle("-fx-background-color: green;");
                } else if (selectedColor.equals("Blue")) {
                    label.setText("Blue");
                    color.setStyle("-fx-background-color: blue;");
                } else if (selectedColor.equals("Yellow")) {
                    label.setText("Yellow");
                    color.setStyle("-fx-background-color: yellow;");
                } else if (selectedColor.equals("Orange")) {
                    label.setText("Orange");
                    color.setStyle("-fx-background-color: orange;");
                }
        });
        Scene sc=new Scene(root, 1500, 800);
        primaryStage.setTitle("Homepage");
        primaryStage.setScene(sc);
        primaryStage.show();
    }
    
}
