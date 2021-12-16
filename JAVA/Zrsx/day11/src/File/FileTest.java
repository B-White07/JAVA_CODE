package File;

import sun.plugin2.os.windows.FLASHWINFO;
import sun.reflect.generics.tree.SimpleClassTypeSignature;

import java.io.File;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) {
        FileUtil fUtil = new FileUtil();

        System.out.println("\n-------------------模拟cmd-----------------------");
        System.out.println("cd 目录名称/..                  进入目录/返回上一级");
        System.out.println("mkdir 目录名称                  创建目录");
        System.out.println("createNewFile 文件名            创建文件");
        System.out.println("rename 原名 新名                重命名");
        System.out.println("dir                            显示目录信息");
        System.out.println("del 目录信息                    删除目录");
        System.out.println("open 文件名                     打开文件");
        System.out.println("edit 文件名 内容 覆盖/追加       编辑内容");
        System.out.println("exit                           退出");
        System.out.println("-------------------------------------------------");
        System.out.println(FileUtil.getCurrFile());

        FileUtil fu = new FileUtil();

        while (true) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String[] com = str.split(" ");
            switch (com[0]) {
                case "cd":
                    fu.cd(com[1]);
                    break;

                case "mkdir":
                    fu.mkdir(com[1]);
                    break;

                case "createNewFile":
                    fu.createNewFile(com[1]);
                    break;

                case "rename":
                    fu.rename(com[1], com[2]);
                    break;

                case "dir":
                    fu.dir();
                    break;

                case "del":
                    fu.del(com[1]);
                    break;

                case "open":
                    fu.open(com[1]);
                    break;

                case "edit":
                    boolean flag = false;
                    if("true".equals(com[3])){
                        flag = true;
                    } else if ("false".equals(com[3])) {
                        flag = false;
                    }

                    fu.edit(com[1],com[2],flag);
                    break;

                case "exit":
                    System.exit(0);

                default:
                    System.out.println("'" + str + "'" + "\t不是内部或外部命令，也不是可运行的程序\n" +
                            "或批处理文件。");
                    System.out.println(FileUtil.getCurrFile());
                    break;
            }
        }

    }
}
