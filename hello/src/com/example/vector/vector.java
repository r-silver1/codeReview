package com.example.vector;

public class vector {
    //protected: otherwise wouldn't be available to children (colvector)
    protected String vecID = "this is a string";
    protected double[] elements;

    public vector(){ }

    public vector(String in, double[] inArr){
        this.vecID = in;
        this.elements = inArr;
    }

    //overload constructor: take in a integer ID
    public vector(int in, double[] inArr){
        this.vecID =Integer.toString(in);
        this.elements = inArr;
    }

    public void setString(String in){
        this.vecID = in;
    }

    public void setArray(double[] in){
        this.elements = in;
    }

    public String readString(){
        return this.vecID;
    }

    public double[] readElements(){
        return this.elements;
    }

    //static: access without making object instance of class (this case use as constructor method)
    //https://www.w3schools.com/java/java_class_methods.asp
    public static vector add(vector a, vector b){
        double[] addRes = new double[a.elements.length];
        for(int i = 0; i<a.elements.length; i+=1){
            addRes[i] = a.elements[i] + b.elements[i];
        }
        vector dotVec = new vector(a.vecID + "+" + b.vecID, addRes);

        return dotVec;
    }

    public double magnitude(){
        double mag = 0.0;
        for(double i : this.elements){
            mag+=Math.pow(i, 2);
        }
        mag = Math.pow(mag, .5);
        return(mag);
    }

    public void increment(double inc){
        for(int i = 0; i < this.elements.length; i+=1){
            this.elements[i] += inc;
        }
    }

    public void printVec(){
        System.out.print(this.vecID +": [");
        try{
        for(double i : this.elements){
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.print("]\n");
        }catch(NullPointerException e){
            //elements is uninitialized; default constructor doesn't initialize because doesn't know how long will be
            System.out.println("[]");
        }
    }

}

