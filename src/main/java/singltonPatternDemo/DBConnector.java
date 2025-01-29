package singltonPatternDemo;

public class DBConnector{
    private static DBConnector db;
    private DBConnector(){
        System.out.println("Db connector constructor");
    }
    public static DBConnector createInstance(){
        if(db == null){
            synchronized (DBConnector.class) {
                if (db == null) {
                    db = new DBConnector();
                }
            }

        }
        return db;
    }
}
