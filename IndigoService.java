
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IndigoService {

    public List<Indigo> getFlights() throws IndigoException,IndigoFileException {
        List<Indigo> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\madha\\Desktop\\JAVAFRAMEWORK\\DAYSKILL\\src\\Flight.txt"))) {
            String line = br.readLine();
            while (line != null) {
                String[] arr = line.split("\\|");
                list.add(new Indigo(arr[0], arr[1], arr[2], arr[3]));

                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new IndigoFileException();

        } catch (IOException e) {
            throw new IndigoException();

        }
        return list;
    }
}



