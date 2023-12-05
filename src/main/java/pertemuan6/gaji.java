/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author ASUS
 */
public abstract class gaji {
    //atribut
    String nama, alamat;
    int Gapok;
    int Hadir;
    int Lembur;
    int Total;
    
    //konstruktor
    public gaji() {
        Gapok = 3200000;
        Hadir = 25000;
        Lembur = 60000;
    }
    
    //method abstract
    abstract int hitGaji();
    
//    String klsJabatan(karyawan a)
//    {
//      return " Jabatan : Karyawan";
//    }
//    String klsJabatan(Sekretaris a)
//    {
//        return " Jabatan : Sekretaris ";
//    }
//    String klsJabatan(manajer a)
//    {
//        return " Jabatan : Manager ";
//    }
}
