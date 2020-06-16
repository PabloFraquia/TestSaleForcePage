package operation;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ReadObject {
    static Properties pr = new Properties();
    public static Properties getObjectRepository() throws IOException{
        //Read object repository file
        InputStream stream = new FileInputStream(new File("src\\main\\java\\objects\\object.properties").getAbsolutePath());
        //load all objects
        pr.load(stream);
         return pr;
    }
}
