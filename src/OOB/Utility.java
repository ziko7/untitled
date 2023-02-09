package OOB;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utility {
    public static List<String[]> readFromCSV(String path) {

        List<String[]> list = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String [] st = line.split(",");
                list.add(st);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
