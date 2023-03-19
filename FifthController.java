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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author EnasK
 */
public class FifthController implements Initializable {

    @FXML
    private Button part1;
    @FXML
    private ImageView pic2;
    @FXML
    private Button part4;
    @FXML
    private ImageView pic1;
    @FXML
    private Button part7;
    @FXML
    private ImageView pic8;
    @FXML
    private Button part2;
    @FXML
    private ImageView pic4;
    @FXML
    private Button part5;
    @FXML
    private ImageView pic3;
    @FXML
    private Button part8;
    @FXML
    private ImageView pic5;
    @FXML
    private Button part3;
    @FXML
    private ImageView pic9;
    @FXML
    private Button part9;
    @FXML
    private ImageView pic7;
    @FXML
    private Button part6;
    @FXML
    private ImageView pic6;
    @FXML
    private ImageView Image4;
    @FXML
    private ImageView image5;
    @FXML
    private ImageView image6;
    @FXML
    private ImageView image1;
    @FXML
    private ImageView image2;
    @FXML
    private ImageView image3;
    @FXML
    private ImageView image7;
    @FXML
    private ImageView image8;
    @FXML
    private ImageView image9;
    @FXML
    private Button BackArraw;
    @FXML
    private Button close2;
    @FXML
    private Button aboutChild;
    @FXML
    private Button put4;
    @FXML
    private Button put7;
    @FXML
    private Button put5;
    @FXML
    private Button put6;
    @FXML
    private Button put8;
    @FXML
    private Button put9;
    @FXML
    private Button put1;
    @FXML
    private Button put2;
    @FXML
    private Button put3;
    @FXML
    private Button done2;
    String photo;
    int  a ,b ,c, d,e,f,g,h,y;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackArrawAction(ActionEvent event) {
        try { 
                  FXMLLoader loader = new FXMLLoader(getClass().getResource("third.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
        
    }

    @FXML
    private void close2action(ActionEvent event) {
          try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("first.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
        
    }

    @FXML
    private void aboutChildAction(ActionEvent event) {
         try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("newPhoto.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }

    @FXML
    private void done2Action(ActionEvent event) {
         if (a==1 && b==2 && c==3&& d==4&& e==5&& f==6&& g==7&& h==8&& y==9 ){ 
        try { 
            FXMLLoader loader = new FXMLLoader(getClass().getResource("final.fxml")); 
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow(); 
            Scene scene = new Scene(loader.load()); 
            stage.setScene(scene); 
         
        } 
      catch (IOException io) { 
            System.out.println("FXML Loading Error"); 
        } 
    } 
         else { 
              
             System.out.println("Please complete All Parts of Picture"); 
              JOptionPane.showMessageDialog(null," Please complete All Parts of Picture ");
         }  
    }
         
 
   @FXML 
    private void part1Action(ActionEvent event) { 
    if(event.getSource()==part1){ 
                photo ="pic2";           
            } 
    } 
    @FXML 
    private void part2Action(ActionEvent event) { 
    if(event.getSource()==part2){ 
                photo ="pic4";           
            } 
    } 
    @FXML 
    private void part3Action(ActionEvent event) { 
      if(event.getSource()==part3){ 
                photo ="pic9";           
            } 
    } 
    @FXML 
    private void part4Action(ActionEvent event) { 
      if(event.getSource()==part4){ 
                photo ="pic1";           
            }  
    } 
    @FXML 
    private void part5Action(ActionEvent event) { 
      if(event.getSource()==part5){ 
                photo ="pic3";           
            } 
    } 
    @FXML 
    private void part6Action(ActionEvent event) { 
    if(event.getSource()==part6){ 
                photo ="pic6";           
            } 
    } 
    @FXML 
    private void part7Action(ActionEvent event) { 
    if(event.getSource()==part7){ 
                photo ="pic8";           
            } 
    } 
    @FXML 
    private void part8Action(ActionEvent event) { 
     if(event.getSource()==part8){ 
                photo ="pic5";           
            } 
    } 
    @FXML 
    private void part9Action(ActionEvent event) { 
     if(event.getSource()==part9){ 
                photo ="pic7";           
            }  
    } 
//////////////////////////////////////////////////////// 
 
     
   @FXML 
    private void put1Ation(ActionEvent event) { 
     if(photo =="pic1") {        
                if(event.getSource()==put1){    
                 image1.setVisible(true); 
                 pic1.setVisible(false); 
                 a = 1; 
              }} 
    } 
    @FXML 
    private void put2Ation(ActionEvent event) { 
      if(photo =="pic2") {        
                if(event.getSource()==put2){    
                 image2.setVisible(true); 
                 pic2.setVisible(false); 
                 b =2; 
                }} 
    } 
    @FXML 
    private void put3Ation(ActionEvent event) { 
     if(photo =="pic3") {        
                if(event.getSource()==put3){    
                 image3.setVisible(true); 
                 pic3.setVisible(false); 
              c=3;}} 
    } 
    @FXML 
    private void put4Ation(ActionEvent event) { 
    if(photo =="pic4") {        
                if(event.getSource()==put4){    
                 Image4.setVisible(true); 
                 pic4.setVisible(false); 
                 d=4;}} 
    } 
    @FXML 
    private void put5Action(ActionEvent event) { 
    if(photo =="pic5") {        
                if(event.getSource()==put5){    
                 image5.setVisible(true); 
                 pic5.setVisible(false); 
              e=5; 
                }} 
    }@FXML 
    private void put6Ation(ActionEvent event) { 
    if(photo =="pic6") {        
                if(event.getSource()==put6){    
                 image6.setVisible(true); 
                 pic6.setVisible(false); 
             f=6; }} 
    } 
    @FXML 
    private void put7Ation(ActionEvent event) { 
     if(photo =="pic7") {        
                if(event.getSource()==put7){    
                 image7.setVisible(true); 
                 pic7.setVisible(false); 
              g=7;}} 
    } 
 
    @FXML 
    private void put8Ation(ActionEvent event) { 
    if(photo =="pic8") {        
                if(event.getSource()==put8){    
                 image8.setVisible(true); 
                 pic8.setVisible(false); 
              h=8;}} 
    } 
    @FXML 
    private void put9Ation(ActionEvent event) { 
       if(photo =="pic9") {        
                if(event.getSource()==put9){image9.setVisible(true); 
                 pic9.setVisible(false); 
                 y=9; 
              }} 
    } 
     
   
 
}