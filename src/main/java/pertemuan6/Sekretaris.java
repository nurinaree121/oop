/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author ASUS
 */
public class Sekretaris extends gaji implements Keahlian{
    //atribut
    int Hadir, jmlHadir;

    //konstruktor
    public Sekretaris() {
        this.Hadir = 25000;
    }

    //method
    @Override
    int hitGaji(){
        Total = Gapok + (jmlHadir * Hadir);
        return Total;
    } 

    @Override
    public String keahlian() {
        return "Administrasi, pengrlolaan dokumen"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
