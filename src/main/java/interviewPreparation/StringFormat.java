package interviewPreparation;

public class StringFormat {
    public static void main(String[] args) {
        String name = "max";
        int marks = 57;

        System.out.println("Hello " +name+ ", your marks are: " +marks);
        //using printf saves string memory.
        System.out.printf("Hello %s, your marks are %d", name, marks);
    }
}
