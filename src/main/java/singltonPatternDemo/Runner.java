package singltonPatternDemo;

public class Runner {
    public static void main(String[] args) {
        DBConnector db1= DBConnector.createInstance();
        System.out.println(db1);
        DBConnector db2 = DBConnector.createInstance();
        System.out.println(db2);
    }
}
