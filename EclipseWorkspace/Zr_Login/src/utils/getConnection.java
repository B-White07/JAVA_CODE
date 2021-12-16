package utils;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class getConnection {
	
	
	//连接数据库
	public static MongoDatabase getConMongodb() {
		MongoClient mongoClient;
		MongoDatabase mongoDatabase;
		mongoClient = new MongoClient("localhost",27017);
		mongoDatabase = mongoClient.getDatabase("Test");
		System.out.println("Connect to MongoDB Successfully!");
		return mongoDatabase;
	}
}
