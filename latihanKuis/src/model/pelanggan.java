/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class pelanggan {
    //atribut
    private static int counter = 1;
    private String prefix = "p";
    private String idPelanggan; 
    
    private String nama;
    private String nomorTelepon;
    
    //constructor
    public pelanggan(String namaMasuk, String nomorMasuk){
        this.idPelanggan = prefix + String.format("%03d", counter);
        this.nama = namaMasuk;
        this.nomorTelepon = nomorMasuk;
        counter++;
    }
    
    public String getNama(){
        return nama;
    }
    public String getTelepoon(){
        return nomorTelepon;
    }
    public String getID(){
        return idPelanggan;
    }
}
