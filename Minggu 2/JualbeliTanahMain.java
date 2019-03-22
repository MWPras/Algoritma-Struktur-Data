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
public class JualbeliTanahMain {
    public static void main (String[] args){
        JualbeliTanah[] jtArray = new JualbeliTanah[3];
        Scanner scan = new Scanner(System.in);
        
        for(int i=1; i<4; i++){
           jtArray[0] = new JualbeliTanah();
           System.out.println("Persegi Panjang ke-"+i);
           System.out.print("Masukkan Panjang: ");
           jtArray[0].panjang = scan.nextInt();
           System.out.print("Masukkan Lebar: ");   
           jtArray[0].lebar = scan.nextInt();
        }
        for(int i=1; i<4; i++){
            System.out.println("Hitung Balok ke "+ i +": " + jtArray[i].hitungLuas());
        }
    }
}