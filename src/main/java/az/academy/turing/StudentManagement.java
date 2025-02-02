package az.academy.turing;

import java.security.PublicKey;
import java.util.*;

public class StudentManagement {
    private List<Student> studentList = new ArrayList<>();
    private LinkedList<Student> outStandingFees = new LinkedList<>();



    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public String toString() {
        return "StudentManagement{" +
                "studentList=" + studentList +
                ", outStandingFees=" + outStandingFees +
                '}';
    }

    public void addFees(Student student ){
        if (  student.getGrade()<=50){
            outStandingFees.add(student);
        }

    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public LinkedList<Student> getOutStandingFees() {
        return outStandingFees;
    }

    public void setOutStandingFees(LinkedList<Student> outStandingFees) {
        this.outStandingFees = outStandingFees;
    }
}
