package UserDao.impl;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import UserDao.UserDao;
import utils.getConnection;

public class UserDaoImpl implements UserDao {
	@Override
	public boolean findByNameAndPassword(String username) {

		boolean rs = false;
		// 1.创建一个集合接收获取到的数据
		MongoCollection<Document> mongoCollection;
		// 2.创建一个迭代器来查询出数据
		FindIterable<Document> findIterable;
		// 3.创建游标。遍历集合中的数据
		MongoCursor<Document> mongoCursor;
		// 4.获取连接
		MongoDatabase con = getConnection.getConMongodb();
		// 5.指定要查询的表传入的是表名
		mongoCollection = con.getCollection("Student");
		// 6.调用FIND方法进行查找
		findIterable = mongoCollection.find();
		// 7.通过游标依次迭代输出到控控制台
		mongoCursor = findIterable.iterator();
		System.out.println("----------------");
		while (mongoCursor.hasNext()) {
			System.out.println("----------------");
			Document docum = (Document) mongoCursor.next();
			System.out.println(docum.getString("UserName"));
			if (docum.getString("UserName").equals(username)) {
				rs = true;
				break;
			}
		}
		return rs;
	}
}
