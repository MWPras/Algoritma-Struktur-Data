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
public class KeranjangBelanja {
  Barang  listBarang[] = new Barang[4];
  int idx;
  
  void tambah(Barang br){
      if(idx<listBarang.length){
          listBarang[idx]=br;
          idx++;
      }else{
          System.out.println("Data Penuh !");
      }
  }
  
  void tampil(){
      for(Barang br : listBarang){
          br.tampil();
          System.out.println("------------------");
      }
  }
  
  void bubbleSort(){
      for(int i=0; i<listBarang.length-1; i++){
          for(int j = i+1; j<listBarang.length-i; j++){
              if(listBarang[j].hargaSatuan<listBarang[j-1].hargaSatuan){
                  Barang tm = listBarang[j];
                  listBarang[j] = listBarang[j-1];
                  listBarang[j-1] = tm;
              }
          }
      }
  }
  void selectionSort(){
      for(int i=0; i<listBarang.length; i++){
          int idxMin =1;
          for(int j=i+i; j<listBarang.length; j++){
              if(listBarang[j].hargaTotal()<listBarang[idxMin].hargaTotal()){
                  idxMin =j;
              }
          }
          Barang tm = listBarang[idxMin];
          listBarang[idxMin]=listBarang[i];
          listBarang[i]=tm;
      }
  }
}
