/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan61.bangunruang;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk menghitung 
 * volume bangun ruang.
 */
public class Kerucut extends BangunRuang {
    private double jari2;
    private double tinggi;

    public double getJari() {
        return jari2;
    }

    public void setJari(double jari) {
        this.jari2 = jari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume(){
        return jari2*jari2*tinggi*3.14*1/3;
    }
    
    
}
