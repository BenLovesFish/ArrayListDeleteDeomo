package com.eduask.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student("张三1",19,101,"java0823");
		Student s2=new Student("张三2",17,201,"php0823");
		Student s3=new Student("王五",23,307,"seo0823");
		Student s4=new Student("刘六",33,456,"sem0823");
		Student s5=new Student("小七",14,789,"html0823");
		List<Student>list =new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		//第一种遍历list的方式：直接输出list
		System.out.println(list);
		System.out.println("-----------------------------------------------");
		//第二种遍历list的方式：用普通for循环进行输出，其中注意：i<list.size();与list.get(i);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("------------------------------------------------");
		//第三种遍历list的方式：用增强for循环进行遍历输出：
		for(Student ss:list){
			System.out.println(ss);
		}
		System.out.println("------------------------------------------------");
		//第四种遍历list的方式：用Iterator迭代器进行遍历输出：
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()){
			Student s=iterator.next();//注意需要将iterator.next()赋值给一个变量进行存储，否则最后直接打印it.next()时会抛出下标越界的异常
			System.out.println(s);
		}
		System.out.println("=================================================");
		//查询所有年龄大于18岁的学生
		//首先用迭代器遍历获得每一个学生，然后再用每一个学生的对象去访问学生的年龄的属性，最后根据年龄来进行判断输出
		Iterator<Student> iterator2 = list.iterator();
		System.out.println("年龄大于18的学生是：");
		while(iterator2.hasNext()){
			Student s=iterator2.next();
			if(s.getAge()>=18){
				System.out.println(s.getName()+"\n");
			}
		}
		System.out.println("=================================================");
		//查询是否存在名字是张三的学生，存在则删除，不存在则添加
		//这里需要利用普通数组遍历方式获取每个学生对象，再利用学生对象获取学生的名字属性，与"张三"进行比较
		//同时这里需要注意的是，因为数组里面可能存在多个叫"张三"的学生，所以，这里i值应该反过来，从后往前进行遍历
		//同时定义一个count值来记录比较的次数，如果count等于list.size()说明遍历完整个数组没有发现叫张三的学生，然后徐璈进行添加
		//如果直接用iterator()来进行遍历并做增加或者删除的话，会出现CurrentModifyException异常
		int count=0;
		for(int i=list.size()-1;i>=0;i--){
			if(list.get(i).getName().equals("张三")){
				list.remove(i);
				System.out.println("数组中存在叫张三的学生，并且已经被删除");
			}else{
				count++;
			}
		}
		if(count==list.size()){
			list.add(new Student("张三",11,109,"java0823"));
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		for(Student ss:list){
			System.out.println(ss);
		}
	}
}
