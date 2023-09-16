/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.upinipin;

/**
 *
 * @author Adhiyaaaaa
 */
public class Item {
    private String name;
    
    private Item() {
        name = "Ipin";
    }
        
    public Item(String name) { 
        this();             //perubahan 7 karakter
        System.out.println(this.name);
    }
}
