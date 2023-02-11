import java.util.ArrayList;

public abstract class Worker {
    private String name;
    private String title;
    private static int employeeID;

    public Worker(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public void clockIn(){
        System.out.println("you are clocked in");
    }

    public void clockOut(){
        System.out.println("you are clocked out");
    }

    public void sendMessage(){
        System.out.println("you are sending a message");
    }



}
