package View_Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class factoryScreenController implements Initializable {

    @FXML private VBox mainVbox;
    @FXML private ImageView map;
    @FXML private AnchorPane anchorPane;

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //set background
        mainVbox.setBackground(Background.EMPTY);

        //set map image
        Image img = new Image("/Resources/factory.png");
        map.setImage(img);
        map.fitWidthProperty().bind(mainVbox.widthProperty());
        map.fitHeightProperty().bind(mainVbox.heightProperty());

    }
}
