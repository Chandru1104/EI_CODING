package commands;

import models.ClassroomManager;

public class ScheduleAssignmentCommand implements Command {
    private ClassroomManager manager;
    private String className;
    private String assignmentDetails;

    public ScheduleAssignmentCommand(ClassroomManager manager, String className, String assignmentDetails) {
        this.manager = manager;
        this.className = className;
        this.assignmentDetails = assignmentDetails;
    }

    @Override
    public void execute() {
        manager.scheduleAssignment(className, assignmentDetails);
    }
}
