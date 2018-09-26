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
public class Latihan4a {
    //private member variable
    private String color;
    //Constructor
    public Latihan4a (String color){
        this.color = color;
    }
    public String toString(){
        return "Shape[color = " + color + "]";
    }
    //All shapes must have a method called getArea()
    public double getArea(){
        //We need to return some value to compile the program
        System.out.println("Shape unknown! Cannot compute area!");
        return 0;
    }
    
}
