//https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-application.html#write-code
//--https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html

/*The prefix of a unique package name is always written in all-lowercase ASCII letters and should be one of the top-level domain names, currently com, edu, gov, mil, net, org, or one of the English two-letter codes identifying countries as specified in ISO Standard 3166, 1981.
Subsequent components of the package name vary according to an organization's own internal naming conventions. Such conventions might specify that certain directory name components be division, department, project, machine, or login names. */
package com.example.helloworld;

import com.example.bank.testClass.*;
import com.example.vector.testVectors.*;
import com.example.shapes.testShapes.*;
import com.example.input.*;

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

/*	Class names should be nouns, in mixed case with the first letter of each internal word capitalized. Try to keep your class names simple and descriptive. Use whole words-avoid acronyms and abbreviations (unless the abbreviation is much more widely used than the long form, such as URL or HTML).*/
public class HelloWorld {

    //https://www.journaldev.com/12552/public-static-void-main-string-args-java-main-method#:~:text=arguments%20in%20Eclipse-,public%20static%20void%20main(String%5B%5D%20args),can%20change%20args%20to%20myStringArgs%20.
    //-public: execute at runtime
    //-static: must be able to get initialized at runtime
    //-void: doesn't return anything
    //-main: on java program run, main first execution point
    //-string[] args: input arguments into java program
    public static void main(String arg[]){
        System.out.println("hello world! in the intellij world again");
        String[] argList = {""};
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
        //testClass: bank abstract class, PNB_5 and SBI_7 abstract class implementation
        testClass.main(argList);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
        //vector class: test defining classes and extended classes with protected variables and methods
        testVectors.main(argList);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
        //test shapes: test interface and implementation for drawing different types of shapes from same base
        testShapes.main(argList);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
        //test try-catch with user input for integers and file reading
        input.main(argList);
    }
}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//