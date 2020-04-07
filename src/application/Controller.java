package application;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    Double data = 0.0;
    int operation = -1;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button zero;

    @FXML
    private Button equal;

    @FXML
    private Button multiply;

    @FXML
    private Button division;

    @FXML
    private Button plus;

    @FXML
    private Button minus;

    @FXML
    private TextField display;

    @FXML
    private Button clear;

    @FXML
    private void handleButtonAction(ActionEvent event){
        if(event.getSource() == one){
            display.setText(display.getText() + "1");
        }
        else if(event.getSource() == two){
            display.setText(display.getText() + "2");
        }
        else if(event.getSource() == three){
            display.setText(display.getText() + "3");
        }
        else if(event.getSource() == four){
            display.setText(display.getText() + "4");
        }
        else if(event.getSource() == five){
            display.setText(display.getText() + "5");
        }
        else if(event.getSource() == six){
            display.setText(display.getText() + "6");
        }
        else if(event.getSource() == seven){
            display.setText(display.getText() + "7");
        }
        else if(event.getSource() == eight){
            display.setText(display.getText() + "8");
        }
        else if(event.getSource() == nine){
            display.setText(display.getText() + "9");
        }
        else if(event.getSource() == zero){
            display.setText(display.getText() + "0");
        }
        else if(event.getSource() == clear){
            display.setText("");
        }else if(event.getSource() == plus){
            try {
                data = Double.parseDouble(display.getText());
            }catch (Exception e){ data = 0.0;}
            operation = 1;
            display.setText("");
        }
        else if(event.getSource() == minus){
            try {
                data = Double.parseDouble(display.getText());
            }catch (Exception e){ data = 0.0;}
            operation = 2;
            display.setText("");
        }
        else if(event.getSource() == division){
            try {
                data = Double.parseDouble(display.getText());
            }catch (Exception e){ data = 0.0;}
            operation = 3;
            display.setText("");
        }
        else if(event.getSource() == multiply){
            try {
                data = Double.parseDouble(display.getText());
            }catch (Exception e){ data = 0.0;}
            operation = 4;
            display.setText("");
        }
        else if(event.getSource() == equal){
            Double secondOperand;
            try {
                secondOperand = Double.parseDouble(display.getText());
            }catch (Exception e){ secondOperand = 0.0;}


            switch (operation){
                case 1:
                    display.setText(String.valueOf(data + secondOperand));
                    break;
                case 2:
                    display.setText(String.valueOf(data - secondOperand));
                    break;
                case 3:
                    //TO FIX
                    double d = data / secondOperand;
                    display.setText(Double.toString(d));
                    break;
                case 4:
                    display.setText(String.valueOf(data * secondOperand));
                    break;
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
