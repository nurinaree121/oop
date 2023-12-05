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
public class Sekretaris extends Pegawai{
    String Pengalaman;
    int jmlHadir,T_Hadir;

    public Sekretaris() {
        T_Hadir = 15000;
    }
    
    @Override
    int hitGaji() {
        return GajiPokok + (T_Hadir * jmlHadir);
    }
}
