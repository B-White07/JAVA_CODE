import java.io.InputStream;
import java.io.OutputStream;

public class IONotepad {
    /**
     * IO流知识：
     * input ,output
     *
     * 流(Stream)：一种传输介质。
     * 输入： 从存储介质（磁盘，U盘等） 读取到内存。
     * 输出： 从内存将内容写入存储介质。
     *
     * 流分类：
     * 按照单位：
     *      字节流 ： 操作的数据 字节
     *      字符流 ： 操作的数据 字符
     * 按照流向：
     *      输入流
     *      输出流
     *
     * 数据流
     * 对象流
     * 转换流
     *
     * ----------------------------------------------------------------------
     * 流的操作步骤：
     * 1. 指定一个要操作的文件的路径（创建一个File对象）
     * 2. 指定流（输入流，输出流）
     * 3. 通过读/写进行内容操作
     * 4. 关闭流
     *
     * -----------------------------------------------------------------------
     * 字节流：
     *   输入流： abstract class InputStream{}
     *
     *   常用方法：
     *        read() : int - InputStream    读取一个字节
     *        read(byte[] b) : int - InputStream  将数据读取到byte数组中，返回读取的长度
     *        read(byte[] b,int offset,int len) : int - InputStream  将数据读取到byte数组中，返回读取的长度
     *
     *         read(参数列表) ： int , 如果返回值为-1，表示读取结束
     *
     *        close(): void - InputStream  : 关闭流
     *        available() : int -InputStrem : 返回可以读取到的个数
     *
     *   常用子类：
     *
     *       FileInputStream, BufferedInputStream, ObjectInputStream
     *
     *
     *  ****************************************************************************
     *  字节流：
     *     输出流： abstract class OutputStream{}
     *
     *       常用方法：
     *          1. write(int) : void - OutputStream  ： 将字节写出到文件中
     *          2. write(byte[] b) : void - OutputStream : 将字节数组写出到文件
     *          3. write(byte[] ,int offset,int len) : void - OutputStream  将字节数组写出到文件
     *          4. flush() : void -  OutputStream   刷新
     *          5. close() : void - OutputStream  关闭流
     *
     *      常用子类：
     *         FileOutputStream, BufferedOutputStream,ObjectOutputStream,PrintStream
     *
     *         FileOutputStream(File file)
     *         FileOutputStream(File file,boolean append)
     *           append: true ,表示追加， false,替换/覆盖  （默认是false）
     *
     *
     *   BufferedXXXXStream: 缓冲流
     *
     *   ObjectInputStream/ObjectOutputStream
     *   readXXXX()/writeXXXX();
     *
     *   readObject() : Object;
     *   writeObject(Object )
     *   要求，对象必须被序列化
     *
     *  如何序列化：
     *    定义一个类，实现Serializable接口即可。
     *
     *   序列化： 将对象的状态信息转换为可以存储或传输的形式的过程
     *   反序列化： 将二进制或者流转换为对象的过程。
     *
     *
     *
     */


}
