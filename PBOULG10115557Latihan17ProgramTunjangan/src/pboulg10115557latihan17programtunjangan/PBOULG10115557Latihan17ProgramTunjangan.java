/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg10115557latihan17programtunjangan;

import java.util.Scanner;

/**
 *
 * @author 10115557 / rayan / PBO Ulg / pertemuan 2 / latihan 17
 */
public class PBOULG10115557Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Variabel
        double gajiPokok;
        String status;
        
        System.out.println("=======Program Tunjangan=======");

        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        Scanner scan = new Scanner(System.in);        
        gajiPokok = scan.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        status = scan.next();
            
        System.out.println();
        System.out.println("=======Hasil Perhitungan Gaji Anda=======");
        System.out.println("Gaji Pokok\t\t: Rp " +gajiPokok);
        
        if(status.equals("Menikah")){
           System.out.println("Tunjangan\t\t: Rp " +gajiPokok*0.35);
            System.out.println("Total Gaji\t\t: Rp " +(gajiPokok*0.35+gajiPokok));
        }
            else    {
            System.out.println("Tunjangan\t\t: Rp " + 0);
            System.out.println("Total Gaji\t\t: Rp " +gajiPokok);
        }        
    }    
}
