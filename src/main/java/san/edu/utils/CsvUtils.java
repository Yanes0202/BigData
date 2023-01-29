package san.edu.utils;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import san.edu.tables.FemaleFullName;
import san.edu.tables.FemaleLastName;
import san.edu.tables.MaleFullName;
import san.edu.tables.MaleLastName;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CsvUtils {

    private CsvUtils(){}

    private static final String PATH = System.getProperty("user.dir") + "/src/main/resources/data/";

    public static List<FemaleLastName> mapFemaleLastName() {
        List<FemaleLastName> objectList = null;
        try {
            CSVReader reader =
                new CSVReaderBuilder(new FileReader(PATH + "femaleLastName.csv"))
                        .withSkipLines(1)
                        .build();
            objectList = reader.readAll().stream().map(data -> {
                FemaleLastName femaleLastName = new FemaleLastName();
                femaleLastName.setLastName(data[0]);
                femaleLastName.setCount(Integer.valueOf(data[1]));
                return femaleLastName;
            }).toList();

        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        return objectList;
    }

    public static List<FemaleFullName> mapFemaleFullName() {
        List<FemaleFullName> objectList = null;
        try {
            CSVReader reader =
                    new CSVReaderBuilder(new FileReader(PATH + "femaleFullName.csv"))
                            .withSkipLines(1)
                            .build();
            objectList = reader.readAll().stream().map(data -> {
                FemaleFullName femaleFullName = new FemaleFullName();
                femaleFullName.setFullName(data[0]);
                femaleFullName.setCount(Integer.valueOf(data[1]));
                return femaleFullName;
            }).toList();

        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        return objectList;
    }

    public static List<MaleLastName> mapMaleLastName() {
        List<MaleLastName> objectList = null;
        try {
            CSVReader reader =
                    new CSVReaderBuilder(new FileReader(PATH + "maleLastName.csv"))
                            .withSkipLines(1)
                            .build();
            objectList = reader.readAll().stream().map(data -> {
                MaleLastName maleLastName = new MaleLastName();
                maleLastName.setLastName(data[0]);
                maleLastName.setCount(Integer.valueOf(data[1]));
                return maleLastName;
            }).toList();

        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        return objectList;
    }

    public static List<MaleFullName> mapMaleFullName() {
        List<MaleFullName> objectList = null;
        try {
            CSVReader reader =
                    new CSVReaderBuilder(new FileReader(PATH + "maleFullName.csv"))
                            .withSkipLines(1)
                            .build();
            objectList = reader.readAll().stream().map(data -> {
                MaleFullName maleFullName = new MaleFullName();
                maleFullName.setFullName(data[0]);
                maleFullName.setCount(Integer.valueOf(data[1]));
                return maleFullName;
            }).toList();

        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        return objectList;
    }
}
