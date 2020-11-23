package com.example.shapes;

public interface shapes {
    //get number of sides
    public int getSides();
    //get or set side length (all equal)
    public double getLen();
    public void setLen(double in);
    //get area
    public double area();
    //get angle between two adjacent sides
    public double angle();
}
