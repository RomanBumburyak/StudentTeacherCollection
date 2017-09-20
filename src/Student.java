import java.util.HashMap;

public class Student {

    String firstName;
    String lastName;
    int id ;
    int grade;


    ///all my getters and setters///


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    ///Constructor///////
    public Student(String firstName, String lastName, int id, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = grade;
    }

    public Student() {
    }

    ////Generate equals(), hashCode() and toString() using IntelliJ.
    // Re-write equals() and hashCode() to use the id variable.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    ///// Hash Map for Teacher:
    /////Code a HashMap that takes a Teacher for a key and a Set of students for the value (not a List of students).
    ///// Each Teacher will have 5 different students in a HashSet.

//    HashMap<Teacher, students> hmapForTeacher = new HashMap<Integer, String>();
//        hmap.put(12, "Chaitanya");








}

