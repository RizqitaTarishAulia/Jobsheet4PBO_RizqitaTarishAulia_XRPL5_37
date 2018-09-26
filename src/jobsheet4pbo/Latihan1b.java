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
public class Latihan1b extends Latihan1a{
    public void walk(){
        System.out.println("Aeroplan is Flying");
    }
    public void fuel(){
        System.out.println("Fuels");
    }
    public static void main(String[] args){
        Latihan1b garuda = new Latihan1b();
        garuda.function();
        garuda.walk();
    }
}
