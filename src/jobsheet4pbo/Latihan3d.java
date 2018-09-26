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
public class Latihan3d {
    public int hitungGaji(Latihan3a peg){
        int uang = peg.gaji();
        if(peg instanceof Latihan3b)
            uang+=((Latihan3b)peg).tunjangan();
        if(peg instanceof Latihan3c)
            uang+=((Latihan3c)peg).Bonus();
        return uang;
    }
    public static void main(String[] args){
        Latihan3d pg = new Latihan3d();
        Latihan3c ali = new Latihan3c();
        Latihan3b tony = new Latihan3b();
        System.out.println("Gaji yang dibayarkan untuk Staf = "+pg.hitungGaji(ali));
        System.out.println("Gaji yang dibayarkan kepada Direktur = "+pg.hitungGaji(tony));
    }
}
