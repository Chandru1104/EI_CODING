package models;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassroomManager {
    private static ClassroomManager instance;
    private Map<String, Classroom> classrooms;
    private static final Logger logger = Logger.getLogger(ClassroomManager.class.getName());

    private ClassroomManager() {
        classrooms = new HashMap<>();
    }

    public static ClassroomManager getInstance() {
        if (instance == null) {
            instance = new ClassroomManager();
        }
        return instance;
    }

    public void addClassroom(String className) {
        if (!classrooms.containsKey(className)) {
            classrooms.put(className, new Classroom(className));
            logger.log(Level.INFO, "Classroom {0} has been created.", className);
        } else {
            logger.log(Level.WARNING, "Classroom {0} already exists.", className);
        }
    }

    public void removeClassroom(String className) {
        if (classrooms.containsKey(className)) {
            classrooms.remove(className);
            logger.log(Level.INFO, "Classroom {0} has been removed.", className);
        } else {
            logger.log(Level.WARNING, "Classroom {0} does not exist.", className);
        }
    }

    public void listClassrooms() {
        if (classrooms.isEmpty()) {
            logger.log(Level.INFO, "No classrooms available.");
        } else {
            classrooms.keySet().forEach(className -> logger.log(Level.INFO, "Classroom: {0}", className));
        }
    }

    public void addStudent(String studentId, String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.addStudent(studentId);
            logger.log(Level.INFO, "Student {0} has been enrolled in {1}.", new Object[]{studentId, className});
        } else {
            logger.log(Level.WARNING, "Classroom {0} does not exist.", className);
        }
    }

    public void listStudents(String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            logger.log(Level.INFO, "Students in {0}:", className);
            classroom.getStudents().forEach(student -> logger.log(Level.INFO, "Student ID: {0}", ((Student) student).getId()));
        } else {
            logger.log(Level.WARNING, "Classroom {0} does not exist.", className);
        }
    }

    public void scheduleAssignment(String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.scheduleAssignment(assignmentDetails);
            logger.log(Level.INFO, "Assignment for {0} has been scheduled.", className);
        } else {
            logger.log(Level.WARNING, "Classroom {0} does not exist.", className);
        }
    }

    public void submitAssignment(String studentId, String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.submitAssignment(studentId, assignmentDetails);
            logger.log(Level.INFO, "Assignment submitted by Student {0} in {1}.", new Object[]{studentId, className});
        } else {
            logger.log(Level.WARNING, "Classroom {0} does not exist.", className);
        }
    }

    public Map<String, Classroom> getClassrooms() {
        return classrooms;
    }
}
