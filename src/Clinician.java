import java.util.ArrayList;

public abstract class Clinician extends Worker {
    private String territory; //later make this zipcode arrayList but for now just the structure is ok
    private ArrayList<Patient> assignedPatients;

    public Clinician(String name, String title, String territory) {
        super(name, title);
        this.territory = territory;
    }

    public void takeVitals(){
        System.out.println("taking vitals");
    }

    public void document(){
        System.out.println("documenting stuff");
    }

    public void editMedications(){
        System.out.println("medication editing method reacheed. later this will take a Patient argument and use " +
                "a getter for pt medication arrayList to edit, but not now.");

    }
}




//Nursing assistant non-abstract class
//methods: wound care, medication training
//Nurse extends nursing and implements CanManageCase interface