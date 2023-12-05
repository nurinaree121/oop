/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembagian;

/**
 *
 * @author ASUS
 */
public class lat2driver {
    public static void main ( String[] args)
    {
        lat2 obj = new lat2();
        for(int i =0; i<=2; i++)
        {
            System.out.println(obj.nama[i]);
        }
        
        try
        {
            obj.nama[3] = "Esa";
            System.out.println(obj.nama[3]);
        }
        catch(Exception a )
        {
            System.out.println(a);
        }
//        catch(ArithmeticException a)
//        {
//            System.out.println("Salah Hitung");
//        }
//        catch(ArrayIndexOutOfBoundsException a)
//        {
//            System.out.println("Index melebihi");
//        }
        
//        obj.nama[3] = "Esa";
//        System.out.println(obj.nama[3]);
    }
}
