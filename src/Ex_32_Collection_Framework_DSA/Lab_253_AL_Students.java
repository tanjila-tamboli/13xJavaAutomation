package Ex_32_Collection_Framework_DSA;

import Task_4_july.*;

import java.util.ArrayList;
import java.util.List;

public class Lab_253_AL_Students {
    public static void main(String[] args) {
        Student s1 =new Student("Tanjila" ,"1");
        Student s2 = new Student("Ritwik","2");
        Student s3 = new Student("Shubham","3");

        List<String> myStudent= new ArrayList<>();
        myStudent.add("s1");
        myStudent.add("s2");
        myStudent.add("s3");
        myStudent.add("s4");
        System.out.println(myStudent);

        s1.printDetails();
        s2.printDetails();

    }
}
class Student {
    private String name;
    private String rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void printDetails() {
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Roll No: " + this.rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}