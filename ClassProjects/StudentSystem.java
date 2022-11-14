package ClassProjects;

public class StudentSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher ("İlber Ortaylı", "TRH", "555" );
        Teacher t2 = new Teacher("Graham Bell", "FZK", "556");
        Teacher t3 = new Teacher("Celal Şengör", "BIO","557");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102","FZK");
        fizik.addTeacher(t2);
        Course bio = new Course("Biyoloji", "103", "BIO");
        bio.addTeacher(t3);

        Student s1 = new Student("Cem Yılmaz", "123", "4", tarih, fizik,bio);
        s1.addBulkExamNote(100,80,60, 80, 100,90);
        s1.isPass();



    }



}