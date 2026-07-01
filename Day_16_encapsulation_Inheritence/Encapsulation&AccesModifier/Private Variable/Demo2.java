
public class Demo2 {
    public static void main(String[] args) {
        Student a = new Student("Shubham");
        System.out.println(a.getname());
        a.setName("jayesh");
        System.out.println(a.getname());

    }
}

class Student {
    private String name;
    private int age;
    private int roll;
    private String college;

    Student() {
        this("unknown");
    }

    Student(String name) {
        this(name, 0);
    }

    Student(String name, int age) {
        this(name, age, 0);
    }

    Student(String name, int age, int roll) {
        this(name, age, roll, "unknown");
    }

    Student(String name, int age, int roll, String college) {
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.college = college;
    }

    // getters and setters
    public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
