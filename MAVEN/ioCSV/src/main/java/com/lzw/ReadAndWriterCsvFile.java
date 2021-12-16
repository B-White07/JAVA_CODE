package com.lzw;

import com.csvreader.CsvWriter;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ReadAndWriterCsvFile {

    // 需要写入的 csv 文件路径
    public static final String WRITE_CSV_FILE_PATH = "D:\\DevelopmentTools\\JetBrains\\IdeaProjects\\MAVEN\\Test\\time.csv";

    /**
     * 生成 csv 文件
     */
    public static void writeCsvFile(String writeCsvFilePath) {
        // 创建 CSV Writer 对象, 参数说明（写入的文件路径，分隔符，编码格式)
        CsvWriter csvWriter = new CsvWriter(writeCsvFilePath,',', Charset.forName("GBK"));

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

        try {
            // 定义 header 头
            String[] headers = {"时间"};
            // 写入 header 头
            csvWriter.writeRecord(headers);

            // 写入一千条记录
            for (int i = 0; i < 100; i++) {
                String orderNum = df.format(new Date()) + "---" + i;

                // 写入行
                csvWriter.writeRecord((String[])Arrays.asList(orderNum).toArray());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            csvWriter.close();
        }
    }

    public static void main(String[] args) {
        writeCsvFile(WRITE_CSV_FILE_PATH);
    }
}