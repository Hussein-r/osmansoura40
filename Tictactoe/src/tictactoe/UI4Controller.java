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
public class UI4Controller implements Initializable {

    @FXML
    Stage stage;
    @FXML
    Parent root;
    @FXML
    private Button signout;
    @FXML
    private Button singleplay;
    @FXML
    private Button multiplay;
    @FXML
    private Button online;
    @FXML
    private Button record;
    
    
    
  
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
            stage = (Stage) signout.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("UI1.fxml"));
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
            stage = (Stage) singleplay.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("UI5.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(UI1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    @FXML
    private void handleButtonAction3(ActionEvent event) {
        try {
            stage = (Stage) online.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("UI9.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(UI1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    @FXML
    private void handleButtonAction4(ActionEvent event) {
        try {
            stage = (Stage) record.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("UI8.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(UI1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    @FXML
    private void handleButtonAction5(ActionEvent event) {
        try {
            stage = (Stage) multiplay.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("UI5.fxml"));
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
