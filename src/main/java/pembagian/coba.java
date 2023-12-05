/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembagian;

/**
 *
 * @author ASUS
 */
public class coba {
    
    
    public static void main(String[] args)
    {
        lat1 obj = new lat1();
        obj.a = 20;
        obj.b = 0;
        
        try 
        {
            System.out.println("hasil pembagian " + obj.pembagian());
        }
        catch(ArithmeticException a) 
        {
            System.out.println("Kesalahan karena dibagi dengan 0");
        }
        
//        System.out.println("hasil pembagian " + obj.pembagian());
    }
}
