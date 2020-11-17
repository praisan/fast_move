package fastmove;

import base.Parcel;
import base.Person;


public class FastMove {
    
    private FastBike[] fastBikes;
    int count;

    public FastMove(int size){
        fastBikes=new FastBike[size];
    }
    
    //ReadMe 4.1 สร้าง method เพื่อเพิ่ม Bike
    public boolean addBike(FastBike fastBike){
        if(count>=fastBikes.length)
            return false;
        fastBikes[count++]=fastBike;
        return true;
    }
    
    //ReadMe 4.3 สร้าง method เพื่อเพิ่ม Percel ให้ Bike ที่รุบุได้ผ่าน index
    public boolean addParcel(Parcel parcel,int index){
        if(index<count)
            return false;
        return fastBikes[index].addParcel(parcel);
    }
    
    //ReadMe 4.4. สร้าง method เพื่อนำ Percel ออกมาจาก Bike ที่รุบุได้ผ่าน index
    public Parcel getParcelFromBike(int index){
        if(index<count)
            return null;
        return fastBikes[index].getParcel();
        
    }
    //ReadMe 4.5. สร้าง method เพื่อค้นหา Person จาก Bike ได้โดยคืนค่าเป็น Person หากเจอ หรือ null หากไม่เจอ
    public Person findPersonFromBike(Person person){
        for(int i=0;i<count;i++){
            if(fastBikes[i].getDriver().matchName(person.getFirstname(), person.getLastname())){
                return fastBikes[i].getDriver();
            }
        }
        return null;
    }
}
