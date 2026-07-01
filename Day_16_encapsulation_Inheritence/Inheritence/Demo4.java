
public class Demo4 {
    public static void main(String[] args) {
        EngineeringSudent e1 = new EngineeringSudent();
        e1.name="Shubham";
        e1.age=28;
        e1.attendLab();
        e1.markAttendence();   
        System.out.println(e1.name);

        Student s1 = new Student();
        
    }
}

class Student {
    String name;
    int age;

    void markAttendence() {
        System.out.println("Attendence marked");
    }
}

class EngineeringSudent extends Student {
    void attendLab() {
        System.out.println("Lab attendend");
    }
}