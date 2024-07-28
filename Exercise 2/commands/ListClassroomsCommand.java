package commands;

import models.ClassroomManager;

public class ListClassroomsCommand implements Command {
    private ClassroomManager manager;

    public ListClassroomsCommand(ClassroomManager manager) {
        this.manager = manager;
    }

    //@Override
    public void execute() {
        manager.listClassrooms();
    }
}
