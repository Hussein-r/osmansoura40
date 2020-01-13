/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author interface
 */
public class UI5Controller implements Initializable {
    @FXML
    Stage stage;
    @FXML
    Parent root;
    @FXML
    private Button exit;
    @FXML
    private Button win;
    @FXML
    private Button lose;
    

   @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
            stage = (Stage) exit.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("UI4.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(UI1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public void handleButtonAction2(ActionEvent event) {
        try {
            stage = (Stage) win.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("UI6.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(UI1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public void handleButtonAction3(ActionEvent event) {
        try {
            stage = (Stage) lose.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("UI7.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(UI1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
