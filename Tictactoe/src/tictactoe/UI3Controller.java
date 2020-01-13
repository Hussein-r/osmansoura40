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
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author interface
 */
public class UI3Controller implements Initializable {
    Database db=new Database();
    @FXML
    Stage stage;
    @FXML
    Parent root;
    @FXML
    private Button register;
    @FXML
    private TextField registername;
    @FXML
    private TextField registerpassword;    
    @FXML
    private TextField email;
    @FXML
    private void registerMethod(ActionEvent event) {
        //System.out.println("test");
        String name,pass,Email;
        name=registername.getText();
        pass=registerpassword.getText();
        Email=email.getText();
        if(name.length()!=0 && pass.length()!=0 && Email.length()!=0 )
        {
            if(db.checkUserName(name))
                JOptionPane.showMessageDialog(null, "Insert another user name", "alert", JOptionPane.ERROR_MESSAGE);

            else
            {
                if(db.checkEmail(Email))
                {
                    JOptionPane.showMessageDialog(null, "Insert another Email", "alert", JOptionPane.ERROR_MESSAGE);
                }
                else
                    db.registration(name, pass, Email);

            }

          
                
        }
        else
            //JOptionPane.showMessageDialog("Enter all fields",null);
            JOptionPane.showMessageDialog(null, "Enter all fields", "alert", JOptionPane.ERROR_MESSAGE);
        
}

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
