/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuis1;

/**
 *
 * @author destini marine
 */
public class DemoHP16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Handphone16 hp = new Handphone16("123456", "iPhone 15 Pro Max", "iOS 18", false, 0);

        System.out.println("=================================================");
        System.out.println("==================== KUIS 1 =====================");
        System.out.println("=================================================");
        System.out.println("Nama    : Hizkia Elsadanta");
        System.out.println("NIM     : 2341720253");
        System.out.println("Kelas   : TI-2E");
        System.out.println("No. Abs : 16");
        System.out.println("=================================================");
        System.out.println("=================================================");
        System.out.println("");
        
        // manampilkan informasi awal
        hp.info();

        // menyalakan handphone
        hp.power();
        hp.info();
        
        // menambah volume
        hp.tambahVolume();
        hp.info();
        
        hp.tambahVolume();
        hp.info();
        
        // menambah volume lagi
        hp.tambahVolume();
        hp.info();
        
        // mengurangi volume
        hp.kurangVolume();
        hp.info();
        
        // ini di mute
        hp.mute();
        hp.info();
        
        // ini di unmute
        hp.mute(); // Unmute
        hp.info();

        // mematikan handphone
        hp.power();
        hp.info();

        // mencoba menambah, mengurangi, dan mute volume saat handphone mati
        hp.tambahVolume();
        hp.kurangVolume();
        hp.mute();
        System.out.println("=================================================");
        System.out.println("");
        
        // handphone dihidupkan kembali
        hp.power();
        hp.info();
    }
    
}
