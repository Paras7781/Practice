package com.firebase.view;
import com.firebase.controller.ImageUploadController;
import com.firebase.controller.PlayerController;
import com.firebase.model.Player;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Homepage extends Application {
        String url;

    @Override
    public void start(Stage stage) {

        Image profImage = new Image("file:src/main/resources/images/Mahi.jpg");
        ImageView proImageView = new ImageView(profImage);
        proImageView.setFitHeight(100);
        proImageView.setPreserveRatio(true);

        Button chooseFile=new Button("Choose File");
        chooseFile.setOnAction(e ->{
            FileChooser fileChooser=new FileChooser();
            fileChooser.setTitle("select a file");
            ImageUploadController imageUploadController=new ImageUploadController();
            File file=fileChooser.showOpenDialog(stage);

            if(file!=null){
                System.out.println("selected file :"+file.getAbsolutePath());
                url=imageUploadController.imageUpload(file);
                proImageView.setImage(new Image(url));
            }
        });

        TextField txtName = new TextField();
        txtName.setPromptText("Player Name");

        TextField txtJersey = new TextField();
        txtJersey.setPromptText("Jersey Number");

        TextField txtCountry = new TextField();
        txtCountry.setPromptText("Player Country");

        Button btnAdd = new Button("Add Data To Firebase");

        Button btnFetch = new Button("Fetch Players");

        Button btnFetchAll = new Button("Fetch All Players");

        Button btnUpdate = new Button("Update Player");

        Button btnDelete = new Button("Delete Player");

        TextArea area = new TextArea();

        PlayerController controller = new PlayerController();

        btnAdd.setOnAction(e -> {

            controller.addPlayer(
                    txtName.getText(),
                    Integer.parseInt(txtJersey.getText()),
                    txtCountry.getText()
            );

            txtName.clear();
            txtJersey.clear();
            txtCountry.clear();

        });


        btnFetch.setOnAction(e -> {

            if (!txtJersey.getText().isEmpty()) {

                int jerseyNo =
                        Integer.parseInt(txtJersey.getText());

                Player player =
                        controller.getPlayer(jerseyNo);

                if (player != null) {

                    txtName.setText(
                            player.getpName()
                    );

                    txtJersey.setText(
                            String.valueOf(
                                    player.getjNo()
                            )
                    );

                    txtCountry.setText(
                            player.getcName()
                    );
                }
            }
        });


        btnFetchAll.setOnAction(e -> {

            area.clear();

            for (Player player :
                    controller.getAllPlayers()) {

                area.appendText(
                        player.getpName()
                                + " - "
                                + player.getjNo()
                                + " - "
                                + player.getcName()
                                + "\n"
                );
            }
        });


        btnUpdate.setOnAction(e -> {

            if (!txtJersey.getText().isEmpty()) {

                int jerseyNo =
                        Integer.parseInt(
                                txtJersey.getText()
                        );

                controller.updatePlayer(
                        jerseyNo,
                        txtName.getText(),
                        txtCountry.getText()
                );

                area.clear();

                txtName.clear();
                txtJersey.clear();
                txtCountry.clear();
            }
        });


        btnDelete.setOnAction(e -> {

            if (!txtJersey.getText().isEmpty()) {

                int jerseyNo =
                        Integer.parseInt(
                                txtJersey.getText()
                        );

                controller.deletePlayer(jerseyNo);

                txtName.clear();
                txtJersey.clear();
                txtCountry.clear();
            }
        });


        VBox root = new VBox(10);

        root.setPadding(
                new Insets(20)
        );


        root.getChildren().addAll(
                proImageView,
                chooseFile,
                txtName,
                txtJersey,
                txtCountry,
                btnAdd,
                btnFetch,
                btnFetchAll,
                btnUpdate,
                btnDelete,
                area
        );


        Scene scene =
                new Scene(root, 400, 450);

        stage.setScene(scene);

        stage.setTitle(
                "Firebase Firestore"
        );

        stage.show();
    }
}