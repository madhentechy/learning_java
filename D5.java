import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class FileReader {
    public void readFromFile(String filename) {
        try {
            File file = new File("D:BIT.txt");
            Scanner f1 = new Scanner(file);

            while (f1.hasNextLine()) {
                String data = f1.nextLine();
                System.out.println(data);
            }
            f1.close();
        }  catch (FileNotFoundException e) {
            System.out.println("Unexcpected error occurred!" +e.getMessage());
        }
    }
}

class Data{
    public void processData(String filename){
        try{
            FileReader  fileReader=new FileReader();
            fileReader.readFromFile("D:BIT.txt");
            System.out.println("Data procesing is completed.");
        }catch(Exception e){
            System.out.println("Error in processing data: "+e.getMessage());
        }
    }
}

public class D5 {
    public static void main(String[] args) {
        Data dataProcessing = new Data();
        dataProcessing.processData("data.txt"); // Replace "data.txt" with your file name
    }
}