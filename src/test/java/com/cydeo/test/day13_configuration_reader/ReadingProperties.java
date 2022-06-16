package com.cydeo.test.day13_configuration_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file() throws FileNotFoundException {

        // Create Properties class' object.
        // We need properties class to use getProperty("key") method
        Properties properties = new Properties();

      // Create FileInputStream object to open file as a stream in Java memory.
       FileInputStream file = new FileInputStream("configuration.properties");


    }
}
