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
public class Balok extends PersegiPanjang implements MenghitungRuang {
    double panjang, lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungvolume(){
        return hitungluas()*tinggi;
    }
    
    @Override
    public double hitungpermukaan(){
        return 2*(hitungluas()+panjang*tinggi+lebar*tinggi);
    }
}
