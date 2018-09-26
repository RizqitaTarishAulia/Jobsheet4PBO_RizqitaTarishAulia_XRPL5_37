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
public class TugasPraktikum {
// ada 4 variable utam yang menentukan titik sudut persegi panjang
    public int x1, y1, x2, y2;
    
/** ini adalah constructor utama **/
    public TugasPraktikum(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
/* constructor dengan panjang dan lebar dimulai dari kordinat 0,0 */
    public TugasPraktikum(int width, int heigth){
        this(0, 0, width, heigth);
    }
    
/** constructor persegi n0.1 */
    public TugasPraktikum(){
        this(0, 0, 0, 0);
    }
    
/** method untuk menggeser persegi panjang */
    public void move(int deltax, int deltay){
        x1 += deltax; x2 += deltax;
        y1 += deltay; y2 += deltay;
    }
    
    /** method untuk memeriksa apa satu titik didalam persegi panjang */
    public boolean isInside(int x, int y){
        return((x >= x1)&& (x <= x2)&& (y >= y1)&& (y <= y2));
    }
        /** method untuk menggabung (union) persegi panjang */
        public TugasPraktikum union(TugasPraktikum r){
            return new TugasPraktikum(
            (this.x1 < r.x1) ? this.x1 : r.x1,
            (this.y1 < r.y1) ? this.y1 : r.y1,
            (this.x2 < r.x2) ? this.x2 : r.x2,
            (this.y2 < r.y2) ? this.y2 : r.y2);
        }
        
        /** method untuk mengetahui perpotongan dua persegi panjang*/
        public TugasPraktikum intersection(TugasPraktikum r){
            TugasPraktikum result = new TugasPraktikum(
            (this.x1 < r.x1) ? this.x1 : r.x1,
            (this.y1 < r.y1) ? this.y1 : r.y1,
            (this.x2 < r.x2) ? this.x2 : r.x2,
            (this.y2 < r.y2) ? this.y2 : r.y2);
            if (result.x1 > result.x2){
                result.x1 = result.x2 = 0;
            }
            if (result.y1 > result.y2){
                result.y1 = result.y2 = 0;
            }
            return result;
        }
        
        public static void main(String[]args){
        TugasPraktikum r1 = new TugasPraktikum(1,1,4,4);
        TugasPraktikum r2 = new TugasPraktikum(2,3,5,6);
        TugasPraktikum a = r1.union(r2);
        TugasPraktikum b = r1.intersection(r2);
        
        if (r2.isInside(r2.x1, r2.y1)==true)
            System.out.println("<"+r2.x1+","+r2.y1+"> is inside the Union");
        System.out.println(r1+" union "+r2+ " = "+a);
        System.out.println(r1+" intersect "+r2+" = "+b);
    }
    }

