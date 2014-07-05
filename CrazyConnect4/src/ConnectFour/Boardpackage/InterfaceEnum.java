/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ConnectFour.Boardpackage;

/**
 *
 * @author kylugo
 */
public interface InterfaceEnum {

public enum WrongMessage{
    WRONG, RIGHT
}   

switch (WrongMessage){
case WRONG:
    System.out.println("Sorry, but that is the WRONG choice!")
    break;
case RIGHT:
    System.out.println("You are RIGHT!")
    break;
}
    int thisIsInterface;
    int thisToo;
}
