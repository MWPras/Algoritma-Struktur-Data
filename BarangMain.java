/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu5;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class BarangMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        KeranjangBelanja data = new KeranjangBelanja();
        int jumlahBarang=4;
               
        for(int i=0; i<jumlahBarang; i++){
            System.out.print("Nama : ");
            String n = scan.nextLine();
            System.out.print("JumlahBarang : ");
            int j = sc.nextInt();
            System.out.print("Harga Satuan : ");
            int hs = sc.nextInt();
            
            Barang br = new Barang(n,j,hs);
            data.tambah(br);
            System.out.println("Harga Total : "+br.hargaTotal());
            System.out.println("---------------------");
        }
        
        System.out.println("Data Barang Sebelum Sorting : ");
        data.tampil();
        
        System.out.println("Data Barang setelah Sorting Berdasarkan Harga Satuan : ");
        data.bubbleSort();
        data.tampil();
        
        System.out.println("Data Barang setelah Sorting Berdasarkan Harga Total : ");
        data.selectionSort();
        data.tampil();
    }
}
