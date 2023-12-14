public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik","MAT101","MAT");
        Course fizik = new Course("Fizik","FZK101","FZK");
        Course kimya = new Course("Kimya","KMY101","KMY");
        Course oralMatNote = new Course(" Mat Sözlü Not","MatSöz101","MatSöz");
        Course oralFizikNote = new Course("Fizik Sözlü Not","FizikSöz101","FzkSöz");
        Course oralKimyaNote = new Course("Kimya Sözlü Not","KimyaSöz101","KmySöz");

        Teacher t1 = new Teacher("Hasan","90553 535 3533","Matematik");
        Teacher t2 = new Teacher("Fırat","90553 535 3522","Fizik");
        Teacher t3 = new Teacher("Ali" ,"90553 535 35 11","Kimya" );

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("salih","01","8/A",mat,fizik,kimya,oralMatNote,oralFizikNote,oralKimyaNote);
        s1.addBolkExamNote(90,50,58,100,100,100);
        s1.isPass();
        Student s2 = new Student("dilek", "02","7/A",mat,fizik,kimya,oralMatNote,oralFizikNote,oralKimyaNote);
        s2.addBolkExamNote(76,85,80,90,90,95);
        s2.isPass();
        Student s3 = new Student("gizem","03","6/A",mat,fizik,kimya,oralMatNote,oralFizikNote,oralKimyaNote);
        s3.addBolkExamNote(15,50,60,85,75,70);
        s3.isPass();
    }
}