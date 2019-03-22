/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu5;

/**
 *
 * @author LENOVO
 */
public class DaftarMahasiswaBerprestasi {
    Mahasiswa ListMhs[]=new Mahasiswa[5];
    int idx;
    
//method tambah
    void tambah(Mahasiswa m){
        if(idx<ListMhs.length){
            ListMhs[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
//method tampil    
    void tampil(){
        for(Mahasiswa m : ListMhs){
            m.tampil();
            System.out.println("----------------");
        }
    }
    void selectionsort(){
        for(int i=0; i<ListMhs.length-1; i++){
            int idxMin =1;
            for(int j=1; j<ListMhs.length-i; j++){
                if(ListMhs[j].ipk < ListMhs[idxMin].ipk){
                    Mahasiswa tmp = ListMhs[j];
                    ListMhs[idxMin] = ListMhs[j-1];
                    ListMhs[1] = tmp;
                }
            }
        }
    }
    void insertionSort(){
        for(int i=0; i<ListMhs.length-1; i++){
            double key = ListMhs[i].ipk;
            int j = i-1;
            
            while(j>=0 && ListMhs[j].ipk>key){
                ListMhs[j+1] = ListMhs[j];
                j = j--;
            }
            ListMhs[j+1].ipk=key;
        }
    }
}
