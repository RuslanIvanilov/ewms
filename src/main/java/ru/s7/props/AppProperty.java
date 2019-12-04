package ru.s7.props;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppProperty extends Properties{

    private AppProperty(){
        try(InputStream input = getClass().getClassLoader().getResourceAsStream(Config.PROPERTIES) ){
            this.load(input);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static class PropertyHolder {
        public static final AppProperty HOLDER_INSTANCE = new AppProperty();
    }

    public static AppProperty getInstance() {
        return PropertyHolder.HOLDER_INSTANCE;
    }

}
