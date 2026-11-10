/*
Develop a Java application for a Rider Trip Management System.

Rider:
* Rider Name
* Plate Number
* Rider Rating

Trip:
* Trip ID (e.g., TID1)
* Pickup Location
* Drop-off Location
* Distance (in kilometers)
* Rider (Rider object)
* Base Fare (a static variable initialized to 50.0).
The Trip class should also contain a method named hasSameRider() that compares two Trip objects to determine whether they have the same rider and plate number.

Tasks:
1. Create a Rider class with appropriate constructors to initialize its attributes.
2. Create a Trip class with appropriate constructors. Implement constructor overloading using the following two constructors:
* A constructor that accepts Pickup Location, Drop-off Location, and a Rider object.
* Another constructor that accepts Pickup Location, Drop-off Location, Distance, and a Rider object.
3. Implement a method inside the Trip class to display all trip information along with the associated rider's information. Each trip must have a unique Trip ID (e.g., TID1, TID2, TID3).
4. In the main() method:
* Create at least three Trip objects.
* Use both overloaded constructors to create the Trip objects.
* Display the information of all trips.
* Compare the riders of different Trip objects using the hasSameRider() method.
* Display whether the compared trips have the same rider or not.
* */

class Rider{
    String name;
    int num;
    double rating;

    public Rider(String name, int num, double rating) {
        this.name = name;
        this.num = num;
        this.rating = rating;
    }
}

class Trip {
    static int tid = 1;
    String ID;
    String Pl;
    String Dl;
    int distance;
    Rider rider;
    static double fare = 50.0;
    Trip(String pl, String Dl , Rider rider){
        this.ID = "TID" + tid++;
        this.Pl = pl;
        this.Dl= Dl;
        this.rider = rider;
    }
    Trip(String pl, String Dl , int distance,  Rider rider){
        this.ID = "TID" + tid++;
        this.Pl = pl;
        this.Dl= Dl;
        this.rider = rider;
        this.distance = distance;
    }
    void hasSameRider(Trip ...trips) {
        boolean same = false;
        for (int i =0; i< trips.length; i++){
            if(trips[i].rider.name == trips[trips.length-1].rider.name && trips[i].rider.num == trips[trips.length-1].rider.num  ){
                same = true;
            }
        }
        if (same){
            System.out.println("Trips have same riderrrrrrrrrr!!");
        }
    }

    void display(){
        System.out.println("Trips info: ");
        System.out.println("ID " + this.ID);
        System.out.println("Pickup location " + this.Pl);
        System.out.println("Drop off location " + this.Dl);
        System.out.println("Distance " + this.distance);
        System.out.println("-- Riders Info --");
        System.out.println(" Rider name : " + this.rider.name);
        System.out.println(" plate number : " + this.rider.num);
        System.out.println(this.rider.rating+" Star ratings ");
    }

}
class  ridersystem {
    public  static void  main(String[] args){
        Rider r1 = new Rider("wild" , 123 , 4.9);
        Rider r2 = new Rider("hopes" , 456 , 5.0);
        Trip t1 = new Trip("syl" , "dhaka" , 9 , r1);
        Trip t2 = new Trip("syl" , "coxs" , 30 , r1);
        Trip t3 = new Trip("syl" , "rajshahi" , 4 , r2);

        t1.display();
        t2.display();
        t3.display();
        t1.hasSameRider(t1, t2);

    }
}