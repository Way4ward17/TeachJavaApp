/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teachjava.Examples;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPopup;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;

import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


/**
 * FXML Controller class
 *
 * @author way4ward
 */
public class ExampleHomeController implements Initializable {

    @FXML
    private VBox vbox;
    @FXML
    private JFXButton e1;
    @FXML
    private JFXButton e2;
    @FXML
    private JFXButton e3;
    @FXML
    private JFXButton e4;
    @FXML
    private JFXButton e5;
    @FXML
    private JFXButton e6;
    @FXML
    private JFXButton e7;
    @FXML
    private JFXButton e8;
    @FXML
    private JFXButton e9;
    @FXML
    private JFXButton e10;
    @FXML
    private JFXButton e11;
    @FXML
    private JFXButton e12;
    @FXML
    private JFXButton e13;
    @FXML
    private JFXButton e14;
    @FXML
    private TextArea imageview;
    @FXML
    private TextArea status;
    @FXML
    private JFXButton output;
    @FXML
    private AnchorPane outputpane;
    @FXML
    private Button closeoutput;
    @FXML
    private ImageView outputimage;
    @FXML
    private JFXButton e15;
    private static JFXPopup staticJFXPopup;
    @FXML
    private AnchorPane rootPane;
    @FXML
    private HBox popUpPane;
    @FXML
    private JFXButton e16;
    @FXML
    private JFXButton e17;
    @FXML
    private JFXButton e18;
    @FXML
    private JFXButton e19;
    @FXML
    private JFXButton e20;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   // popUpPane.setVisible(false);
        
        
        outputpane.setVisible(false);
        // TODO
   output.setOnAction(e->{
     outputpane.setVisible(true);  
  
   });  
   closeoutput.setOnAction(e->{
        outputpane.setVisible(false);
   });

     
e1.setOnAction(e->{
    outputimage.setImage(new Image("/images/examples/helloworld.PNG"));
    imageview.setText("//EXAMPLE 1\n" +
"package examples;\n" +
"\n" +
"public class Examples {\n" +
"public static void main(String[] args) {\n" +
"  System.out.println(\"HELLO WORLD\");\n" +
"   \n" +
" \n" +
"   }\n" +
"    }  \n" +
"\n" +
"");
    status.setText("");
});
e2.setOnAction(e->{
     outputimage.setImage(new Image("/images/examples/example2.PNG"));
    imageview.setText("EXAMPLE 2 PROGRAM TO ADD 5 AND 2\n" +
"package examples;\n" +
"\n" +
"public class Examples {\n" +
"public static void main(String[] args) {\n" +
"  int a = 5;\n" +
"  int b  = 2 , c;\n" +
"  c = a + b;\n" +
"  System.out.println(\"THE TOTAL IS: \"+ c);\n" +
"   \n" +
" \n" +
"   }\n" +
"    }  \n" +
"\n" +
"");
    status.setText("");
});
e3.setOnAction(e->{
     outputimage.setImage(new Image("/images/examples/example3.PNG"));
    imageview.setText("EXAMPLE 3 PROGRAM TO ADD TWO NUMBER \n"
            + "package examples;\n" +
"import java.util.Scanner;\n" +
"public class Examples {\n" +
"public static void main(String[] args) {\n" +
"    Scanner baba = new Scanner(System.in);\n" +
"    System.out.println(\"Enter the first number\");\n" +
"    int a=baba.nextInt();\n" +
"    System.out.println(\"Enter the second number\");\n" +
"    int b=baba.nextInt();\n" +
"     int c = a + b;\n" +
"     \n" +
"     System.out.println(\"THE TOTAL OF \"+a+\" AND \"+b+\" IS: \"+c);\n" +
"             \n" +
"    }  \n" +
"}");
    status.setText("TO ACCEPT INPUT FROM\n"
                 + "THE USER, YOU NEED TO\n"
                 + "IMPORT THE SCANNER");
});
e4.setOnAction(e->{
      outputimage.setImage(new Image("/images/examples/example4.PNG"));
    imageview.setText("EXAMPLE 4.. PROGRAM TO ADD, MULTI , DIV AND MODULUS\n" +
"package examples;\n" +
"import java.util.Scanner;\n" +
"public class Examples {\n" +
"public static void main(String[] args) {\n" +
"    Scanner baba = new Scanner(System.in);\n" +
"    System.out.println(\"Enter the first number\");\n" +
"    int a=baba.nextInt();\n" +
"    System.out.println(\"Enter the second number\");\n" +
"    int b=baba.nextInt();\n" +
"     int c = a + b;\n" +
"     int d = a * b;\n" +
"     double e = a / b;\n" +
"     int mod = a%b;\n" +
"     \n" +
"     System.out.println(\"THE SUM OF \"+a+\" AND \"+b+\" IS: \"+c);\n" +
"     System.out.println(\"\");//This is just to create a space\n" +
"     System.out.println(\"THE MULTIPLICATION OF \"+a+\" AND \"+b+\" IS: \"+d);\n" +
"     System.out.println(\"\");\n" +
"     System.out.println(\"THE DIVISION OF \"+a+\" AND \"+b+\" IS: \"+e);\n" +
"     System.out.println(\"\");\n" +
"     System.out.println(\"THE MODULUS OF \"+a+\" AND \"+b+\" IS: \"+mod);\n" +
"             \n" +
"    }  \n" +
"}");
    status.setText("");
});
e5.setOnAction(e->{
    outputimage.setImage(new Image("/images/examples/example5.PNG"));
    imageview.setText("EXAMPLE 5.. PROGRAM TO ADD AND TEST IF ITS GREATERTHAN 40\n" +
"package examples;\n" +
"import java.util.Scanner;\n" +
"public class Examples {\n" +
"public static void main(String[] args) {\n\n" +
"    Scanner baba = new Scanner(System.in);\n" +
"    System.out.println(\"Enter the first number\");\n" +
"    int a=baba.nextInt();\n" +
"    System.out.println(\"Enter the second number\");\n" +
"    int b=baba.nextInt();\n" +
"     int c = a + b;\n" +
"    if(c > 40){\n" +
"         System.out.println(c+\" IS GREATERTHAN 40\");  \n" +
"    }else{\n" +
"           System.out.println(\"IT IS LESSER THAN 40\");\n" +
"    }\n" +
"  \n" +
"     System.out.println(\"THE ADDITION OF \"+a+\" AND \"+b+\" IS: \"+c);\n" +
"             \n" +
"    }  \n" +
"}\n" +
            
""
    );
    imageview.setStyle("-fx-font-size:15px;");
    status.setText("");
});
e6.setOnAction(e->{
    outputimage.setImage(new Image("/images/examples/example6.PNG"));
   imageview.setText("EXAMPLE 6.. PROGRAM TO FIND LARGEST AMONG 3 NUMBERS\n" +
"package examples;\n" +
"import java.util.Scanner;\n" +
"public class Examples {\n" +
"public static void main(String[] args) {\n" +
"    Scanner baba = new Scanner(System.in);\n" +
"    System.out.println(\"Enter the first number\");\n" +
"    int a=baba.nextInt();\n" +
"    System.out.println(\"Enter the second number\");\n" +
"    int b=baba.nextInt();\n" +
"      System.out.println(\"Enter the Third number\");\n" +
"    int c=baba.nextInt();\n" +
"    \n" +
"    if(a > b && a > c){\n" +
"        System.out.println(\"A IS THE LARGEST: \"+a); \n" +
"    }else if(b > a && b > c){\n" +
"        System.out.println(\"B IS THE LARGETS: \" +b); \n" +
"    }else{\n" +
"         System.out.println(\"C IS THE LARGEST: \"+c);\n" +
"    }\n" +
"    }  \n" +
"}\n" +
""); 
   status.setText("THIS IS AN EXAMPLE ON\n"
           + "HOW TO USE AN IF ELSE STATEMENT\n"
           + "\n"
           + ">  GreaterThan\n"
           + "<  LesserThan\n"
           + "&& AND\n"
           + "|| OR\n"
           + ">= GreatherThan Or EqualTo\n"
           + "<= LesserThan Or EqualTo\n"
           + "== Equal To"
           + "! NOT");
});

e7.setOnAction(e->{
    outputimage.setImage(new Image("/images/examples/example7.PNG"));
    imageview.setText("//EXAMPLE 7.. PROGRAM TO PRINT OUT 1 - 10 Using While LOOP\n" +
"package examples;\n" +
"\n" +
"public class Examples {\n" +
"public static void main(String[] args) {\n" +
"   int a = 1;\n" +
"   while(a <= 10){\n" +
"       System.out.println(a);\n" +
"       a = a + 1;\n" +
  "       }" +          
"       }" +  
"");
status.setText("");
    });
e8.setOnAction(e->{
   outputimage.setImage(new Image("/images/examples/example8.PNG"));
   imageview.setText("//EXAMPLE 8.. PROGRAM TO PRINT AND SUM OUT 1 - 10 Using While LOOP\n" +
"package examples;\n" +
"\n" +
"public class Examples {\n" +
"public static void main(String[] args) {\n" +
"   int a = 1;\n" +
"   int sum = 0;\n" +
           " \n" +
"   while(a <= 10){\n" +
"       System.out.println(a);\n" +
"        sum +=a;\n" +
"       a = a + 1; \n" +
"   }\n" +
"   System.out.println(\"THE TOTAL OF 1 - 10 IS: \"+sum);\n" +
"    }  \n" +
"}\n" +
"");
   status.setText("TO DISPLAY AN EVEN NUMBER \n"
           + "JUST CHANGE THE INCREMENT i.e a = a + 1 \n"
           + "TO a = a + 2 THEN int a = 2 SO THE LIST\n"
           + "WILL START FROM 2");
}); 
e9.setOnAction(e->{
   outputimage.setImage(new Image("/images/examples/example9.PNG"));
   imageview.setText("EXAMPLE 9.. PROGRAM TO PRINT OUT 1 - 10 Using DO - WHILE LOOP\n" +
"package examples;\n" +
"\n" +
"public class Examples {\n" +
"public static void main(String[] args) {\n" +
"   int a = 1;\n" +
"   int sum = 0;\n" +
"   do{\n" +
"       System.out.println(a);\n" +
"       a = a + 1; \n" +
"   }while(a<=10);\n" +
"    }  \n" +
"}\n" +
"");
   status.setText("TO DISPLAY AN EVEN NUMBER \n"
           + "JUST CHANGE THE INCREMENT i.e a = a + 1 \n"
           + "TO a = a + 2 THEN int a = 2 SO THE LIST\n"
           + "WILL START FROM 2");
}); 
e10.setOnAction(e->{
   outputimage.setImage(new Image("/images/examples/example10.PNG"));
   imageview.setText("//EXAMPLE 10.. PROGRAM TO PRINT AND SUM OUT 1 - 10 Using DO - WHILE LOOP\n" +
"package examples;\n" +
"\n" +
"public class Examples {\n" +
"public static void main(String[] args) {\n" +
"   int a = 1;\n" +
"   int sum = 0;\n" +
"   do{\n" +
"       System.out.println(a);\n" +
"        sum +=a;\n" +
"       a = a + 1; \n" +
"   }while(a<=10);\n" +
"   System.out.println(\"THE TOTAL OF 1 - 10 IS: \"+sum);\n" +
"    }  \n" +
"}\n" +
"");
   status.setText("TO DISPLAY AN EVEN NUMBER \n"
           + "JUST CHANGE THE INCREMENT i.e a = a + 1 \n"
           + "TO a = a + 2 THEN int a = 2 SO THE LIST\n"
           + "WILL START FROM 2");
}); 
e11.setOnAction(e->{
   outputimage.setImage(new Image("/images/examples/example9.PNG"));
   imageview.setText("EXAMPLE 10.. PROGRAM TO PRINT OUT 1 - 10 Using DO - WHILE LOOP\n" +
"package examples;\n" +
"\n" +
"public class Examples {\n" +
"public static void main(String[] args) {\n" +
"   int a = 1;\n" +
"  for(a = 1; a <=10 ; a++){\n" +
"      System.out.println(a);\n" +
"  }\n" +
"    }  \n" +
"}\n" +
"");
   status.setText("");
}); 
e12.setOnAction(e->{
   outputimage.setImage(new Image("/images/examples/example10.PNG"));
   imageview.setText("EXAMPLE 12.. PROGRAM TO PRINT AND SUM OUT 1 - 10 Using DO - WHILE LOOP\n" +
"package examples;\n" +
"\n" +
"public class Examples {\n" +
"public static void main(String[] args) {\n" +
"   int a = 1;\n" +
"   int sum = 0;\n" +
"  for(a = 1; a <=10 ; a++){\n" +
"      System.out.println(a);\n" +
"      sum +=a;\n" +
"  }\n" +
"        System.out.println(\"THE TOTAL IS: \"+sum);\n" +
"\n" +
"    }  \n" +
"}\n" +
"");
   status.setText("");
}); 
e13.setOnAction(e->{
   outputimage.setImage(new Image("/images/examples/example13.PNG"));
   imageview.setText("EXAMPLE 13.. ANTHONY JOSHUA VS ANTHONY PARKER\n" +
"package examples;\n" +
"import java.util.Scanner;\n" +
"public class Examples {\n" +
"public static void main(String[] args) {\n" +
"    Scanner baba = new Scanner(System.in);\n" +
"   int a = 1;\n" +
"   int sum = 0 , sum1 =0;\n" +
"   int i , j;\n" +
"  for(a = 1; a <=3 ; a++){\n" +
"      System.out.println(\"ENTER THE POINT OF THE \"+a+\" JUDGE FOR ANTHONY JOSHUA\");\n" +
"     i =baba.nextInt();\n" +
"      sum +=i;\n" +
"  }\n" +
"  for(int b = 1; b <=3 ; b++){\n" +
"      System.out.println(\"ENTER THE POINT OF THE \"+b+\" JUDGE FOR ANTHONY PARKER\");\n" +
"      j = baba.nextInt();\n" +
"      sum1 +=j;\n" +
"  }    \n" +
"  if(sum > sum1){\n" +
"      System.out.println(\"WIN!!.. ANTHONY JOSHUA \");\n" +
"  }else if(sum1 > sum){\n" +
"      System.out.println(\"WIN!!.. ANTHONY PARKER \");\n" +
"  }else if(sum == sum1){\n" +
"      System.out.println(\"ITS A TIE \");\n" +
"  }\n" +
"\n" +
"    }  \n" +
"}\n" +
"");
   status.setText("ALWAYS REMEMBER THAT TO \n"
           + "ACCEPT AN INPUT FROM THE\n"
           + "USER YOU MUST ALWAYS IMPORT"
           + "THE SCANNER CLASS ");
}); 
e14.setOnAction(e->{
   outputimage.setImage(new Image("/images/examples/example14.PNG"));
   imageview.setText("/**In a typical PUTME Examination, it is believed that \n" +
"students from different classes of studies \n" +
"(e.g. SCIENCE, ARTS & COMMERCIAL classes) partake \n" +
"in such an examination. It is also expected that such \n" +
"classes of students are given different examination requirements\n" +
"\n" +
"Write a Java GUI SWITCH-CASE CLASS program that prompts a student\n" +
"*to input his/her class of studies (e.g. science, arts or commercial)\n" +
"*, then capture and output the appropriate examination requirement\n" +
"* for such student.	\n" +
"**/\n" +
"\n" +
"package examples;\n" +
"import javax.swing.JOptionPane;\n" +
"public class Examples {\n" +
"    public static void main(String[]args){\n" +
"String myclass;\n" +
"int department;\n" +
"myclass=JOptionPane.showInputDialog(\"SELECT AS BELOW FOR EXAM INSTRUCTIONS\\n1.SCIENCE\\n2.ARTS\\n3.COMMERCIAL\");\n" +
"department=Integer.parseInt(myclass); //to parse the value to int\n" +
"switch(department){\n" +
"  case 1:\n" +
"   JOptionPane.showMessageDialog(null,\"1. You are permitted to come with  calculator and pencil.\\n\" + \n" +
"  \"2.	You will be taking 5 exams.\\n\" +\n" +
"  \"3.	For you, Mathematics is compulsory regardless of your chosen course.\",\n" +
"           \"SCIENCE EXAM INSTRUCTION\",JOptionPane.INFORMATION_MESSAGE);\n" +
"  break;\n" +
"  case 2:\n" +
" JOptionPane.showMessageDialog(null,\"1.	You are not permitted to come with calculator and pencil.\\n\" +\n" +
"         \"2.	You will be taking 3 exams.\\n\" +\n" +
"         \"3.	For you, Literature is compulsory regardless of your chosen course.\",\n" +
"         \"ARTS EXAM INSTRUCTION\",JOptionPane.INFORMATION_MESSAGE);\n" +
" break;\n" +
" case 3:\n" +
" JOptionPane.showMessageDialog(null,\"1.\\tYou are permitted to come with your calculator and pencil.\\n\" +\n" +
"         \"2.	You will be taking 4 exams.\\n\" +\n" +
"         \"3.	For you, Government is compulsory regardless of your chosen course.\",\n" +
"         \"COMMERCIAL EXAM INSTRUCTION\",JOptionPane.INFORMATION_MESSAGE);\n" +
" break;\n" +
" default:\n" +
" JOptionPane.showMessageDialog(null,\"INVALID ENTRY. TRY AGAIN!!!\",\"ERROR MESSAGE\",\n" +
"         JOptionPane.ERROR_MESSAGE);\n" +
"   }\n" +
"    }\n" +
"}\n" +
"");
   status.setText("");
}); 

e15.setOnAction(e->{
   outputimage.setImage(new Image("/images/examples/example15.PNG"));
   imageview.setText("EXAMPLE 15 \n"
           + "The game of LUDO is designed to be played by four (4). Design a JAVA Application using\n" +
"random facility available to allow for the game to be played three (3) \n" +
"times by four (4) different people. For each game however, we want to\n" +
"capture the winner by recording the values thrown. So, in your coding,\n" +
"allow the values of the dice thrown by each player to be recorded for them\n" +
"From the scores recorded, sum all the values thrown by each player against\n" +
"their id and then compare to know which of the four (4) players has the highest\n" +
"figure thrown after three (3) rounds of play; consequently, adjudge the\n" +
"person to be the winner (e.g. PLAYER 1 is the WINNER! ACCEPT MY CONGRATULATIONS!!HURRAY!!!).\n" +
"\n" +
"25 MARKS**/\n" +
"\n" +
           "\n" +
           "\n" +
"package examples;\n" +
"import java.util.Random;\n" +
"public class Examples {\n" +
"    public static void main(String[] args) {\n" +
"        Random ludo=new Random();\n" +
"        String playerid[]= {\"PLAYER001\",\"PLAYER002\",\"PLAYER003\",\"PLAYER004\"};\n" +
"        int playpoint[][]= new int[4][3];\n" +
"        int sumpoint[]={0,0,0,0};\n" +
"        for(int i=0;i<4;i++){\n" +
"            for(int j=0;j<3;j++){\n" +
"                playpoint[i][j]=ludo.nextInt(6)+1; //to get a random num from 1 - 6\n" +
"                sumpoint[i]=sumpoint[i]+playpoint[i][j];\n" +
"            }\n" +
"        }\n" +
"        \n" +
"        for(int i=0;i<4;i++){\n" +
"             System.out.printf(\"%s POINTS ARE:\\n\",playerid[i]);\n" +
"            for(int j=0;j<3;j++){\n" +
"                System.out.println(playpoint[i][j]);\n" +
"            }\n" +
"            System.out.printf(\"SUM OF POINT IS %d\\n\",sumpoint[i]);\n" +
"            if(sumpoint[0]>sumpoint[i]){\n" +
"                sumpoint[0]=sumpoint[i];\n" +
"                playerid[0]=playerid[i];\n" +
"            }\n" +
"        }\n" +
"        System.out.printf(\"THE WINNER IS %s ACCEPT MY CONGRATULATION\",playerid[0]);\n" +
"      \n" +
"                }\n" +
"        \n" +
"}\n" +
"\n" +
"\n" +
"");
   status.setText("");
}); 
 e16.setOnAction(e->{
     outputimage.setImage(new Image("/images/examples/example16.PNG"));
     imageview.setText("EXAMPLE 16. ARRAY, MAX and MIN NUMBER \n\n"
             + "import java.util.Scanner;\n" +
"public class Tube {\n" +
"	public static void main(String[] args) {\n\n" +
"int a[] = new int[5], i;\n" +
"Scanner baba = new Scanner(System.in);\n" +
"\n" +
"for(i = 0;i <=4; i++) {\n" +
"	System.out.println(\"ENTER THE \"+(i + 1)+\" NUMBER\");\n" +
"	a[i] = baba.nextInt();\n" +
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
"	\n" +
"}\n" +
"");
 });
    e17.setOnAction(e->{
        outputimage.setImage(new Image("/images/examples/example17.PNG"));
       imageview.setText("EXAMPLE 17. PROGRAM TO ACCEPT INTO 2\n ARRAY AND PRINT IT OUT \n"
               + "import java.util.Scanner;\n" +
"public class Tube {\n" +
"	public static void main(String[] args) {\n" +
"int a[][] = new int[4][3], j, i;\n" +
"int b[][] = new int[4][3];\n" +
"Scanner baba = new Scanner(System.in); \n" +
"//ACCEPT THE FIRST MATRIX\n" +
"for (i = 0;i<=3 ; i++) {//i is the \n" +
"	System.out.println(\"ENTER THE \"+(i + 1)+\" ROW\");\n" +
"for(j = 0;j <=2; j++) {\n" +
"	System.out.println(\"ENTER THE \"+(j + 1)+\" COLUMN\");\n" +
"	a[i][j] = baba.nextInt();\n" +
"\n" +
"}\n" +
"}\n" +
"System.out.println(\"INPUTTING THE SECOND MATRIX B\");\n" +
"for (i = 0;i<=3 ; i++) {//i is the \n" +
"	System.out.println(\"ENTER THE \"+(i + 1)+\" ROW\");\n" +
"for(j = 0;j <=2; j++) {\n" +
"	System.out.println(\"ENTER THE \"+(j + 1)+\" COLUMN\");\n" +
"	b[i][j] = baba.nextInt();\n" +
"}\n" +
"}\n" +
"System.out.println(\"THE FIRST FORMED MATRIX\");\n" +
"for (i = 0;i<=3 ; i++) {\n" +
"for(j = 0;j <=2; j++) {\n" +
"	System.out.print(a[i][j] +\"\\t\");\n" +
"\n" +
"}\n" +
"System.out.println();\n" +
"}\n" +
"\n" +
"System.out.println(\"THE SECOND FORMED MATRIX\");\n" +
"System.out.println(\"\\n\");\n" +
"for (i = 0;i<=3 ; i++) {\n" +
"for(j = 0;j <=2; j++) {\n" +
"\n" +
"	System.out.print(b[i][j] +\"\\t\");\n" +
"}\n" +
"System.out.println();\n" +
"}\n" +
"\n" +
"	}\n" +
"	\n" +
"}\n" +
""
); 
  status.setText("NOTE\n"
               + "YOU CAN BOTH COMBINE\n"
               + "THE LINE TO ACCEPT \n"
               + "THE ARRAY AND PRINT \n"
               + "OUT THE IN A SINGLE LOOP\n"
               + "THAT MAKES 2 LOOPS IN\n"
               + "THE WHOLE PROGRAM INSTEAD OF 4");
    }); 
    e18.setOnAction(e->{
        outputimage.setImage(new Image("/images/examples/example18.PNG"));
       imageview.setText("EXAMPLE 18. PROGRAM TO FIND FACTORIAL OF ANY NUMBER \n\n"
               + "import java.util.Scanner;\n" +
"class Factorial{\n" +
"public static void main(String args[]){\n" +
"int n, c, fact = 1;\n" +
"\n" +
"System.out.println(\"Enter an integer to calculate it's factorial\");\n" +
"Scanner in = new Scanner(System.in);\n" +
"n = in.nextInt();\n" +
"for ( c = 1 ; c <= n ; c++ )\n" +
"fact = fact*c;\n" +
"System.out.println(\"Factorial of \"+n+\" is = \"+fact);\n" +
"}\n" +
"   }");
     status.setText("");
    });
    
