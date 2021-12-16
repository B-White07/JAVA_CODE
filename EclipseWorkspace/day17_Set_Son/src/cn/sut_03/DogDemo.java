package cn.sut_03;

import java.util.HashSet;

/*
 * HashSet���ϴ洢�Զ�����󲢱������������ĳ�Ա����ֵ��ͬ��Ϊͬһ������
 * 
 * ע���ˣ�
 * 		��ʹ�õ���HashSet���ϣ�������ϵĵײ��ǹ�ϣ��ṹ��
 * 		����ϣ��ṹ�ײ�����:hashCode()��equals()������
 * 		�������Ϊ����ĳ�Ա����ֵ��ͬ��Ϊͬһ������Ļ������Ӧ����д������������
 * 		�����д��?��ͬ���ģ��Զ����ɼ��ɡ�
 */
public class DogDemo {
	public static void main(String[] args) {
		// �������϶���
		HashSet<Dog> hs = new HashSet<Dog>();

		// ���������Ԫ��
		hs.add(new Dog("lzw", 20, "��ɫ", '��'));
		hs.add(new Dog("lzw", 20, "��ɫ", 'Ů'));
		hs.add(new Dog("lzw", 20, "��ɫ", '��'));
		hs.add(new Dog("lzw1", 22, "��ɫ", '��'));
		hs.add(new Dog("lzw2", 20, "��ɫ", 'Ů'));
		hs.add(new Dog("lzw3", 20, "��ɫ", '��'));
		hs.add(new Dog("lzw3", 20, "��ɫ", '��'));
		hs.add(new Dog("lzw4", 27, "��ɫ", '��'));

		// ��������
		for (Dog d : hs) {
			System.out.println(d.getName() + "---" + d.getAge() + "---" + d.getColor() + "---" + d.getSex());
		}
	}
}
