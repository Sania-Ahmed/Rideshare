class Doctor{
    String DocName , spec , chamber ;
    int  room ;

   Doctor(String docName, String chamber, String spec, int room) {
        DocName = docName;
        this.chamber = chamber;
        this.spec = spec;
        this.room = room;
    }

    Doctor(){

    }
}

class Appointment {
 int ID , dur , fee ;
 String patientName;

    Appointment(int ID, int dur, int fee, String patientName) {
        this.ID = ID;
        this.dur = dur;
        this.fee = fee;
        this.patientName = patientName;
    }
    Appointment(){

    }

    void Display (){
        System.out.println("Patient Name : " + patientName);
        System.out.println("Appointment Duration : " + dur + "hrs");
        System.out.println("Total Fee : " + dur*fee );
    }
    void Display ( boolean show){
        if(show){
            System.out.println("Patient Name : " + patientName);
            System.out.println("Appointment Duration : " + dur + "hrs");
            System.out.println("Total Fee : " + dur*fee );
        }
        else{
            System.out.println("Patient info can not be shown");
        }

    }
    public static Appointment fL(Appointment... apps) {



        Appointment longest = apps[0];

        for (int i = 1; i < apps.length; i++) {
            if (apps[i].dur> longest.dur) {
                longest = apps[i];
            }
        }

        return longest;
    }
}
 class HospitalManagement {
    public static void main(String[] args) {

        // Creating Doctor objects
        Doctor d1 = new Doctor("Dr. x","syl", "Cardiologist", 101);
        Doctor d2 = new Doctor("Dr. strange","syl", "Neurologist", 202);
        Doctor d3 = new Doctor("Dr. mojojojo","syl", "Dermatologist", 303);

        // Creating Appointment objects
        Appointment a1 = new Appointment(1,  2, 1000 , "blossom");

        Appointment a2 = new Appointment(2,  1, 1500 , "nick");

        Appointment a3 = new Appointment(3,  3, 1200 , "juddy");

        // Calling both display methods
        a1.Display();

        a2.Display(false);

        // Finding longest appointment among three objects
        System.out.println("\nLongest among THREE appointments:");

        Appointment longest1 =
                Appointment.fL(a1 , a2 , a3);


            longest1.Display();



    }
}