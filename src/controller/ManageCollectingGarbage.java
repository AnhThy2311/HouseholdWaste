/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Repository.CollectingGarbageRepository;
import Repository.ICollectingGarbageRepository;
import view.Menu;

/**
 *
 * @author HP
 */
public class ManageCollectingGarbage extends Menu<String>{
    
    private ICollectingGarbageRepository icg= new CollectingGarbageRepository();
    private double[] list_stations;
    public ManageCollectingGarbage(String title, String[] s, double[] stations){
        super(title, s);
        this.list_stations= stations;        
    }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.print("Tổng chi phí thu gom rác tốn hết: "+icg.totalCost(list_stations));
                System.out.println("");
                break;
            case 2:
                System.exit(0);
                break;
        }
    }
    
}
