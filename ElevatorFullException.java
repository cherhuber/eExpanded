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
public class ElevatorFullException extends Exception {
    public ElevatorFullException (String message){
        super(message);
    }
}
