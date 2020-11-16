
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
    
    public static Parcel[] getParcels(){
        Parcel[] parcels = new Parcel[0];
        parcels[0] = new Parcel(2.5, ParcelStatus.SHIPPING);
        
        return parcels;
        
        //asdasd
    }
}
