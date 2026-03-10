

import com.assignment.dao.StudentDao;
import com.assignment.dao.StudentDaoImp;
import com.assignment.model.Student;
import com.assignment.util.DBUtil;

import java.util.List;

public class Main {

    public static void main(String[] args) {
    	DBUtil.createTable();

        StudentDao dao = new StudentDaoImp();

   
        Student s1 = new Student("Anoushka", "anoushka@gmail.com", 95);
        dao.addStudent(s1);

       
        Student student = dao.getStudentById(1);
        System.out.println(student);

        
        List<Student> students = dao.getAllStudents();

        for (Student s : students) {
            System.out.println(s);
        }

        Student s2 = new Student(1, "Anoushka", "anoushka@gmail.com", 98);
        dao.updateStudent(s2);

       
        dao.deleteStudent(2);
    }
}