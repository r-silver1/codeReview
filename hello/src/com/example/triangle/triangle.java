package com.example.triangle;
import com.example.shapes.*;

public class triangle implements shapes{
    private final int numSides = 3;
    private double length;
    public triangle(){
        this.length = 1.0;
    }
    public triangle(double len){
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
    //get area triangle: : Heron's formula https://www.mathopenref.com/heronsformula.html
    public double area(){
        //for perimeter/2 = (a + b + c)/2
        //Math.sqrt(p(p−a)(p−b)(p−c))
        double p = 1.5*(this.length);
        double a = Math.sqrt(p*Math.pow(p-this.length, this.numSides));
        return a;
    }
    //get angle between two adjacent sides
    public double angle(){
        return 360.0/this.numSides;
    }
}
