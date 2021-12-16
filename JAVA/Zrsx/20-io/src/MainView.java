import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileUtil util = new FileUtil();
        while (true) {
            System.out.println("***********************************************");
            System.out.println("** dir 显示目录信息                           **");
            System.out.println("** cd 目录名称/..   进入目录/返回上一级         **");
            System.out.println("** mkdir 目录名称   创建目录                   **");
            System.out.println("** createNewFile 文件名  创建文件             **");
            System.out.println("** rename(原名,新名)  重命名                  **");
            System.out.println("** del 目录信息      删除目录                 **");
            System.out.println("** open 文件名      打开文件                  **");
            System.out.println("** edit 文件名 内容 覆盖/追加   编辑内容       **");
            System.out.println("**********************************************");

            System.out.println(util.getCurrFile());
            String opt = reader.readLine();
            String[] cmd = opt.split(" ");
            switch (cmd[0]) {
                case "dir":
                    File[] files = util.dir();
                    System.out.println("最后修改日期\t\t\t类型\t\t文件大小\t\t名称");
                    for (File file : files) {
                        if (!file.isHidden()) {
                            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(file.lastModified());
                            String type = "";
                            String len = "";
                            if (file.isFile()) {
                                type = "文件";
                                len = util.getSize(file.length());
                            } else if (file.isDirectory()) {
                                type = "目录";
                                len = file.list().length + " 项";
                            }
                            System.out.println(time + "\t" + type + "\t\t" + len + "\t\t" + file.getName());
                        }
                    }
                    break;
                case "cd":
                    util.cd(cmd[1]);
                    break;
                case "mkdir":
                    if (util.mkdir(cmd[1])) {
                        System.out.println("创建成功");
                    } else {
                        System.out.println("创建失败");
                    }
                    break;
                case "createNewFile":
                    if (util.createNewFile(cmd[1])) {
                        System.out.println("文件创建成功");
                    } else {
                        System.out.println("文件创建失败");
                    }
                    break;
                case "rename":
                    if (util.rename(cmd[1], cmd[2])) {
                        System.out.println("重命名成功");
                    } else {
                        System.out.println("重命名失败");
                    }
                    break;
                case "del":
                    File tFile = new File(util.getCurrFile(), cmd[1]);
                    if (!tFile.exists()) {
                        System.out.println("目录不存在");
                        break;
                    }
                    util.delFile(tFile);
                default:
                    break;
            }

        }
    }
}
