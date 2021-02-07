package util;

import java.util.ResourceBundle;

public class PropertyReader {

    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle("config");

    private PropertyReader() {
    }

    public static String getProperty(String propertyName) {
        return RESOURCE_BUNDLE.getString(propertyName);
    }

}
