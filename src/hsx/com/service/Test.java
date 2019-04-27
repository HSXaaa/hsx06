package hsx.com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hsx.com.test.HelloWorld;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld helloWorld=(HelloWorld)ac.getBean("helloWorld");
		helloWorld.say();
	}
}
