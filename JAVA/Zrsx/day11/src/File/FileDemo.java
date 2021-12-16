package File;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileDemo {
    public static void main(String[] args) {
        //创建file对象
        /**
         * windows  \
         * linux    /
         */
        File file = new File("D:" + File.separator + "test" + File.separator + "a");
        System.out.println(file);
        System.out.println(file.exists());  //判断是否存在
        System.out.println(file.isFile());  //判断是否是文件
        System.out.println(file.isDirectory()); //判断是否是目录

//        System.out.println(file.delete());
        System.out.println(file.list());
        for(String lists: file.list()){
            System.out.println(lists);
        }
        //创建文件
        /*try {
            if(file.createNewFile()){
                System.out.println("success!");
            }else{
                System.out.println("fail!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //创建文件夹
//        System.out.println(file.mkdir());   //父目录不存在报错
//        System.out.println(file.mkdirs());  //如果父目录不存在，则创建父目录

        //显示D盘test中的所有内容
        /*String []names = file.list();
        for(String name:names){
            System.out.println(name);
        }*/
//        System.out.println(file.getName());
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified()));
//        System.out.println(file.length());  //获取文件大小（字节），不能获取目录大小

        //System.out.println(file.renameTo(new File("D:" + File.separator + "test" + File.separator + "cc.txt")));
    }
}
