package demo_hibernate1;

import java.util.List;

import demo_hibernate1.dao.StudentDao;
import demo_hibernate1.entity.Student;

public class App {
	public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Student student = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
        studentDao.saveStudent(student);

        List < Student > students = studentDao.getStudents();
        students.forEach(s -> System.out.println(s.getFirstName()));
    }
}
