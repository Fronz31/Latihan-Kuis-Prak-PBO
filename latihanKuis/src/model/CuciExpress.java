/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class CuciExpress extends PaketCuci implements LayananAntar{
    //constructor
    public CuciExpress(int hargaDasar){
        super("Cuci Express", hargaDasar);
    }
    
    //method bawaan
    @Override
    public int hitungTotalBiaya(){
        return hargaDasar + 20000;
    }
    
    //interface
    @Override
    public void cetakInfoAntar(){
        System.out.println("Layanan Antar-Jemput Gratis LaundryKita");
    }
}
