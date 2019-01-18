/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teachjava.Videos;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import static javafx.scene.media.MediaPlayer.Status.PLAYING;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author way4ward
 */
public class VideoHomeController implements Initializable {

    @FXML
    private MediaView mview;
    @FXML
    private JFXButton a;
    @FXML
    private JFXButton b;
    @FXML
    private JFXButton a1;
    @FXML
    private JFXButton b1;
    @FXML
    private JFXButton a11;
    @FXML
    private JFXButton b11;
    @FXML
    private JFXButton a111;
    @FXML
    private JFXButton b111;
    @FXML
    private JFXButton a1111;
    @FXML
    private JFXButton b1111;
    @FXML
    private JFXButton a11111;
    @FXML
    private JFXButton b11111;
    @FXML
    private JFXButton a111111;
    @FXML
    private JFXButton b111111;
    @FXML
    private JFXButton a1111111;
    @FXML
    private JFXButton b1111111;
    @FXML
    private JFXButton a11111111;
    @FXML
    private JFXButton b11111111;
    @FXML
    private JFXButton a111111111;
    @FXML
    private JFXButton b111111111;
    @FXML
    private JFXButton a1111111111;
    @FXML
    private JFXButton b1111111111;
    @FXML
    private JFXButton a11111111111;
    @FXML
    private JFXButton b11111111111;
    @FXML
    private JFXButton a111111111111;
    @FXML
    private JFXButton b111111111111;
    @FXML
    private JFXButton a1111111111111;
    @FXML
    private JFXButton b1111111111111;
    @FXML
    private JFXButton a11111111111111;
    @FXML
    private JFXButton b11111111111111;
    @FXML
    private JFXButton a111111111111111;
    @FXML
    private JFXButton b111111111111111;
    @FXML
    private JFXButton a1111111111111111;
    @FXML
    private JFXButton b1111111111111111;

    
MediaPlayer mediaplayer;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

      
 // file:/C:/Users/way4ward/Documents/NetBeansProjects/TeachJava/src/teachjava/vid/JAVA_ONE.mp4
    }    
    
  private void player(String V){
       String Vurl =(V);
           Media media = new Media(Vurl);
           mediaplayer = new MediaPlayer(media);
           mview.setMediaPlayer(mediaplayer); 
    }
  //  
    @FXML
  private void a(ActionEvent event){
 player("file:/C:/Users/way4ward/Desktop/JAVACONSOLE/JAVA_ONE.mp4");
      if(mediaplayer.getStatus() == PLAYING){
          mediaplayer.stop();
          mediaplayer.play();
      }else{
          mediaplayer.play();
      }    
  }  
  
  @FXML
  public void stop(ActionEvent event){
      mediaplayer.stop();
  }
}
