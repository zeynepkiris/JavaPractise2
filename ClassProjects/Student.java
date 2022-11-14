package ClassProjects;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String sName;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;
    double avarage1, avarage2, avarage3;

    Student (String sName, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.sName = sName;
        this.classes = classes;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage= 0.0;
        this.isPass = false;
    }
    void addBulkExamNote (int note1, int note2, int note3, int pNote1, int pNote2, int pNote3){
        if (note1>=0  && note1<=100 && pNote1>=0  && pNote1<=100){
            this.c1.note= note1;
            this.c1.pNote = pNote1;
            this.avarage1 = ((this.c1.note*0.8) + (this.c1.pNote*0.2));

        }
        if (note2>=0  && note2<=100 && pNote2>=0  && pNote2<=100){
            this.c2.note= note2;
            this.c2.pNote = pNote2;
            this.avarage2 = ((this.c2.note*0.8) + (this.c2.pNote*0.2));
        }
        if (note3>=0  && note3<=100 && pNote3>=0  && pNote3<=100){
            this.c3.note= note3;
            this.c3.pNote = pNote3;
            this.avarage3 = ((this.c3.note*0.8) + (this.c3.pNote*0.2));
        }
    }
    void isPass () {
        System.out.println("===================");
        this.avarage = (this.avarage1 + this.avarage2 + this.avarage3) / 3.0;
        if (this.avarage > 55){
            System.out.println("Tebrikler, Sınıfı Geçtiniz...");
            this.isPass = true;
        }else {
            System.out.println("Sınıf Tekrarı Yapmanız Gerek:(");
            this.isPass = false;
        }
        printNote();
    }
    void printNote (){
        System.out.println(c1.cName+" notu: "+c1.note);
        System.out.println(c2.cName+" notu: "+c2.note);
        System.out.println(c3.cName+" notu: "+c3.note);
        System.out.println(c1.cName+" Performans notu: "+c1.pNote);
        System.out.println(c2.cName+" Performans notu: "+c2.pNote);
        System.out.println(c3.cName+" Performans notu: "+c3.pNote);
        System.out.println("Ortalamanız:" + this.avarage);
    }




}
