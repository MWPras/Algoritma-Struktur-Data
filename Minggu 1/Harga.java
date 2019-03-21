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
public class Harga {
    String nama;
    int hargaSatuan, jumlah, total, diskon, bayar;
    int hitungHargaTotal() {
        return total = hargaSatuan * jumlah;
    }

    int hitungDiskon() {
        if (total > 100000) {
            System.out.println("Diskon 10%");
            return diskon = total * 10 / 100;
        } else if (total >= 50000 && total <= 100000) {
            System.out.println("Diskon 5%");
            return diskon = total * 5 / 100;
        } else
            return 0;
    }

    int hitungHargaBayar() {
        return bayar = total - diskon;
    }

    void tampil() {
        System.out.println("Nama = " + nama);
        System.out.println("Harga Satuan = " + hargaSatuan);
        System.out.println("Jumlah = " + jumlah);
    }
}
