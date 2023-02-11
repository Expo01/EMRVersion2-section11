public class PhysicalTherapyAssistant extends Clinician{
    public PhysicalTherapyAssistant(String name, String title, String territory) {
        super(name, title, territory);
    }

    public void balance(){
        System.out.println("doing balance training");
    }

    public void gait(){
        System.out.println("doing gait training");
    }

    public void transfer(){
        System.out.println("doing transfer training");
    }
}

//PTA non-abstract subclass extends Clinician
// methods: balance, gait, transfer
//physical therapist class extends PTA and implements canManageCase Interface
