package com.api.View;
import org.json.JSONArray;
import org.json.JSONObject;

import com.api.Controller.ActivityController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Homepage extends Application {
    public void start(Stage Primary){
        Button getActivity=new Button("Get Activity");
        ActivityController controller=new ActivityController();
        TextArea gTextArea=new TextArea();
        getActivity.setOnAction(e->{
            String body = controller.getActivity();

            JSONObject jsonObject=new JSONObject(body);

            System.out.println(jsonObject.toString(4));
            String activity=jsonObject.getString("activity");

            gTextArea.setText(activity);
        });
        TextField tf=new TextField();
        Button getOrigin=new Button("Get Origin");
        TextArea gArea=new TextArea();
        getOrigin.setOnAction(e->{
            String body = controller.getOrigin(tf.getText());

            JSONObject json=new JSONObject(body);

            System.out.println(json.toString(4));
            JSONArray country=json.getJSONArray("country");

            JSONObject count=country.getJSONObject(0);
            String cId=count.getString("country_id");
            gArea.setText(cId);
        });
        VBox root=new VBox(10,getActivity,gTextArea,tf,getOrigin,gArea);
        Scene scene=new Scene(root);
        Primary.setScene(scene);
        Primary.show();
    }
}
