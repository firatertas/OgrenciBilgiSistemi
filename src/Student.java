public class Student {
    String name;
    String stuNo;
    String classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course oralMatNote;
    Course oralFizikNote;
    Course oralKimyaNote;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course mat,Course fizik,Course kimya, Course oralMatNote,Course oralFizikNote,Course oralKimyaNote){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.oralMatNote = oralMatNote;
        this.oralKimyaNote=oralKimyaNote;
        this.oralFizikNote=oralFizikNote;
        colcAvarage();
        this.isPass=false;
    }

    public void  addBolkExamNote(int fizik, int kimya, int mat, int oralMatNote,int oralKimyaNote, int oralFizikNote){
       if (fizik>=0 && fizik<=100){
           this.fizik.note=fizik;
       }
       if (kimya>=0 && kimya<=100){
           this.kimya.note=kimya;
       }
       if (mat>=0 && mat<=100){
           this.mat.note=mat;
       }
       if (oralMatNote>=0 && oralMatNote<=100){
           this.oralMatNote.oralMatNote = oralMatNote;
       }
       if (oralFizikNote>=0 && oralFizikNote<=100){
           this.oralFizikNote.oralFizikNote = oralFizikNote;
       }
       if (oralKimyaNote>=0 && oralKimyaNote<=100){
           this.oralKimyaNote.oralKimyaNote = oralKimyaNote;
       }
    }

    public  void isPass(){
        if (this.mat.note==0 || this.fizik.note == 0 || this.kimya.note == 0 || this.oralMatNote.oralMatNote==0 || this.oralKimyaNote.oralKimyaNote==0 || this.oralFizikNote.oralFizikNote==0){
            System.out.println("Notlar tam girilmemiştir.");
        }else  {
            this.isPass = colcAvaragePass();
            printNote();
            System.out.println("Ortalama :\t"+ this.avarage);
            if (this.isPass){
                System.out.println("Sınıfı geçti");
            }else {
                System.out.println("Sınıfta kaldı");
            }
        }
    }
    public void colcAvarage(){
        this.avarage = (
                (
                        ((this.mat.note*0.6))+(this.oralMatNote.oralMatNote*0.2))+
                        ((this.fizik.note*0.6)+(this.oralFizikNote.oralFizikNote*0.2))+
                        ((this.kimya.note*0.6)+(this.oralKimyaNote.oralKimyaNote*0.2))
        )/3;
    }

    public boolean colcAvaragePass(){
        colcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.oralMatNote.oralMatNote);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.oralFizikNote.oralFizikNote);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.oralKimyaNote.oralKimyaNote);

    }
}
