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
public class Persewaan {
    int id, lamaPinjam, hargaSewa, jumlah;
    String namaMember, namaGame;

    void hitung(){
       jumlah = hargaSewa * lamaPinjam;
       System.out.println("id : "+id + "\nNama Member : "+namaMember+"\nNama Game : "+namaGame);
       System.out.println("Jumlah Pembayaran = "+jumlah);
    }
    
    void Tampil() {
       System.out.println("id"+id); 
    }
}
