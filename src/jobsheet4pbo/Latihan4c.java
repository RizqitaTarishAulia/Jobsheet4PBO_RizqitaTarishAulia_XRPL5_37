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
public class Latihan4c extends Latihan4a{
    //private member variables
    private int base;
    private int heigth;
    //constructor
    public Latihan4c(String color, int base, int heigth){
        super(color);
        this.base = base;
        this.heigth = heigth;
    }
    public String toString(){
        return "Triangle[base = " + base + ",heigth = " + heigth + "," + super.toString() + "]";
    }
    //Override the inherited getArea()
    public double getArea(){
        return 0.5*base*heigth;
    }
}
