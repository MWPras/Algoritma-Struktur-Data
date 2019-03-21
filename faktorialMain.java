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
public class faktorialMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        faktorial fakObjek = new faktorial();
        System.out.print("Masukkan jumlah n faktorial: ");
        fakObjek.nilai = sc.nextInt();
        
        System.out.println("Nilai Faktorial Brute Force: "+fakObjek.faktorialBF(fakObjek.nilai));
        System.out.println("Nilai Faktorial Divide Conquer: "+fakObjek.faktorialDC(fakObjek.nilai));
        
    }

}
    