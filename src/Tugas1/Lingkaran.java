/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author isatr
 */
public class Lingkaran implements MenghitungBidang{
    
    double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }
    
    @Override
    public double hitungluas(){
        return (3.14159265358979323846*jari*jari);
    }
    
    @Override
    public double hitungkeliling(){
        return 3.14159265358979323846*jari*2;
    }
    
    public double hitungkeliling(double diameter){
        return 3.14159265358979323846*diameter;
    }
    
    public void lingkarankeluar(){System.out.println("Lingkaran");}
    
}
