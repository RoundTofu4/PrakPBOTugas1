/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.util.Scanner;

/**
 *
 * @author isatr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ulang;
        do{
        System.out.println("==========");
        System.out.println("Menu Utama");
        System.out.println("==========");
        System.out.println("1. Hitung Balok");
        System.out.println("2. Hitung Tabung");
        System.out.println("0. Exit");
        System.out.print("Pilih : ");
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        int pilih = input.nextInt();
        
        if (pilih == 1){
            System.out.print("Panjang : ");double panjang = input1.nextInt();
            System.out.print("Lebar : ");double lebar = input1.nextInt();
            System.out.print("Tinggi : ");double tinggi = input1.nextInt();
            Balok balok = new Balok(panjang, lebar, tinggi);
            System.out.println("Luas Persegi Panjang : "+balok.hitungluas());
            System.out.println("Keliling Persegi Panjang : "+balok.hitungkeliling());
            System.out.println("Volume Balok : "+ balok.hitungvolume());
            System.out.println("Luas Permukaan Balok : "+balok.hitungpermukaan());
        }
        
        if (pilih == 2){
            System.out.print("Jari-Jari : ");double jari = input1.nextInt();
            System.out.print("Tinggi : ");double tinggi = input1.nextInt();
            Tabung tabung = new Tabung(jari, tinggi);
            System.out.println("Luas Lingkaran : "+tabung.hitungluas());
            System.out.println("Keliling Lingkaran : "+tabung.hitungkeliling(jari*2));
            System.out.println("Volume Tabung : "+tabung.hitungvolume());
            System.out.println("Luas Permukaan Balok : "+tabung.hitungpermukaan());
        }
        if (pilih==3){break;}
        
            System.out.print("Ulang? (Ya: 1 || Tidak: 0)");
            ulang = input.nextInt();
            
        } while(ulang==1);


    }
    
}
