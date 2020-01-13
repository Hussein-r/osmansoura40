/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.io.File;
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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author interface
 */
public class UI6Controller implements Initializable {
    @FXML
    Stage stage;
    @FXML
    Parent root;
    @FXML 
    private MediaView mv;
    @FXML
    private MediaPlayer mp;
    @FXML
    private Media me;
    @FXML
    private Button rematch;
    @FXML
    private Button exit;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
            stage = (Stage) exit.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("UI5.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            mp.stop();
        } catch (IOException ex) {
            Logger.getLogger(UI1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    @FXML
    private void handleButtonAction2(ActionEvent event) {
        try {
            stage = (Stage) rematch.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("UI4.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            mp.stop();
        } catch (IOException ex) {
            Logger.getLogger(UI1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
}
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        String path = new File("src/tictactoe/video/winner.mp4").getAbsolutePath();
        me = new Media(new File(path).toURI().toString());
        mp = new MediaPlayer(me);
        mv.setMediaPlayer(mp);
        mp.setAutoPlay(true);
        
    } 
    
}
