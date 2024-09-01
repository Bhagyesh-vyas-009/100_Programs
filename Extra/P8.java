import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class P8 {
    public static void main(String[] args) {
           try{
            String content = new String(Files.readAllBytes(Paths.get("Extra/P8.java")));
            FileWriter fw = new FileWriter("Code.txt");
            fw.write(content);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
