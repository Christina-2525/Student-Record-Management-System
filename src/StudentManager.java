import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public Student searchStudent(String id) {

        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public boolean updateStudent(String id,
                                 String name,
                                 String dept,
                                 double gpa) {

        Student s = searchStudent(id);

        if (s != null) {
            s.setName(name);
            s.setDepartment(dept);
            s.setGpa(gpa);
            return true;
        }

        return false;
    }

    public boolean deleteStudent(String id) {

        Student s = searchStudent(id);

        if (s != null) {
            students.remove(s);
            return true;
        }

        return false;
    }

    public void displayAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
