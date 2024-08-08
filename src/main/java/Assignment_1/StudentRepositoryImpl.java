package Assignment_1;


import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    private List<Student> students;

    public void StudentRepositoryImpl() {
        students = new ArrayList<>();
        students.add(new Student(1, "Bao", 25, "110"));
        students.add(new Student(2, "Quy", 30, "111"));
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void updateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == student.getId()) {
                students.set(i, student);
                break;
            }
        }
    }

    @Override
    public void deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                break;
            }
        }
    }
}
