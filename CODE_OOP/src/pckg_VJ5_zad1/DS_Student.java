package pckg_VJ5_zad1;

public class DS_Student extends Student{

    public DS_Student(String name){
        this.name = name;
        this.idStudent = cntStudents;
        cntStudents++;
    }

    @Override
    protected void completedStudy(int num) {
        super.infoStudent();
        if(num < 2){
            System.out.println("Student nije upisao zadnju godinu.");
        } else {
            System.out.println("Student je uspješno upisao zadnju godinu.");
        }
    }
}
