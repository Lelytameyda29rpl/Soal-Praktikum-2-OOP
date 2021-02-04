/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author MOKLET-2
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //object
       Pohon manggil = new Pohon();
       
       //Pengisian Variabel
       String nama_1 = "Pohon Cemara";
        System.out.println(" "+nama_1);
       //Menjalankan void method
       manggil.setNama();
       manggil.setTinggi();
       //Menjalankan method
       manggil.getNama();
       manggil.getTinggi();
       //Pengisian Variabel
       String nama_2 = "Pohon Kelapa";
        System.out.println(" "+nama_2);
       //Menjalankan void method
       manggil.setNama();
       manggil.setTinggi();
       //Menjalankan method
       manggil.getNama();
       manggil.getTinggi();
       
       
        
    }
    
}
