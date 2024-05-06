package pckg_abs_class;

public class Student extends Person{

    private String university;
    private String studyProgram;

    protected Student(String name, String sname, String uni, String studyProgram){
        super(name, sname);
        this.studyProgram = studyProgram;
        this.university = uni;
        System.out.println("Constructor called: " + this.getClass().getSimpleName());
    }

    @Override
    public void getInfo() {
//        super.getInfo();
//        System.out.println(this);
        System.out.println(super.toString());
        System.out.println(this);
    }

    @Override
    protected void getSignature() {
        System.out.println(getClass().getSimpleName() + "name: " + this.name + " surname: " + this.surname + " signed!");
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "university='" + university + '\'' +
//                ", studyProgram='" + studyProgram + '\'' +
//                ", id=" + id +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                ", studyProgram='" + studyProgram + '\'' +
                '}';
    }

    public boolean passedExam(String course, int points){
        boolean pass = false;
        if(points > 50){
            pass = true;
            System.out.println("Passed exam in course: " + course + " points: " + points);
        }
        return pass;
    }
}
