public class PhysicalTherapist extends PhysicalTherapyAssistant implements canManageCases {
    public PhysicalTherapist(String name, String title, String territory) {
        super(name, title, territory);
    }

    @Override
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
}
