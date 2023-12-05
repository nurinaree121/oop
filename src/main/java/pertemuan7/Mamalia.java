/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author ASUS
 */
public class Mamalia extends MakhlukHidup implements DapatKomunikasiTV{
    //atirbut
    int jmlKaki;
    String suara;

    public Mamalia() {
        nama = "Kuda";
    }
    
    String bereproduksi(){
        return "melahirkan";
    }
    
    @Override
    String bernafas() {
        return " Bernafas menggunakan Paru-paru"; 
    }

    @Override
    public String TekanPowe() {
        return "Tekan tombol dg simbol lingkaran bergaris tenngah"; 
    }

    @Override
    public String TekanVolume() {
        return " Tekan tomobl segitiga";
    }

    @Override
    public String TekanChannel() {
        return  " Tekan tombol bernomor 0-9"; 
    }
    
    
    
}
