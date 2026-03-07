/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Transaksi {
    //atribut
    pelanggan pelanggan;
    PaketCuci paket;
    
    
    //array
    public static Transaksi[] daftarTransaksi = new Transaksi[100];
    public static int jumlah = 0;
    
    //constructor
    public Transaksi(pelanggan pelanggan, PaketCuci paket){
        this.pelanggan = pelanggan;
        this.paket = paket;
    }
    
    //method
    public static void tambahDaftar(Transaksi t){
        daftarTransaksi[jumlah] = t;
        jumlah++;
    }
    
    public static void tampilkanTransaksi(){
        System.out.println("==== DAFTAR TRANSAKSI ====");
        for(int i = 0; i < jumlah; i++){
            System.out.println("Nama            : " + daftarTransaksi[i].pelanggan.getNama());
            System.out.println("Nomor Telepon   : " + daftarTransaksi[i].pelanggan.getID());
            System.out.println("Paket Cuci      : " + daftarTransaksi[i].paket.namaPaket);
            System.out.println("Harga Total     : " + daftarTransaksi[i].paket.hitungTotalBiaya());
            System.out.println("-------------------------");
        }
        
    }
}
