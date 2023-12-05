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
public class Karyawan extends Pegawai{
    String Keahlian;
    
    
    @Override
    int hitGaji() {
        return GajiPokok;
    }
}
