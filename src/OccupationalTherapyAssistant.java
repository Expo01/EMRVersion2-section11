public class OccupationalTherapyAssistant extends Clinician{
    public OccupationalTherapyAssistant(String name, String title, String territory) {
        super(name, title, territory);
    }

    public void showerTraining(){
        System.out.println("doing shower training");
    }

    public void dressingTraining(){
        System.out.println("doing dressing training");
    }
}
