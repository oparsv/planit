package common.utils;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Properties;


public final class PropertyUtils {

    /** ссылка на файл настроек приложения */
    private static final String APP_PROPERTIES_URL = "app.properties";

    /** кодировка файла настроек по-умолчанию */
    private static final Charset APP_PROPERTIES_CHARSET = Charset.forName("UTF-8");

    private static final Properties properties = new Properties();


    /** Загрузка файла при первом обращении к классу PropertyUtils */
    static {
        try (Reader reader = Files.newReader(new File(APP_PROPERTIES_URL), APP_PROPERTIES_CHARSET)) {
            properties.load(reader);
        } catch (IOException e) {

        }
    }

    private PropertyUtils() throws IllegalAccessException {
        throw new IllegalAccessException("PropertyUtils is utility class!");
    }

    /** Метод возвращает значение настройки по ключу */
    public static String getProperty(String propertyKey) {

        return properties.getProperty(propertyKey);
    }

    /** Метод возвращает значение настройки по ключу */
    public static String prop(String propertyKey) {
        return getProperty(propertyKey);
    }

    /** Метод возвращает значение настройки по ключу. Со значением по-умолчанию! */
    public static String prop(String propertyKey, String defaultValue) {
        String value = getProperty(propertyKey);
        return value == null ? defaultValue : value;
    }

    /**
     * Метод возвращает значение типа Boolean настройки по ключу
     * Если getProperty == "true" то вернётся true
     * Если getProperty != "true" (в том числе null) то вернётся false
     **/
    public static Boolean getBooleanProperty(String propertyKey) {
        return Boolean.valueOf(getProperty(propertyKey));
    }

    /**
     * Метод установливает значение настройки по ключу
     * @param propertyKey - ключ настройки
     * @param propertyValue - значение настройки
     */
    public static void setProperty(String propertyKey, String propertyValue) {
        properties.setProperty(propertyKey, propertyValue);
    }
}
