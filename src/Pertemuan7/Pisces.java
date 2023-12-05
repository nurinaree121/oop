/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author raph
 */
public class Pisces extends Mamalia{
    int jmlSirip;
    String bentuk_ekor;

    public Pisces() {
        nama = "Gurami";
    }
    
    @Override
    String bernafas() {
        return "Bernafas menggunakan Insang";
    }
}
