
import base.Bike;
import base.Location;
import base.Parcel;
import base.ParcelStatus;
import base.Person;
import java.util.Scanner;

public class FastMoveConsoleApplication {

    public static void main(String[] args) {
        //ReadMe 3.1 สร้าง Menu เพื่อใช้ในการเลือกทำงาน
        String menu = "Select\n"
                + "1. input Bike\n"
                + "2. input Person\n"
                + "3. input Parcel\n"
                + "0. exit";
        Scanner input = new Scanner(System.in);
        int select=0;
        do {
            System.out.println(menu);
            System.out.print("Select: ");
            select = input.nextInt();
            input.nextLine();
            switch (select) {
                case 1:
                    Bike testBike = inputBike();
                    System.out.println(testBike.toString());
                    break;
                case 2:
                    Person testPerson = inputPerson();
                    System.out.println(testPerson.toString());
                    break;
                case 3:
                    Parcel parcel = inputParcel();
                    System.out.println(parcel.toString());
                    break;
            }

        }while(select!=0);

    }

    public static Bike inputBike() {
        //ReadMe 2.1 สร้าง method เพื่อรับค่ามาสร้าง Bike 1 Bike
        Scanner input = new Scanner(System.in);
        System.out.println("Input new Bike");
        System.out.print("License plate:");
        String licensePlate = input.nextLine();
        System.out.print("Engine capacity (cc):");
        int cc = input.nextInt();
        return new Bike(licensePlate, cc);
    }

    public static Person inputPerson() {
        //ReadMe 2.2 สร้าง method เพื่อรับค่ามาสร้าง Person 1 Person
        Scanner input = new Scanner(System.in);
        System.out.println("Input new Person");
        System.out.print("Name:");
        String name = input.nextLine();
        System.out.print("Sername:");
        String sername = input.nextLine();
        return new Person(name, sername);
    }

    public static Parcel inputParcel() {
        //ReadMe 2.3 สร้าง method เพื่อรับค่ามาสร้าง Parcel 1 Parcel
        Scanner input = new Scanner(System.in);
        System.out.println("Input new Parcel");
        System.out.print("Weight:");
        double weight = input.nextDouble();
        System.out.print("Latitude:");
        double latitude = input.nextDouble();
        System.out.print("Longitude:");
        double longitude = input.nextDouble();
        return new Parcel(weight, ParcelStatus.READY_TO_SHIP, new Location(latitude, longitude));
    }

}
