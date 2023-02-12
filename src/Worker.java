import java.util.ArrayList;

public abstract class Worker {
    private String name;
    private String title;
    private static int employeeID;

    public Worker(String name, String title) {
        String[] jobTitles = {"PT", "OT", "PTA", "COTA", "Nurse", "CNA"};
        this.name = name;
        for (String start : jobTitles) {
            if (start.equals(title)) {
                this.title = title;
            } else {
                this.title = "other";

            }
        }
    }

    public void clockIn() {
        System.out.println("you are clocked in");
    }

    public void clockOut() {
        System.out.println("you are clocked out");
    }

    public void sendMessage() {
        System.out.println("you are sending a message");
    }


}
