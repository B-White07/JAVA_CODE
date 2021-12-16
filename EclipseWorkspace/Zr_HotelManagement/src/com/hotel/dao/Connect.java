package com.hotel.dao;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Connect {
	public static MongoDatabase getComMongodb() {
		MongoClient mongoClient;
		MongoDatabase mongoDatabase = null;
		mongoClient = new MongoClient();
		
		return mongoDatabase;
	}
}
