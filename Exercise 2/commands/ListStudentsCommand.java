package commands;

import models.ClassroomManager;

public class ListStudentsCommand implements Command {
    private ClassroomManager manager;
    private String className;

    public ListStudentsCommand(ClassroomManager manager, String className) {
        this.manager = manager;
        this.className = className;
    }

    @Override
    public void execute() {
        manager.listStudents(className);
    }
}
