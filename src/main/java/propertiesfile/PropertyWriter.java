package propertiesfile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyWriter {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("name","mahi");
        properties.setProperty("email","mahiuni2012@gmail.com");
        properties.setProperty("age","33");

        String filePath = System.getProperty("user.dir")+"\\src\\main\\resources\\data\\example.properties";

        //src\main\resources\data\example.properties

        FileOutputStream file = new FileOutputStream(filePath);
        properties.store(file, "Sample data in properties file.");
        file.close();
        System.out.println("Properties have been written into " +filePath);


    }
}
