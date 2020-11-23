package com.example.testShapes;

import com.example.square.*;
import com.example.triangle.*;

public class testShapes {
    public static void main(String args[]){
        //implemented interface classes
        //I created a shapes interface which has the same basic fields for any of the shapes we will talk about: number of sides, and length of sides
        //We assume all sides are the same length. From these shape classes we want the same return values. We want to use methods implemented in the
        //triangle and square classes to return the number of sides, length of sides, set the length of sides, and get the areas and angle between adjacent sides
        //For different shapes, area will be based on both length and number of sides. Angle will change based on number of sides
        //test triangle
        triangle testTri = new triangle(1.0);
        testTri.setLen(3.0);
        System.out.println("testTri: numSides: " + testTri.getSides() + " length sides: " +testTri.getLen());
        System.out.println("area: " + testTri.area() + " and interior angle is " + testTri.angle());

        //test square
        square testSq = new square(1.0);
        testSq.setLen(5.0);
        System.out.println("testSq: numSides: " + testSq.getSides() + " length sides: " +testSq.getLen());
        System.out.println("area: " + testSq.area() + " and interior angle is " + testSq.angle());

    }
}
