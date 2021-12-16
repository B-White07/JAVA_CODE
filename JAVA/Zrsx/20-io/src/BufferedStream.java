import java.io.*;

public class BufferedStream {
    public static void main(String[] args) throws IOException {
        //1.指定要操作的文件
        File file = new File("e:" + File.separator + "test.txt");
        //bufferedInput(file);
        //bufferedOutput(file);


    }

    private static void bufferedOutput(File file) throws IOException {
        //2.创建一个输出流的对象
        FileOutputStream fos = new FileOutputStream(file,true);

        //创建一个缓冲流对象
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String str = "你好啊。。。。。";

        bos.write(str.getBytes());
        bos.flush();
        bos.close();
        fos.close();
    }

    private static void bufferedInput(File file) throws IOException {
        //2.指定输入流 FileInputStream
        FileInputStream fis = new FileInputStream(file);
        //创建一个输入流的缓冲流
        BufferedInputStream bis = new BufferedInputStream(fis);

        byte[] b = new byte[1024];

        //读取数据到字节数组中
        int len = bis.read(b);

        System.out.println(new String(b, 0, len));

        //关闭流
        bis.close();
        fis.close();
    }
}
