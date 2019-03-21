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
public class Lingkaran {
    double phi, r;
    double hitungLuas() {
        return phi * r * r;
    }
    double hitungKeliling() {
        return 2 * phi * r;
    }
    void tampil() {
        System.out.println("Phi = " + phi);
        System.out.println("r = " + r);
    }
}
