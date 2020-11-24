package com.example.vector.colVector;

import com.example.vector.vector;

public class colVector extends vector {
    //use static to reduce number of
    static int colLen = 3;
    private double[] colors = new double[colLen];

    public colVector(){
        //initialize to all white
        for(int i = 0; i<colLen; i+=1){
            this.elements[i] = 255.0;
        }
    };
    public colVector(String in, double[] inArr, double[] col){
        //call parent constructor
        super(in, inArr);
        this.colors = col;
    }

    //as in vector, parse int to string ID
    public colVector(int in, double[] inArr, double[] col){
        setString(Integer.toString(in));
        this.elements = inArr;
        this.colors = col;
    }

    public void setColors(double[] in){
        this.colors = in;
    }

    public double[] readColors(){
        return this.colors;
    }


    public void printVec(){
        super.printVec();
        System.out.print("Colors: [");
        int i = 0;
        do{
            System.out.print(this.colors[i]);
            System.out.print(", ");
            i+=1;
        }while(i<this.colors.length);
        System.out.print("]\n");
    }

}
