package org.daniel.springtry;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Triangle triangle = new Triangle();
		//BeanFactory factory = new FileSystemXmlApplicationContext("beanconf.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("beanconf.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();

	}

}