       e19.setOnAction(e->{
        outputimage.setImage(new Image("/images/examples/example19.PNG"));
       imageview.setText("EXAMPLE 19. HELLO WORLD USING JOptionPane \n\nimport javax.swing.JOptionPane;\n" +
"public class Examples {\n" +
"    public static void main(String[] args) {\n" +
"   \n" +
"     JOptionPane.showMessageDialog(null , \"WELCOME TO WAY4WARD ACADEMY\");\n" +
"     \n" +
"}\n" +
"}");
        status.setText("");
       });
        e20.setOnAction(e->{
        outputimage.setImage(new Image("/images/examples/example20.PNG"));
       imageview.setText("EXAMPLE 20. JOptionPane CONFIRM DIALOG \n\nimport java.awt.Component;\n" +
"import javax.swing.JOptionPane;\n" +
"public class Examples {\n" +
"    public static void main(String[] args) {\n" +
"   \n" +
"     JOptionPane.showConfirmDialog((Component)null , \"WELCOME TO WAY4WARD ACADEMY\", \"INFORMATION MESSAGE\",JOptionPane.INFORMATION_MESSAGE);\n" +
"     JOptionPane.showConfirmDialog((Component)null , \"WELCOME TO WAY4WARD ACADEMY\", \"OK_OPTION\",JOptionPane.OK_OPTION);\n" +
"     JOptionPane.showConfirmDialog((Component)null , \"WELCOME TO WAY4WARD ACADEMY\", \"OK_CANCEL_OPTION\",JOptionPane.OK_CANCEL_OPTION);\n" +
"     JOptionPane.showConfirmDialog((Component)null , \"WELCOME TO WAY4WARD ACADEMY\", \"ERROR_MESSAGE\",JOptionPane.ERROR_MESSAGE);\n" +
"     JOptionPane.showConfirmDialog((Component)null , \"WELCOME TO WAY4WARD ACADEMY\", \"CLOSED_OPTION\",JOptionPane.CLOSED_OPTION);\n" +
"}\n" +
"}");
        status.setText("");
       });

            }
     @FXML
    private void openDialog(MouseEvent event) {
       
        JFXPopup fXPopup = new JFXPopup();
        fXPopup.setPopupContent(popUpPane);
        fXPopup.show(rootPane, JFXPopup.PopupVPosition.TOP, JFXPopup.PopupHPosition.LEFT, 10, 70);
        staticJFXPopup = fXPopup;
 
    }
}
