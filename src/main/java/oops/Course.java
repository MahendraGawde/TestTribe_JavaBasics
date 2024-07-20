package oops;

//Design Course KG coding
public class Course {
    static int maxCapacity = 100;
    String courseName;
    int totalEnrollments;

    String[] enrolledStudents;

    static{
        maxCapacity = 0;
    }

    {//Object init
        maxCapacity++;
    }

    Course(String courseName){
        this.courseName = courseName;
        this.totalEnrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }



    public void enrolledStudent(String studentName){
        enrolledStudents[totalEnrollments] = studentName;
        totalEnrollments++;
    }

    public void unenrollStudent(String studentName){
        totalEnrollments--;
    }

    public static void  setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }
}
