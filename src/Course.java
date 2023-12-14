public class Course {
    Teacher teacher;
    String neme;
    String code;
    String prefix;
    int note;
    int oralMatNote;
    int oralFizikNote;
    int oralKimyaNote;

    Course(String name, String code, String prefix){
        this.neme=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.oralMatNote = 0;
        this.oralFizikNote=0;
        this.oralKimyaNote=0;
    }

    public void  addTeacher(Teacher teach){
        this.teacher = teach;
        if (this.prefix.equals(teach.branch)){
            this.teacher=teach;
            System.out.println("Öğretmenin adı :\t"+ this.teacher);
        }

    }

    public void printTeacher(){
       if (teacher != null){
           System.out.println(this.neme+" kursunun öğretmeni "+teacher.name+" olarak atanmıştır.");
       }else {
           System.out.println(this.neme+ "kursuna öğretmen atanmamıştır.");
       }
    }
}
