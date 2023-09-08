/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal1_input_output;
import java.util.Scanner;
/**
 *
 * @author Adhiyaaaaa
 */
public class Soal1_input_Output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();
        String[] tokens = splitKata(s);
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
        scanner.close();
    }
    
    // Method untuk membagi string menjadi token
    private static String[] splitKata(String s) { 
        s = s.replaceAll("[!,?._'@]", " "); // Menghilangkan karakter yang tidak relevan 
        String[] tokens = s.split("\\s+"); // Memecah string berdasarkan spasi
        return tokens;
    }
}
