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
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class gun_AmmoScreenController implements Initializable {
    //shotgun table 12g
    @FXML private TableView<Ammo> shotgunTable;
    @FXML private TableColumn<Ammo, String> shotgunNameColumn;
    @FXML private TableColumn<Ammo, Integer> shotgunDamageColumn;
    @FXML private TableColumn<Ammo, Integer> shotgunPenetrationColumn;

    //shotgun table 12g
    @FXML private TableView<Ammo> shotgun20gTable;
    @FXML private TableColumn<Ammo, String> shotgun20gNameColumn;
    @FXML private TableColumn<Ammo, Integer> shotgun20gDamageColumn;
    @FXML private TableColumn<Ammo, Integer> shotgun20gPenetrationColumn;

    @FXML private TableView<Ammo> _366TKMTable;
    @FXML private TableColumn<Ammo, String> _366TKMNameColumn;
    @FXML private TableColumn<Ammo, Integer> _366TKMDamageColumn;
    @FXML private TableColumn<Ammo, Integer> _366TKMPenetrationColumn;

    @FXML private TableView<Ammo> _762x39Table;
    @FXML private TableColumn<Ammo, String> _762x39NameColumn;
    @FXML private TableColumn<Ammo, Integer> _762x39DamageColumn;
    @FXML private TableColumn<Ammo, Integer> _762x39PenetrationColumn;

    @FXML private TableView<Ammo> _545x39Table;
    @FXML private TableColumn<Ammo, String> _545x39NameColumn;
    @FXML private TableColumn<Ammo, Integer> _545x39DamageColumn;
    @FXML private TableColumn<Ammo, Integer> _545x39PenetrationColumn;

    @FXML private TableView<Ammo> _762x51Table;
    @FXML private TableColumn<Ammo, String> _762x51NameColumn;
    @FXML private TableColumn<Ammo, Integer> _762x51DamageColumn;
    @FXML private TableColumn<Ammo, Integer> _762x51PenetrationColumn;


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

    public ObservableList<Ammo> get12GaugeShotGunAmmo(){
        ObservableList<Ammo> shotGunAmmoList12Gauge = FXCollections.observableArrayList();

        shotGunAmmoList12Gauge.add(new Ammo("5.25mm BuckShot", 34, 1));
        shotGunAmmoList12Gauge.add(new Ammo("8.5mm Buckshot(Magnum)", 44, 2));
        shotGunAmmoList12Gauge.add(new Ammo("6.5mm Buckshot(Express)", 29, 3));
        shotGunAmmoList12Gauge.add(new Ammo("7mm Buckshot", 32, 3));
        shotGunAmmoList12Gauge.add(new Ammo("Flechette", 19, 28));
        shotGunAmmoList12Gauge.add(new Ammo("RIP Slug", 235, 0));
        shotGunAmmoList12Gauge.add(new Ammo("Superformance HP Slug", 190, 2));
        shotGunAmmoList12Gauge.add(new Ammo("Grizzly 40 Slug", 170, 12));
        shotGunAmmoList12Gauge.add(new Ammo("HP Copper Sabot Premier", 160, 13));
        shotGunAmmoList12Gauge.add(new Ammo("Led Slug", 147,  15));
        shotGunAmmoList12Gauge.add(new Ammo("Dual Sabot Slug", 75, 17));
        shotGunAmmoList12Gauge.add(new Ammo("Slug \"Poleva-3\"", 130, 17));
        shotGunAmmoList12Gauge.add(new Ammo("FTX Custom Lite Slug", 153, 18));
        shotGunAmmoList12Gauge.add(new Ammo("Slug \"Poleva-6u\"", 140, 20));
        shotGunAmmoList12Gauge.add(new Ammo("Shell With .50 BMG (Tracer)", 177, 23));
        shotGunAmmoList12Gauge.add(new Ammo("AP 20 Slug", 164, 32));

        return shotGunAmmoList12Gauge;
    }

    public ObservableList<Ammo> get20GaugeShotGunAmmo(){
        ObservableList<Ammo> shotGunAmmoList20Gauge = FXCollections.observableArrayList();

        shotGunAmmoList20Gauge.add(new Ammo("5.6mm Buckshot", 25, 1));
        shotGunAmmoList20Gauge.add(new Ammo("6.2mm Buckshot", 21, 2));
        shotGunAmmoList20Gauge.add(new Ammo("7.5mm Buckshot", 24, 3));
        shotGunAmmoList20Gauge.add(new Ammo("7.3mm Buckshot", 22, 3));
        shotGunAmmoList20Gauge.add(new Ammo("Devastator Slug", 188, 4));
        shotGunAmmoList20Gauge.add(new Ammo("20g Slug \"Poleva-3\"", 110, 14));
        shotGunAmmoList20Gauge.add(new Ammo("Star Slug", 134, 16));
        shotGunAmmoList20Gauge.add(new Ammo("20g Slug \"Poleva-6u\"", 120, 17));

        return shotGunAmmoList20Gauge;
    }

    public ObservableList<Ammo> get366Ammo(){
        ObservableList<Ammo> _366AmmoList = FXCollections.observableArrayList();

        _366AmmoList.add(new Ammo("Geksa", 80, 14));
        _366AmmoList.add(new Ammo("FMJ", 73, 20));
        _366AmmoList.add(new Ammo("EKO", 65, 30));

        return _366AmmoList;
    }

    public ObservableList<Ammo> get762x39Ammo(){
        ObservableList<Ammo> _762x39AmmoList = FXCollections.observableArrayList();

        _762x39AmmoList.add(new Ammo("HP", 83, 15));
        _762x39AmmoList.add(new Ammo("US", 56, 29));
        _762x39AmmoList.add(new Ammo("T45M", 62, 31));
        _762x39AmmoList.add(new Ammo("PS", 54, 34));
        _762x39AmmoList.add(new Ammo("BP", 58, 47));

        return _762x39AmmoList;
    }

    public ObservableList<Ammo> get545x39Ammo(){
        ObservableList<Ammo> _545x39AmmoList = FXCollections.observableArrayList();

        _545x39AmmoList.add(new Ammo("HP", 68, 11));
        _545x39AmmoList.add(new Ammo("SP", 74, 11));
        _545x39AmmoList.add(new Ammo("PRS", 60, 14));
        _545x39AmmoList.add(new Ammo("US", 65, 15));
        _545x39AmmoList.add(new Ammo("FMJ", 54, 20));
        _545x39AmmoList.add(new Ammo("T", 57, 20));
        _545x39AmmoList.add(new Ammo("PS", 50, 25));
        _545x39AmmoList.add(new Ammo("PP", 46, 30));
        _545x39AmmoList.add(new Ammo("BP", 48, 32));
        _545x39AmmoList.add(new Ammo("BT", 44, 37));
        _545x39AmmoList.add(new Ammo("BS", 40, 51));
        _545x39AmmoList.add(new Ammo("7n39 Igolnik", 37, 62));

        return _545x39AmmoList;
    }

    public ObservableList<Ammo> get762x51Ammo(){
        ObservableList<Ammo> _762x51AmmoList = FXCollections.observableArrayList();

        _762x51AmmoList.add(new Ammo("Ultra Nosier", 102, 15));
        _762x51AmmoList.add(new Ammo("BPZ FMJ", 88, 31));
        _762x51AmmoList.add(new Ammo("TPZ SP", 60, 36));
        _762x51AmmoList.add(new Ammo("M80", 80, 41));
        _762x51AmmoList.add(new Ammo("M62", 79, 54));
        _762x51AmmoList.add(new Ammo("M61", 70, 68));

        return _762x51AmmoList;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //set up columns
        shotgunNameColumn.setCellValueFactory(new PropertyValueFactory<Ammo, String>("ammoType_Name"));
        shotgunDamageColumn.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("damageValue"));
        shotgunPenetrationColumn.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("penetrationValue"));

        shotgun20gNameColumn.setCellValueFactory(new PropertyValueFactory<Ammo, String>("ammoType_Name"));
        shotgun20gDamageColumn.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("damageValue"));
        shotgun20gPenetrationColumn.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("penetrationValue"));

        _366TKMNameColumn.setCellValueFactory(new PropertyValueFactory<Ammo, String>("ammoType_Name"));
        _366TKMDamageColumn.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("damageValue"));
        _366TKMPenetrationColumn.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("penetrationValue"));

        _762x39NameColumn.setCellValueFactory(new PropertyValueFactory<Ammo, String>("ammoType_Name"));
        _762x39DamageColumn.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("damageValue"));
        _762x39PenetrationColumn.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("penetrationValue"));

        _545x39NameColumn.setCellValueFactory(new PropertyValueFactory<Ammo, String>("ammoType_Name"));
        _545x39DamageColumn.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("damageValue"));
        _545x39PenetrationColumn.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("penetrationValue"));

        _762x51NameColumn.setCellValueFactory(new PropertyValueFactory<Ammo, String>("ammoType_Name"));
        _762x51DamageColumn.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("damageValue"));
        _762x51PenetrationColumn.setCellValueFactory(new PropertyValueFactory<Ammo, Integer>("penetrationValue"));

        //load data
        shotgunTable.setItems(get12GaugeShotGunAmmo());
        shotgun20gTable.setItems(get20GaugeShotGunAmmo());
        _366TKMTable.setItems(get366Ammo());
        _762x39Table.setItems(get762x39Ammo());
        _545x39Table.setItems(get545x39Ammo());
        _762x51Table.setItems(get762x51Ammo());

    }
}
