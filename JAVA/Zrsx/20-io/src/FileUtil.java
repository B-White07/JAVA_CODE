import java.io.*;

public class FileUtil {
    public static void copyFile(File sourceFile, File targetFile) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //创建一个输入流，读取文件内容
            fis = new FileInputStream(sourceFile);
            // 创建一个输入出流，写出内容
            fos = new FileOutputStream(new File(targetFile, sourceFile.getName()));

            byte[] b = new byte[1024 * 4];
            int len;

            while ((len = fis.read(b)) != -1) {
                fos.write(b, 0, len);
                fos.flush();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
