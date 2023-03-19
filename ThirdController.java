/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author EnasK
 */
public class ThirdController implements Initializable {

    @FXML
    private Button cakeButton;
    @FXML
    private Button orangeButton;
    @FXML
    private MenuBar thismenu;
    @FXML
    private MenuItem MENUCLOSE;
    @FXML
    private MenuItem ABUT;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cakeButtonAction(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("fourth.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }

    @FXML
    private void orangeButton(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("fifth.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }

    @FXML
    private void MENUCLOSE(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void ABUTACTION(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("seconed.fxml"));
            Stage stage = (Stage) thismenu.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
         }
    }
    
}
