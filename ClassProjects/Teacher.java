package ClassProjects;

public class Teacher {
    String tName;
    String mpno;
    String branch;

    Teacher(String tName, String branch, String mpno){
        this.tName = tName;
        this.branch = branch;
        this.mpno = mpno;
    }
    void print() {
        System.out.println("Adı \t:"+ this.tName);
        System.out.println("Bölümü \t:"+ this.branch);
        System.out.println("Numarası \t:"+ this.mpno);
    }

}
