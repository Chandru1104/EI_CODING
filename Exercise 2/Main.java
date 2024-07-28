import commands.*;
import java.util.Scanner;
import java.util.logging.Logger;
import models.ClassroomManager;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static boolean running = true;

    public static void main(String[] args) {
        ClassroomManager manager = ClassroomManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Virtual Classroom Manager.");
        displayCommands();
        while (running) {
            System.out.println("Enter a command (type 'exit' to terminate):");
            String input = scanner.nextLine();
            processCommand(input, manager);
        }

        scanner.close();
        System.out.println("Program terminated.");
    }

    private static void displayCommands() {
        System.out.println("1. add_classroom [class_name]");
        System.out.println("2. remove_classroom [class_name]");
        System.out.println("3. list_classrooms");
        System.out.println("4. add_student [student_id] [class_name]");
        System.out.println("5. list_students [class_name]");
        System.out.println("6. schedule_assignment [class_name] [assignment_details]");
        System.out.println("7. submit_assignment [student_id] [class_name] [assignment_details]");
        System.out.println("8. exit");
    }

    private static void processCommand(String input, ClassroomManager manager) {
        String[] parts = input.split(" ");
        String commandType = parts[0];

        Command command = null;
        switch (commandType) {
            case "add_classroom":
                if (parts.length == 2) {
                    command = new AddClassroomCommand(manager, parts[1]);
                } else {
                    System.out.println("Invalid command. Usage: add_classroom [class_name]");
                }
                break;
            case "remove_classroom":
                if (parts.length == 2) {
                    command = new RemoveClassroomCommand(manager, parts[1]);
                } else {
                    System.out.println("Invalid command. Usage: remove_classroom [class_name]");
                }
                break;
            case "list_classrooms":
                command = new ListClassroomsCommand(manager);
                break;
            case "add_student":
                if (parts.length == 3) {
                    command = new AddStudentCommand(manager, parts[1], parts[2]);
                } else {
                    System.out.println("Invalid command. Usage: add_student [student_id] [class_name]");
                }
                break;
            case "list_students":
                if (parts.length == 2) {
                    command = new ListStudentsCommand(manager, parts[1]);
                } else {
                    System.out.println("Invalid command. Usage: list_students [class_name]");
                }
                break;
            case "schedule_assignment":
                if (parts.length == 3) {
                    command = new ScheduleAssignmentCommand(manager, parts[1], parts[2]);
                } else {
                    System.out.println("Invalid command. Usage: schedule_assignment [class_name] [assignment_details]");
                }
                break;
            case "submit_assignment":
                if (parts.length == 4) {
                    command = new SubmitAssignmentCommand(manager, parts[1], parts[2], parts[3]);
                } else {
                    System.out.println("Invalid command. Usage: submit_assignment [student_id] [class_name] [assignment_details]");
                }
                break;
            case "exit":
                stop();
                break;
            default:
                System.out.println("Unknown command.");
                return;
        }

        if (command != null) {
            command.execute();
        }
    }

    private static void stop() {
        running = false;
    }
}
