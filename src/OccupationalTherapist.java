public class OccupationalTherapist extends OccupationalTherapyAssistant implements canManageCases{
    public OccupationalTherapist(String name, String title, String territory) {
        super(name, title, territory);
    }

    public void performOASIS() {
        System.out.println("pushing many medicare buttons");
    }

    @Override
    public void inputOrders() {
        System.out.println("inputting orders");
    }

    @Override
    public void deleteOrders() {
        System.out.println("discontinuing orders");
    }

    public void performCogTest(){
        System.out.println("performing MOCA");
    }
}
