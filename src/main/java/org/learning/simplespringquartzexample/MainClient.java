package org.learning.simplespringquartzexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClient {

	public static void main(String[] args) {

		new ClassPathXmlApplicationContext("spring.xml");

	}

}
