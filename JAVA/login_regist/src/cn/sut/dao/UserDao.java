package cn.sut.dao;

import cn.sut.pojo.User;

/**
 * ��������û����в����Ľӿ�
 * 
 * @author B_White
 * @version V1.0
 */
public interface UserDao {
	/**
	 * �����û���¼����
	 * 
	 * @param username �����û���
	 * @param password ��������
	 * @return �����Ƿ�ɹ�
	 */
	public abstract boolean islogin(String username, String password);

	/**
	 * �����û�ע�Ṧ�ܣ����������ʱ��ֱ�Ӵ��ݶ���
	 * 
	 * @param user Ҫע����û���Ϣ
	 */
	public abstract void regist(User user);
}
