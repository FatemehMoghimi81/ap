public class Student extends Human {
    int ID ;



    static{
        
    }
    public Student(String name, int iD) {
        super(name);
        ID = iD;
        
    }
    public static void print (Student student){
        System.out.println(student.ID);
    }
}
