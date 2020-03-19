package sample;

import java.util.ArrayList;

public class Tractor extends Car {
    public String equipment;

    public Tractor (String equipment, String name, int doors, double fuelVolume){
        super(name, doors, fuelVolume);
        this.equipment = equipment;
    }

    public void removeSnow(){
        this.drive();
        System.out.println("Removing snow...");
    }
}
