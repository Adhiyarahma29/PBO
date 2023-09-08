/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal5_bukatutupjalan;
import java.util.Scanner;
/**
 *
 * @author Adhiyaaaaa
 */
public class Soal5_Bukatutupjalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan plat nomor empat mobil :");
        String input = scanner.nextLine();
        scanner.close();
        
        // Memisahkan plat nomor empat mobil menjadi array
        String[] platNomor = input.split(" ");
        
        // Menggabungkan angka-angka dari plat nomor empat mobil
        int gabunganAngka = 0;
        for (String platNomor1 : platNomor) {
            gabunganAngka += Integer.parseInt(platNomor1);
        }
        
        // Menentukan apakah harus berhenti atau jalan
        if ((gabunganAngka - 999999) % 5 != 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}
