package az.academy.turing;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Ali", 20, 85.7);
        Student student2 = new Student(2, "Dilber", 18, 87.5);
        Student student3 = new Student(3, "Gunel", 18, 45.5);
        Student student4 = new Student(4, "Aynur", 18, 40.5);


        System.out.println(student2.toString());

        StudentManagement studentManagement1 = new StudentManagement();
        studentManagement1.addStudent(student1);
        studentManagement1.addStudent(student3);
        studentManagement1.addStudent(student2);
        Collections.sort(studentManagement1.getStudentList());
        System.out.println(studentManagement1.toString());

        studentManagement1.addFees(student2);
        studentManagement1.addFees(student4);
        studentManagement1.addFees(student1);
        studentManagement1.addFees(student3);
        System.out.println(studentManagement1.getOutStandingFees());

        Course course1=new Course(1,"Back End");



    }
}