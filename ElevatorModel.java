/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cheryl
 */
package elevator_mvc_exp;
public class ElevatorModel {
    public final int MAX_CAPACITY = 10;
    public final int NUM_FLOORS = 7;
    private final int[] floors = new int[NUM_FLOORS];
    private int current_floor;
    private boolean moving_up;
    private int[] passenger_targets;
    private int stops[];

public ElevatorModel() {
    current_floor = 0;
    moving_up = true;
    passenger_targets = new int[NUM_FLOORS];
}
public boolean getDirection(){
    return moving_up;
}
public int getCurrentFloor(){
    return current_floor;
}
public int getNumPassengers(){
    int passengers = 0;
    for (int i=0; i<passenger_targets.length; i++) {
        if (passenger_targets[i] > 0) {
            passengers += passenger_targets[i];
        }//if
    }//for
    return passengers;
}
public void move() {
    if (moving_up) {
        current_floor++;
        //System.out.println("\r\nStopping on floor "+(current_floor+1));
    }
    else {
        current_floor--;
        //System.out.println("\r\nStopping on floor "+(current_floor+1));
    }
    if (current_floor == 0) {
        moving_up = true;
    }
    else if (current_floor == NUM_FLOORS-1) {
        moving_up = false;
    }
    if (passenger_targets[current_floor] != 0) {
        
        //stop();
        System.out.println("\r\nStopping on floor "+(current_floor+1));
        passenger_targets[current_floor] = 0;
    }
    try{
        Thread.sleep(2000); //1000 milliseconds = 1 seconds
    }catch(InterruptedException e){
        Thread.currentThread().interrupt();
    }
}

/*public void stop() {
    passenger_targets[current_floor] = 0;
    System.out.println("\r\nStopping on floor "+(current_floor+1));
    System.out.println(this);
}
*/

public void boardPassenger(int floor) {
    floor--;
    passenger_targets[floor]++;
}
@Override public String toString() {
    int passengers = getNumPassengers();  
    return "Current Passengers: "+passengers+"\tCurrent Floor: "+(current_floor+1)+"\tDirection: "+(moving_up?"Up":"Down");
}

}
