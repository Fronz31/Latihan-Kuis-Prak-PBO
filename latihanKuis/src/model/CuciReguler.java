/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lenovo
 */
public class CuciReguler extends PaketCuci{
    //constructors
    public CuciReguler(int hargaDasar){
       super("Cuci Reguler", hargaDasar);
    }
    
    //panggil method
    @Override
    public int hitungTotalBiaya(){
        return hargaDasar;
    }
}
