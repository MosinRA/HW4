package sample;
//import org.mariuszgromada.math.mxparser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class Controller {
    @FXML
    public TextArea textArea;
    @FXML
    public Button one;
    @FXML
    public Button two;
    @FXML
    public Button three;
    @FXML
    public Button four;
    @FXML
    public Button five;
    @FXML
    public Button six;
    @FXML
    public Button seven;
    @FXML
    public Button eight;
    @FXML
    public Button nine;
    @FXML
    public Button zero;
    @FXML
    public Button minus;
    @FXML
    public Button plus;
    @FXML
    public Button multiply;
    @FXML
    public Button divide;
    @FXML
    public Button equally;
    @FXML
    public Button clear;


    public void one() {
        textArea.appendText(one.getText());
    }

    public void two() {
        textArea.appendText(two.getText());
    }

    public void three() {
        textArea.appendText(three.getText());
    }

    public void four() {
        textArea.appendText(four.getText());
    }

    public void five() {
        textArea.appendText(five.getText());
    }

    public void six() {
        textArea.appendText(six.getText());
    }

    public void seven() {
        textArea.appendText(seven.getText());
    }

    public void eight() {
        textArea.appendText(eight.getText());
    }

    public void nine(ActionEvent actionEvent) {
        textArea.appendText(nine.getText());
    }

    public void zero() {
        textArea.appendText(zero.getText());
    }

    public void minus() {
        textArea.appendText(minus.getText());

    }

    public void plus() {
        textArea.appendText(plus.getText());
    }

    public void multiply() {
        textArea.appendText(multiply.getText());
    }

    public void divide() {
        textArea.appendText(divide.getText());
    }

    public void equally() {
//не получается импортировать библиотеку =(

        //        textArea.setText(e);

    }

    public void clear() {
        textArea.clear();
    }
//        Expression e = new Expression(textArea.getText());
//        e.calculate();


}


