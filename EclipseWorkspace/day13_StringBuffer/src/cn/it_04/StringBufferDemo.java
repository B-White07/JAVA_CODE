package cn.it_04;

/*
 * StringBuffer 的替换功能
 * public StringBuffer replace(int start,int end,String str)
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		// 创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();

		// 添加内容
		sb.append("hello").append("world").append("java");
		System.out.println("sb:" + sb);

		// public StringBuffer replace(int start,int end,String str)
		// 把world替换成“你好”
		sb.replace(5, 10, "你好");
		System.out.println("sb:" + sb);
	}
}
