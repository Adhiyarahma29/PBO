/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal7_array;

/**
 *
 * @author Adhiyaaaaa
 */
public class Soal7_Array{
    public static void main(String[] args) {
        // One Dimensional Arrays
        int[] firstArray = {2, 5, 3}; 
        int[] secondArray = {9, 5, 3}; 
        int[] thirdArray = {2, 4, 9}; 
        int[] fourthArray = {10, 11, 12}; 
        int[] fifthArray = {13, 14, 15}; 
        int[] sixthArray = {16, 17, 18}; 
        int[] seventhArray = {19, 20, 21}; 
        int[] eighthArray = {22, 23, 24}; 
        int[] ninthArray = {25, 26, 27}; 
        
        // Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {firstArray, secondArray, thirdArray}; 
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
        
        // Three Dimensional Array
        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
        
        for (int[][] threeDimensionalArray1 : threeDimensionalArray) {
            for (int[] threeDimensionalArray11 : threeDimensionalArray1) {
                System.out.print("{");
                for (int k = 0; k < threeDimensionalArray11.length; k++) {
                    System.out.print(threeDimensionalArray11[k]);
                    if (k < threeDimensionalArray11.length - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.print("} ");
            }
            System.out.println();
        }
    }
}
