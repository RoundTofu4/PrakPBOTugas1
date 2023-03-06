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
public class Tabung extends Lingkaran implements MenghitungRuang{
    
    private double tinggi;
    
    public Tabung(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungvolume(){
        return hitungluas()*tinggi;
    }
    
    @Override
    public double hitungpermukaan(){
        return (2*hitungluas()+hitungkeliling()*tinggi);
    }
    
    
    
    public void tabungkeluar(){System.out.println("tabung");}
    
}
