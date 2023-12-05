/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author raph
 */
public class Driver1 {
    public static void main(String[] args) {
        //Start Dynamic Polymorph
        MahlukHidup MH;
        MH = new Mamalia(); // Upcasting
        
        System.out.println(MH.bernafas()); // 1  Polymorph
        
        // End Dynamic Polymorphism
        Mamalia MH1 = (Mamalia) MH; // Downcasting
        System.out.println(MH1.bernafas()); // 2 Bukan Polymorph
        
        MH = new Pisces(); // Upcasting
        System.out.println(MH.bernafas()); // 3 Polymorph
        Pisces MH2 = (Pisces) MH; // Downcasting
        System.out.println(MH2.bernafas()); // 4 Bukan Polymorph
        
        Mamalia sapi = new Mamalia();
        Pisces gurami = new Pisces();
        sapi.setNama("Sapi");
//        Polymorph Static
        System.out.println(sapi.kelasMH(sapi)); // 1
        System.out.println(sapi.kelasMH(gurami)); // 2
      
    }
}
