/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

import Pertemuan6.*;

/**
 *
 * @author raph
 */
public abstract class Pegawai {
    String nama;
    String alamat;
    int GajiPokok;
    public Pegawai(){
        GajiPokok = 3200000;
    }
    abstract int hitGaji();
    
    String kelasJabatan(Karyawan A){
        return " Jabatan Karyawan";
    }
    String kelasJabatan(Sekretaris A){
        return " Jabatan Sekretaris";
    }
    String kelasJabatan(Manager A){
        return " Jabatan Manager";
    }
}
