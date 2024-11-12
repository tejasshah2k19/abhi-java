import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("C:\\java\\abhi-1\\lab18\\customers.csv");
                BufferedReader br = new BufferedReader(fr);) {

            // BufferedReader br2 = new BufferedReader(new FileReader(""));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
