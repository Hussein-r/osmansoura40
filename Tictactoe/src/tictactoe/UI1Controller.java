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
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author interface
 */
public class UI1Controller implements Initializable {
    @FXML
    private Button Login;
    @FXML
    private Button register;
    @FXML
    Stage stage;
    @FXML
    Parent root;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
            
            stage = (Stage) Login.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("UI2.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(UI1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    private void handleButtonAction2(ActionEvent event) {
        try {
            stage = (Stage) register.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("UI3.fxml"));
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
