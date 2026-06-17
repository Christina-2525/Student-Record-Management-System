# Student Record Management System

## Project Description

This project is a **Student Record Management System** developed using Java.
It uses **Object-Oriented Programming (OOP)** concepts and **Java File I/O** to store, manage, and process student information.

The system allows users to add, search, update, delete, and display student records. It also saves student data using different file handling methods.

---

## Features

### Student Management

* Add new students
* Search student by ID
* Update student information
* Delete student records
* Display all students

### File I/O Features

* Save student data into a text file
* Save data using binary file format
* Save data using object serialization
* Load saved student records
* Create backup files
* Display file information

### Report Generation

The system generates a report showing:

* Total number of students
* Highest GPA
* Lowest GPA
* Average GPA

### GUI Feature

A simple Notepad GUI is included:

* Write notes
* Save notes into a file
* User-friendly interface

---

## Project Structure

```
Student Record Management System

│
├── Main.java
│   - Runs the program
│   - Tests student operations
│
├── Student.java
│   - Student information class
│   - Stores ID, name, department, GPA
│
├── StudentManager.java
│   - Handles student operations
│   - Add, search, update, delete students
│
├── FileManager.java
│   - Handles all file operations
│   - Text, binary, and serialized files
│
├── ReportGenerator.java
│   - Creates GPA reports
│
└── NotepadGUI.java
    - Simple Java Swing GUI application
```

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java File I/O
* Serialization
* Java Swing GUI
* ArrayList
* Exception Handling

---

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure Java JDK is installed.
3. Run `Main.java`.
4. The program will:

   * Create required files
   * Add student records
   * Display students
   * Perform search, update, and delete operations
   * Save files
   * Generate a report

---

## Example Student Data

```
S001 | Christina | Computer Science | GPA: 3.6

S002 | Aya | Software Engineering | GPA: 3.9

S003 | Sofi | Information Systems | GPA: 3.8
```

---

## Files Created

After running the program, a folder named **data** will be created:

```
data/

students.txt
students.dat
students.ser
students_backup.txt
```

These files store the student records.
