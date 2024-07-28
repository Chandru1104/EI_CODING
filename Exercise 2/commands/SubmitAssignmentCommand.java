package commands;

import models.ClassroomManager;

public class SubmitAssignmentCommand implements Command {
    private ClassroomManager manager;
    private String studentId;
    private String className;
    private String assignmentDetails;

    public SubmitAssignmentCommand(ClassroomManager manager, String studentId, String className, String assignmentDetails) {
        this.manager = manager;
        this.studentId = studentId;
        this.className = className;
        this.assignmentDetails = assignmentDetails;
    }

    @Override
    public void execute() {
        manager.submitAssignment(studentId, className, assignmentDetails);
    }
}
