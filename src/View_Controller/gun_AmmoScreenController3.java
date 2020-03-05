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

public class gun_AmmoScreenController3 implements Initializable {

    @FXML private TableView<Ammo> _9x21Table;
    @FXML private TableColumn<Ammo, String> _9x21Name;
    @FXML private TableColumn<Ammo, Integer> _9x21Damage;
    @FXML private TableColumn<Ammo, Integer> _9x21Pen;

    @FXML private TableView<Ammo> _57x28Table;
    @FXML private TableColumn<Ammo, String> _57x28Name;
    @FXML private TableColumn<Ammo, Integer> _57x28Damage;
    @FXML private TableColumn<Ammo, Integer> _57x28Pen;

    @FXML private TableView<Ammo> _46x30HKTable;
    @FXML private TableColumn<Ammo, String> _46x30HKName;
    @FXML private TableColumn<Ammo, Integer> _46x30HKDamage;
    @FXML private TableColumn<Ammo, Integer> _46x30HKPen;

    @FXML private TableView<Ammo> _762x25ttTable;
    @FXML private TableColumn<Ammo, String> _762x25ttName;
    @FXML private TableColumn<Ammo, Integer> _762x25ttDamage;
    @FXML private TableColumn<Ammo, Integer> _762x25ttPen;

    @FXML private TableView<Ammo> mountedTable;
    @FXML private TableColumn<Ammo, String> mountedName;
    @FXML private TableColumn<Ammo, Integer> mountedDamage;
    @FXML private TableColumn<Ammo, Integer> mountedPen;

    public ObservableList<Ammo> getMountedAmmo(){
        ObservableList<Ammo> mountedList = FXCollections.observableArrayList();

        mountedList.add(new Ammo("30mm Grenade", 199,1));
        mountedList.add(new Ammo("12.7x108mm Tracer", 182,80));
        mountedList.add(new Ammo("12.7x108mm", 182,88));

        return  mountedList;
    }

    public ObservableList<Ammo> get762x25ttAmmo(){
        ObservableList<Ammo> _762x25ttList = FXCollections.observableArrayList();

        _762x25ttList.add(new Ammo("LRNPC", 66,5));
        _762x25ttList.add(new Ammo("LRN", 64,6));
        _762x25ttList.add(new Ammo("FMJ43", 60,8));
        _762x25ttList.add(new Ammo("akbs", 58,9));
        _762x25ttList.add(new Ammo("P Gl", 58,10));
        _762x25ttList.add(new Ammo("PT Gzh", 60,12));
        _762x25ttList.add(new Ammo("Pst gzh", 50,24));


        return _762x25ttList;
    }

    public ObservableList<Ammo> get46x30HKAmmo(){
        ObservableList<Ammo> _46x30HKList = FXCollections.observableArrayList();

        _46x30HKList.add(new Ammo("Action SX", 65,10));
        _46x30HKList.add(new Ammo("FMJ SX", 43,30));
        _46x30HKList.add(new Ammo("Subsonic SX", 41,34));
        _46x30HKList.add(new Ammo("AP SX", 35,47));


        return  _46x30HKList;
    }

    public ObservableList<Ammo> get57x28Ammo(){
        ObservableList<Ammo> _57x28List = FXCollections.observableArrayList();

        _57x28List.add(new Ammo("R 37 F", 98,8));
        _57x28List.add(new Ammo("SS 198 LF", 74,10));
        _57x28List.add(new Ammo("R 37 X", 81,11));
        _57x28List.add(new Ammo("SS 197 SR", 62,20));
        _57x28List.add(new Ammo("SS 190", 57,32));
        _57x28List.add(new Ammo("L 191", 58,33));
        _57x28List.add(new Ammo("SB 193", 54,35));

        return  _57x28List;
    }

    public ObservableList<Ammo> get9x21Ammo(){
        ObservableList<Ammo> _9x21List = FXCollections.observableArrayList();

        _9x21List.add(new Ammo("sp12", 75,14));
        _9x21List.add(new Ammo("sp11", 70,16));
        _9x21List.add(new Ammo("sp10", 49,32));
        _9x21List.add(new Ammo("sp13", 62,36));

        return  _9x21List;
    }

    public void changeToMainScreen(ActionEvent event) throws IOException {
        Parent mainScreen = FXMLLoader.load(getClass().getResource("/Resources/mainScreen.fxml"));
        Scene mainScene = new Scene(mainScreen, 800, 600);
        //get stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(mainScene);
        window.show();
    }

    public void changeToAmmoScreen2(ActionEvent event) throws IOException {
        Parent mainScreen = FXMLLoader.load(getClass().getResource("/Resources/gun_AmmoScreen2.fxml"));
        Scene mainScene = new Scene(mainScreen, 1200, 800);
        //get stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(mainScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //set up columns
        _9x21Name.setCellValueFactory(new PropertyValueFactory<Ammo, String>("ammoType_Name"));
        _9x21Damage.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("damageValue"));
        _9x21Pen.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("penetrationValue"));

        _57x28Name.setCellValueFactory(new PropertyValueFactory<Ammo, String>("ammoType_Name"));
        _57x28Damage.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("damageValue"));
        _57x28Pen.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("penetrationValue"));


        _46x30HKName.setCellValueFactory(new PropertyValueFactory<Ammo, String>("ammoType_Name"));
        _46x30HKDamage.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("damageValue"));
        _46x30HKPen.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("penetrationValue"));

        _762x25ttName.setCellValueFactory(new PropertyValueFactory<Ammo, String>("ammoType_Name"));
        _762x25ttDamage.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("damageValue"));
        _762x25ttPen.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("penetrationValue"));

        mountedName.setCellValueFactory(new PropertyValueFactory<Ammo, String>("ammoType_Name"));
        mountedDamage.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("damageValue"));
        mountedPen.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("penetrationValue"));

        //load data
        _9x21Table.setItems(get9x21Ammo());
        _57x28Table.setItems(get57x28Ammo());
        _46x30HKTable.setItems(get46x30HKAmmo());
        _762x25ttTable.setItems(get762x25ttAmmo());
        mountedTable.setItems(getMountedAmmo());
    }
}
