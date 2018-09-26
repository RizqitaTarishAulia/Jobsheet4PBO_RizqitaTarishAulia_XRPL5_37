/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet4pbo;

/**
 *
 * @author Tarishaulia
 */
public class Latihan2c{
    public static void main(String[] args){
        
        //membuat 2 objek
        Latihan2b line = new Latihan2b(13,37,28,4);
        Latihan2b line2 = new Latihan2b(34,23,16,9);
        //lenght objek 1 dan 2
        System.out.println("Panjang Angka Objek 1 = "+line.getLength());
        System.out.println("Panjang Angka Objek 2 = "+line2.getLength());
        System.out.println("");
        //Perbandingan
        System.out.println("Perbandingan Objek 1 > Objek 2 = "+line.isGreater(line,line2));
        System.out.println("Perbandingan Objek 1 < Objek 2 = "+line.isLess(line,line2));
    }
    
}
