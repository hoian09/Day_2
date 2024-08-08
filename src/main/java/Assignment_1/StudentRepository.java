package Assignment_1;

import java.util.List;

public interface StudentRepository {
    List<Student> getAllStudents();
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int id);
}
