/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public abstract class PaketCuci {
    //atribut
    String namaPaket;
    int hargaDasar;
    
    //contructor
    public PaketCuci(String namaPaket, int hargaDasar){
        this.namaPaket = namaPaket;
        this.hargaDasar = hargaDasar;
    }
    
    //method
    public abstract int hitungTotalBiaya();
    
    
}
