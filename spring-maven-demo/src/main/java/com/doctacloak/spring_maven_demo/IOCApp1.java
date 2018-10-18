package com.doctacloak.spring_maven_demo;

import org.springframework.context.ApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		// create application context (container)
		ApplicationContext ctx = FileSystemXmlApplicationContext("beans.xml");

	}

}
