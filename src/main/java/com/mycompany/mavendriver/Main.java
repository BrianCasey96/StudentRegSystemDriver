package com.mycompany.mavendriver;

import com.mycompany.CourseProgramme;
import com.mycompany.Module;
import com.mycompany.Student;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

public class Main {
    
    public static void main(String[] args) {
       
        Student s1 = new Student("Aria", 21, "25/04/1996");
        System.out.print("Student 1's username is : ");
        System.out.println(s1.getUsername());
        
        Student s2 = new Student("Anna", 21, "20/04/1996");
        Student s3 = new Student("Andy", 19, "20/07/2015");
        Student s4 = new Student("Abe", 22, "20/07/2015");
        Student s5 = new Student("Archy", 23, "20/07/2015");
        
        Module CT417 = new Module("Software Engineering |||", "CT417");
        Module CT421 = new Module("Artificial Intelligence", "CT421");
        Module CS402 = new Module("Cryptography", "CS402");
        
        CT417.addStudent(s1);
        CT417.addStudent(s2);
        CT417.addStudent(s3);
        CT417.addStudent(s4);
        System.out.print("Students taking CT417 are: ");
        System.out.println(CT417.getStudents());

        CT421.addStudent(s1);
        CT421.addStudent(s2);
        CT421.addStudent(s3);
        CT421.addStudent(s5);
        System.out.print("Students taking CT421 are: ");
        System.out.println(CT421.getStudents());
        
        CS402.addStudent(s1);
        CS402.addStudent(s2);
        CS402.addStudent(s3);
        CS402.addStudent(s5);
        System.out.print("Students taking CS402 are: ");
        System.out.println(CS402.getStudents());
        
        CourseProgramme CSIT = new CourseProgramme("Computer Science and Information Technology", new DateTime(1-8-17), new DateTime(1-8-18));
        CSIT.addModule(CT417);
        CSIT.addModule(CT421);
        CSIT.addModule(CS402);
        System.out.print("CSIT modules are are: ");
        System.out.println(CSIT.getModules());
        
    }
}
