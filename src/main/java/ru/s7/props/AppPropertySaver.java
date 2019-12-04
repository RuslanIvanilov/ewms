package ru.s7.props;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class AppPropertySaver {
    static File file;

    public static void save(Properties prop, String pathToProperty){
        try {
            file = new File( pathToProperty );
            FileOutputStream fr = new FileOutputStream(file);
            String comments = "";
            prop.store(fr, comments);
            fr.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
