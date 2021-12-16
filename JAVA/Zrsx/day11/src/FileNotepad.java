public class FileNotepad {
    /**
     *
     * I/O操作
     * input / output
     *
     * File 文件类
     *
     * 指的是磁盘上的一个文件或者是一个目录(文件夹)
     *
     * 静态属性：
     *  separator ： 路径中分隔符（/ \）
     *
     * 构造方法：
     * 1. File(String path) :
     * 2. File(String parent,String name)
     * 3. File(File parent,String name)
     *
     * 常用成员方法：
     * 1. exists(): boolean - File  判断文件或者目录是否存在
     * 2. isFile() : boolean -File  判断File是否是一个文件
     * 3. isDirectory:boolean - File  判断File是否是一个目录
     * 4. createNewFile():boolean -File 创建文件，返回true则为创建成功，否则失败
     * 5. mkdir():boolean -File 创建目录（要求父目录一定要存在）
     * 6. mkdirs():boolean -File 创建目录（如果父目录不存在，则将父目录一同创建出来）
     * 7. getName():String-File 返回指定路径的文件或者目录名称
     * 8. lastModified():long - File 返回指定的文件或者目录的最后修改日期
     * 9. length() : long - File  返回文件的大小，单位字节
     * 10.renameTo():boolean - File  重命名文件或者是目录
     * 11.getAbsoluteFile(): File -File 返回当前指定路径的绝对路径
     * 12.getAbsolutePath(): String -File 返回当前指定路径的绝对路径
     * 13.getParent(): String - File 返回当前目录的父目录
     * 13.getParentFile(): File - File 返回当前目录的父目录
     * 14.delete() : boolean - File 删除当前的文件或者是目录
     *                              注意：只能删除单个文件或者空目录
     *
     *                              递归：
     * 15.canRead(): boolean - File 判断文件是否可读取
     * 16.canWrite(): boolean - File 判断文件是否可写入
     * 17.isHidden(): boolean - File 判断文件是否隐藏
     * 18.list(): String[] - File 返回当前目录下所有文件或者文件夹的名称
     * 19.listFiles(): File[] - File 返回当前目录下所有的路径
     *
     *
     *
     *
     *
     */
}
