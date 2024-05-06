package pckg_VJ5_zad1;

public class PDS_Student extends Student{

    public PDS_Student(String name){
        this.name = name;
        this.idStudent = cntStudents;
        cntStudents++;

    }

    @Override
    protected void completedStudy(int num) {
        super.infoStudent();
        if (num < 3){
            System.out.println("nije upisana posljednja godina studija.");
        } else {
            System.out.println("Student je uspješno upisao zadnju godinu.");
        }
    }
}
