/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teachjava;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDecorator;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author way4ward
 */
public class LoadPageController implements Initializable {

    @FXML
    private Text t;
    @FXML
    private ImageView img1;
    @FXML
    private Label lb1;
    @FXML
    private ImageView img2;
    @FXML
    private Label lb2;
    @FXML
    private ImageView img3;
    @FXML
    private Label lb3;
    @FXML
    private ImageView img4;
    @FXML
    private Label lb4;
    @FXML
    private ImageView img5;
    @FXML
    private Text t1;
    @FXML
    private Text t11;
    @FXML
    private Text t111;
    @FXML
    private Text t1111;
private RotateTransition r,r1,r2,r3,r4;
    @FXML
    private JFXButton launchd;
    /**
     * Initializes the controller class.
     */
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    } 
    private void name(){
         img1.setImage(new Image("/images/icons8_Rotate_24px.png"));
        t.setText("Loading Modules");
        r = new RotateTransition(Duration.seconds(1),img1);
        r1 = new RotateTransition(Duration.seconds(0),img2);
        r2 = new RotateTransition(Duration.seconds(1),img3);
        r3 = new RotateTransition(Duration.seconds(1),img4);
        r4 = new RotateTransition(Duration.seconds(4),img5);
        
        RotateTransition rt[]={r,r1,r2,r3,r4};
        
        for(RotateTransition rt1:rt){
            rt1.setCycleCount(1);
            rt1.setAutoReverse(false);
            rt1.setFromAngle(720);
            rt1.setToAngle(0);
        }
        r.play();
        r.setOnFinished((e)->{
        img1.setImage(new Image("/images/icons8_Ok_24px_1.png"));
        lb1.setStyle("-fx-background-color:limegreen");
        img2.setImage(new Image("/images/icons8_Rotate_24px.png"));
       t1.setText("Checking System Settings");
       r1.play();
        });
        
         r1.setOnFinished((e)->{
        img2.setImage(new Image("/images/icons8_Ok_24px_1.png"));
        lb2.setStyle("-fx-background-color:limegreen");
        img3.setImage(new Image("/images/icons8_Rotate_24px.png"));
       t11.setText("Applying Setting to System");
       r2.play();
        });
         
          r2.setOnFinished((e)->{
        img3.setImage(new Image("/images/icons8_Ok_24px_1.png"));
        lb3.setStyle("-fx-background-color:limegreen");
        img4.setImage(new Image("/images/icons8_Rotate_24px.png"));
       t111.setText("Loading App");
       r3.play();
        });
          
           r3.setOnFinished((e)->{
        img4.setImage(new Image("/images/icons8_Ok_24px_1.png"));
        lb4.setStyle("-fx-background-color:limegreen");
        img5.setImage(new Image("/images/icons8_Rotate_24px.png"));
       t1111.setText("Ready To Use");
       r4.play();
        });
           
           r4.setOnFinished((e)->{
           
                img5.setImage(new Image("/images/icons8_Ok_24px_1.png"));
                // lb.setStyle("-fx-background-color:limegreen");
                
              
  
                try{
                Parent root = FXMLLoader.load(getClass().getResource("/teachjava/Home.fxml"));
                
                Stage stage = new Stage();
                JFXDecorator decorator=new JFXDecorator(stage, root, false, false, true);
                decorator.setCustomMaximize(false);
                decorator.setBorder(Border.EMPTY);
                
                Scene scene = new Scene(decorator);
                String css = Home.class.getResource("css.css").toExternalForm();
                scene.getStylesheets().add(css);
                
                stage.initStyle(StageStyle.UNDECORATED);
                launchd.getScene().getWindow().hide();
                
                stage.setScene(scene);
                stage.centerOnScreen();
                
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(LoadPageController.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        
       
           
           
           });
    }
    
    @FXML
    private void loadApp(ActionEvent event){
       name(); 
       
    }

    @FXML
    private void lauchAppEnetr(KeyEvent event) {
      if(event.getCode() == KeyCode.ENTER){
        name();  
    }
    }
}
