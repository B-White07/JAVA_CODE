package UserDao;

/*
 * 底层接口实现功能
 * 接受传递过来的用户名和密码
 * 操作数据库，验证是否存在
 */
public interface UserDao {
	public boolean findByNameAndPassword(String username);
}
