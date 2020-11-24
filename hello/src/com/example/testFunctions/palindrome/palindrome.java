package com.example.testFunctions.palindrome;

public class palindrome {
    public static boolean isPal(String s){
        //trick: only need to iterate over half the string, other half would be pal..
        for(int i = 0; i < (s.length()/2); i+=1){
            int j = s.length() - (1+i);
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
