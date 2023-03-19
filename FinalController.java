/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author EnasK
 */
public class FinalController implements Initializable {

    @FXML
    private Button close;
    @FXML
    private Label playername;

    /**
     * Initializes the controller class.
     */
    
    @Override 
    public void initialize(URL url, ResourceBundle rb) { 
        String nameFromFileText = FromTheFile(); 
        playername.setText(nameFromFileText+"!!!"); 
    }     
    @FXML 
    private void closeAction(ActionEvent event) { 
          
        System.exit(0); 
    }  
    
    private String FromTheFile () {  
 
BufferedReader PlayerInfoFile;  
String PlayerName = null;  
try { PlayerInfoFile = new BufferedReader (new FileReader ("Playerinformation.txt")); 
 
PlayerName = PlayerInfoFile.readLine ();  
                 
System.out.println ("player information is read successfully");  
        PlayerInfoFile.close () ;  
}  
catch (IOException ex) { 
    System.out.println (ex); 
} return PlayerName; 
     
}
    
    
}
