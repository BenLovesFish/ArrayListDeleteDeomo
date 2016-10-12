package com.eduask.java;
/**
 * ����һ��ѧ���࣬�����ǣ����������䣬��ţ��༶
 * a.������ʼ��ѧ����Ϣ�Ĺ��췽��
 * b.��װѧ��������Ϣ�����¶���toString()����������ѧ������ϸ��Ϣ
 * c.����5��Student���󣬲���������5��ѧ������������ӵ�ArrayList������
 * 1��.�������ѧ��˵����ϸ��Ϣ
 * 2��.��ѯ�����������18���ѧ����Ϣ
 * 3��.��ѯ�Ƿ�������ֽУ�������ѧ�������������ɾ����û�д��ڣ������һ��������������ѧ��
 * */
public class Student {
	private String name;
	private int age;
	private int id;
	private String className;
	public Student(String name, int age, int id, String className) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.className = className;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", id=" + id
				+ ", className=" + className ;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result
				+ ((className == null) ? 0 : className.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (className == null) {
			if (other.className != null)
				return false;
		} else if (!className.equals(other.className))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
