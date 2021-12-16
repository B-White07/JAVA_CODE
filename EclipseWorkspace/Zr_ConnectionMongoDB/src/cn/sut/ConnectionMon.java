package cn.sut;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class ConnectionMon {

	public static void main(String[] args) {
		// 1.����һ�����Ͻ��ջ�ȡ��������
		MongoCollection<Document> mongoCollection;
		// 2.����һ������������ѯ������
		FindIterable<Document> findIterable;
		// 3.�����αꡣ���������е�����
		MongoCursor<Document> mongoCursor;
		// 4.��ȡ����
		MongoDatabase con = getConMongodb();
		// 5.ָ��Ҫ��ѯ�ı�����Ǳ���
		mongoCollection = con.getCollection("Student");
		// 6.����FIND�������в���
		findIterable = mongoCollection.find();
		// 7.ͨ���α����ε���������ؿ���̨
		mongoCursor = findIterable.iterator();
		// 8.ѭ�����
		while (mongoCursor.hasNext()) {
			Document docum = (Document) mongoCursor.next();
			System.out.println(docum.getString("UserName"));
		}
	}

	// �������ݿ�
	public static MongoDatabase getConMongodb() {
		MongoClient mongoClient;
		MongoDatabase mongoDatabase;
		// 1.�������� ����˿ڼ���������ַ��Ĭ�϶˿�27017
		mongoClient = new MongoClient("localhost", 27017);
		// 2.���������е�ĳ���� ����Ҫ���ӵ����ݿ���
		mongoDatabase = mongoClient.getDatabase("Test");
		System.out.println("Connect to MongoDB SucessFully!");
		return mongoDatabase;
	}

}