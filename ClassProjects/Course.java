package ClassProjects;

public class Course {
    Teacher teacher;
    String cName;
    String code;
    String prefix;
    int note;
    int pNote;

    Course (String cName, String code, String prefix){
        this.cName = cName;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int pNote = 0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ile Ders bölümleri uyuşmuyor!");
        }

    }
    void printTeacher() {
        this.teacher.print();

    }

}
