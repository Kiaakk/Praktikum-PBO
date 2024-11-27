/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis1;

/**
 *
 * @author destini marine
 */
public class Handphone16 {
    private String noSeri;
    private String model;
    private String versiOS;
    private boolean on = false; // posisi handphone dalam keadaan mati
    private int volume = 0; // volume awal adalah 0
    private int lastVolume = 0; // saya menambah atribut baru agar bisa menyimpan volume terakhir sebelum di mute
    
    public Handphone16() {
        
    }
    
    public Handphone16 (String seri, String model, String versi, boolean power, int volume) {
        this.noSeri = seri;
        this.model = model;
        this.versiOS = versi;
        this.on = power;
        if (power && volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            this.volume = 0;
        }
    }
    
    public void power() {
        on = !on;
        if (!on) {
            System.out.println("Handphone dimatikan."); // posisi handphone dalam keadaan mati
        } else {
            System.out.println("Handphone dihidupkan."); // posisi handphone dalam keadaan hidup
        }
    }
    
    // penambahan volume dengan kelipatan 20 ya bu hehe
    public void tambahVolume() {
        if (on && volume <= 80) { // Maksimal volume 100, jadi harus <= 80 agar bisa ditambah 20
            volume += 20;
            System.out.println("Volume dinaikkan menjadi: " + volume);
        } else if (!on) {
            System.out.println("Handphone dalam keadaan mati, tidak bisa menambah volume.");
        } else {
            System.out.println("Volume maksimal sudah tercapai.");
        }
    }
    
    // pengurangan volume juga dengan kelipatan 20 bu 
    public void kurangVolume() {
        if (on && volume >= 20) { // Minimal volume 0, jadi harus >= 20 agar bisa dikurangi 20
            volume -= 20;
            System.out.println("Volume diturunkan menjadi: " + volume);
        } else if (!on) {
            System.out.println("Handphone dalam keadaan mati, tidak bisa mengurangi volume.");
        } else {
            System.out.println("Volume sudah minimal.");
        }
    }
    
    public void mute() {
        if (on) {
            if (volume != 0) {
                lastVolume = volume;
                volume = 0;
                System.out.println("Volume telah di mute.");
            } else {
                volume = lastVolume;
                System.out.println("Volume telah di unmute dan kembali ke volmue " + volume);
            }
        } else {
            System.out.println("Handphone dalam keadaan mati, tidak bisa mute.");
        }
    }
    
    public void info() {
        System.out.println("No. Seri        : " + noSeri);
        System.out.println("Model           : " + model);
        System.out.println("Versi OS        : " + versiOS);
        if (!on) {
            System.out.println("Status Power    : Off");
            System.out.println("Volume          : " + volume);
            System.out.println("Hp dalam keadaan mati.");
        } else {
            System.out.println("Status Power    : On");
            System.out.println("Volume          : " + volume);
        }
        System.out.println("=================================================");
        System.out.println("");
    }
}
