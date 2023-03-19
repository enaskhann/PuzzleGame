/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
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
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author EnasK
 */
public class BeforthirdController implements Initializable {

    @FXML
    private Label namelable;
    @FXML
    private Label namelable1;
    @FXML
    private Button buttonNext1;
    @FXML
    private TextField nameText;
    @FXML
    private TextField emailText;
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
    private void back(ActionEvent event) {
        
      nameText.setText("");
         emailText.setText("");
        
    }

    @FXML
    private void next(ActionEvent event) {
        String name = "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)";
        String EmailForm = "^[A-Za-z0-9+_.-]+@(.+)$"; 
        
         boolean EmailMatch = emailText.getText().matches(EmailForm);
         boolean NameMatch = nameText.getText().matches(name);
         boolean Empty = nameText.getText().trim().isEmpty() || emailText.getText().trim().isEmpty(); 
         if(Empty==true){ 
                namelable.setText("Please enter your information."); 
            } 
            else{ 
               if(EmailMatch==false){ 
                       namelable.setText("Please enter correct email"); 
               } 
               
           if (Empty==false && EmailMatch==true ){   
               
                writeToFile(); 
        try { 
            FXMLLoader loader = new FXMLLoader(getClass().getResource("third.fxml")); 
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow(); 
            Scene scene = new Scene(loader.load()); 
            stage.setScene(scene); 
         
        } 
      catch (IOException io) { 
            System.out.println("FXML Loading Error"); 
        } 
           }}
        }
    
    
    
      private void writeToFile () {
                        
      BufferedWriter PlayerInfoFile;
      try { 
      PlayerInfoFile = new BufferedWriter (new FileWriter ("PlayerInformation.txt",false));
         
           // Write to the file. 
       PlayerInfoFile.write ( (String) nameText.getText () + "\n");
       PlayerInfoFile.write ( (String) emailText.getText () + "\n");
        
     //show confirmation message 
       System.out.println("Player information is added successfully");
       PlayerInfoFile.close( );
     
      
       }catch (FileNotFoundException ex) {
       System.out.println ("Error wrting to file"); 
       }catch (IOException ex) {
         System.out.println("Error wrting to file");
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
