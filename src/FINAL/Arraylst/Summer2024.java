package FINAL.Arraylst;

import java.util.ArrayList;
import java.util.Collections;

class Student {
    int id;
    String name;
    double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - GPA: " + gpa;
    }
}

class StudentList {
    public static void main(String[] args) {
        // 1. Create an ArrayList
        ArrayList<Student> students = new ArrayList<>();

        // 2. Insert entries
        students.add(new Student(101, "Hasibul Islam", 3.75));
        students.add(new Student(102, "Mitu Rahman", 3.90));
        students.add(new Student(103, "Fahim Khan", 3.40));
        students.add(new Student(104, "Nusrat Jahan", 3.85));
        students.add(new Student(105, "Aminul Haque", 3.55));
        students.add(new Student(106, "Sumaiya Chowdhury", 3.78));

        System.out.println("Before Swap:");
        for (Student s : students) {
            System.out.println(s);
        }

        // 3. Swap the first two student objects (no new object creation)
        Collections.swap(students, 0, 1);

        System.out.println("\nAfter Swap:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

