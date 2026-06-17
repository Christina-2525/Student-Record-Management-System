public class Main {

    public static void main(String[] args) {


        FileManager.createFiles();



        StudentManager manager =
                new StudentManager();



        manager.addStudent(
                new Student(
                        "S001",
                        "Christina",
                        "Computer Science",
                        3.60
                ));



        manager.addStudent(
                new Student(
                        "S002",
                        "Aya",
                        "Software Engineering",
                        3.90
                ));



        manager.addStudent(
                new Student(
                        "S003",
                        "Sofi",
                        "Information Systems",
                        3.80
                ));




        System.out.println(
                "===== ALL STUDENTS =====");


        manager.displayAllStudents();



        System.out.println(
                "\n===== SEARCH =====");


        Student search =
                manager.searchStudent("S002");


        if(search != null){

            System.out.println(search);

        } else {

            System.out.println(
                    "Student not found");

        }

        manager.updateStudent(
                "S002",
                "Aya Updated",
                "Software Engineering",
                3.95
        );


        manager.deleteStudent("S003");


        System.out.println(
                "\n===== AFTER UPDATE =====");


        manager.displayAllStudents();


        FileManager.saveText(
                manager.getStudents());

        FileManager.saveBinary(
                manager.getStudents());


        FileManager.saveSerialized(
                manager.getStudents());



        FileManager.backupStudents();



        System.out.println(
               "=====FILE INFORMATION=====");


        FileManager.showFileInfo();

        ReportGenerator.generateReport(
                manager.getStudents());




    }

}