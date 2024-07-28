package commands;

import models.ClassroomManager;

public class RemoveClassroomCommand implements Command {
    private ClassroomManager manager;
    private String className;

    public RemoveClassroomCommand(ClassroomManager manager, String className) {
        this.manager = manager;
        this.className = className;
    }

    @Override
    public void execute() {
        manager.removeClassroom(className);
    }
}
