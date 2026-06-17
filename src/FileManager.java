import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FileManager {



    public static void createFiles() {

        try {

            File folder = new File("data");

            if (!folder.exists()) {
                folder.mkdir();
            }


            File textFile =
                    new File("data/students.txt");

            if (!textFile.exists()) {
                textFile.createNewFile();
            }


            File binaryFile =
                    new File("data/students.dat");

            if (!binaryFile.exists()) {
                binaryFile.createNewFile();
            }


            File backupFile =
                    new File("data/students_backup.txt");

            if (!backupFile.exists()) {
                backupFile.createNewFile();
            }


        } catch (IOException e) {

            System.out.println(e.getMessage());

        }
    }




    public static void saveText(
            ArrayList<Student> students) {


        try {


            PrintWriter pw =
                    new PrintWriter(
                            "data/students.txt");



            for(Student s : students){


                pw.println(
                        s.getStudentId() + "," +
                                s.getName() + "," +
                                s.getDepartment() + "," +
                                s.getGpa()
                );

            }


            pw.close();



        } catch(Exception e){

            System.out.println(e.getMessage());

        }

    }





    public static ArrayList<Student> loadText(){


        ArrayList<Student> students =
                new ArrayList<>();


        try{


            Scanner sc =
                    new Scanner(
                            new File(
                                    "data/students.txt"));


            while(sc.hasNextLine()){


                String line =
                        sc.nextLine();


                String data[] =
                        line.split(",");



                students.add(
                        new Student(
                                data[0],
                                data[1],
                                data[2],
                                Double.parseDouble(data[3])
                        ));

            }


            sc.close();



        }catch(Exception e){

            System.out.println(e.getMessage());

        }


        return students;

    }






    public static void saveBinary(
            ArrayList<Student> students){


        try{


            DataOutputStream dos =
                    new DataOutputStream(
                            new FileOutputStream(
                                    "data/students.dat"));



            dos.writeInt(students.size());



            for(Student s : students){


                dos.writeUTF(
                        s.getStudentId());


                dos.writeUTF(
                        s.getName());


                dos.writeUTF(
                        s.getDepartment());


                dos.writeDouble(
                        s.getGpa());

            }



            dos.close();



        }catch(Exception e){

            System.out.println(e.getMessage());

        }

    }






    public static ArrayList<Student> loadBinary(){


        ArrayList<Student> students =
                new ArrayList<>();


        try{


            DataInputStream dis =
                    new DataInputStream(
                            new FileInputStream(
                                    "data/students.dat"));



            int size =
                    dis.readInt();



            for(int i=0;i<size;i++){


                students.add(
                        new Student(
                                dis.readUTF(),
                                dis.readUTF(),
                                dis.readUTF(),
                                dis.readDouble()
                        ));

            }



            dis.close();



        }catch(Exception e){

            System.out.println(e.getMessage());

        }


        return students;

    }







    public static void saveSerialized(
            ArrayList<Student> students){


        try{


            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream(
                                    "data/students.ser"));



            oos.writeObject(students);


            oos.close();



        }catch(Exception e){

            System.out.println(e.getMessage());

        }

    }






    public static ArrayList<Student> loadSerialized(){


        ArrayList<Student> students =
                new ArrayList<>();


        try{


            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream(
                                    "data/students.ser"));



            students =
                    (ArrayList<Student>)
                            ois.readObject();



            ois.close();



        }catch(Exception e){

            System.out.println(e.getMessage());

        }


        return students;

    }








    public static void backupStudents(){


        try{


            BufferedInputStream bis =
                    new BufferedInputStream(
                            new FileInputStream(
                                    "data/students.txt"));



            BufferedOutputStream bos =
                    new BufferedOutputStream(
                            new FileOutputStream(
                                    "data/students_backup.txt"));



            int data;



            while((data = bis.read()) != -1){


                bos.write(data);

            }



            bis.close();

            bos.close();



            System.out.println(
                    "Backup created successfully.");



        }catch(Exception e){

            System.out.println(e.getMessage());

        }

    }








    public static void showFileInfo(){


        File file =
                new File(
                        "data/students.txt");



        System.out.println(
                "Name: "
                        + file.getName());



        System.out.println(
                "Path: "
                        + file.getAbsolutePath());



        System.out.println(
                "Size: "
                        + file.length());



        System.out.println(
                "Modified: "
                        + new Date(
                        file.lastModified()));

    }

}