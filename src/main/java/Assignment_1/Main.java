package Assignment_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepositoryImpl();
        StudentService studentService = new StudentService(studentRepository);
        //Hien thi danh sach hoc sinh
        System.out.println("Danh sách học sinh:");
        List<Student> students = studentService.getAllStudents();

        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge() + ", Mssv =" + student.getMssv());
        }
        //Them hoc sinh moi
        Student newStudent = new Student(1, "Johnson", 20 ,"118");
        studentService.addStudent(newStudent);
        System.out.println("Thêm học sinh mới:" + newStudent.getName());

        //Cap nhat hoc sinh
        Student updatedStudent = new Student(2, "Jane", 19, "116");
        studentService.updateStudent(updatedStudent);
        System.out.println("Cập nhật học sinh:" + updatedStudent.getName());
        // Xoa hoc sinh
        int deleteId = 2;
        studentService.deleteStudent(deleteId);
        System.out.println("Xóa học sinh:" + deleteId);

        System.out.println("Danh sách học sinh khi thay đổi:");
        students = studentService.getAllStudents();
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge() + ", Mssv =" + student.getMssv());
        }
    }
}
