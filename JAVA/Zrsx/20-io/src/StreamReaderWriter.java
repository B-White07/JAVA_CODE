import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.util.Scanner;

public class StreamReaderWriter {
    public static void main(String[] args) throws IOException {

        File file = new File("E:", "test.txt");

        /*InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader reader = new BufferedReader(isr);*/

        //读取控制台输入的信息  如何将字节流转换为字符流
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));

        while (true) {
            System.out.println("请输入信息：");
            String str = reader.readLine();

            if ("over".equals(str)) {
                System.out.println("程序退出");
                break;
            }
            writer.write(str);
            writer.flush();

        }

        writer.close();
        reader.close();

    }
}
