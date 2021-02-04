/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Scanner;//library untuk inputan keyboard
/**
 *
 * @author MOKLET-2
 */
public class Pohon {
    
    //Mendeklarasikan Variabel
    String nama;
    int tinggi;
    //Method Void Pertama
    void setNama(){
        //Untuk mengambil input dari keyboard
        Scanner input = new Scanner(System.in);
        //User memasukkan nilai variabel
        System.out.print("Masukkan Nama Pohon Yang Anda Inginkan: ");
        nama = input.nextLine();
        
    }
    //Method Void Kedua
    void setTinggi(){
        //Untuk mengambil input dari keyboard
        Scanner input = new Scanner(System.in);
        //User memasukkan nilai variabel
        System.out.print("Masukkan Tinggi Pohonnya: ");
        tinggi = input.nextInt();
    }
    //Method Ketiga
    public void getNama(){
        //Perintah untuk mengeluarkan output program
        System.out.println("Nama Pohonnya Adalah: "+nama);
    }
    //Method Keempat
    public void getTinggi(){
        //Perintah untuk mengeluarkan output program
        System.out.println("Tinggi Pohonnya Adalah: "+tinggi);
    }
    
}
