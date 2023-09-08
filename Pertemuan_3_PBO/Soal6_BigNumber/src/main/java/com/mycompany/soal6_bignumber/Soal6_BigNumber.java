/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal6_bignumber;
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author Adhiyaaaaa
 */
public class Soal6_BigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca dua bilangan sebagai string
        String strA = scanner.nextLine();
        String strB = scanner.nextLine();
        
        // Mengonversi string menjadi objek BigInteger
        BigInteger a = new BigInteger(strA);
        BigInteger b = new BigInteger(strB);
        
        // Menambahkan a dan b
        BigInteger sum = a.add(b);
        
        // Mengalikan a dan b
        BigInteger product = a.multiply(b);
        
        // Mengeluarkan hasil tanpa leading zeros
        System.out.println(sum.toString());
        System.out.println(product.toString());
        
        scanner.close();
    }
}

