package com.hotel.dao;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Connect {
	public static MongoDatabase getComMongodb() {
		MongoClient mongoClient;
		MongoDatabase mongoDatabase;
		mongoClient = new MongoClient("localhost", 27017);
		mongoDatabase = mongoClient.getDatabase("Test");
		return mongoDatabase;

	}
}
