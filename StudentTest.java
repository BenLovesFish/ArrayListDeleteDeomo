package com.eduask.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student("����1",19,101,"java0823");
		Student s2=new Student("����2",17,201,"php0823");
		Student s3=new Student("����",23,307,"seo0823");
		Student s4=new Student("����",33,456,"sem0823");
		Student s5=new Student("С��",14,789,"html0823");
		List<Student>list =new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		//��һ�ֱ���list�ķ�ʽ��ֱ�����list
		System.out.println(list);
		System.out.println("-----------------------------------------------");
		//�ڶ��ֱ���list�ķ�ʽ������ͨforѭ���������������ע�⣺i<list.size();��list.get(i);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("------------------------------------------------");
		//�����ֱ���list�ķ�ʽ������ǿforѭ�����б��������
		for(Student ss:list){
			System.out.println(ss);
		}
		System.out.println("------------------------------------------------");
		//�����ֱ���list�ķ�ʽ����Iterator���������б��������
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()){
			Student s=iterator.next();//ע����Ҫ��iterator.next()��ֵ��һ���������д洢���������ֱ�Ӵ�ӡit.next()ʱ���׳��±�Խ����쳣
			System.out.println(s);
		}
		System.out.println("=================================================");
		//��ѯ�����������18���ѧ��
		//�����õ������������ÿһ��ѧ����Ȼ������ÿһ��ѧ���Ķ���ȥ����ѧ������������ԣ������������������ж����
		Iterator<Student> iterator2 = list.iterator();
		System.out.println("�������18��ѧ���ǣ�");
		while(iterator2.hasNext()){
			Student s=iterator2.next();
			if(s.getAge()>=18){
				System.out.println(s.getName()+"\n");
			}
		}
		System.out.println("=================================================");
		//��ѯ�Ƿ����������������ѧ����������ɾ���������������
		//������Ҫ������ͨ���������ʽ��ȡÿ��ѧ������������ѧ�������ȡѧ�����������ԣ���"����"���бȽ�
		//ͬʱ������Ҫע����ǣ���Ϊ����������ܴ��ڶ����"����"��ѧ�������ԣ�����iֵӦ�÷��������Ӻ���ǰ���б���
		//ͬʱ����һ��countֵ����¼�ȽϵĴ��������count����list.size()˵����������������û�з��ֽ�������ѧ����Ȼ����H�������
		//���ֱ����iterator()�����б����������ӻ���ɾ���Ļ��������CurrentModifyException�쳣
		int count=0;
		for(int i=list.size()-1;i>=0;i--){
			if(list.get(i).getName().equals("����")){
				list.remove(i);
				System.out.println("�����д��ڽ�������ѧ���������Ѿ���ɾ��");
			}else{
				count++;
			}
		}
		if(count==list.size()){
			list.add(new Student("����",11,109,"java0823"));
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		for(Student ss:list){
			System.out.println(ss);
		}
	}
}
