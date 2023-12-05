/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author ASUS
 */
public class manajer extends gaji implements Keahlian{
    //atribut
    int Hadir;
    int Lembur;
    int jmlHadir, jmlLembur;
        //konstruktor
    public manajer() {
        this.Hadir = 25000;
        this.Lembur = 60000;
    }

    //method
    int hitGaji() {
        Total = Gapok + (jmlHadir * Hadir) + (jmlLembur * Lembur);
        return Total;
    }

    //dari kls interface
    @Override
    public String keahlian() {
        return "Administrasi, pengelolaan dokumen"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
