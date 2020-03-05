package View_Controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import java.awt.Desktop;
import java.net.URI;

public class mainScreenController implements Initializable {
    @FXML private ImageView logoImageView;
    @FXML private AnchorPane anchorPane;
    @FXML private VBox vBox;
    @FXML private Button mapsButton;
    @FXML private Button guns_Ammo_Button;
    @FXML private Button donationButton;
    @FXML private Button exitButton;

    public void setLogoImageView(){
        Image img = new Image("/Resources/logo.png");
        logoImageView.setImage(img);
    }

    public void changeToMapsScreen(ActionEvent event) throws IOException {
        Parent mapsScreen = FXMLLoader.load(getClass().getResource("/Resources/mapScreen.fxml"));
        if(anchorPane.getWidth() != 800.0 || anchorPane.getHeight() != 600.0){
            Scene mapsScene = new Scene(mapsScreen, this.anchorPane.getWidth(), this.anchorPane.getHeight());
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(mapsScene);
            window.show();
        }
        else {
            Scene mapsScene = new Scene(mapsScreen, 800, 600);
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(mapsScene);
            window.show();
        }

    }

    public void changeToGun_AmmoScreen(ActionEvent event) throws IOException {
        Parent ammoScreen = FXMLLoader.load(getClass().getResource("/Resources/gun_AmmoScreen.fxml"));

            Scene ammoScene = new Scene(ammoScreen, 1200, 800);
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(ammoScene);
            window.show();
    }

    //this method exits the application
    public void exitApplication(ActionEvent event){

        Alert exitAlert = new Alert(Alert.AlertType.CONFIRMATION);
        exitAlert.setTitle("EXIT?");
        exitAlert.setContentText("Are you sure you want to exit the application?");
        Optional<ButtonType> result = exitAlert.showAndWait();
        if(result.get() == ButtonType.OK){
            Platform.exit();
        } else {
            exitAlert.close();
        }
    }

    public void donationButtonWasClicked() throws URISyntaxException, IOException {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://www.patreon.com/komodo1022"));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setLogoImageView();
        VBox.setVgrow(anchorPane, Priority.ALWAYS);
    }


}
