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
public class ElevatorController {
    public static ElevatorModel model;
    public static ElevatorView view;
    
    public ElevatorController(){
        model = new ElevatorModel();
        view = new ElevatorView();
       
        
    }
    public void simulate(){
        model.boardPassenger(3);
        model.boardPassenger(3);
        model.boardPassenger(5);
        for (int i=0; i<12; i++) {
            System.out.println(model.toString());
            model.move();
            System.out.println(model.toString());
        }//for
       // view.setFloor
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ElevatorController myElevator = new ElevatorController();
        model.boardPassenger(3);
        model.boardPassenger(3);
        model.boardPassenger(5);
        model.boardPassenger(7);
        //model.boardPassenger(2);
        view.updateAll(model.getCurrentFloor()+1, model.getNumPassengers(), model.getDirection());
        for (int i=0; i<12; i++) {
            System.out.println(model.toString());
            model.move();
            if(i<11)
                view.updateAll(model.getCurrentFloor()+1, model.getNumPassengers(), model.getDirection());
            System.out.println(model.toString());
        }//for
        view.exitElevatorView();
    }
}
