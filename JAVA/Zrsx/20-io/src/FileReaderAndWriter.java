import java.io.*;
import java.util.Arrays;

public class FileReaderAndWriter {
    public static void main(String[] args) {
        //1.指定要操作的文件路径
        File file = new File("E:", "test.txt");
        //readerFile(file);
        writerFile(file);

    }

    private static void writerFile(File file) {
        //2. 声明一个FileWriter对象
        FileWriter writer = null;

        try {
            //实例化FileWriter对象
            writer = new FileWriter(file, true);

            //写出内容
            writer.write("我不做大哥好多年");

            //刷新
            writer.flush();

            //关闭流
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readerFile(File file) {
        //2.创建一个字符流的输入流
        FileReader reader = null;
        try {
            //实例化对象
            reader = new FileReader(file);

            char[] c = new char[1024];

            StringBuffer buffer = new StringBuffer();
            //3.读取信息
            int len;
            while ((len = reader.read(c)) != -1) {
                buffer.append(new String(c, 0, len));
            }
            System.out.println(buffer.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                //关闭流
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
