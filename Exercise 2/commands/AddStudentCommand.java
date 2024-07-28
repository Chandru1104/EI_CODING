package commands;

import models.ClassroomManager;

public class AddStudentCommand implements Command {
    private ClassroomManager manager;
    private String studentId;
    private String className;

    public AddStudentCommand(ClassroomManager manager, String studentId, String className) {
        this.manager = manager;
        this.studentId = studentId;
        this.className = className;
    }

    @Override
    public void execute() {
        manager.addStudent(studentId, className);
    }
}
