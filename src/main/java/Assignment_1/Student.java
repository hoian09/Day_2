package Assignment_1;

public class Student {
    private int id;
    private String name;
    private int age;
    private String mssv;
    public Student() {

    }

    public Student(int id, String name, int age, String mssv) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mssv = mssv;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mssv='" + mssv + '\'' +
                '}';
    }
}
