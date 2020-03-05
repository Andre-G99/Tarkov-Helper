package View_Controller;

import Model.Ammo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;

public class mapsScreenController implements Initializable {

    @FXML private AnchorPane anchorPane;
    @FXML private Button customsButton;
    @FXML private Button factoryButton;
    @FXML private Button woodsButton;
    @FXML private Button interchangeButton;
    @FXML private Button shorelineButton;
    @FXML private Button reserveButton;
    @FXML private Button labsButton;
    @FXML private Button backButton;

    public void changeToCustomsScreen(ActionEvent event) throws IOException {
        Parent customsScreen = FXMLLoader.load(getClass().getResource("/Resources/customsScreen.fxml"));
        if(anchorPane.getWidth() != 800.0 || anchorPane.getHeight() != 600.0){
            Scene customsScene = new Scene(customsScreen, this.anchorPane.getWidth(), this.anchorPane.getHeight());
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(customsScene);
            window.show();
        }
        else {
            Scene customsScene = new Scene(customsScreen, 800, 600);
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(customsScene);
            window.show();
        }
    }

    public void changeToWoodsScreen(ActionEvent event) throws IOException {
        Parent woodsScreen = FXMLLoader.load(getClass().getResource("/Resources/woodsScreen.fxml"));
        if(anchorPane.getWidth() != 800.0 || anchorPane.getHeight() != 600.0){
            Scene woodsScene = new Scene(woodsScreen, this.anchorPane.getWidth(), this.anchorPane.getHeight());
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(woodsScene);
            window.show();
        }
        else {
            Scene woodsScene = new Scene(woodsScreen, 800, 600);
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(woodsScene);
            window.show();
        }
    }

    public void changeToFactoryScreen(ActionEvent event) throws IOException {
        Parent factoryScreen = FXMLLoader.load(getClass().getResource("/Resources/factoryScreen.fxml"));
        if(anchorPane.getWidth() != 800.0 || anchorPane.getHeight() != 600.0){
            Scene factoryScene = new Scene(factoryScreen, this.anchorPane.getWidth(), this.anchorPane.getHeight());
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(factoryScene);
            window.show();
        }
        else {
            Scene factoryScene = new Scene(factoryScreen, 800, 600);
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(factoryScene);
            window.show();
        }
    }

    public void changeToShorelineScreen(ActionEvent event) throws IOException{
        Parent shorelineScreen = FXMLLoader.load(getClass().getResource("/Resources/shorelineScreen.fxml"));
        if(anchorPane.getWidth() != 800.0 || anchorPane.getHeight() != 600.0){
            Scene shorelineScene = new Scene(shorelineScreen, this.anchorPane.getWidth(), this.anchorPane.getHeight());
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(shorelineScene);
            window.show();
        }
        else {
            Scene shorelineScene = new Scene(shorelineScreen, 800, 600);
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(shorelineScene);
            window.show();
        }
    }

    public void changeToInterchangeScreen(ActionEvent event) throws IOException{
        Parent interchangeScreen = FXMLLoader.load(getClass().getResource("/Resources/interchangeScreen.fxml"));
        if(anchorPane.getWidth() != 800.0 || anchorPane.getHeight() != 600.0){
            Scene interchangeScene = new Scene(interchangeScreen, this.anchorPane.getWidth(), this.anchorPane.getHeight());
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(interchangeScene);
            window.show();
        }
        else {
            Scene interchangeScene = new Scene(interchangeScreen, 800, 600);
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(interchangeScene);
            window.show();
        }
    }

    public void changeToReserveScreen(ActionEvent event) throws IOException{
        Parent reserveScreen = FXMLLoader.load(getClass().getResource("/Resources/reserveScreen.fxml"));
        if(anchorPane.getWidth() != 800.0 || anchorPane.getHeight() != 600.0){
            Scene reserveScene = new Scene(reserveScreen, this.anchorPane.getWidth(), this.anchorPane.getHeight());
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(reserveScene);
            window.show();
        }
        else {
            Scene reserveScene = new Scene(reserveScreen, 800, 600);
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(reserveScene);
            window.show();
        }
    }

    public void changeToLabsScreen(ActionEvent event) throws IOException{
        Parent labsScreen = FXMLLoader.load(getClass().getResource("/Resources/labsScreen.fxml"));
        if(anchorPane.getWidth() != 800.0 || anchorPane.getHeight() != 600.0){
            Scene labsScene = new Scene(labsScreen, this.anchorPane.getWidth(), this.anchorPane.getHeight());
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(labsScene);
            window.show();
        }
        else {
            Scene labsScene = new Scene(labsScreen, 800, 600);
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(labsScene);
            window.show();
        }
    }

    public void changeToMainScreen(ActionEvent event) throws IOException{
        Parent mainScreen = FXMLLoader.load(getClass().getResource("/Resources/mainScreen.fxml"));
        if(anchorPane.getWidth() != 800.0 || anchorPane.getHeight() != 600.0){
            Scene mainScene = new Scene(mainScreen, this.anchorPane.getWidth(), this.anchorPane.getHeight());
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(mainScene);
            window.show();
        }
        else {
            Scene mainScene = new Scene(mainScreen, 800, 600);
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(mainScene);
            window.show();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
