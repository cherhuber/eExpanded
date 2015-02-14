/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator_mvc_exp;

/**
 *
 * @author cheryl
 */
public class FloorModel {
    int numPassengersWaiting;
    int floor;
    BuildingModel b;
    
    public FloorModel(){
        numPassengersWaiting=0;
        floor = 0;
    }
    public FloorModel(BuildingModel building, int floorNumber){
        numPassengersWaiting=0;
        floor = floorNumber;
        b = building;
    }
    public int passengersWaiting(){
        return numPassengersWaiting;
    }
    public void waitForElevator(){
        numPassengersWaiting++;
    }
}
