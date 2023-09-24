/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurant;

/**
 *
 * @author Adhiyaaaaa
 */
public class MenuItem {
    private String nama;
    private double harga;
    private int stok;

    public MenuItem(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public boolean isOutOfStock() {
        return stok == 0;
    }
    
    // Tambahkan metode lain sesuai kebutuhan
}
