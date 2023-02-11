import java.util.ArrayList;

//methods:assignPatients, removePatients (both will accept an ArrayList of Patients and Clinicians to querry).
//a way to do this if i want factory method would be to take thee arrayList and then search each item in an enhanced for loop for
//the name field, return the clinician object if name found and call the instance method 'add' of clinicial objeect. that would mean
//that office personal has access to clinicians methods which is not great but this doesn't have to be perfect, jsut a seceond draft
// PT zipcodeArrrayList contains pt zipcode

public class OfficeWorker extends Worker{
    public OfficeWorker(String name, String title) {
        super(name,title);
    }


}
