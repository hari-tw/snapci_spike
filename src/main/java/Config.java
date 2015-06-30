import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;


public class Config {

    public String getConnectionString() throws IOException {

        ResourceBundle rb = ResourceBundle.getBundle("config");
        System.out.println(rb.getBaseBundleName());
        return rb.getString("connectionString");

    }
}
