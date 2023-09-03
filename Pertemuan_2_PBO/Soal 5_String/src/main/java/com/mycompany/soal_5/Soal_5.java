/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal_5;

/**
 *
 * @author Adhiyaaaaa
 */
import java.util.Scanner;

public class Soal_5 {
    public static void main(String[] args) {
        // Input strings A and B
        try (Scanner scanner = new Scanner(System.in)) {
            // Input strings A and B
            String A = scanner.next();
            String B = scanner.next();
            
            // Calculate the sum of lengths of A and B
            int totalLength = A.length() + B.length();
            System.out.println(totalLength);
            
            // Determine if A is lexicographically greater than B
            String comparison = A.compareTo(B) > 0 ? "Yes" : "No";
            System.out.println(comparison);
            
            // Capitalize the first letter in both A and B
            A = capitalizeFirstLetter(A);
            B = capitalizeFirstLetter(B);
            
            // Print the capitalized strings separated by a space
            System.out.println(A + " " + B);
        }
    }

    // Helper function to capitalize the first letter of a string
    private static String capitalizeFirstLetter(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}

