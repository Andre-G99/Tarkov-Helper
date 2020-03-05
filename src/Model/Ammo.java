package Model;

import javafx.beans.property.SimpleStringProperty;

public class Ammo {
    //class variables
    private SimpleStringProperty ammoType_Name;
    private Integer damageValue, penetrationValue;

    public Ammo (String ammoType_Name, Integer damageValue, Integer penetrationValue){
        this.ammoType_Name = new SimpleStringProperty(ammoType_Name);
        this.damageValue = damageValue;
        this.penetrationValue = penetrationValue;
    }

    public void setDamageValue(Integer damageValue) {
        this.damageValue = damageValue;
    }

    public Integer getDamageValue() {
        return damageValue;
    }

    public void setAmmoType_Name(String ammoType_Name) {
        this.ammoType_Name.set(ammoType_Name);
    }

    public String getAmmoType_Name() {
        return ammoType_Name.get();
    }

    public void setPenetrationValue(Integer penetrationValue) {
        this.penetrationValue = penetrationValue;
    }

    public Integer getPenetrationValue() {
        return penetrationValue;
    }
}
