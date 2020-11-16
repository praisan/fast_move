
import base.Person; 

import base.Bike;
import base.Parcel;
import base.ParcelStatus;
import java.util.Arrays;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author praisan
 */
public class FastMoveConsoleApplication {

    public static Bike[] getBike() {
        Bike[] bikes = new Bike[0];
        bikes[0] = new Bike("eiei", 2);

        return bikes;
    }
    

 public static Person[] getPerson() {
        Person[] person = new Person[3];
        person[0] = new Person("firstname","lastname");
        return person;
    }
    
     
 }   
   