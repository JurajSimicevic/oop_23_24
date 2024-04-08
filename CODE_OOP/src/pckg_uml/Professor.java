package pckg_uml;

import java.util.ArrayList;

public class Professor extends Person {

    private ArrayList <Student> students;

    public Professor(String name, String surname) {

        super(name, surname);
        students = new ArrayList<>();
        System.out.println(this.getClass().getSimpleName() + "constructor called!");
    }

//    public void setStudent(Student student){
//        this.student = student;
//    }

    public void performConsulation(){
        System.out.println(this.getClass().getSimpleName() + " gives consultative lectures to the students...");
        for(Student student : students){
            student.askQuestion();
        }
    }
}
