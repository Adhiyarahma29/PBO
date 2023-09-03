/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kasus_1;

/**
 *
 * @author Adhiyaaaaa
 */
public class Kasus_1 {
    public static void main(String[] args) {
        long num1 = -150;
        long num2 = 150000;
        long num3 = 1500000000;
        long num4;
        num4 = (long) -100000000000000L;

        System.out.println(num1 + " can be fitted in:");
        if (num1 >= Byte.MIN_VALUE && num1 <= Byte.MAX_VALUE) {
            System.out.println("* byte");
        }
        if (num1 >= Short.MIN_VALUE && num1 <= Short.MAX_VALUE) {
            System.out.println("* short");
        }
        if (num1 >= Integer.MIN_VALUE && num1 <= Integer.MAX_VALUE) {
            System.out.println("* int");
        }
        if (num1 >= Long.MIN_VALUE && num1 <= Long.MAX_VALUE) {
            System.out.println("* long");
        }

        System.out.println(num2 + " can be fitted in:");
        if (num2 >= Integer.MIN_VALUE && num2 <= Integer.MAX_VALUE) {
            System.out.println("* int");
        }
        if (num2 >= Long.MIN_VALUE && num2 <= Long.MAX_VALUE) {
            System.out.println("* long");
        }

        System.out.println(num3 + " can be fitted in:");
        if (num3 >= Integer.MIN_VALUE && num3 <= Integer.MAX_VALUE) {
            System.out.println("* int");
        }
        if (num3 >= Long.MIN_VALUE && num3 <= Long.MAX_VALUE) {
            System.out.println("* long");
        }

        System.out.println(num4 + " can be fitted in:");
        if (num4 >= Long.MIN_VALUE && num4 <= Long.MAX_VALUE) {
            System.out.println("* long");
        }

        System.out.println("213333333333333333333333333333333333 can't be fitted anywhere.");
    }
}
