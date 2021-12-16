package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStreamDemo {
    public static void main(String[] args) {
        //1.指定要操作的文件路径
        File file = new File("D:" + File.separator + "test" + File.separator + "bb.txt");

        try {
            //2.指定一个字节流的输入流
            FileInputStream fis = new FileInputStream(file);
            //3.通过输入流的read方法，读取内容
            int result = 0;

            result = fis.read();

            System.out.println("result = " + (char) result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
