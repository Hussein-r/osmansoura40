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
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author interface
 */
public class UI2Controller implements Initializable {
    Database db=new Database();
    
    @FXML
    private Button Login;
    @FXML
    Stage stage;
    @FXML
    Parent root;
    @FXML
    private TextField nametextfield;
    @FXML
    private PasswordField passwordtextfield;
    @FXML
    private Label invalid;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String name,pass;
        boolean flag;
        name=nametextfield.getText();
        pass=passwordtextfield.getText();
        flag = db.Login(name, pass);
        if(flag)
        {
            try {
                stage = (Stage) Login.getScene().getWindow();
                root = FXMLLoader.load(getClass().getResource("UI4.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(UI2Controller.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else
            JOptionPane.showMessageDialog(null, "Invalid email or password", "alert", JOptionPane.ERROR_MESSAGE);

        
            
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
