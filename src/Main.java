public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}

//EMR second attempt. This time using abstract class and interfaces
   //CanManageCase
        //methods: OASISDocumentation, inputOrders,

    //main
        //ArrayList of Patients
        //ArrayList of all Clinicians
        //factory generation of patients and workers? Might need their variable names though...
        //office personal will be able to querry the patient and clinician lists to assign

    //Worker abstract class
        //fields: name, static employeeID,
        //methods: punchTime, sendMessages

        //Office personnel non-abstract subclass extends Worker
            //fields: title
            //methods:assignPatients, removePatients (both will accept an ArrayList of Patients and Clinicians to querry and add if
                // PT zipcodeArrrayList contains pt zipcode

        //Clinician abstract subclass extends Worker
            //fields: title,zipcodes ArrayList, Patients ArrayList
            //methods: takeVitals, document, editMedications

                //PTA non-abstract subclass extends Clinician
                    // methods: balance, gait, transfer
                //physical therapist class extends PTA and implements canManageCase Interface

                //Nursing assistant non-abstract class
                    //methods: wound care, medication training
                //Nurse extends nursing and implements CanManageCase interface


        //Patient non-abstract class
            //fields: name, zipCode, medication ArrayList, static MRNNumber






// TIM UPDATED THE COURSE AGAIN SO NUMBERS ARE ALL JACKED UP
// 148/149: PhoneInterface: just implementing an Interface
// 150/151: InterfaceGameChallenge: Not much new. Sloppy code by Tim. Not sure its worth detailing
// InnerClassGearbox: Inner class. For loop method call of local method to assign values to…
        //ArrayList field in constructor. Way cool. Local class. Anonymous class. Implementing of an Interface
// PlaylistInnerClass: Outer class Album with inner class Songlist serving as ArrayList of Song objects. Factory
        // method generation of Song when passing argument to add a Song to an Album. Use of Switch/Scanner and
        // Iterator for user traversal and modification of playlist of Songs.
// AnimalClassAbstract: mixed use of interface and abstract classes/methods
//AbstractClassChallenge: use of interfacee and abstract class to create a linked list similiar to inbuilt Java
        // LinkedList with pointers. Optional use of search tree and recursive method
