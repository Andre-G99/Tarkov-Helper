package Main;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Image img = new Image("/Main/logo.png");

        Parent root = FXMLLoader.load(getClass().getResource("/Resources/mainScreen.fxml"));
        Scene mainScene = new Scene(root, 800, 600);
        mainScene.setFill(Color.BLACK);
        primaryStage.setTitle("Tarkov Helper");
        primaryStage.setScene(mainScene);
        primaryStage.getIcons().add(img);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
