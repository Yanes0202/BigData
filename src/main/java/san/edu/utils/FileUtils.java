package san.edu.utils;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils {

    private static final String PATH = System.getProperty("user.dir") + "/src/main/resources/data/";

    @SneakyThrows
    public static String readFile(String fileName){
        return Files.readString(Paths.get(PATH + fileName + ".txt"));
    }
}
