package com.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
public static String reverseString(String str){
char [] chars = str.toCharArray();
int l = 0;
int r = chars.length - 1;
while(l < r){
char temp = chars[l];
chars[l] = chars[r];
chars[r] = temp;
l++;
r--;

}
return new String(chars);
}



    public static void main( String[] args )
    {
        System.out.println("Hello World!");

        // Demonstrate the reverseString method
        String originalString = "Hello World!";
        String reversedString = reverseString(originalString);
        System.out.println("Original: " + originalString);
        System.out.println("Reversed: " + reversedString);


    }
}
