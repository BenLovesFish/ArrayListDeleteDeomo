package com.eduask.java;
/**
 * 创建一个学生类，属性是：姓名，年龄，编号，班级
 * a.创建初始化学生信息的构造方法
 * b.封装学生属性信息，重新定义toString()方法，返回学生的详细信息
 * c.创建5个Student对象，并将创建的5个学生对象依次添加到ArrayList对象中
 * 1）.遍历输出学生说的详细信息
 * 2）.查询所有年龄大于18岁的学生信息
 * 3）.查询是否存在名字叫：张三的学生，如果存在则删除，没有存在，则添加一个姓名叫张三的学生
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
