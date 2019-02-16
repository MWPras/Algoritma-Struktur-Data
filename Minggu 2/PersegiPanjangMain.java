/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class PersegiPanjangMain {
   public static void main (String[] args){
       Scanner scan = new Scanner(System.in);
       PersegiPanjang[] ppArray = new PersegiPanjang[3];
       
       for(int i=0; i<3; i++){
           ppArray[0] = new PersegiPanjang();
           System.out.println("Persegi Panjang ke-"+i);
           System.out.print("Masukkan Panjang: ");
           ppArray[0].panjang = scan.nextInt();
           System.out.print("Masukkan Lebar: ");
           ppArray[0].lebar = scan.nextInt(); 
       }
       
       for(int i=0; i<3; i++){
           System.out.println("Persegi Panjang ke-" + i);
           System.out.println("Panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
       }
   } 
}
