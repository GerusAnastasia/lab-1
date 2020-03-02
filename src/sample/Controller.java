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
    private TextField InputFirst;

    @FXML
    private TextField InputSecond;

    @FXML
    private Button AddButton;

    @FXML
    private Button MulButton;

    @FXML
    private Label AddLabel;

    @FXML
    private Label MulLabel;

    @FXML
    void initialize() {


        AddButton.setOnAction(actionEvent -> {
            int num1 = Integer.parseInt(InputFirst.getText());
            int num2 = Integer.parseInt(InputSecond.getText());
            AddLabel.setText(Integer.toString(Logic.Addition(num1, num2)));
        });

        MulButton.setOnAction(actionEvent -> {
            int num1 = Integer.parseInt(InputFirst.getText());
            int num2 = Integer.parseInt(InputSecond.getText());
            MulLabel.setText(Integer.toString(Logic.Multiplication(num1, num2)));
        });

    }
}