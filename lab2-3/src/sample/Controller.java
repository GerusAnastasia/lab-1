package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField SetName;

    @FXML
    private TextField SetNumOfDoors;

    @FXML
    private TextField SetVolume;

    @FXML
    private TextField GetFuel;

    @FXML
    private Label GetEngineWeight;

    @FXML
    private Label GetWheelWeight;

    @FXML
    private Label GetTankWeight;

    @FXML
    private Button Drive;

    @FXML
    private TextField SetEquipment;

    @FXML
    private Button RemoveSnow;

    @FXML
    private TextField SetIndex;

    @FXML
    private Button CloseDoor;

    @FXML
    private Button OpenDoor;

    @FXML
    private Button InflateWheel;

    @FXML
    void initialize() {
        AllData all = new AllData();
        Drive.setOnAction(actionEvent -> {
            String name = SetName.getText();
            int numOfDoors = Integer.parseInt(SetNumOfDoors.getText());
            double volumeOfTank = Double.parseDouble(SetVolume.getText());
            all.car = new Car(name, numOfDoors, volumeOfTank);
            all.car.drive();
            GetEngineWeight.setText(Double.toString(all.car.engine.weight));
            GetTankWeight.setText(Double.toString(all.car.tank.weight));
            GetWheelWeight.setText(Double.toString(all.car.wheels.get(0).weight));
        });
        RemoveSnow.setOnAction(actionEvent -> {
            String equipment = SetEquipment.getText();
            String name = SetName.getText();
            int numOfDoors = Integer.parseInt(SetNumOfDoors.getText());
            double volumeOfTank = Double.parseDouble(SetVolume.getText());
            all.car = new Car(name, numOfDoors, volumeOfTank);
            all.tractor = new Tractor(equipment, name, numOfDoors, volumeOfTank);
        });
        InflateWheel.setOnAction(actionEvent -> {
            int index = Integer.parseInt(SetIndex.getText());

            String name = SetName.getText();
            int numOfDoors = Integer.parseInt(SetNumOfDoors.getText());
            double volumeOfTank = Double.parseDouble(SetVolume.getText());
            all.car = new Car(name, numOfDoors, volumeOfTank);
            all.driver = new Driver(all.car);

            all.driver.putWheel(index);

        });
        OpenDoor.setOnAction(actionEvent -> {
            int index = Integer.parseInt(SetIndex.getText());

            String name = SetName.getText();
            int numOfDoors = Integer.parseInt(SetNumOfDoors.getText());
            double volumeOfTank = Double.parseDouble(SetVolume.getText());
            all.car = new Car(name, numOfDoors, volumeOfTank);
            all.driver = new Driver(all.car);

            all.driver.manageCar(index, true);
        });

        CloseDoor.setOnAction(actionEvent -> {
            int index = Integer.parseInt(SetIndex.getText());

            String name = SetName.getText();
            int numOfDoors = Integer.parseInt(SetNumOfDoors.getText());
            double volumeOfTank = Double.parseDouble(SetVolume.getText());
            all.car = new Car(name, numOfDoors, volumeOfTank);
            all.driver = new Driver(all.car);

            all.driver.manageCar(index, false);
        });


    }
}
