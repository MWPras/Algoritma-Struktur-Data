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
public class JajarGenjangMain {
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         JajarGenjang[] jgArray = new JajarGenjang[5];
         
         for(int i=0; i<5; i++){
             jgArray[i]= new JajarGenjang();
             System.out.println("Jajar Genjang ke-"+i);
             System.out.print("Masukkan Alas: ");
             jgArray[i].alas = scan.nextInt();
             System.out.print("Masukkan Tinggi: ");
             jgArray[i].tinggi = scan.nextInt();
             System.out.print("Masukkan Sisi Miring: ");
             jgArray[i].sisiMiring = scan.nextInt();
             
         }
         for( int i=0; i<5; i++){
            System.out.println("Hitung Luas Jajar Genjang ke "+ i +": " + jgArray[i].hitungLuas());
            System.out.println("Hitung Keliling Jajargenjang ke "+ i +": " + jgArray[i].hitungKeliling());
         }
    }
}
