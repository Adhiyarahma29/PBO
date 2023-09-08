/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal2_inputoutput2;
import java.util.Scanner;
/**
 *
 * @author Adhiyaaaaa
 */
public class Soal2_InputOutput2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        while (scanner.hasNext()) {
            String s = scanner.next();
            int n = scanner.nextInt();
            
            // Menggunakan printf untuk mencetak output terformat
            System.out.printf("%-15s%03d%n", s, n);
        }
        System.out.println("================================");
        scanner.close();
    }
}
