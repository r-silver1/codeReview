package com.example.input;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class input {
    //https://www.w3schools.com/java/java_user_input.asp
    public static void main(String[] args){
        List inputs = new ArrayList();
        System.out.println("enter 3 integerrs in a row to store in array list");
        for(var i = 0; i < 3; i+=1) {
            //unchecked runtime exception: bad user input
            Scanner intScan = new Scanner(System.in);
            System.out.println("enter an integer");
            try {
                int input = intScan.nextInt();
                System.out.println("you entered: " + input);
                inputs.add(input);
                System.out.println("array list: \t" + inputs);
            } catch (InputMismatchException e) {
                System.out.println("oops, try again, you didn't enter an integer: " + e);
                input.main(args);
            }
        }

        //checked exceptions: bad file input
        File file = new File("hello\\notrealFile");
        try {
            FileReader fr = new FileReader(file);
        }catch(FileNotFoundException e){
            System.out.println("file 1: not accessible: is it real? " + e);
        }


        char[] readArr = new char[1024];
        //test current path
        File pathFile = new File(".");
        String path1 = pathFile.getAbsolutePath();
        path1 = path1.substring(0, path1.length()-1);
        String path2 = "hello\\sampleFile.txt";
        System.out.println(path1+path2);

        File file2 = new File(path1+path2);
        try {
            FileReader fr2 = new FileReader(file2);
            //read file input http://tutorials.jenkov.com/java-io/filereader.html
            fr2.read(readArr, 0, readArr.length);
            String fileInput = new String(readArr);
            System.out.println("sampleFile: " + fileInput);
        }catch(FileNotFoundException e){
            System.out.println("file 2: not accessible: is it real? " + e);
        }catch(IOException e){
            System.out.println("file 2: accessible but cannot be read " +e);
        }
    }
}
