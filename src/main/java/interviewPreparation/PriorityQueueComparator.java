package interviewPreparation;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueComparator {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });
        queue.offer(new Student("Rishi",'B'));
        queue.offer(new Student("Bhushan",'A'));
        queue.offer(new Student("Tarun",'C'));
        queue.offer(new Student("Adarsh",'D'));
        queue.offer(new Student("Vikrant",'A'));

        System.out.printf("Queue is: %s\n" ,queue );
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());


    }





    private static class Student{



        private final String name;
        private final char grade;

        @Override
        public String toString() {
            return "Student{"  + name + '\'' +
                    "," + grade +
                    '}';
        }
        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }


        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }




    }
}
