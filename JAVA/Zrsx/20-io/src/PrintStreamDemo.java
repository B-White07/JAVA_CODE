import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {


        PrintStream pm = System.out;

        //1.指定操作的文件
        File file = new File("e:\\test.txt");

        FileOutputStream fos = new FileOutputStream(file, true);
        PrintStream ps = new PrintStream(fos, true);

        System.setOut(ps);


        System.out.println("哈哈哈哈哈哈1");
        System.out.println("哈哈哈哈哈哈2");


        System.setOut(pm);
        System.out.println("over");


    }
}
