package com.lzw.base64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64Test {
    public static void main(String[] args) throws Exception {
        String content = "这是需要Base64编码的内容";
        //  创建一个base64编码器
        BASE64Encoder base64Encoder = new BASE64Encoder();
        //  执行Base64编码操作
        String encode = base64Encoder.encode(content.getBytes("UTF-8"));
        System.out.println(encode);

        //  创建解码器
        BASE64Decoder base64Decoder = new BASE64Decoder();
        //  解码操作
        byte[] bytes = base64Decoder.decodeBuffer(encode);
        String str = new String(bytes,"UTF-8");
        System.out.println(str);
    }
}
