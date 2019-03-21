/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class pangkatMain {
    //memasukkan nilai dan pangkat
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        pangkat a = new pangkat();
        System.out.print("Masukkan nilai :");
        a.x = scInt.nextInt();
        System.out.print("Masukkan Pangkat :");
        a.n = scInt.nextInt();
        
        int brute =a.bruteForce(a.x,a.n);
        int divide=a.divideQ(a.x, a.n);
        System.out.println("Brute Force : "+brute);
        System.out.println("Divide conquer : "+divide);
    }
}
