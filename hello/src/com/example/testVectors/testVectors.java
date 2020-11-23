package com.example.testVectors;

import com.example.colVector.colVector;
import com.example.vector.vector;

public class testVectors {
    public static String arrToString(double[] in){
        String newStr = "[";
        for(int i = 0; i<in.length; i+=1){
            newStr += in[i];
            if(i!=in.length-1){
                newStr += ", ";
            }
        }
        newStr += "]";
        return newStr;
    }

    static public void main(String[] args){
        //testing class: vector
        //unparameterized constructor
        vector initObj = new vector();
        initObj.printVec();

        //vector class: user defined and imported
        double[] inArg = {1.0, 0.0, 1.0};
        vector testObj = new vector("testObj", inArg);
        //use get method to get protected string field
        //this: won't work because vecID is protected System.out.println(testObj.vecID);
        System.out.println(testObj.readString());
        //parameterized constructor
        //use abstraction to print out vector in human readable format
        testObj.printVec();

        //creating a double array to match constructor parameter
        inArg[0] = 2.0;
        inArg[1] = .25;
        inArg[2] = 1.5;
        vector testObj2 = new vector("testObj2", inArg);
        //use abstraction to add a double to the vector... i.e evenly add to all members of testObj2.elements (protected)
        testObj2.increment(.66);
        testObj2.printVec();

        //use abstraction as well as a static class method (returning new vector) to add two vectors and get a new one
        vector testObj3 = vector.add(testObj, testObj2);
        testObj3.printVec();

        //testing overloaded constructor: pass in integer for ID rather than string, which will get converted to string in overloaded constructor
        vector testObjInt = new vector(10001, inArg);
        testObjInt.increment(2.1);
        testObjInt.printVec();

        //test reusability of code for vectors of length >3
        double[] inArgB = {1.0, 2.0, 3.0, 4.0};
        vector testObj4 = new vector("testObj4", inArgB);
        testObj4.printVec();

        //test extended class color vector: adds a color parameter to normal vector
        inArgB[0] = 1.1;
        inArgB[1] = 3.12;
        inArgB[2] = 4.1;
        double[] colVect = {0.0, 0.0, 0.0};
        //parameterized constructor: colVector constructor will first call super() with first two arguments (same as normal vector) and then initialize color vector field
        colVector testCol1 = new colVector("testCol1", inArgB, colVect);
        //polymorphism: increment works just fine even though it's an extended class
        testCol1.increment(.65);
        testCol1.printVec();

        //overloaded constructor for int id works for extended class
        double[] inArgC = {5.0, 0.0, 0.0, 0.0};
        //test overloaded constructor taking int id
        colVector testCol2 = new colVector(123314, inArgC, colVect);
        testCol2.printVec();

        //test private read/write
        double[] colVect2 = {2.0, 1.6, 0.0};
        //use data hiding to hide implementation of color vector change
        testCol2.setColors(colVect2);
        //same data hiding but read colors
        System.out.println(arrToString(testCol2.readColors()));
        //show another encapsulation methodology; get length of vector without knowing implementation
        System.out.println("mag: " + testCol2.magnitude());

        //yes I know how to use conditional statements
        if(testCol2.magnitude() == 5.0){
            System.out.println("equal!");
        }else{
            System.out.println("not equal!");
        }
        testCol1.printVec();
    }
}
