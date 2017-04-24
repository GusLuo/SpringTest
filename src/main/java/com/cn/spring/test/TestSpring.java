package com.cn.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cn.spring.one.SpringOne;

public class TestSpring {

	public static void main(String[] args) {
		//使用系统路径方式加载文件
		//ApplicationContext actx = new FileSystemXmlApplicationContext("classpath:config.xml");
		//使用类路径方式加载文件
		ApplicationContext actx = new ClassPathXmlApplicationContext(new String[]{"config.xml"});
		SpringOne so = (SpringOne) actx.getBean("SpringOne");
		System.out.println(so.getMsg()+";"+so.getSex()+";"+so.getName()+";"+so.getEmail());
	}
	
}
