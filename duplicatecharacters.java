package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class duplicatecharacters {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to find duplicate characters:");
        String input = sc.nextLine();

        // Create a HashMap to store the frequency of each character
        HashMap<Character, Integer> hm = new HashMap<>();

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If the character is already in the map, increment its count
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                // If the character is not in the map, add it with count 1
                hm.put(ch, 1);
            }
        }

        // Print the duplicate characters
        System.out.println("Duplicate characters are:");
        boolean foundDuplicate = false;
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() >= 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
                foundDuplicate = true;
            }
        }

        // If no duplicates found, print a message
        if (!foundDuplicate) {
            System.out.println("No duplicate characters found.");
        }

        // Close the scanner object
        sc.close();
    }
}
