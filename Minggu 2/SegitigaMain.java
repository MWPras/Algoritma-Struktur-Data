/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2;

/**
 *
 * @author LENOVO
 */
public class SegitigaMain {
 public static void main(String[] args){
        Segitiga[] sgArray = new Segitiga[4];
        
        sgArray[0] = new Segitiga (10,4);
        sgArray[1] = new Segitiga (20,10);
        sgArray[2] = new Segitiga (15,6);
        sgArray[3] = new Segitiga (25,10);
        
        for(int i=0; i<4; i++){
            System.out.println("Hitung Balok ke "+ i +": " + sgArray[i].hitungLuas());
            System.out.println("Hitung Balok ke "+ i +": " + sgArray[i].hitungKeliling());
        }
    }   
}
