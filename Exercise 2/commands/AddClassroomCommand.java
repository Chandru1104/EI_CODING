package commands;

import models.ClassroomManager;

public class AddClassroomCommand implements Command {
    private ClassroomManager manager;
    private String className;

    public AddClassroomCommand(ClassroomManager manager, String className) {
        this.manager = manager;
        this.className = className;
    }

    @Override
    public void execute() {
        manager.addClassroom(className);
    }
}
