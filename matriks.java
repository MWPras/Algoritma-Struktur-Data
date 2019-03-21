/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3;

/**
 *
 * @author LENOVO
 */
public class matriks {
int jumlahBaris, jumlahKolom,nilai;

public int kalimatriksBF(int n){nilai= n;
    int faktor=1;
    for (int i=1; i<= n; i++){
    faktor= faktor * i;
}
    return faktor;
}
public int kalimatriksDC(int n){
    nilai =n;
        if (n==1){
            return 1;
        }else{
            int faktor = n * kalimatriksDC(n-1);
            return faktor;
        }
    }
}