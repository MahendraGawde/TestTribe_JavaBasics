package propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertyFile {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String filePath = System.getProperty("user.dir")+"\\src\\main\\resources\\data\\example.properties";
        FileInputStream file = new FileInputStream(filePath);
        properties.load(file);
        file.close();

        //Read from properties file
        String name = properties.getProperty("name");
        String age = properties.getProperty("age");
        String email = properties.getProperty("email");

        System.out.printf("name : %s\nage :%s\nemail: %s\n", name,age,email);

        //capture all properties
        Set<String> keys =properties.stringPropertyNames();
        System.out.println("<Method1> with string");
        System.out.println(keys);

        //capture properties method2
        Set<Object> allKeys = properties.keySet();
        System.out.println("<Method2> with object keyset");
        System.out.println(allKeys);

        //Capture only values
        Collection<Object> values = properties.values();
        System.out.println("values using collection object");
        System.out.println(values);

        //Reading all property and values
        for(String key : properties.stringPropertyNames()){
            System.out.println(key+ " : " +properties.getProperty(key));
        }

    }
}
