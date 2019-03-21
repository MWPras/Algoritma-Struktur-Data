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
public class pangkat {
    public int x,n;
    
    public int bruteForce(int x,int n){
        int hasil = 1;
        for (int i = 0; i < n; i++) {
        hasil *=x;
    }
        return hasil;
    }
    
    public int divideQ(int x,int n){
        int temp = 1;
        if(n==0){
        return 1;
    }
        
    //pemangkatan
        temp = divideQ(x, n/2);
        if ((n%2)==0) {
            return (temp*temp);
        }else{
            return (x*temp*temp);
        }
    }
}