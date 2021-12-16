import java.io.*;

public class BufferedReaderAndWriter {
    public static void main(String[] args) throws IOException {

        //1.指定一个操作文件路径
        File file = new File("E:", "test.txt");
        //readerBuffered(file);

        writerBuffered(file);


    }

    private static void writerBuffered(File file) throws IOException {
        FileWriter fw = new FileWriter(file, true);

        //创建一个字符流的缓冲流
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("今天是星期三，再有两天。。。。。\n\r");

        bw.flush();

        bw.close();
        fw.close();
    }

    private static void readerBuffered(File file) throws IOException {
        //创建一个字符流的输入流
        FileReader reader = new FileReader(file);

        //创建一个输入流的缓冲流
        BufferedReader br = new BufferedReader(reader);

        StringBuffer buffer = new StringBuffer();

        String str;
        while ((str = br.readLine()) != null) {
            buffer.append(str);
        }

        System.out.println(buffer.toString());

        br.close();
        reader.close();
    }
}
