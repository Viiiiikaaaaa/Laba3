package org.example;

public class Methods {
    public static boolean compareStrings(String string1, String string2) {
        return string1.length() == string2.length();
    }
    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }

}
