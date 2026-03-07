/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihankuis;
import java.util.Scanner;
import model.*;

public class LatihanKuis {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //atribut
        int menu;
        do{
            System.out.println("===== LOUNDRY KITA =====");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Keluar");
            System.out.println("Pilih Menu: ");
            menu = input.nextInt();
            input.nextLine();

            if(menu == 1){
                System.out.println("Masuk Menu 1");
                //atribut
                String nama;
                String telepon;
                
                System.out.println("Masukkan Nama Pelanggan: ");
                nama = input.nextLine();
                System.out.println("Masukkan Nomor Telepon: ");
                telepon = input.next();
                
                try{
                    if(!telepon.matches("[0-9]+")){
                        throw new DataPaketTidakValidException("ERROR NOMOR HARUS ANGKA TIDAK BOLEH STRING");
                    }
                }catch(DataPaketTidakValidException e){
                    System.out.println(e.getMessage());
                    continue;
                }
                pelanggan pelangganBaru = new pelanggan(nama, telepon);
                
                int harga;
                System.out.println("Masukkan Harga Dasar: ");
                harga = input.nextInt();
                try{
                    if(harga <= 0){
                        throw new DataPaketTidakValidException("ERROR HARGA TIDAK VALID");
                    }
                }catch(DataPaketTidakValidException e){
                    System.out.println(e.getMessage());
                    continue;
                }
                
                int paket;
                System.out.println("Masukkan Tipe Paket Cuci(1. Reguler/2. Express): ");
                paket = input.nextInt();
                
                PaketCuci paketBaru;
                
                if(paket == 1){
                    paketBaru = new CuciReguler(harga);
                }
                else if(paket ==2){
                    paketBaru = new CuciExpress(harga);
                }
                else{
                    try{
                        throw new DataPaketTidakValidException("ERROR INPUT PAKET TIDAK VALID");
                    }
                    catch(DataPaketTidakValidException e){
                        System.out.println(e.getMessage());
                        continue;
                    }
                    
                }
                
                Transaksi transaksiBaru = new Transaksi(pelangganBaru, paketBaru);
                Transaksi.tambahDaftar(transaksiBaru);
                
                System.out.println("DATA BERHASIL DITAMBAH!");
            }
            else if(menu == 2){
                System.out.println("Program Selesai");
                Transaksi.tampilkanTransaksi();
            }
            
            else{
                System.out.println("MENU TIDAK VALID!");
            }
            
            
        }while(menu != 2);        
    }
    
}
