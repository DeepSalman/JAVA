package GUI_project;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class User {
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void performRole() {
        System.out.println("No role for " + name + ".");
    }
}

class Student extends User {
    private ArrayList<String> courses;
    private ArrayList<String> grades;

    public Student(String name, String email) {
        super(name, email);
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void enrollCourse(String course, String grade) {
        courses.add(course);
        grades.add(grade);
    }

    public String getGrade(String course) {
        int index = courses.indexOf(course);
        if (index != -1) {
            return grades.get(index);
        }
        return "No grade";
    }

    @Override
    public void performRole() {
        StringBuilder sb = new StringBuilder(name + "'s courses:\n");
        if (courses.isEmpty()) {
            sb.append("No courses enrolled.\n");
        } else {
            for (int i = 0; i < courses.size(); i++) {
                sb.append("- ").append(courses.get(i)).append(": ").append(grades.get(i)).append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}

class Teacher extends User {
    private ArrayList<String> courses;
    private ArrayList<ArrayList<String>> students;

    public Teacher(String name, String email) {
        super(name, email);
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void createCourse(String course, String[] studentNames) {
        courses.add(course);
        ArrayList<String> studentList = new ArrayList<>();
        for (String student : studentNames) {
            studentList.add(student);
        }
        students.add(studentList);
    }

    @Override
    public void performRole() {
        StringBuilder sb = new StringBuilder(name + "'s courses and students:\n");
        if (courses.isEmpty()) {
            sb.append("No courses created.\n");
        } else {
            for (int i = 0; i < courses.size(); i++) {
                sb.append("- ").append(courses.get(i)).append(":\n");
                for (String student : students.get(i)) {
                    sb.append("  * ").append(student).append("\n");
                }
            }
        }
        System.out.print(sb.toString());
    }
}

public class Gui_DEMO {
    private static Student student = new Student("Alice", "alice@example.com");
    private static Teacher teacher = new Teacher("Bob", "bob@example.com");
    private static JTextArea outputArea;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Education Platform");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        // Output area
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        frame.add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));

        // Student inputs
        inputPanel.add(new JLabel("Student Course:"));
        JTextField studentCourseField = new JTextField(10);
        inputPanel.add(studentCourseField);

        inputPanel.add(new JLabel("Grade:"));
        JTextField gradeField = new JTextField(10);
        inputPanel.add(gradeField);

        JButton enrollButton = new JButton("Enroll Course");
        inputPanel.add(enrollButton);

        // Teacher inputs
        inputPanel.add(new JLabel("Teacher Course:"));
        JTextField teacherCourseField = new JTextField(10);
        inputPanel.add(teacherCourseField);

        inputPanel.add(new JLabel("Students (comma-separated):"));
        JTextField studentsField = new JTextField(10);
        inputPanel.add(studentsField);

        JButton createCourseButton = new JButton("Create Course");
        inputPanel.add(createCourseButton);

        frame.add(inputPanel, BorderLayout.NORTH);

        // Role display buttons
        JPanel buttonPanel = new JPanel();
        JButton studentRoleButton = new JButton("Show Student Role");
        JButton teacherRoleButton = new JButton("Show Teacher Role");
        buttonPanel.add(studentRoleButton);
        buttonPanel.add(teacherRoleButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Redirect System.out to JTextArea
        JTextAreaOutputStream outStream = new JTextAreaOutputStream(outputArea);
        System.setOut(new java.io.PrintStream(outStream));

        // Event handlers
        enrollButton.addActionListener(e -> {
            String course = studentCourseField.getText().trim();
            String grade = gradeField.getText().trim();
            if (!course.isEmpty() && !grade.isEmpty()) {
                student.enrollCourse(course, grade);
                outputArea.append("Enrolled " + course + " with grade " + grade + "\n");
                studentCourseField.setText("");
                gradeField.setText("");
            } else {
                outputArea.append("Please enter course and grade.\n");
            }
        });

        createCourseButton.addActionListener(e -> {
            String course = teacherCourseField.getText().trim();
            String studentsInput = studentsField.getText().trim();
            if (!course.isEmpty() && !studentsInput.isEmpty()) {
                String[] studentNames = studentsInput.split(",");
                for (int i = 0; i < studentNames.length; i++) {
                    studentNames[i] = studentNames[i].trim();
                }
                teacher.createCourse(course, studentNames);
                outputArea.append("Created course " + course + " with students: " + studentsInput + "\n");
                teacherCourseField.setText("");
                studentsField.setText("");
            } else {
                outputArea.append("Please enter course and students.\n");
            }
        });

        studentRoleButton.addActionListener(e -> {
            outputArea.append("\n");
            student.performRole();
        });

        teacherRoleButton.addActionListener(e -> {
            outputArea.append("\n");
            teacher.performRole();
        });

        frame.setVisible(true);
    }
}

// Helper class to redirect System.out to JTextArea
class JTextAreaOutputStream extends java.io.OutputStream {
    private JTextArea textArea;

    public JTextAreaOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) {
        textArea.append(String.valueOf((char) b));
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}
