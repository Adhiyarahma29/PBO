/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal4_gajiagent;
import java.util.Scanner;
/**
 *
 * @author Adhiyaaaaa
 */
public class Soal4_GajiAgent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca jumlah penjualan bulan ini
        int jumlah_Penjualan = scanner.nextInt();
        int gaji_Pokok = 500000; // per bulan
        int harga_PerItem = 50000;
        int total_Penjualan = jumlah_Penjualan * harga_PerItem;
        
        // Menghitung bonus
        double bonus = 0;
        if (jumlah_Penjualan >= 80) { //J.penjualan >= 80 item
            bonus = 0.35 * total_Penjualan;
        } else if (jumlah_Penjualan >= 40) { // J.penjualan >= 40 item
            bonus = 0.25 * total_Penjualan;
        } else if (jumlah_Penjualan > 15) { // J.penjualan > 15 item
            bonus = 0.10 * total_Penjualan;
        } else {
            bonus = -0.15 * (15 - jumlah_Penjualan) * harga_PerItem; // J.penjualan <= 15 item
        }
        int total_Gaji = gaji_Pokok + (int) bonus;
        System.out.println(total_Gaji);
        scanner.close();
    }
}

