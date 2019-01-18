/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teachjava.Tutorial;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author way4ward
 */
public class TutorialHomeController implements Initializable {

    @FXML
    private TextArea CHP1intro;
    @FXML
    private TextArea chap2;
    @FXML
    private TextArea chp3;
    @FXML
    private TextArea chp4;
    @FXML
    private TextArea chp5;
    @FXML
    private TextArea chp6;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       CHP1intro.setText("1.1 INTRODUCTION\n"
               + "Java is a simple and yet powerful object oriented programming language and it is in many respects similar to C++.Java is created by\n"
               + "James Gosling from Sun Microsystems (Sun) in 1991.The first publicly available version of Java (Java 1.0) was released in 1995.\n"
               + "\n"
               
               + "Java is defined by a specification and consists of a programming language,a compiler, core libraries and a runtime machine(Java\n"
               + "virtual machine).The Java runtime allows software developers to write program code in other languages than the Java programming\n "
               + "language which still runs on the Java virtual machine.The Java platform is usually associated with the Java virtual machine and the\n "
               + "Java core libraries.\n"
               +"\n"
               + "JAVA VIRTUAL MACHINE\n"
               +"\n"
               + "The Java virtual machine (JVM) is a software implementation of a computer that executes programs like a real machine.\n"
               + "Java Runtime Environment vs. Java Development KitA\n"
               + "Java distribution typically comes in two flavors, the Java Runtime Environment(JRE) and the Java Development Kit (JDK).The JRE consists\n"
               + "of the JVM and the Java class libraries. Those contain the necessary functionality to start Java programs.The JDK additionally contains\n"
               + "the development tools necessary to create Java programs.\n"
               + "The JDK therefore consists of a Java compiler, the Java virtual machine and the Java class libraries.\n"+"\n"
               + "USES OF JAVA\n"
               +"\n"
               + "Java is also used as the programming language for many different software programs,games, and add-ons. Some examples of the more widely \n"
               + "used programs written in Java or that use Java include the Android apps, Big Data Technologies, Adobe Creative suite, Eclipse,Lotus Notes,\n"
               + "Minecraft, OpenOffice, 23Runescape, and Vuze."
    +"\n"           
               +"1.2 FEATURES\n"+"\n"
               +"1. SIMPLE\n"
               +"Java is easy to learn and its syntax is quite simple and easy to understand."

               +"2. OBJECT-ORIENTED\n"
               +"In java everything is Object which has some data and behaviour. Java can be easily extended as it is based on Object Model.\n"
+"\n"
               +"3. PLATFORM INDEPENDENT\n"
               +"Unlike other programming languages such as C, C++ etc which are compiled into platform specific machines. Java is guaranteed to be write-once\n"
               +"run-anywhere language. On compilation Java program is compiled into bytecode. This bytecode is platform independent and can run on any machine\n"
               +"plus this bytecode format also provide security. Any machine with Java Runtime Environment can run Java Programs.\n"
+"\n"
               +"4. SECURED\n"
               +"When it comes to security,Java is always the first choice. With java secure features it enable us to develop virus free,temper free system.Java\n"
               +"program always runs in Java runtime environment with almost null interaction with system OS, hence it is more secure.\n"
+"\n"
               +"5. ROBUST\n"
               +"Java makes an effort to eliminate error prone codes by emphasizing mainly on compile time error checking and runtime checking.But the main areas\n"
               +"which Java improved were Memory Management and mishandled Exceptions by introducing automatic Garbage Collector and Exception Handling.\n"
+"\n"
               +"6. PORTABLE\n"
               +"Java Bytecode can be carried to any platform. No implementation dependent features. Everything related to storage is predefined, example: size\n"
               +"of primitive data types\n" 
+"\n"
               +"7. HIGH PERFORMANCE\n"
               +"Java is an interpreted language, so it will never be as fast as a compiled language like C or C++. But, Java enables high performance with the \n"
               +"use of just-in-time compiler.\n"
+"\n"
               +"8. MULTI-THRENDING\n"
               +"Java multithreading feature makes it possible to write program that can do many tasks simultaneously. Benefit of multithreading is that it utilizes\n"
               +"same memory and other resources to execute multiple threads at the same time, like While typing, grammatical errors are checked along.\n"

+"\n"

               +"9. INTERPRETED\n"
               +"An interpreter is needed in order to run Java programs. The programs are compiled into Java Virtual Machine code called bytecode. The bytecode is \n"
               +"machine independent and is able to run on any machine that has a Java interpreter. With Java, the program need only be compiled once, and the bytecode\n"
               +"generated by the Java compiler can run on any platform."
+"\n"


               +"1.3 ADVANTAGES AND DISADVANTAGES\n"+"\n"

               +"ADVANTAGE\n"
               +"\n"
               +"1. Java is Simple.\n"+"\n"
               +"2. Java is object-oriented because programming in Java is centered on creating objects, manipulating objects, and making objects work together.\n"
               +"This allows you to create modular programs and reusable code.\n"+"\n"
               +"3. One of the most significant advantages of Java is Platform indenpendence.\n"+"\n"
               +"4. Java is Secure: Java is one of the first programming languages to consider security as part of its design. \n"+"\n"
               +"5. Java is Multithreaded: Multithreaded is the capability for a program to perform several tasks simultaneously within a program.\n"+"\n"
               +"6. Java is Robust: Robust means reliable and no programming language can really assure reliability.\n"+"\n"
+"\n"
               +"DISADVANTAGES\n"+"\n"
               +"1. Java can be perceived as significantly slower and more memory-consuming than natively compiled languages such as C or C++.\n"+"\n"
               +"2. No local constants. In Java, variables that belong to a class can be made constant by declaring them to be final. Variables that\n"+"\n"
               +"are local to a method cannot be declared final, however.\n"+"\n"
               +"3. Java is predominantly a single-paradigm language. However, with the addition of static imports in Java 5.0 the procedural paradigm is better\n"
               +"accommodated than in earlier versions of Java."

       );
       
       
chap2.setText("2.1 Environment Setup\n" +
"\n" +
"We need to install the Java Development Toolkit aka JDK, which is bundled with the Java Runtime Environment.\n" +
"At this moment, the latest JDK versions is JDK 8.\n" +
"All you have to do is head to the main download page provided by Oracle , and download the latest version that you will find.\n" +
"\n" +
"Follow the instructions to download java and run the .exe to install Java on your machine. Once you installed Java on your machine\n"
        + ", you would need to set environment variables to point to correct installation directories.\n" +
"\n" +
"Assuming you have installed Java in\n" +
"c:\\Program Files\\java\\jdk\n" +
"1. Right-click on 'My Computer' and select 'Properties'.\n" +
"2. Click on the 'Environment variables' button under the 'Advanced' tab.\n" +
"3. Now, alter the 'Path' variable so that it also contains the path to the Java executable.\n" +
"\n" +
"Example, if the path is currently set to \n" +
"'C:\\WINDOWS\\SYSTEM32',\n" +
"then change your path to read \n" +
"'C:\\WINDOWS\\SYSTEM32; c:\\Program Files\\java\\jdk\\bin'.\n" +
"\n" +
"Setting up the path for Linux, Ubuntu, UNIX, Solaris\n" +
"Environment variable PATH should be set to point to where the Java binaries have been installed.\n" +
"Refer to your shell documentation if you have trouble doing this.\n" +
"\n" +
"Example, if you use bash as your shell, then you would add the following line to the end of your \n" +
"'.bashrc: export PATH=/path/to/java:$PATH'\n" +
"\n" +
"Up until now we have installed a variety of tools towards setting up our Java Development environment. \n" +
"\n" +
"Since the JDK is already installed (from step one) we could actually jump to coding just by using our text editor of choice \n"
        + "(NotePad++, TextPad, NotePad, Ultra Edit etc) and invoking the javac and java commands from the command line.\n");


chp3.setText("3.1 Variables\n" +
"\n" +
"A variable provides us with named storage that our programs can manipulate. \n" +
"Each variable in Java has a specific type, which determines the size and layout of the variable's memory; the range of values that can be\n"
        + " stored within that memory; and the set of operations that can be applied to the variable.\n" +
"\n" +
"You must declare all variables before they can be used. \n" +
"The basic form of a variable declaration is shown here:\n" +
"data_type variable = value;\n" +
"\n" +
"Here data type is one of Java's datatypes and variable is the name of the variable. To declare more than one variable of the specified type,\n"
        + " you can use a comma-separated list.\n" +
"\n" +
"Following are valid examples of variable declaration and initialization in Java:\n" +
"int a, b, c;\n" +
"// Declares three ints, a, b, and c.\n" +
"\n" +
"int a = 10, b = 10;\n" +
"// Example of initialization\n" +
"\n" +
"double pi = 3.14159;\n" +
"// declares and assigns a value of PI.\n" +
"\n" +
"char a = 'a';\n" +
"// the char variable a iis initialized with value 'a'\n" +
"\n" +
"Constant: During the execution of program, value of variable may change. A constant represents permanent data that never changes. \n" +
"\n" +
"If you want use some value likes p=3.14159; no need to type every time instead you can simply define constant for p, following is the\n"
        + " syntax for declaring constant.\n" +
"Static final datatype ConstantName = value;\n" +
"\n" +
"Example: static final float PI=3.14159; \n" +
"\n" +
"\n" +
"\n" +
"3.2 Data type\n" +
"\n" +
"Every variable in Java has a data type. Data types specify the size and type of values that can be stored.\n" +
"Data types in Java divided primarily in two tyeps: \n" +
"Primitive(intrinsic) and Non-primitive.\n" +
"\n" +
"Primitive types contains Integer, Floating points, Characters, Booleans And Non-primitive types contains Classes, Interface and Arrays.\n" +
"\n" +
"Integer:This group includes byte, short, int and long, which are whole signed numbers.\n" +
"Floating-point Numbers: This group includes float and double, which represent number with fraction precision.\n" +
"Characters: This group includes char, which represents character set like letters and number\n" +
"Boolean: This group includes Boolean, which is special type of representation of true or false value.\n" +
"\n" +
"Some data types with their range and size:\n" +
"byte: -128 to 127 (1 byte)\n" +
"\n" +
"short: -32,768 to +32,767 (2 bytes)\n" +
"\n" +
"int: -2,147,483,648 to +2,147,483,647 (4 bytes)\n" +
"\n" +
"float: 3.4e-038 to 1.7e+0.38 (4 bytes)\n" +
"\n" +
"double: 3.4e-038 to 1.7e+308 (8 bytes)\n" +
"\n" +
"char : holds only a single character(2 bytes)\n" +
"\n" +
"boolean : can take only true or false (1 bytes)");
chp4.setText("4.1 Operators\n" +
"\n" +
"Java provides a rich set of operators to manipulate variables. We can divide all the Java operators into the following groups:\n" +
"- Arithmetic Operators\n" +
"- Relational Operators\n" +
"- Bitwise Operators\n" +
"- Logical Operators\n" +
"- Assignment Operators\n" +
"- Misc Operators\n" +
"\n" +
"Arithmetic Operators:\n" +
"Arithmetic operators are used in mathematical expressions in the same way that they are used in algebra.\n" +
"arithmetic operators:\n" +
"+ Additive operator (also used for String concatenation)\n" +
"- Subtraction operator\n" +
"* Multiplication operator\n" +
"/ Division operator\n" +
"% Remainder operator\n" +
"\n" +
"Relational Operators:\n" +
"There are following relational operators supported by Java language\n" +
"> Greater than\n" +
"< Less than\n" +
"== Equal to\n" +
"!= Not equal to\n" +
">= Greater than or equal to\n" +
"<= Less than or equal to\n" +
"\n" +
"Bitwise Operators:\n" +
"Java defines several bitwise operators, which can be applied to the integer types, long, int, short, char, and byte.\n" +
"Bitwise operator works on bits and performs bit-by-bit operation. \n" +
"\n" +
"~ Unary bitwise complement\n" +
"<< Signed left shift\n" +
">> Signed right shift\n" +
">>> Unsigned right shift & Bitwise AND\n" +
"^ Bitwise exclusive OR\n" +
"| Bitwise inclusive OR\n" +
"\n" +
"Logical Operators:\n" +
"The following table lists the logical operators:\n" +
"&& Conditional-AND\n" +
"|| Conditional-OR\n" +
"?: Ternary (shorthand for if-then-else statement)\n" +
"\n" +
"Assignment Operators:\n" +
"There are following assignment operators supported by Java language:\n" +
"= Simple assignment operator\n" +
"+= Add AND assignment operator\n" +
"-= Subtract AND assignment operator\n" +
"*= Multiply AND assignment operator\n" +
"/= Divide AND assignment operator\n" +
"%= Modulus AND assignment operator\n" +
"<<= Left shift AND assignment operator.\n" +
">>= Right shift AND assignment operator\n" +
"&= Bitwise AND assignment operator.\n" +
"^= bitwise exclusive OR and assignment operator.\n" +
"|= bitwise inclusive OR and assignment operator.\n" +
"\n" +
"Increment and Decrement Operators\n" +
"Increment and decrement operators are used to add or subtract 1 from the current value of oprand.\n" +
"++ increment\n" +
"-- decrement\n" +
"\n" +
"Increment and Decrement operators can be prefix or postfix. \n" +
"In the prefix style the value of oprand is changed before the result of expression and in the postfix style the variable\n"
        + " is modified after result.\n" +
"\n" +
"For eg.\n" +
"a = 9;\n" +
"b = a++ + 5;\n" +
"/* a=10 b=14 */\n" +
"\n" +
"a = 9;\n" +
"b = ++a + 5;\n" +
"/* a=10 b=15 */\n" +
"\n" +
"Miscellaneous Operators\n" +
"There are few other operators supported by Java Language.\n" +
"Conditional Operator ( ? : )\n" +
"Conditional operator is also known as the ternary operator.\n" +
"The operator is written as:\n" +
"variable x = (expression) ? value if true : value if false\n" +
"\n" +
"Instance of Operator:\n" +
"This operator is used only for object reference variables.\n" +
"instanceof operator is wriiten as:\n" +
"( Object reference variable ) instanceof (class/interface type)\n" +
"\n" +
"\n" +
"\n" +
"4.3 Operator precedence\n" +
"\n" +
"Certain operators have higher priorities than others. Operator precedence determines the grouping of terms in an expression.\n"
        + " This affects how an expression is evaluated. for example, the dot operator has higher precedence than the any other operator.\n" +
"\n" +
"Precedence 15\n" +
"() Parentheses\n" +
"[] Array subscript\n" +
"• Member selection\n" +
"\n" +
"Precedence 14\n" +
"++ Unary post-increment\n" +
"-- Unary post-decrement\n" +
"\n" +
"Precedence 13\n" +
"+ Unary plus\n" +
"- Unary minus\n" +
"++ Unary pre-increment\n" +
"-- Unary pre-decrement\n" +
"! Unary logical negation\n" +
"~ Unary bitwise complement\n" +
"(type) Unary type cast \n" +
"\n" +
"Precedence 12\n" +
"* Multiplication\n" +
"/ Division\n" +
"% Modulus\n" +
"\n" +
"Precedence 11\n" +
"+ Addition\n" +
"- Subtraction\n" +
"\n" +
"Precedence 10\n" +
"<< Bitwise left shift\n" +
">> Bitwise right shift with sign extension\n" +
">>> Bitwise right shift with zero extension\n" +
"\n" +
"Precedence 9\n" +
"< Relational less than\n" +
"> Relational greater than\n" +
"<= Relational less than or equal\n" +
">= Relational greater than or equal\n" +
"instanceof Type comparison (objects only)\n" +
"\n" +
"Precedence 8\n" +
"== Relational is equal to\n" +
"!= Relational is not equal to\n" +
"\n" +
"Precedence 7\n" +
"& Bitwise AND\n" +
"\n" +
"Precedence 6\n" +
"^ 	Bitwise exclusive OR \n" +
"\n" +
"Precedence 5\n" +
"| Bitwise inclusive OR \n" +
"\n" +
"Precedence 4\n" +
"&& Logical AND\n" +
"\n" +
"Precedence 3\n" +
"|| Logical OR \n" +
"\n" +
"Precedence 2\n" +
"? : Ternary conditional\n" +
"\n" +
"Precedence 1\n" +
"= Assignment\n" +
"+= Addition assignment\n" +
"-= Subtraction assignment\n" +
"*= Multiplication assignment\n" +
"/= Division assignment\n" +
"%= Modulus assignment\n" +
"");  
chp5.setText("5.2 Switch statement\n" +
"\n" +
"A switch statement is used instead of nested if...else statements. It is multiple branch decision statement. \n" +
"A switch statement tests a variable with list of values for equivalence. Each value is called a case. The case value must be a constant i.\n" +
"\n" +
"SYNTAX\n" +
"switch(expression){\n" +
"case constant:\n" +
"//sequence of optional statements\n" +
"break; //optional\n" +
"case constant:\n" +
"//sequence of optional statements\n" +
"break; //optional\n" +
".\n" +
".\n" +
".\n" +
"default : //optional\n" +
"//sequence of optional statements\n" +
"}\n" +
"\n" +
"\n" +
"Individual case keyword and a semi-colon (:) is used for each constant. \n" +
"Switch tool is used for skipping to particular case, after jumping to that case it will execute all statements from cases beneath that\n"
        + " case this is called as ''Fall Through''.\n" +
"\n" +
"In the example below, for example, if the value 2 is entered, then the program will print two one something else!\n" +
"\n" +
"switch(i)\n" +
"{\n" +
"case 4: System.out.println(''four''); \n" +
"break;\n" +
"case 3: System.out.println(''three''); \n" +
"break;\n" +
"case 2: System.out.println(''two'');\n" +
"case 1: System.out.println(''one'');\n" +
"default: System.out.println(''something else!'');\n" +
"}\n" +
"\n" +
"To avoid fall through, the break statements are necessary to exit the switch.\n" +
"If value 4 is entered, then in case 4 it will just print four and ends the switch.\n" +
"\n" +
"The default label is non-compulsory, It is used for cases that are not present.\n" +
"\n" +
"\n" +
"\n" +
"5.3 While loop\n" +
"\n" +
"Java while loop is used to execute statement(s) until a condition holds true.\n" +
"SYNTAX\n" +
"while (condition(s)) {\n" +
"// statements\n" +
"}\n" +
"\n" +
"If the condition holds true then the body of loop is executed, after execution of loop body condition is tested again and if the condition is \n"
        + "true then body of loop is executed again and the process repeats until condition becomes false. \n" +
"\n" +
"1. Condition is always evaluated to true or false and if it is a constant, For example while (c) { …} where c is a constant then any non zero\n"
        + " value of c is considered true and zero is considered false.\n" +
"\n" +
"2. You can test multiple conditions such as\n" +
"\n" +
"while ( a > b && c != 0) {\n" +
"// statements\n" +
"}\n" +
"\n" +
"Loop body is executed till value of a is greater than value of b and c is not equal to zero.\n" +
"\n" +
"3. Body of loop can contain more than one statement.\n" +
"For multiple statements you need to place them in a block using {} and if body of loop contain only single statement you can optionally use {}. \n" +
"\n" +
"It is recommended to use braces always to make your program easily readable and understandable. \n" +
"\n" +
"\n" +
"\n" +
"5.4 Do While loop\n" +
"\n" +
"The while loop makes a test condition before the loop is executed.Therefore, the body of the loop may not be executed at all if the condition is\n"
        + " not satisfied at the very first attempt. \n" +
"\n" +
"On some occasions it might be necessary to execute the body of the loop before the test is performed.\n" +
"Such situations can be handled with the help of the do statement.\n" +
"\n" +
"SYNTAX\n" +
"do {\n" +
"//statement(s)...\n" +
"} while (condition);\n" +
"\n" +
"On reaching the do statement, program evaluate the body of loop first. \n" +
"At the end of the loop, the condition in the while statement is evaluated. If the condition is true, the program continues to evaluate the body\n"
        + " of loop again and again till condition becomes false.\n" +
"\n" +
"int i =0;\n" +
"do\n" +
"{\n" +
"System.out.println(\"i is : \" + i);\n" +
"i++;\n" +
"}while(i < 5);\n" +
"\n" +
"\n" +
"Output would be\n" +
"i is : 0\n" +
"i is : 1\n" +
"i is : 2\n" +
"i is : 3\n" +
"i is : 4 \n" +
"\n" +
"\n" +
"\n" +
"5.5 For loop\n" +
"\n" +
"Java for loop used to repeat execution of statement(s) until a certain condition holds true. \n" +
"The general form of the for statement can be expressed as follows:\n" +
"\n" +
"for (initialization; termination; increment)\n" +
"{\n" +
"statement(s)...\n" +
"}\n" +
"\n" +
"You can initialize multiple variables, test many conditions and perform increments or decrements on many variables according to requirement. \n" +
"All three components of for loop are optional. \n" +
"\n" +
"For example, to execute a statement 5 times:\n" +
"for (i = 0; i < 5; i++)\n" +
"statements...;\n" +
"\n" +
"\n" +
"Another way of doing this is: i = 4;\n" +
"while (i>=0)\n" +
"statements...;\n" +
"\n" +
"");

chp6.setText("7.1 Arrays\n" +
"\n" +
"Array is an object the contains elements of similar data type. It is a data structure where we store similar elements. We can store only\n"
        + " fixed set of elements in a java array.\n" +
"Array in java is index based, first element of the array is stored at 0 index.\n" +
"\n" +
"Types of Array in java\n" +
"1. Single Dimensional Array\n" +
"2. Multidimensional Array\n" +
"\n" +
"1. Single Dimensional Array\n" +
"Declaring Array Variables:\n" +
"To use an array in a program, you must declare a variable to reference the array, and you must specify the type of array the variable\n"
        + " can reference. Here is the syntax for declaring an array variable:\n" +
"\n" +
"dataType[] arrayName; \n" +
"or\n" +
"dataType arrayName[];\n" +
"\n" +
"Instantiating Arrays:\n" +
"You can instantiate an array by using the new operator with the following syntax:\n" +
"\n" +
"arrayName = new dataType[arraySize];\n" +
"\n" +
"The above statement does two things:\n" +
"It creates an array using new dataType[arraySize];\n" +
"It assigns the reference of the newly created array to the variable arrayName.\n" +
"\n" +
"2. Multidimensional Array\n" +
"Syntax to Declare Multidimensional Array in java\n" +
"\n" +
"dataType[][] arrayName; or \n" +
"dataType arrayName[][];\n" +
"\n" +
"Example to instantiate Multidimensional Array\n" +
"int[][] arr=new int[2][3];\n" +
"//2 row and 3 column \n" +
"\n" +
"Example to initialize Multidimensional Array in java\n" +
"arr[0][0]=1; \n" +
"arr[0][1]=2; \n" +
"arr[0][2]=3; \n" +
"arr[1][0]=4; \n" +
"arr[1][1]=5; \n" +
"arr[1][2]=6; \n" +
"\n" +
"Passing Arrays to Methods:\n" +
"Just as you can pass primitive type values to methods, you can also pass arrays to methods. For example, the following method displays\n"
        + " the elements in an int array:\n" +
"public static void display(int[] arr) {\n" +
"for (int i = 0; i < arr.length; i++) {\n" +
"System.out.print(arr[i] + \" \");\n" +
"}\n" +
"}\n" +
"\n" +
"Returning an Array from a Method:\n" +
"A method may also return an array. For example, the method shown below returns an array that is the copy of another array:\n" +
"public static int[] copyarray(int[] list) {\n" +
"int[] result = new int[list.length];\n" +
"\n" +
"for (int i = 0; i < list.length - 1 ; i++) {\n" +
"result[i] = list[i];\n" +
"}\n" +
"return result;\n" +
"}\n" +
"\n" +
"Arrays Methods :\n" +
"Arrays.binarySearch(Object[] a, Object key)\n" +
"Searches the specified array of Object ( Byte, Int , double, etc.) for the specified value using the binary search algorithm. The\n"
        + " array must be sorted prior to making this call. This returns index of the search key.\n" +
"\n" +
"Arrays.equals(long[] a, long[] a2)\n" +
"Returns true if the two specified arrays of longs are equal to one another. Two arrays are considered equal if both arrays contain\n"
        + " the same number of elements, and all corresponding pairs of elements in the two arrays are equal.\n" +
"\n" +
"Arrays.fill(int[] a, int val)\n" +
"Assigns the specified int value to each element of the specified array of ints. Same method could be used by all other primitive data\n"
        + " types (Byte, short, Int etc.)\n" +
"\n" +
"Arrays.sort(Object[] a)\n" +
"Sorts the specified array of objects into ascending order, according to the natural ordering of its elements. Same method could be used\n"
        + " by all other primitive data types ( Byte, short, Int, etc.)\n" +
"\n" +
"\n" +
"\n" +
"7.2 String\n" +
"\n" +
"In java, string is basically an object that represents sequence of char values. The Java platform provides the String class to create\n"
        + " and manipulate strings.\n" +
"\n" +
"Creating Strings:\n" +
"1) The most direct way to create a string is to write:\n" +
"String str1 = \"Hello Java!\";\n" +
"\n" +
"2) Using another String object\n" +
"String str2 = new String(str1);\n" +
"\n" +
"3) Using new Keyword\n" +
"String str3 = new String(\"Java\");\n" +
"\n" +
"4) Using + operator (Concatenation)\n" +
"String str4 = str1 + str2;\n" +
"or,\n" +
"String str5 = \"hello\"+\"Java\";\n" +
"\n" +
"String Length:\n" +
"length() method returns the number of characters contained in the string object.\n" +
"String str1 = \"Hello Java\";\n" +
"int len = str1.length();\n" +
"System.out.println( \"String Length is : \" + len );\n" +
"\n" +
"Concatenating Strings:\n" +
"The String class includes a method for concatenating two strings:\n" +
"string1.concat(string2);\n" +
"This returns a new string that is string1 with string2 added to it at the end. You can also use the concat() method with string literals,\n"
        + " as in:\n" +
"\"Hello \".concat(\"Java\");\n" +
"Strings are more commonly concatenated with the + operator, as in:\n" +
"\"Hello \" + \" Java\" + \"!\"\n" +
"which results in:\n" +
"\"Hello Java!\"\n" +
"\n" +
"String Methods :\n" +
"1 char charAt(int index) \n" +
"returns char value for the particular index\n" +
"\n" +
"2 int length() \n" +
"returns string length\n" +
"\n" +
"3 static String format(String format, Object... args) \n" +
"returns formatted string\n" +
"\n" +
"4 static String format(Locale l, String format, Object... args) \n" +
"returns formatted string with given locale\n" +
"\n" +
"5 String substring(int beginIndex) \n" +
"returns substring for given begin index\n" +
"\n" +
"6 String substring(int beginIndex, int endIndex) \n" +
"returns substring for given begin index and end index\n" +
"\n" +
"7 boolean contains(CharSequence s) \n" +
"returns true or false after matching the sequence of char value\n" +
"\n" +
"8 static String join(CharSequence delimiter, CharSequence... elements) \n" +
"returns a joined string\n" +
"\n" +
"9 static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) \n" +
"returns a joined string\n" +
"\n" +
"10 boolean equals(Object another) \n" +
"checks the equality of string with object\n" +
"\n" +
"11 boolean isEmpty() \n" +
"checks if string is empty\n" +
"\n" +
"12 String concat(String str) \n" +
"concatinates specified string\n" +
"\n" +
"13 String replace(char old, char new) \n" +
"replaces all occurrences of specified char value\n" +
"\n" +
"14 String replace(CharSequence old, CharSequence new) \n" +
"replaces all occurrences of specified CharSequence\n" +
"\n" +
"15 String trim() \n" +
"returns trimmed string omitting leading and trailing spaces\n" +
"\n" +
"16 String split(String regex) \n" +
"returns splitted string matching regex\n" +
"\n" +
"17 String split(String regex, int limit) \n" +
"returns splitted string matching regex and limit\n" +
"\n" +
"18 String intern() \n" +
"returns interned string\n" +
"\n" +
"19 int indexOf(int ch) \n" +
"returns specified char value index\n" +
"\n" +
"20 int indexOf(int ch, int fromIndex) \n" +
"returns specified char value index starting with given index\n" +
"\n" +
"21 int indexOf(String substring) \n" +
"returns specified substring index\n" +
"\n" +
"22 int indexOf(String substring, int fromIndex) \n" +
"returns specified substring index starting with given index\n" +
"\n" +
"23 String toLowerCase() \n" +
"returns string in lowercase.\n" +
"\n" +
"24 String toLowerCase(Locale l) \n" +
"returns string in lowercase using specified locale.\n" +
"\n" +
"25 String toUpperCase() \n" +
"returns string in uppercase.\n" +
"\n" +
"26 String toUpperCase(Locale l) \n" +
"returns string in uppercase using specified locale.");
    }  
  
    
}
