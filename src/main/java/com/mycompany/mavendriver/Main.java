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
        
        Module m1 = new Module("Software Engineering |||", "CT417");
        Module m2 = new Module("Artificial Intelligence", "CT421");
        Module m3 = new Module("Cryptography", "CS402");
        
        m1.addStudent(s1);
        m2.addStudent(s1);
        m3.addStudent(s1);

        m1.addStudent(s2);
        m2.addStudent(s2);
        m3.addStudent(s2);
        
        m1.addStudent(s3);
        m2.addStudent(s3);
        m3.addStudent(s3);
        
        System.out.println(m1.getStudents());
        
        
        CourseProgramme cp1;
        cp1 = new CourseProgramme("Computer Science and Information Technology", new DateTime(1-8-17), new DateTime(1-8-18));
        cp1.addModule(m1);
        cp1.addModule(m2);
        cp1.addModule(m3);
        System.out.println(cp1.getModules());
        
    }
}
