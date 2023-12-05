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
public class Manager extends Pegawai{
    String Pendidikan;
    int jmlLembur,jmlHadir,T_Hadir,J_Lembur;

    public Manager() {
        T_Hadir = 15000;
        J_Lembur = 40000;
    }
   
    @Override
    int hitGaji() {
        return GajiPokok+ (T_Hadir * jmlHadir) + (J_Lembur * jmlLembur);
    }
}
