package File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileUtil {
    private static final String ROOT_PATH = "D:\\test\\";
    private static File currFile = new File(ROOT_PATH);

    public static File getCurrFile() {
        return currFile;
    }

    public void cd(String path) {
        File temp = new File(currFile + File.separator + path);
        if ("..".equals(path)) {
            if (currFile.getParentFile() != null) {
                currFile = currFile.getParentFile();
                System.out.println(currFile);
            } else {
                System.out.println(currFile);
            }
        } else if (temp.exists()) {
            currFile = temp;
            System.out.println(currFile);
        } else {
            System.out.println("目录不存在！");
            System.out.println(currFile);
        }

    }

    public void dir() {
        String[] list = currFile.list();
        File[] file = currFile.listFiles();

        /*for (String lists : list) {
            for (File files : file) {
                System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(files.lastModified())
                        + "\t\t" + lists);
            }
            //System.out.println(list);
        }*/
        for (int i = 0, j = 0; i < list.length && j < file.length; i++, j++) {
            if (!file[i].isHidden()) {
                System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file[i].lastModified())
                        + "\t\t" + list[j]);
            }
        }
        System.out.println("\n" + currFile);
    }

    public void mkdir(String dirName) {
        File newNameFile = new File(currFile + File.separator + dirName);
        if (newNameFile.mkdir()) {
            System.out.println(currFile);
        } else {
            System.out.println("请先创建父目录！");
            System.out.println(currFile);
        }
    }

    public void createNewFile(String fileName) {
        File newNameFile = new File(currFile + File.separator + fileName);
        try {
            if (newNameFile.createNewFile()) {
                System.out.println(currFile);
            } else {
                System.out.println("创建失败！");
                System.out.println(currFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void rename(String oriName, String newName) {
        if (new File(currFile + File.separator + oriName)
                .renameTo(new File(currFile + File.separator + newName))) {
            System.out.println(currFile);
        } else {
            System.out.println("重命名失败！");
        }
    }

    public void del(String file){
        File temp = new File(currFile + File.separator + file);
        if(temp.isFile() || (temp.list().length == 0)){
            temp.delete();
            System.out.println(currFile);
        }else{
            System.out.println("删除失败，目标可能不是空目录");
            System.out.println(currFile);
        }

    }

    public void open(String fileName){
        File temp = new File(currFile + File.separator + fileName);
        FileReader reader = null;
        try {
        reader = new FileReader(temp);
        char []c = new char[1024];
        StringBuffer buffer = new StringBuffer();

        int len;
        while((len = reader.read(c)) != -1){
            buffer.append(new String(c,0,len));
        }
            System.out.println(buffer.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader != null) {
                //关闭流
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(currFile);
    }

    public void edit(String fileName,String context,boolean append){
        File temp = new File(currFile + File.separator + fileName);
        FileWriter writer = null;
        try {
            writer = new FileWriter(temp,append);
            writer.write(context);
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(currFile);

    }
}
