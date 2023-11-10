package classlist;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author GaLa
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList();
        
        addStudents(studentNames);
        displayStudents(studentNames);
        Collections.sort(studentNames);
        displayStudents(studentNames);
    }
    
    static void addStudents(ArrayList<String> studentNames){
        studentNames.add("Gala");
        studentNames.add("Azhar");
        studentNames.add("Edo");
        studentNames.add("Hilmy");
        studentNames.add("Erick");
        studentNames.add("Yoggy");
        studentNames.add("Yusuf");
        studentNames.add("Dimas");
        studentNames.add("Arinal");
        studentNames.add("Joko");
        studentNames.add("Eka");
        studentNames.add("Devi");
    }
    static void displayStudents(ArrayList<String> studentNames){
        System.out.println("Student Names:");
        for(String student: studentNames){
            System.out.println(student);
        }
        System.out.println("");
    }
}
