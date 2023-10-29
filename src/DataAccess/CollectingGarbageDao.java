/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import model.Dump;
import model.Truck;

/**
 *
 * @author HP
 */
public class CollectingGarbageDao {
    private static CollectingGarbageDao instance=null;
    
    public static CollectingGarbageDao Instance(){
        if(instance==null){
            synchronized (CollectingGarbageDao.class) {
                if(instance==null){
                    instance= new CollectingGarbageDao();
                }
            }
        }
        return instance;
    }
    
    public double convertMinute(double minutes){
        return minutes/60;
    }
    
    public boolean checkTotalGarbageTruck(double totalGarbageTrck){
        return (totalGarbageTrck>=10000);
    }
    
    public double totalCost(double[] list_stations){              
        Truck truck= new Truck();
        Dump dump= new Dump();               
        double totalGarbageTruckNext=0;
        double totalCost=0;
        int count=0;        
        for (int i = 0; i < list_stations.length; i++) {                                    
            truck.setSoRacTrenXe( truck.getSoRacTrenXe()+list_stations[i] );            
            truck.setThoiGianThuGom( truck.getThoiGianThuGom() + 8 );            
            if(i<list_stations.length-1){
                totalGarbageTruckNext=  truck.getSoRacTrenXe()+list_stations[i+1]; 
                if(checkTotalGarbageTruck(totalGarbageTruckNext)){
                    dump.setSoLanXeDen(++count);
                    truck.setThoiGianThuGom( truck.getThoiGianThuGom() + 30 );                
                    truck.setSoRacTrenXe(0);                
                }    
            }                      
        }
        truck.setThoiGianThuGom(truck.getThoiGianThuGom()+30);        
        totalCost= convertMinute(truck.getThoiGianThuGom())*120000+dump.getSoLanXeDen()*57000;
        return totalCost;
    }
}
