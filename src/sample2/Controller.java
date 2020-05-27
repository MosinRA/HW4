package sample2;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    public Button message;
    @FXML
    public TextField textPad;
    @FXML
    public TextArea textWindow;

    public void message() {
        textWindow.appendText(textPad.getText());
        textPad.clear();

    }
}


