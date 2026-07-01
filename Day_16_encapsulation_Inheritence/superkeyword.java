public class superkeyword {
    public static void main(String[] args) {
     engineeringStudent a = new engineeringStudent();
     a.name="shubham";
     a.age=28;
     a.rollNo=30;
     a.college="lpu";
     a.print();

    }

}
class student{
    String name;
    int age;
    int rollNo;
    
    void print(){
        System.out.print(name + " , " + age + " , " + rollNo+ " , ");
    }
}
class engineeringStudent extends student{
    String college;


    void print(){
        super.print();
        System.out.println(college);
    }
}