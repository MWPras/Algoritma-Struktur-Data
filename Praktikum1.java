/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3;
import java.util.Scanner;
import static Minggu3.MinMax.max_min;

/**
 *
 * @author LENOVO
 */
public class Praktikum1 {
    public static void main(String[] args) {
       MinMax[] ppArray = new MinMax[5];
       ppArray[0] = new MinMax();
       
       Scanner sc = new Scanner(System.in);
       
       for (int i = 0; i < 5; i++){
           ppArray[i] = new MinMax();
           System.out.println("Nilai Array indeks ke-" + i);
           System.out.print("Masukkan Nilai : ");
           ppArray[i].nilaiArray = sc.nextInt();
       }
      
       int arr [] = new int [5];
       for (int i = 0; i < 5; i++){
           arr[i] = ppArray[i].nilaiArray;
       }
            MaxMin hasil  = new MaxMin();
            
            max_min(arr, 0, 4, hasil);
            
            
            System.out.println("Devide Conquer");
            System.out.print("Nilai Minimal : " + hasil.minimum + "\nNilai Maksimal : " + hasil.maximum);
            System.out.print("\n");
    }
}
