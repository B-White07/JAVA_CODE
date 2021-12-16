import java.io.*;
import java.util.Arrays;

public class FileStreamDemo {
    public static void main(String[] args) {
        //1.指定要操作的文件路径
        File file = new File("E:" + File.separator + "test.txt");
        //outputStreamFile(file);
        //inputStreamFile(file);

        //文件复制？？？？

    }

    private static void outputStreamFile(File file) {
        //2.指定一个字节流的输出流
        FileOutputStream fos = null;
        try {
            //创建输入流对象
            fos = new FileOutputStream(file, true);

            String str = "ten years old.";
            //3.将字节数组中的内容写出到文件中
            fos.write(str.getBytes());

            //刷新
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void inputStreamFile(File file) {
        //2.指定一个字节流的输入流
        FileInputStream fis = null;
        try {
            //创建输入流对象
            fis = new FileInputStream(file);
            //3.通过输入流的read方法，读取内容
            byte[] b = new byte[1024];
            StringBuffer buffer = new StringBuffer();

            /*int result = fis.read(b);
            while (result != -1) {
                buffer.append(new String(b, 0, result));
                result = fis.read(b);
            }*/

            int len;
            while ((len = fis.read(b)) != -1) {
                buffer.append(new String(b, 0, len));
            }

            //字符串和字节数组如何转换。
            System.out.println(buffer.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                //4.关闭流
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
