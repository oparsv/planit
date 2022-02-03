package common.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public final class AllureUtils {
    private static final String PATH_ENV_PROP = "target/allure-results/";
    private static final String NAME_ENV_FILE = PATH_ENV_PROP + "environment.properties";

    private AllureUtils() throws IllegalAccessException {
        throw new IllegalAccessException("AllureUtils is utility class!");
    }

    /**
     * Метод для создания environment.properties - настройки запуска тестов в отчёте Allure
     */
    public static void createEnvironmentProperties() {
        try {
            if (!Paths.get(PATH_ENV_PROP).toFile().exists()) {
                Files.createDirectories(Paths.get(PATH_ENV_PROP));
            }
        } catch (IOException e) {

        }

        try (FileOutputStream fos = new FileOutputStream(NAME_ENV_FILE)) {
            Properties props = new Properties();

            props.store(fos, "-- NO COMMENTS--");
        } catch (IOException e) {

        }
    }
}
