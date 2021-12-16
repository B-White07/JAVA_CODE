package UserDao.impl;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import utils.*;
import UserDao.UserDao;

/*
 * 据以实现操作数据库的功能
 */
public class UserDaoImpl implements UserDao {

	@Override
	public boolean findByNameAndPassword(String username) {
		boolean rs = false;
		// 1.创建一个集合接收获取到的数据
		MongoCollection<Document> mongoCollection;
		// 2.创建一个迭代器查询出数据
		FindIterable<Document> findIterable;
		// 3.创建游标，遍历集合中的数据
		MongoCursor<Document> mongoCursor;
		// 4.获取链接
		MongoDatabase con = getConnection.getConMongodb();
		// 5.指定要查询的表，传入的是表名
		mongoCollection = con.getCollection("Student");
		// 6.调用Find方法进行查找
		findIterable = mongoCollection.find();
		// 7.通过游标依次迭代输出到控制台
		mongoCursor = findIterable.iterator();
		while (mongoCursor.hasNext()) {
			Document docum = (Document) mongoCursor.next();
			System.out.println(docum.getString("UserName"));
			if (docum.getString("UserName").equals(username)) {
				rs = true;
				break;
			}

		}
		return false;
	}

}
