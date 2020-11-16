package data;

import base.Bike;
import base.Location;
import base.Parcel;
import base.ParcelStatus;
import base.Person;
import jdk.javadoc.doclet.Taglet;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        // your code
        // edit edit edit

        bikes[0] = new Bike("eiei", 2);
        bikes[1] = new Bike("ei", 3);
        bikes[2] = new Bike("e", 4);
        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        // your code
        person[0] = new Person("Ploy", "Ch");
        person[1] = new Person("Nut", "Sb");
        person[2] = new Person("Winner", "Wm");
        //asdasdasd
        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        Location[] location = new Location[10];
        location[0] = new Location(50, 06);
        
        parcels[0] = new Parcel(1.0, ParcelStatus.SHIPPING, location[0]);
        parcels[1] = new Parcel(1.0, ParcelStatus.SHIPPING);
        parcels[2] = new Parcel(1.0, ParcelStatus.SHIPPING);
        parcels[3] = new Parcel(1.0, ParcelStatus.SHIPPING);
        parcels[4] = new Parcel(1.0, ParcelStatus.SHIPPING);
        parcels[5] = new Parcel(1.0, ParcelStatus.SHIPPING);
        parcels[6] = new Parcel(1.0, ParcelStatus.SHIPPING);
        parcels[7] = new Parcel(1.0, ParcelStatus.SHIPPING);
        parcels[8] = new Parcel(1.0, ParcelStatus.SHIPPING);
        parcels[9] = new Parcel(1.0, ParcelStatus.SHIPPING);

        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
