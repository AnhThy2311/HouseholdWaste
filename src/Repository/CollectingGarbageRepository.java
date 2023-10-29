/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.CollectingGarbageDao;

/**
 *
 * @author HP
 */
public class CollectingGarbageRepository implements ICollectingGarbageRepository{

    @Override
    public double totalCost(double[] list_stations) {
        return CollectingGarbageDao.Instance().totalCost(list_stations);
    }
    
}
