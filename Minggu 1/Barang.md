/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu1;

/**
 *
 * @author LENOVO
 */
public class Barang {
   String namaBarang, jenisBarang;
    
    Barang(){
        
    }
    Barang(String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }
    int stok, hargaSatuan;
    void tampilBarang(){
        System.out.println("Nama = "+namaBarang);
        System.out.println("Jenis = "+jenisBarang);
        System.out.println("stok = "+stok);
        System.out.println("Harga Satuan = "+hargaSatuan);
        
    }
    void tambahStok(int n){
        stok = stok-n;
        
    }
    void kurangiStok (int n){
        stok = stok+n;
        
    }
    int hitungHargaTotal(int jumlah){
        return jumlah*hargaSatuan;
    } 
}
