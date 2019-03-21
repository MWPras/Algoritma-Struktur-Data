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
public class LingkaranOOP {
 public static void main(String[] args) {
        Lingkaran circle = new Lingkaran();
        circle.phi = 3.14;
        circle.r = 7;
        double l = circle.hitungLuas();
        double k = circle.hitungKeliling();
        circle.tampil();
        System.out.println("Luas = " + l);
        System.out.println("Keliling = " + k);
    }   
}
