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
public class faktorial {
    public int nilai, hasil;
        
    public int faktorialBF(int n){
        nilai = n;
        int fakto = 1;
        for(int i =1; i<= n; i++)
            fakto = fakto*i;
        return fakto;
    }
    
    public int faktorialDC(int n){
        nilai = n;
        if(n==1){
            return 1;
        }
        else {
            int fakto = n* faktorialDC(n-1);
            return fakto;
        }
    }

}
