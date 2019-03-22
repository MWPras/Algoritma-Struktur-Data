/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu5;

/**
 *
 * @author LENOVO
 */
public class Barang {
    String nama;
    int jumlah, hargaSatuan;
    
    Barang(String n, int j, int hs){
        nama =n;
        jumlah=j;
        hargaSatuan=hs;
    }
    
    void tampil(){
        System.out.println("Nama : "+nama);
        System.out.println("Jumlah : "+jumlah);
        System.out.println("Harga Satuan : "+hargaSatuan);
        System.out.println("Harga Total : "+hargaTotal());
    }
    
    int hargaTotal(){
        return hargaSatuan*jumlah;
    }
}
