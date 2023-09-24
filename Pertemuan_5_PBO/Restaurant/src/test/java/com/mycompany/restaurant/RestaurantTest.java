/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.restaurant;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Adhiyaaaaa
 */
public class RestaurantTest {
    
    public RestaurantTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of tambahMenuMakanan method, of class Restaurant.
     */
    @org.junit.jupiter.api.Test
    public void testTambahMenuMakanan() {
        System.out.println("tambahMenuMakanan");
        String nama = "";
        double harga = 0.0;
        int stok = 0;
        Restaurant instance = new Restaurant();
        instance.tambahMenuMakanan(nama, harga, stok);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tampilMenuMakanan method, of class Restaurant.
     */
    @org.junit.jupiter.api.Test
    public void testTampilMenuMakanan() {
        System.out.println("tampilMenuMakanan");
        Restaurant instance = new Restaurant();
        instance.tampilMenuMakanan();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextId method, of class Restaurant.
     */
    @org.junit.jupiter.api.Test
    public void testNextId() {
        System.out.println("nextId");
        Restaurant.nextId();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
