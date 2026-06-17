import java.util.ArrayList;

public class ReportGenerator {

    public static void generateReport(
            ArrayList<Student> students) {

        if (students.isEmpty()) {

            System.out.println(
                    "No student data.");
            return;
        }

        double highest =
                students.get(0).getGpa();

        double lowest =
                students.get(0).getGpa();

        double total = 0;

        for (Student s : students) {

            if (s.getGpa() > highest)
                highest = s.getGpa();

            if (s.getGpa() < lowest)
                lowest = s.getGpa();

            total += s.getGpa();
        }

        double average =
                total / students.size();

        System.out.println("\n===== REPORT =====");

        System.out.println(
                "Total Students: "
                        + students.size());

        System.out.println(
                "Highest GPA: "
                        + highest);

        System.out.println(
                "Lowest GPA: "
                        + lowest);

        System.out.println(
                "Average GPA: "
                        + average);
    }
}
