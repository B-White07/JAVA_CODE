package cn.sut;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class ConnectionMon {

	public static void main(String[] args) {
		// 1.创建一个集合接收获取到的数据
		MongoCollection<Document> mongoCollection;
		// 2.创建一个迭代器来查询出数据
		FindIterable<Document> findIterable;
		// 3.创建游标。遍历集合中的数据
		MongoCursor<Document> mongoCursor;
		// 4.获取连接
		MongoDatabase con = getConMongodb();
		// 5.指定要查询的表传入的是表名
		mongoCollection = con.getCollection("Student");
		// 6.调用FIND方法进行查找
		findIterable = mongoCollection.find();
		// 7.通过游标依次迭代输出到控控制台
		mongoCursor = findIterable.iterator();
		// 8.循环输出
		while (mongoCursor.hasNext()) {
			Document docum = (Document) mongoCursor.next();
			System.out.println(docum.getString("UserName"));
		}
	}

	// 连接数据库
	public static MongoDatabase getConMongodb() {
		MongoClient mongoClient;
		MongoDatabase mongoDatabase;
		// 1.创建连接 传入端口及服务器地址。默认端口27017
		mongoClient = new MongoClient("localhost", 27017);
		// 2.连接数据中的某个表 传入要连接的数据库名
		mongoDatabase = mongoClient.getDatabase("Test");
		System.out.println("Connect to MongoDB SucessFully!");
		return mongoDatabase;
	}

}