import java.io.File;

public class CopyFileTest {
    public static void main(String[] args) {

        File sourceFile = new File("D:\\RainyDay\\Study\\大数据\\实训\\171203110_李增伟.7Z");
        File targetFile = new File("D:");

        FileUtil.copyFile(sourceFile, targetFile);
    }
}
