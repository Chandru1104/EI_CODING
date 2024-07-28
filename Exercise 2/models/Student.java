package models;

public class Student implements Observer {
    private String id;

    public Student(String id) {
        this.id = id;
    }

    //@Override
    public void update(String message) {
        System.out.println("Student " + id + " received notification: " + message);
    }

    public String getId() {
        return id;
    }
}
