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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class gun_AmmoScreenController2 implements Initializable {

    @FXML private TableView<Ammo> _556x45Table;
    @FXML private TableColumn<Ammo, String> _556x45Name;
    @FXML private TableColumn<Ammo, Integer> _556x45Damage;
    @FXML private TableColumn<Ammo, Integer> _556x45Pen;

    @FXML private TableView<Ammo> _127x55Table;
    @FXML private TableColumn<Ammo, String> _127x55Name;
    @FXML private TableColumn<Ammo, Integer> _127x55Damage;
    @FXML private TableColumn<Ammo, Integer> _127x55Pen;

    @FXML private TableView<Ammo> _762x54RTable;
    @FXML private TableColumn<Ammo, String> _762x54RName;
    @FXML private TableColumn<Ammo, Integer> _762x54RDamage;
    @FXML private TableColumn<Ammo, Integer> _762x54RPen;

    @FXML private TableView<Ammo> _9x39Table;
    @FXML private TableColumn<Ammo, String> _9x39Name;
    @FXML private TableColumn<Ammo, Integer> _9x39Damage;
    @FXML private TableColumn<Ammo, Integer> _9x39Pen;

    @FXML private TableView<Ammo> _9x19Table;
    @FXML private TableColumn<Ammo, String> _9x19Name;
    @FXML private TableColumn<Ammo, Integer> _9x19Damage;
    @FXML private TableColumn<Ammo, Integer> _9x19Pen;

    @FXML private TableView<Ammo> _9x18Table;
    @FXML private TableColumn<Ammo, String> _9x18Name;
    @FXML private TableColumn<Ammo, Integer> _9x18Damage;
    @FXML private TableColumn<Ammo, Integer> _9x18Pen;


    public void changeToMainScreen(ActionEvent event) throws IOException {
        Parent mainScreen = FXMLLoader.load(getClass().getResource("/Resources/mainScreen.fxml"));
            Scene mainScene = new Scene(mainScreen, 800, 600);
            //get stage info
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(mainScene);
            window.show();
    }

    public void changeToAmmoScreen1(ActionEvent event) throws IOException {
        Parent mainScreen = FXMLLoader.load(getClass().getResource("/Resources/gun_AmmoScreen.fxml"));
        Scene mainScene = new Scene(mainScreen, 1200, 800);
        //get stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(mainScene);
        window.show();
    }

    public void changeToAmmoScreen3(ActionEvent event) throws IOException {
        Parent mainScreen = FXMLLoader.load(getClass().getResource("/Resources/gun_AmmoScreen3.fxml"));
        Scene mainScene = new Scene(mainScreen, 1200, 800);
        //get stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(mainScene);
        window.show();
    }

    public ObservableList<Ammo> get9x18Ammo(){
        ObservableList<Ammo> _9x18List = FXCollections.observableArrayList();

        _9x18List.add(new Ammo("SP8 gzh", 67,1));
        _9x18List.add(new Ammo("SP7 gzh", 77,2));
        _9x18List.add(new Ammo("PSV", 69,3));
        _9x18List.add(new Ammo("P gzh", 50,5));
        _9x18List.add(new Ammo("PSO gzh", 54,5));
        _9x18List.add(new Ammo("PS gs PPO", 55,6));
        _9x18List.add(new Ammo("PRS gs", 58,6));
        _9x18List.add(new Ammo("PPE gzh", 61,7));
        _9x18List.add(new Ammo("PPT gzh", 59,8));
        _9x18List.add(new Ammo("PST gzh", 50,12));
        _9x18List.add(new Ammo("RG028 gzh", 65,13));
        _9x18List.add(new Ammo("BZT gzh", 55,16));
        _9x18List.add(new Ammo("PBM", 44,22));
        _9x18List.add(new Ammo("PMM", 56,25));


        return  _9x18List;
    }

    public ObservableList<Ammo> get9x19Ammo(){
        ObservableList<Ammo> _9x19List = FXCollections.observableArrayList();

        _9x19List.add(new Ammo("RIP", 102,2));
        _9x19List.add(new Ammo("PSO gzh", 56,10));
        _9x19List.add(new Ammo("luger cci", 70,10));
        _9x19List.add(new Ammo("Green Tracer", 58,14));
        _9x19List.add(new Ammo("PST gzh", 54,18));
        _9x19List.add(new Ammo("AP 6.3", 52,25));

        return  _9x19List;
    }

    public ObservableList<Ammo> get9x39Ammo(){
        ObservableList<Ammo> _9x39List = FXCollections.observableArrayList();

        _9x39List.add(new Ammo("sp5", 68,35));
        _9x39List.add(new Ammo("sp6", 58,43));
        _9x39List.add(new Ammo("7n9 SPP", 67,45));
        _9x39List.add(new Ammo("7n12 BP", 60,50));


        return  _9x39List;
    }

    public ObservableList<Ammo> get762x54RAmmo(){
        ObservableList<Ammo> _127x55List = FXCollections.observableArrayList();

        _127x55List.add(new Ammo("T-46M", 82,41));
        _127x55List.add(new Ammo("LPS Gzh", 81,42));
        _127x55List.add(new Ammo("7N1", 86,45));
        _127x55List.add(new Ammo("7BT1", 78,59));
        _127x55List.add(new Ammo("SNB", 75,62));
        _127x55List.add(new Ammo("7n37", 72,70));


        return  _127x55List;
    }

    public ObservableList<Ammo> get127x55Ammo(){
        ObservableList<Ammo> _127x55List = FXCollections.observableArrayList();

        _127x55List.add(new Ammo("PS 12a", 165,10));
        _127x55List.add(new Ammo("PS 12", 115,28));
        _127x55List.add(new Ammo("PS 12b", 102,46));


        return  _127x55List;
    }

    public ObservableList<Ammo> get556x45Ammo(){
        ObservableList<Ammo> _556x45List = FXCollections.observableArrayList();

        _556x45List.add(new Ammo("Warmage", 85, 3));
        _556x45List.add(new Ammo("HP", 75, 9));
        _556x45List.add(new Ammo("MK 255 Mod 0", 60, 17));
        _556x45List.add(new Ammo("M856", 55, 23));
        _556x45List.add(new Ammo("FMJ", 52, 24));
        _556x45List.add(new Ammo("M855", 49, 26));
        _556x45List.add(new Ammo("M856A1", 51, 37));
        _556x45List.add(new Ammo("M855A1", 44, 40));
        _556x45List.add(new Ammo("M995", 41, 53));

        return _556x45List;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //set up columns
        _556x45Name.setCellValueFactory(new PropertyValueFactory<Ammo, String>("ammoType_Name"));
        _556x45Damage.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("damageValue"));
        _556x45Pen.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("penetrationValue"));

        _127x55Name.setCellValueFactory(new PropertyValueFactory<Ammo, String>("ammoType_Name"));
        _127x55Damage.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("damageValue"));
        _127x55Pen.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("penetrationValue"));


        _762x54RName.setCellValueFactory(new PropertyValueFactory<Ammo, String>("ammoType_Name"));
        _762x54RDamage.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("damageValue"));
        _762x54RPen.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("penetrationValue"));

        _9x39Name.setCellValueFactory(new PropertyValueFactory<Ammo, String>("ammoType_Name"));
        _9x39Damage.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("damageValue"));
        _9x39Pen.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("penetrationValue"));

        _9x19Name.setCellValueFactory(new PropertyValueFactory<Ammo, String>("ammoType_Name"));
        _9x19Damage.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("damageValue"));
        _9x19Pen.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("penetrationValue"));

        _9x18Name.setCellValueFactory(new PropertyValueFactory<Ammo, String>("ammoType_Name"));
        _9x18Damage.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("damageValue"));
        _9x18Pen.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("penetrationValue"));


        //load data
        _556x45Table.setItems(get556x45Ammo());
        _127x55Table.setItems(get127x55Ammo());
        _762x54RTable.setItems(get762x54RAmmo());
        _9x39Table.setItems(get9x39Ammo());
        _9x19Table.setItems(get9x19Ammo());
        _9x18Table.setItems(get9x18Ammo());
    }
}
