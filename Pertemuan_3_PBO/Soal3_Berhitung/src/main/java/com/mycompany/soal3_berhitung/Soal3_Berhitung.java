/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal3_berhitung;
import java.util.Scanner;
/**
 *
 * @author Adhiyaaaaa
 */
public class Soal3_Berhitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        // Memisahkan string input dengan spasi
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("Format input salah. Gunakan spasi.");
            return;
        }
        
        int A = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int B = Integer.parseInt(parts[2]);
        
        // Memeriksa  1 ≤ A, B ≤ 1.000
        if (A <= 1 || A >= 1000 || B <= 1 || B >= 1000) {
            System.out.println("Input salah. Harus rentang 1 sampai 1000");
            return;
        }
        
        // Memeriksa batasan operator
        if (!operator.matches("[+\\-*/%]")) {
            System.out.println("Operator tidak valid.");
            return;
        }

        int hasil = 0;
        
        // Operasi matematika
        switch (operator) {
            case "+" -> hasil = A + B;
            case "-" -> hasil = A - B;
            case "*" -> hasil = A * B;
            case "/" -> hasil = A / B;
            case "%" -> hasil = A % B;
            default -> {
            }
        }
        
        System.out.println("hasil : " + hasil);
        
        scanner.close();
    }
}