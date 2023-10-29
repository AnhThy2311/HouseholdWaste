/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class CostOfGarbage {
    public double totalTime;
    public Dump dump;
    
    
    public CostOfGarbage(){}
    
    public CostOfGarbage(double totalTime, Dump dump) {
        this.totalTime = totalTime;
        this.dump = dump;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public Dump getDump() {
        return dump;
    }

    public void setDump(Dump dump) {
        this.dump = dump;
    }
}
