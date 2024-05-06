package pckg_VJ5_zad1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public abstract class Student {

    private static DateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
    protected String enrolmentDate;
    protected String name;
    protected int idStudent;
    protected static int cntStudents = 1;
    private Scanner sc;

    protected void setEnrollmentDate() throws ParseException {
        System.out.println("Please enter enrollment data in the format dd-MM-yyyy");
        String date = sc.nextLine();
        this.enrolmentDate = String.valueOf(DATE_FORMAT.parse(date));
    }

    public void setScanner(Scanner sc) {
        this.sc = sc;
    }

    protected void infoStudent() {
        System.out.println("Student: " + this.name + " - id: " + this.idStudent);
        System.out.println("Student enrolment date - " + enrolmentDate.toString());
    }

    protected abstract void completedStudy(int num);

}
