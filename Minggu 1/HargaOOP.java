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
public class HargaOOP {
    public static void main(String[] args) {
        Harga item = new Harga();
        item.nama = "POTATO";
        item.hargaSatuan = 15000;
        item.jumlah = 5;
        item.tampil();
        item.hitungHargaTotal();
        item.hitungDiskon();
        int total = item.hitungHargaBayar();
        System.out.println("total bayar : " + total);
    }
}
