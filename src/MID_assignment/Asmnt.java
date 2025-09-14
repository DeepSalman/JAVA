package MID_assignment;

class User {
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void performRole() {
        System.out.println("No specific role defined for " + name + ".");
    }
}

class Student extends User {
    private String[] enrolledCourses;
    private int courseCount;
    private String[] gradedCourses;
    private String[] grades;
    private int gradeCount;
    private static final int MAX_COURSES = 10;
    private static final int MAX_GRADES = 10;

    public Student(String name, String email) {
        super(name, email);
        this.enrolledCourses = new String[MAX_COURSES];
        this.gradedCourses = new String[MAX_GRADES];
        this.grades = new String[MAX_GRADES];
        this.courseCount = 0;
        this.gradeCount = 0;
    }

    public void enrollCourse(String courseName) {
        if (courseCount < MAX_COURSES) {
            enrolledCourses[courseCount] = courseName;
            courseCount++;
        } else {
            System.out.println("Cannot enroll in more courses. Maximum limit reached.");
        }
    }

    public void viewGrades() {
        if (gradeCount == 0) {
            System.out.println("No grades available.");
        } else {
            for (int i = 0; i < gradeCount; i++) {
                System.out.println(gradedCourses[i] + ": " + grades[i]);
            }
        }
    }

    public void setGrade(String course, String grade) {
        if (gradeCount < MAX_GRADES) {
            gradedCourses[gradeCount] = course;
            grades[gradeCount] = grade;
            gradeCount++;
        } else {
            System.out.println("Cannot assign more grades. Maximum limit reached.");
        }
    }

    public String getGrade(String course) {
        for (int i = 0; i < gradeCount; i++) {
            if (gradedCourses[i].equals(course)) {
                return grades[i];
            }
        }
        return "No grade assigned";
    }

    @Override
    public void performRole() {
        System.out.println("Enrolled courses for " + name + ":");
        if (courseCount == 0) {
            System.out.println("No courses enrolled.");
        } else {
            for (int i = 0; i < courseCount; i++) {
                System.out.println("- " + enrolledCourses[i]);
            }
        }
    }
}

class Teacher extends User {
    private String[] taughtCourses;
    private int courseCount;
    private static final int MAX_COURSES = 10;

    public Teacher(String name, String email) {
        super(name, email);
        this.taughtCourses = new String[MAX_COURSES];
        this.courseCount = 0;
    }

    public void createCourse(String courseName) {
        if (courseCount < MAX_COURSES) {
            taughtCourses[courseCount] = courseName;
            courseCount++;
        } else {
            System.out.println("Cannot create more courses. Maximum limit reached.");
        }
    }

    @Override
    public void performRole() {
        System.out.println("Courses taught by " + name + ":");
        if (courseCount == 0) {
            System.out.println("No courses created.");
        } else {
            for (int i = 0; i < courseCount; i++) {
                System.out.println("- " + taughtCourses[i]);
            }
        }
    }
}

class Administrator extends User {
    private String[] activities;
    private int activityCount;
    private static final int MAX_ACTIVITIES = 20;

    public Administrator(String name, String email) {
        super(name, email);
        this.activities = new String[MAX_ACTIVITIES];
        this.activityCount = 0;
    }

    public void addUser(String userName) {
        if (activityCount < MAX_ACTIVITIES) {
            activities[activityCount] = "Added user: " + userName;
            activityCount++;
        } else {
            System.out.println("Cannot log more activities. Maximum limit reached.");
        }
    }

    public void deleteUser(String userName) {
        if (activityCount < MAX_ACTIVITIES) {
            activities[activityCount] = "Deleted user: " + userName;
            activityCount++;
        } else {
            System.out.println("Cannot log more activities. Maximum limit reached.");
        }
    }

    @Override
    public void performRole() {
        System.out.println("User management activities by " + name + ":");
        if (activityCount == 0) {
            System.out.println("No activities recorded.");
        } else {
            for (int i = 0; i < activityCount; i++) {
                System.out.println("- " + activities[i]);
            }
        }
    }
}

public class Asmnt {
    public static void main(String[] args) {
        // Create instances
        Student student = new Student("Alice", "alice@example.com");
        student.enrollCourse("Math 101");
        student.enrollCourse("Science 101");
        student.setGrade("Math 101", "A");
        student.setGrade("Science 101", "B");

        Teacher teacher = new Teacher("Bob", "bob@example.com");
        teacher.createCourse("Math 101");
        teacher.createCourse("Science 101");

        Administrator admin = new Administrator("Charlie", "charlie@example.com");
        admin.addUser("Alice");
        admin.addUser("Bob");
        admin.deleteUser("Dave");

        // Demonstrate polymorphism
        User[] users = new User[3];
        users[0] = student;
        users[1] = teacher;
        users[2] = admin;

        System.out.println("Demonstrating polymorphism with performRole():");
        for (User user : users) {
            user.performRole();
            System.out.println();
        }

        // Test specific functionalities
        System.out.println("Testing Student-specific methods:");
        System.out.println("Enrolling in another course:");
        student.enrollCourse("History 101");
        student.performRole();
        System.out.println();

        System.out.println("Viewing grades:");
        student.viewGrades();
        System.out.println();

        System.out.println("Getting specific grade for Math 101: " + student.getGrade("Math 101"));
        System.out.println();

        System.out.println("Testing Teacher-specific methods:");
        System.out.println("Creating another course:");
        teacher.createCourse("History 101");
        teacher.performRole();
        System.out.println();

        System.out.println("Testing Administrator-specific methods:");
        System.out.println("Adding another user:");
        admin.addUser("Eve");
        admin.performRole();
        System.out.println();
    }
}