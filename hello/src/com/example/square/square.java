package com.example.square;
import com.example.shapes.*;

public class square implements shapes{
    private final int numSides = 4;
    private double length;
    public square(){
        this.length = 1.0;
    }
    public square(double len){
        this.length = len;
    }
    //get number of sides
    public int getSides(){
        return this.numSides;
    }
    //get or set side length (all equal)
    public double getLen(){
        return this.length;
    }
    public void setLen(double in){
        this.length = in;
    }
    //get area square:
    public double area(){
        return Math.pow(this.length, 2);
    }
    //get angle between two adjacent sides
    public double angle(){
        return 360.0/this.numSides;
    }
}

