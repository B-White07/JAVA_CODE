import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("E:", "test.txt");

        FileWriter fw = new FileWriter(file, true);
        PrintWriter writer = new PrintWriter(fw);

        writer.print("asdfasf");

        writer.flush();
        writer.close();
    }
}
