package data;

import base.Bike;
import base.Location;
import base.Parcel;
import base.Person;
import base.ParcelStatus;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        // ReadMe 1.1 สร้าง Bike เก็บไว้ 3 bike
        bikes[0]=new Bike("กค1234",250);
        bikes[1]=new Bike("ฟก1235",150);
        bikes[2]=new Bike("คง1236",120);
        //
        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        // ReadMe 1.2 สร้าง Person เก็บไว้ 3 persons
        person[0]=new Person("Alis","Jonathan");
        person[1]=new Person("Jojo","Mahaname");
        person[2]=new Person("Bob","Satit");
        //
        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        // ReadMe 1.3 สร้าง Parcel เก็บไว้ 10 parcels
        parcels[0]=new Parcel(50,ParcelStatus.READY_TO_SHIP,new Location(13.6561348,100.4958685));
        parcels[1]=new Parcel(10,ParcelStatus.READY_TO_SHIP,new Location(13.6509219,100.4821593));
        parcels[2]=new Parcel(20,ParcelStatus.READY_TO_SHIP,new Location(13.6436941,100.4167727));
        parcels[3]=new Parcel(40,ParcelStatus.READY_TO_SHIP,new Location(13.7023389,100.5340495));
        parcels[4]=new Parcel(30,ParcelStatus.READY_TO_SHIP,new Location(13.6790903,100.5909862));
        parcels[5]=new Parcel(80,ParcelStatus.READY_TO_SHIP,new Location(13.6356235,100.5905143));
        parcels[6]=new Parcel(10,ParcelStatus.READY_TO_SHIP,new Location(13.7527356,100.5107628));
        parcels[7]=new Parcel(20,ParcelStatus.READY_TO_SHIP,new Location(13.7509552,100.4289055));
        parcels[8]=new Parcel(60,ParcelStatus.READY_TO_SHIP,new Location(13.6569614,100.4015918));
        parcels[9]=new Parcel(90,ParcelStatus.READY_TO_SHIP,new Location(13.7257105,100.5328871));
        //

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
