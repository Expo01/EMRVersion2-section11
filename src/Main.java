import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ArrayList<Patient> agencyPatientList = new ArrayList<>();
        addNewPatientToAgency("Dick", "Bellevue", agencyPatientList);
        addNewPatientToAgency("Sally", "Seattle", agencyPatientList);
        addNewPatientToAgency("Sally", "Seattle", agencyPatientList); //benefit of directly creating and adding
        //patienet to the agency master list and avoids having a Patient that is created but isn't in any organized list
        // but the downside is that withouth an object name created, the criteria to add and remove to master list is
        // based on the most unique field such as name, otheerwise I have to test for exact much of all field criteria manually

        //this really is a problem I need to solve because all ofmy code I keep trying to hide classes and use factory methods, but then
        // I can't do direct object searching or comparison withouth thee actual object variable name.

        displayAgencyPatientList(agencyPatientList);


    }

    public static void addNewPatientToAgency(String name, String territory, ArrayList<Patient> agencyPatientList) {
        for (Patient start : agencyPatientList) {
            if (start.getName().equals(name)) {
                System.out.println("patient is already in the agency's patient list"); //this doesn't work. don't know why
            } else {
                agencyPatientList.add(new Patient(name, territory));
                System.out.println("patient added to agency's patient list");
            }
        }
    }

    public static void removePatientFromAgency(String name, ArrayList<Patient> agencyPatientList) {
        for (Patient start : agencyPatientList) {
            if (start.getName().equals(name)) {
                agencyPatientList.remove(start);
                System.out.println("patient found and removed"); //downside is this doesn't look up by MRN #, and duplicate names could theoretically exist
            }
        }
    }

    public static void displayAgencyPatientList(ArrayList<Patient> agencyPatientList) {
        for (Patient start : agencyPatientList) {
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
// InnerClassGearbox: Inner class. For loop method call of local method to assign values to???
//ArrayList field in constructor. Way cool. Local class. Anonymous class. Implementing of an Interface
// PlaylistInnerClass: Outer class Album with inner class Songlist serving as ArrayList of Song objects. Factory
// method generation of Song when passing argument to add a Song to an Album. Use of Switch/Scanner and
// Iterator for user traversal and modification of playlist of Songs.
// AnimalClassAbstract: mixed use of interface and abstract classes/methods
//AbstractClassChallenge: use of interfacee and abstract class to create a linked list similiar to inbuilt Java
// LinkedList with pointers. Optional use of search tree and recursive method
