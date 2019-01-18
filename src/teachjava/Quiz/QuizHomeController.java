/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teachjava.Quiz;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import org.controlsfx.control.textfield.TextFields;

/**
 * FXML Controller class
 *
 * @author way4ward
 */
public class QuizHomeController implements Initializable {

    @FXML
    private TextArea dialog;
    @FXML
    private TextField input;
  String[][] chatBot={
           //standard greetings
        {"hi","hello","holla","howdy"},
        {"hi","xup"},
        //question greeting
        {"how are you","are u doing","how er u"},
        {"good and you?","doing well, and you?"},
        //intro
        {"who are you","wu er u","what is ur name","what is your name"},
        {"I am way4ward Chat Bot\n \t\tProcessor:10GHTZ \n\t \t HDD: 50TERA_BYTE",""},
        
        //for loop
       {"how can i use a for loop"},
       {"for(int i = 1 ; i<=10 ; i++){\n\t\tSystem.out.println(i);\n\t\t}"},
        //kk
        {"k","kk","kkk","ok","okay","okies"},
        {"Alright"},
       
        //array
        {"how to use an array","array","what is an array"},
        {"THIS IS AN EXAMPLE \nint a[] = new int[5], i;\n" +
"Scanner baba = new Scanner(System.in);\n" +
"\n" +
"for(i = 0;i <=4; i++) {\n" +
"System.out.println(\"ENTER THE \"+(i + 1)+\" NUMBER\");\n" +
"a[i] = baba.nextInt();\n" +
"}\n" +
"\n" +
"for(i = 0;i <=4; i++) {\n" +
"if(a[0] > a[i]) {\n" +
"	a[0] = a[i];\n" +
"}\n" +
"}\n" +
"System.out.println(\"THE MINIMUM IS: \"+a[0]);	\n" +
"\n" +
"System.out.println(\"\\n\\n\");\n" +
"\n" +
"for(i = 0;i <=4; i++) {\n" +
"if(a[0] < a[i]) {\n" +
"	a[0] = a[i];\n" +
"}\n" +
"}\n" +
"System.out.println(\"THE MAXIMUM IS: \"+a[0]);\n" +
"	}\n" +
"	"},
        {"papa"},
        {"bobo"},
        //testin
        {"baba"},
        {"mama"},
        //default
        {"I dont understand you, Can u pls select \n from the auto complete option \n \t\t or"
          + "from read abt me", "Cant get u, Can u pls select \n \t\tfrom the auto complete option \n \t\t or"
          + "from read abt me"}
        };
    @FXML
    private Label status;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        String[] possiblewords = {"hi","java","hello","how to","way4ward","how can i use a for loop"};
       TextFields.bindAutoCompletion(input, possiblewords);
 //input = TextFields.createClearableTextField();
 //dialog.setStyle("-fx-background-color:yellow;");
    }    

    
    @FXML
    public void sendbutton(ActionEvent event){
        send();
        input.setText("");
        status.setText("");
    }
    @FXML
    public void keyPressed(KeyEvent event) {
        if(event.getCode() == KeyCode.ENTER){
         dialog.setEditable(false);
            //---grabe quote
            String quote = input.getText();
            input.setText("");
            
               dialog.setText("-->YOU\t"+quote); 
           
            
            quote = quote.trim();
            while(
            quote.charAt(quote.length() - 1)=='!'||
            quote.charAt(quote.length() - 1)==','||     
            quote.charAt(quote.length() - 1)=='?'        
                    ){
            quote = quote.substring(0,quote.length()-1);   
            
            }
 
            quote = quote.trim();
            byte response =0;
            int j =0;
            
            while(response ==0){
                if(intArray(quote.toLowerCase(),chatBot[j * 2])){
                    response = 2;
                   int r = (int)Math.floor(Math.random() * chatBot[(j * 2) + 1].length);
                    addText("\n-->BOT \t"+ chatBot[(j * 2)+ 1][r]); 
                }        
           j++;
            if(j * 2 == chatBot.length - 1 && response ==0){
                response = 1;
            }
             
            }
        
            //---if not match ---default
            if(response ==1){
              int r = (int)Math.floor(Math.random() * chatBot[chatBot.length -1].length);
            
                addText("\n-->BOT \t"+ chatBot[chatBot.length -1][r]);     
                 
            }
             addText("\n");
              
        }
    }
    
    
    public void send(){
         dialog.setEditable(false);
            //---grabe quote
            String quote = input.getText();
            input.setText("");
            
               dialog.setText("-->YOU\t"+quote); 
           
            
            quote = quote.trim();
            while(
            quote.charAt(quote.length() - 1)=='!'||
            quote.charAt(quote.length() - 1)==','||     
            quote.charAt(quote.length() - 1)=='?'        
                    ){
            quote = quote.substring(0,quote.length()-1);   
            
            }
 
            quote = quote.trim();
            byte response =0;
            int j =0;
            
            while(response ==0){
                if(intArray(quote.toLowerCase(),chatBot[j * 2])){
                    response = 2;
                   int r = (int)Math.floor(Math.random() * chatBot[(j * 2) + 1].length);
                                     
                  
                     addText("\n-->BOT \t"+ chatBot[(j * 2)+ 1][r]); 
                }        
           j++;
            if(j * 2 == chatBot.length - 1 && response ==0){
                response = 1;
            }
             
            }
        
            //---if not match ---default
            if(response >=1){
              int r = (int)Math.floor(Math.random() * chatBot[chatBot.length -1].length);
            
                addText("\n-->BOT \t"+ chatBot[chatBot.length -1][r]);     
                 
            }
             addText("\n");
         
    }
public boolean intArray(String in , String[] string){
   boolean match =false;
   for(int i = 0; i< string.length;i++){
       if(string[i].equals(in)){
           match = true;
       }
   }
   return match;
}
    @FXML
    public void KeyReleased(KeyEvent event) {
    }

    @FXML
    public void keyTyped(KeyEvent event) {
    }

    private void addText(String string) {
       
          dialog.setText(dialog.getText()+string);
       

    }

    @FXML
    private void labelkeypressed(KeyEvent event) {
        if (input.getText().trim().length() > 0){
           status.setText("You are Typing");
        }
         if (input.getText().isEmpty()){
           status.setText("");
        }
    }
   
    
}
