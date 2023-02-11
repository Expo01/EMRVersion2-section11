public class NursingAssistant extends Clinician {
    public NursingAssistant(String name, String title, String territory) {
        super(name, title, territory);
    }

    public void woundCare(){
        System.out.println("doing wound care");
    }

    public void medicationManagement(){
        System.out.println("doing medication management");
    }
}
