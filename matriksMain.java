/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
//masukkan data
public class matriksMain {
    public static void main(String[] args){
        matriks a = new matriks();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Jumlah indeks baris martriks : ");
        a.jumlahBaris = scanner.nextInt();
        System.out.print("Masukan Jumlah indeks kolom martriks : ");
        a.jumlahKolom = scanner.nextInt();
        
        Integer[][] array = new Integer[a.jumlahBaris][a.jumlahKolom];
        for (int i = 0; i < a.jumlahBaris; i++) {
            for (int j = 0; j < a.jumlahKolom; j++) {
            System.out.print("Masukan isi indeks beris ke " + i + " kolom ke "+j+":");
            array[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println();
        System.out.println("berikut adalah isi array yang tadi dimasukan:");
        for (int i = 0; i < a.jumlahBaris; i++) {
            for (int j = 0; j < a.jumlahKolom; j++) {
            System.out.println("Isi indeks baris ke " + i + " kolom ke "+j+" adalah :" +
            array[i][j]);
            }
        }
        
        System.out.println();
        System.out.println("Bentuk matriks:");
        for (int i = 0; i < a.jumlahBaris; i++) {
            for (int j = 0; j < a.jumlahKolom; j++) {
            System.out.print(array[i][j]+" ");
            }
        System.out.println();
        }
        System.out.println("Nilai faktorial Brute force: "+ a.kalimatriksBF(a.nilai));
        System.out.println("Nilai faktorial Divide Conquer: "+ a.kalimatriksDC(a.nilai));
    }
}
