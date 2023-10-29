/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class Truck {
   private double soRacTrenXe;
    private double thoiGianThuGom;
    
    
    public Truck(){}

    public Truck(double soRacTrenXe,double thoiGianThuGom) {
        this.soRacTrenXe = soRacTrenXe;
        this.thoiGianThuGom= thoiGianThuGom;
    }
    
    
    public double getSoRacTrenXe() {
        return soRacTrenXe;
    }

    public void setSoRacTrenXe(double soRacTrenXe) {
        this.soRacTrenXe = soRacTrenXe;
    }

    public double getThoiGianThuGom() {
        return thoiGianThuGom;
    }

    public void setThoiGianThuGom(double thoiGianThuGom) {
        this.thoiGianThuGom = thoiGianThuGom;
    } 
}
