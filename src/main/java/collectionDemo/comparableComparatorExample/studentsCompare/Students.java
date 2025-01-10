package collectionDemo.comparableComparatorExample.studentsCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Students implements Comparable<Students>{

    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return id == students.id && Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }



    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Students that) {
        if(id == that.id){
            return name.compareTo(that.name);
        }else if(id > that.id){
            return 1;
        }else{
            return -1;
        }

    }


    public static void main(String[] args) {
        List<Students> studentsList = new ArrayList<>();
        Students s1 = new Students(109,"Rishi");
        Students s2 = new Students(101, "Vikrant");
        Students s3 = new Students(99, "Ananya");
        Students s4 = new Students(101, "Rohan");
        Students s5 = new Students(111, "Bhushan");
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s4);
        studentsList.add(s5);

        System.out.println("Before sorting: \n " +studentsList);
        Collections.sort(studentsList);
        System.out.println("<--------------------------->");
//        studentsList.sort(new IdComparator());
        System.out.println("After sorting: \n " +studentsList);

    }





}
