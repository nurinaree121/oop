/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author ASUS
 */
public class DriverInterface {
    public static void main(String [] args)
    {
        Mamalia manusia = new Mamalia(); 
        manusia.nama = "Al";
        
        System.out.println("nama = "+ manusia.nama);
        System.out.println(manusia.bernafas());
        System.out.println("Cara berkomunikasi dengan tv  ");
        System.out.println(manusia.TekanPowe());
        System.out.println(manusia.TekanVolume());
        System.out.println(manusia.TekanChannel());
        System.out.println(DapatKomunikasiTV.jmlBateraiRemote);//
    }
    
}
