package com.ui.view;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Homepage extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Homepage");
        Text text1 = new Text("Welcome to the Homepage!");
        Text text2 = new Text("This is a simple JavaFX application.");
        text1.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        text2.setStyle("-fx-font-size: 16px;");
        Image image = new Image("icons\\Sahaygram.jpeg");
        ImageView imgView = new ImageView(image);
        Label label = new Label("This is a label");
        VBox vbox = new VBox(10, text1, text2, imgView, label);
        Group root = new Group(vbox);
        Scene scene = new Scene(root, 800, 600);
        imgView.setFitWidth(400);
        imgView.setFitHeight(300);
        scene.setFill(Color.LIGHTBLUE);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(image);
        primaryStage.show();
    }
}
