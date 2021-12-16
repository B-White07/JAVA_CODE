package com.utils;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class getConnection {
	// 连接数据库
	public static MongoDatabase getConMongodb() {
		MongoClient mongoClient;
		MongoDatabase mongoDatabase;
		// 1.创建连接 传入端口及服务器地址。默认端口27017
		mongoClient = new MongoClient("localhost", 27017);
		// 2.连接数据中的某个表 传入要连接的表
		mongoDatabase = mongoClient.getDatabase("Test");
		System.out.println("Connect to MongoDB SucessFully!");
		return mongoDatabase;
	}
}
