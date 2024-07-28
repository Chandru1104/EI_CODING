package models;

import java.util.ArrayList;
import java.util.List;

public class Classroom implements Observable {
    private String name;
    private List<Observer> students;
    private List<String> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public void addStudent(String studentId) {
        Student student = new Student(studentId);
        students.add(student);
    }

    public void scheduleAssignment(String assignmentDetails) {
        assignments.add(assignmentDetails);
        notifyObservers("New assignment: " + assignmentDetails);
    }

    public void submitAssignment(String studentId, String assignmentDetails) {
        // Handle assignment submission logic here
    }

    @Override
    public void addObserver(Observer observer) {
        students.add(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : students) {
            observer.update(message);
        }
    }

    public String getName() {
        return name;
    }

    public List<Observer> getStudents() {
        return students;
    }

    public List<String> getAssignments() {
        return assignments;
    }
}
