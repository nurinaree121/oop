/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author ASUS
 */
public interface DapatKomunikasiTV {
    
    int jmlBateraiRemote = 2;//menjadi konstan haru sada nilai nya, dan tidak bisa diubah,
                               // jika tidak ada nilai nya dia akan error
                               // dia sebg static bisa diakses tanpa membuat object langsung tulis kelas 
                         //dia juga final / constant
                         //dia bersifat static dan final = akhir sama tetap
    
    String TekanPowe();//walaupun tidak ada abstract di sudah di anggap abstract
                        //semua method di interface dianggap abstract
    String TekanVolume();
    String TekanChannel();
    
    //jika seperti dibawah maka akan error
//    String TekanPowe()
//    {
//        return "Tekan dengan simbol bulat bergaris tengnah";
//    }
}

