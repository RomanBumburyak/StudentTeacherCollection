import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String args []){

        System.out.println("System Beginning . . .");

        //instantiated


        System.out.println("Beginning of Student Instantiation . . .");
//        Student student = new Student("first", "last", 1, 1);
        Student student1 = new Student("ron", "burgundy", 1, 1);
        Student student2 = new Student("rondo", "burg", 2, 1);
        Student student3 = new Student("rambo", "burgle", 3, 1);
        Student student4 = new Student("rondel", "burgund", 4, 1);
        Student student5 = new Student("rex", "burdle", 5, 1);
        Student student6 = new Student("roman", "Bumburyak", 6, 1);
        Student student7 = new Student("brice", "blanch", 7, 1);
        Student student8 = new Student("shikkira", "williams", 8, 1);
        Student student9 = new Student("robby", "duire", 9, 1);
        Student student10 = new Student("will", "rausche", 10, 1);
        Student student11 = new Student("cornelia", "wonokay", 11, 1);
        Student student12 = new Student("isaac", "Hardy", 12, 1);
        Student student13 = new Student("arthur", "bumburyaak", 13, 1);
        Student student14 = new Student("tolik", "constantine", 14, 1);
        Student student15 = new Student("david", "goliath", 15, 1);

        ArrayList<Student> allStudents = new ArrayList<>();
        Set<Student> students = new HashSet<>();
        Set<Student> studentsGroup2 = new HashSet<>();
        Set<Student> studentsGroup3 = new HashSet<>();


        ///I need 15 students
//        allStudents.add(student);

        allStudents.add(student1);
        allStudents.add(student2);
        allStudents.add(student3);
        allStudents.add(student4);
        allStudents.add(student5);
        allStudents.add(student6);
        allStudents.add(student7);
        allStudents.add(student8);
        allStudents.add(student9);
        allStudents.add(student10);
        allStudents.add(student11);
        allStudents.add(student12);
        allStudents.add(student13);
        allStudents.add(student14);
        allStudents.add(student15);


        ////////TEACHER INSTANTIATION


        ArrayList<Teacher> allTeachers = new ArrayList<>();
        Set<Teacher> teachers = new HashSet<>();


        Teacher teacher1 = new Teacher("Kenneth", "King", 16, 1);
        Teacher teacher2 = new Teacher("James", "Jefferson", 17, 1);
        Teacher teacher3 = new Teacher("Jennifer", "Joanne", 18, 1);


        allTeachers.add(teacher1);
        allTeachers.add(teacher2);
        allTeachers.add(teacher3);
        //////TEACHER INSTANTIATION




        ///// Hash Map for Teacher:
        /////Code a HashMap that takes a Teacher for a key and a Set of students for the value (not a List of students).
        ///// Each Teacher will have 5 different students in a HashSet.
        HashMap<Teacher, Set<Student>> hmapForTeacher = new HashMap<>();

///HashSet
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        hmapForTeacher.put("Tj", "JavaTeacher");
///HashSet

        studentsGroup2.add(student6);
        studentsGroup2.add(student7);
        studentsGroup2.add(student8);
        studentsGroup2.add(student9);
        studentsGroup2.add(student10);

        hmapForTeacher.put("Robbie", "Dore");
///HashSet

        studentsGroup3.add(student11);
        studentsGroup3.add(student12);
        studentsGroup3.add(student13);
        studentsGroup3.add(student14);
        studentsGroup3.add(student15);

        hmapForTeacher.put(teacher1, students);


        System.out.println("System End");

    }

}
