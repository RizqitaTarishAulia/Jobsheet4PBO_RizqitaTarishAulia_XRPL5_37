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
public class Latihan4b extends Latihan4a{
    //private member variables
    private int length;
    private int width;
    //constructor
    public Latihan4b(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }
    public String toString(){
        return "Rectangle[length = " + length + ",width = " + width + "," + super.toString() + "]";
    }
    public double getArea(){
        return length*width;
    }
}
