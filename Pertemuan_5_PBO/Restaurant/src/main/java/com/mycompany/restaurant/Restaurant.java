/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurant;

import java.awt.MenuItem;

/**
 *
 * @author Adhiyaaaaa
 */

public class Restaurant {
    private MenuItem[] menu;
    private int itemCount;
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    
    public Restaurant(){
        nama_makanan = new String[10];
        double[] harga_makanan = new double [10];
        int[] stok = new int[10];
    }
    public void tambahMenuMakanan (String nama, double harga, int stok){
        int id = 0;
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok [id] = stok;
    }

    public void tampilMenuMakanan(){
        int id = 0;
        int i;
        for(i =0; i<=id; i++){
            if(!isOutOfStock(i)){
                System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
            }
        }
    }

    private boolean isOutOfStock(int id) {
        int[] stok = null;
        if(stok[id] == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void nextId(){
        int id = 0;
        id++;
    }
    
    public void pesanMenu(String namaMenu, int jumlah) {
        int id = 0;
        int[] pesanan = null;
        for (int i = 0; i < id; i++) {
            if (nama_makanan[i].equalsIgnoreCase(namaMenu)) {
                if (stok[i] >= jumlah) {
                    pesanan[i] += jumlah;
                    stok[i] -= jumlah;
                    System.out.println(jumlah + " " + namaMenu + " telah dipesan.");
                } else {
                    System.out.println("Maaf, stok " + namaMenu + " tidak mencukupi.");
                }
                return;
            }
        }
        System.out.println("Menu " + namaMenu + " tidak ditemukan.");
    }

    public void tampilPesanan() {
        System.out.println("Pesanan saat ini:");
        int id = 0;
        for (int i = 0; i < id; i++) {
            int[] pesanan = null;
            if (pesanan[i] > 0) {
                System.out.println(nama_makanan[i] + ": " + pesanan[i]);
            }
        }
    }
}
    