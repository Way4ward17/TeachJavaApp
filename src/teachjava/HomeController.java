/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teachjava;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDecorator;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;


import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;



/**
 *
 * @author way4ward
 */
public class HomeController implements Initializable {

    @FXML
    private AnchorPane pane;
    @FXML
    private JFXButton tutorial;
    @FXML
    private JFXButton video;
    @FXML
    private JFXButton note;
    @FXML
    private JFXButton examples;
    @FXML
    private JFXButton quiz;

 
      private double xoffset =0;
    private double yoffset = 0;
    @FXML
    private AnchorPane pana;
    @FXML
    private StackPane stick;
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
      
    }
     
     
      
    
     public void setNode(Node node){
        pane.getChildren().clear();
        pane.getChildren().add((Node)node);
      //  node.setLayoutX(50);
       // node.setLayoutY(10);
        
        
        //FADE TRANSITION
        FadeTransition ft = new FadeTransition();
       ft.setDuration(Duration.seconds(3));
       ft.setNode(node);
       ft.setFromValue(0.1);
       ft.setToValue(1);
       ft.setCycleCount(1);
       ft.setAutoReverse(false);
       ft.play();
    }
    public void createPage(AnchorPane pane,String loc) throws IOException{
       pane = FXMLLoader.load(getClass().getResource(loc)); 
       setNode(pane);
    }
    @FXML
    private void tutorial(ActionEvent event) throws IOException{
         this.createPage(pane, "/teachjava/Tutorial/TutorialHome.fxml");
    }
    @FXML
    private void video(ActionEvent event) throws IOException{
       //  this.createPage(pane, "/teachjava/Videos/VideoHome.fxml");
        msg("Error","NOT AVAILABLE IN THIS VERSION");
      
    }
    @FXML
    private void note(ActionEvent event) throws IOException{
        // this.createPage(pane, "/teachjava/Tutorial/TutorialHome.fxml");
        msg("Error","NOT AVAILABLE IN THIS VERSION");
    }
    @FXML
    private void quiz(ActionEvent event) throws IOException{
        // this.createPage(pane, "/teachjava/Quiz/QuizHome.fxml");
          msg("Error","NOT AVAILABLE IN THIS VERSION");
    }
    @FXML
    private void examples(ActionEvent event) throws IOException{
         this.createPage(pane, "/teachjava/Examples/ExampleHome.fxml");
    }
    
    
    
    private void msg(String Title , String Message){
         stick.setVisible(true);
      JFXDialogLayout content =  new JFXDialogLayout();
  content.setHeading(new Text(Title)); // Header of the Dialog
  content.setBody(new Text(Message)); // Text in the dialog
 JFXDialog dialog = new JFXDialog(stick, content,JFXDialog.DialogTransition.CENTER);
  JFXButton btn = new JFXButton("Close"); // Button to close Dialog
  btn.setOnAction(new EventHandler <ActionEvent>(){
      @Override
      public void handle(ActionEvent event) {
          dialog.close();
          stick.setVisible(false);
      }
      
  });
  content.setActions(btn);
     
     dialog.show();  
    }
}
