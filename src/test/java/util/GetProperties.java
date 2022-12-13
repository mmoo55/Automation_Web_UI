package util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class GetProperties {
    private static GetProperties getProperties= null;
    private String browser;
    private String host;
    private String email;
    private String pwd;

    private GetProperties(){
        Properties properties = new Properties();
        String nameFile="ticktick.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
        if(inputStream!= null){
            try {
                properties.load(inputStream);
                browser=properties.getProperty("browser");
                host=properties.getProperty("host");
                email=properties.getProperty("email");
                pwd=properties.getProperty("pwd");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static GetProperties getInstance(){
        if (getProperties == null)
            getProperties=new GetProperties();
        return getProperties;
    }

    public void setProperties() throws IOException {
        String nameFile="ticktick.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
        Properties props = new Properties();
        props.load(inputStream);
        inputStream.close();

        FileOutputStream out = new FileOutputStream("ticktick.properties");
        String projectCreated = "Automation" + new Date().getTime();
        props.setProperty("nameProject", projectCreated);
        props.store(out, null);
        out.close();
    }

    public String getBrowser() {
        return browser;
    }

    public String getHost() {
        return host;
    }

    public String getEmail() {
        return email;
    }

    public String getPwd() {
        return pwd;
    }
}
