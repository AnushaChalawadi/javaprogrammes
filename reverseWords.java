package test;

import java.util.Scanner;

public class reverseWords {
 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String input = sc.nextLine();

    //call a method to reverse
    String reverse = reverseChar(input);
    // Print the original and the reversed words string
    System.out.println("Original String: " + input);
    System.out.println("Reversed Words String: " + reverse);
    
    // Close the scanner object to prevent resource leak
    sc.close();
     
 }
 public static String reverseChar(String str)
 {
    String[] words = str.split(" ");
    StringBuilder reveredstring = new StringBuilder();

    //through each loop
    for (String word  : words) {
        StringBuilder reverseword = new StringBuilder(word);
        reveredstring.append(reverseword.reverse().toString()).append(" ");

        
    }
    return reveredstring.toString().trim();

 }
    
    
}
