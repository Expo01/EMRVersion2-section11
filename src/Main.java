import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        OfficeWorker bob = new OfficeWorker("bob", "other");
        bob.sendMessage();
//        PhysicalTherapyAssistant barbara = new PhysicalTherapyAssistant("barbara", "PTA", "bellevue");
//        barbara.editMedications();
//        PhysicalTherapist hank = new PhysicalTherapist("Hank", "PT", "Redmond");
//        hank.performOASIS();
//        NursingAssistant betty = new NursingAssistant("betty", "CNA", "Seattle");
//        betty.clockIn();
//        Nurse voldemort = new Nurse("Voldemort", "nurse", "Hogwarts");
//        voldemort.woundCare();
//        OccupationalTherapyAssistant debbie = new OccupationalTherapyAssistant("Debbie", "COTA", "Renton");
//        debbie.showerTraining();
//        OccupationalTherapist neesha = new OccupationalTherapist("Neesha", "OT", "Renton");
//        neesha.performCogTest();



        ArrayList<Patient> agencyPatientList = new ArrayList<>();
        addNewPatientToAgency("Dick", "Bellevue", agencyPatientList);
        addNewPatientToAgency("Sally", "Seattle", agencyPatientList);
        addNewPatientToAgency("Sally", "Seattle", agencyPatientList);

        displayAgencyPatientList(agencyPatientList);


    }

    public static void addNewPatientToAgency(String name, String territory, ArrayList<Patient> agencyPatientList){
//        agencyPatientList.add(new Patient(name, territory));
                for (Patient start : agencyPatientList){
            if(start.equals (new Patient(name, territory))){
                System.out.println("pt already in list");
            } else agencyPatientList.add(new Patient(name,territory));
            System.out.println("patient added");
        }
    }

    public static void displayAgencyPatientList(ArrayList<Patient> agencyPatientList){
        for(Patient start : agencyPatientList){
            System.out.println(start); //overRided to String method in Patient class
        }
    }


}


//main
//ArrayList of Patients
//ArrayList of all Clinicians
//factory generation of patients and workers? Might need their variable names though...
//office personal will be able to querry the patient and clinician lists to assign


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
