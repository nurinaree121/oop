/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author raph
 */
public abstract class MahlukHidup {
//    String test;
    String nama;
    
    abstract String bernafas();

    public void setNama(String nama) {
        this.nama = nama;
    }
    String test(){
        return "ITN";
    }
    String kelasMH(Mamalia A){
        return nama + " adalah bagian Kelas Mamalia";
    }
    String kelasMH(Pisces A){
        return nama + " adalah bagian Kelas Mamalia";
    }
}
