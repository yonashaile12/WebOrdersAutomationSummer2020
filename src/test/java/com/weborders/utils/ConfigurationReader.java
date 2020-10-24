package com.weborders.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();

    static{
        //try with resources
        //allows to automatically close input stream when objects is not used any more
        //works only for the classes that implement Autocloseable interface
        try(InputStream in = new FileInputStream("configuration.properties")){
            properties.load(in);

        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("Failed to load configuration.properties file!");
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }

}
