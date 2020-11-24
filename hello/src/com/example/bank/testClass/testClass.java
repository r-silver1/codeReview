package com.example.bank.testClass;

import com.example.bank.PNB_5.PNB_5;
import com.example.bank.SBI_7.SBI_7;

public class testClass {
    public static void main(String[] args){
        System.out.println("in testClass main");

        SBI_7 testSBI = new SBI_7();
        double SBIrate = testSBI.getRateOfInterest();
        System.out.println("SBI: " + SBIrate*100 + "% ");

        PNB_5 testPNB = new PNB_5();
        double PNBrate = testPNB.getRateOfInterest();
        System.out.println("PNB: " + PNBrate*100 + "% ");

    }
}

