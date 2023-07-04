package hello.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hello.ui.DisplayHello;

public class Program{

	

public static void main(String[] args) {
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("hello/di/setting.xml");
		DisplayHello dh = ac.getBean(DisplayHello.class);
		
		dh.sayHello();
	}

}
