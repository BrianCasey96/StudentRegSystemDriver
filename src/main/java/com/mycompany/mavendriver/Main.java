package com.mycompany.mavendriver;

import com.mycompany.CourseProgramme;
import com.mycompany.Module;
import com.mycompany.Student;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 *
 * @author I330151
 */
public class Main {
    
    public static void main(String[] args) {
       
        System.out.println("Hello World!"); // Display the string.
        Student s1 = new Student("Aria", 21, "25/04/1996");
        System.out.println(s1.getUsername());
        
        Student s2 = new Student("Anna", 21, "20/04/1996");
        Student s3 = new Student("Annabelle", 2, "20/07/2015");
        
        Module CT417 = new Module("Software Engineering |||", "CT417");
        Module CT421 = new Module("Artificial Intelligence", "CT421");
        Module CS402 = new Module("Cryptography", "CS402");
        
        CT417.addStudent(s1);
        CT417.addStudent(s2);
        CT417.addStudent(s3);

        CT421.addStudent(s1);
        CT421.addStudent(s2);
        CT421.addStudent(s3);
        
        CS402.addStudent(s1);
        CS402.addStudent(s2);
        CS402.addStudent(s3);
        
        System.out.println(CT417.getStudents());
        
        CourseProgramme CSIT = new CourseProgramme("Computer Science and Information Technology", new DateTime(1-8-17), new DateTime(1-8-18));
        CSIT.addModule(CT417);
        CSIT.addModule(CT421);
        CSIT.addModule(CS402);
        System.out.println(CSIT.getModules());
        
    }
}
