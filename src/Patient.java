public class Patient{


    //fieelds: date arrayList, assignedClinician String
    //
    //
    //
    private String name;
    private String territory; //will be zipcode later or full address to extract zipcode, but not until i can assign a zipcode arrayList to Clinician object
    private static int medicalRecordNumber;
 //   private ArrayList<CalendarDates> appointments; // will have fields of date and clinician. in adding a clinician, should querry the arraylist of
    //clinicians and eextract the name field and set the assignedClinician field to the etracted string name value, since I don't want a Calendar

 //   private ArrayList<Medications> medications; // will have fields of name, dose, unit, delivery method, frequency
    //consider appointmnts and medications as inner classees or records since just info storage and they can't exist without a patient objcet
    //object to have access to a whole clinician object


    public Patient(String name, String territory) {
        this.name = name;
        this.territory = territory;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", territory='" + territory + '\'' +
                '}';
    }
}
