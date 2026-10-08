import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        System.out.println("Hello, World!");
        arg0.show();
    }
}