package UserService;
/*
 * service与dao保持一致
 * 通过service调用DAO层的方法
 */
public interface UserService {
	public boolean loginUser(String userName);
}
