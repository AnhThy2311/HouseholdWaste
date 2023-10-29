/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ManageCollectingGarbage;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        String title= "Collecting household waste";
        String[] s= new String[] {"CHI PHI THU GOM RAC"};        
        double[] stations= new double[] {1765, 2808, 952, 4206, 3102, 3902, 1292, 3985, 8324, 1928, 4426, 397, 3277};
        new ManageCollectingGarbage(title, s, stations).run();
    }
}
