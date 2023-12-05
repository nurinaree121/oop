/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author ASUS
 */
public class Driver1 {
    public static void main(String [] args ) 
    {
        
        //DINAMIC polimorfisme -> BERUBAH
//        MakhlukHidup 
        MakhlukHidup MH = new Mamalia();//variabel MH-> bertipe kelas induk, konstrak dari kls anak
        //upcasting menggunakan 
        
//        System.out.println(MH.);
        System.out.println(MH.bernafas());//1  -> 1 & 3 sama atau polimosfisme
        
        //borcasting merubah
        Mamalia MH1 = (Mamalia) MH; //
        System.out.println(MH1.bernafas());//2  -> 2 & 4 tdk sama bukan polimorfisme
        
         MH = new Pisces();
         System.out.println(MH.bernafas());//3
         
         //downcasting -> memakai konstraktor induk
         Pisces MH2 =  (Pisces) MH;
         System.out.println(MH2.bernafas());//4
        
        //static -> TIDAK BERUBAH
//        Mamalia sapi = new Mamalia();
//        Pisces gurami = new Pisces();
//        
//        sapi.setNama("sapi");
//        gurami.setNama("Gurami");
//        
//        System.out.println(sapi.KelasMH(sapi)); //memanggilnya dg cara yg sama tapi outpunntya berbeda (static)
//        System.out.println(gurami.KelasMH(gurami)); //
//        
//        System.out.println(sapi.bernafas());
//        System.out.println(gurami.bernafas());
        
//        System.out.println();
    }
}



///sebelum running compiler/belum jalan=eksekusi -> 

//runtime=proses -> overriding

//override overload ->punya method
//static dinamic -> punya object

//polimorfisme => untuk memfleksibelkan code yang konsep utama dlm o
//op memungkinkan object kelas yng berbeda dapat
//entitas => object


//upcasting => anak menggunakan anak, anak-menggunakan induk
//memanipulasi objeknya =>upcasting

//downcast mengakses anak