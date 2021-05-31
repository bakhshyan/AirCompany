import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoggerSet {
    private static final String LOG_FILE = "Java/src/main/javaLog4jProperties/log4j.properties";

    public Logger settingLogger(String classname) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream(LOG_FILE));
        PropertyConfigurator.configure(properties);
        return Logger.getLogger(classname);
    }
}
