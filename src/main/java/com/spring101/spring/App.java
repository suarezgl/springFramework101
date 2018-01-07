package com.spring101.spring;
								   
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.beans.Persona;

public class App {

	public static void main(String[] args) {
	
	  //XML
	  ApplicationContext appContext = new ClassPathXmlApplicationContext("com/spring/xml/beans.xml");
	  
	  Persona persona = (Persona) appContext.getBean("persona");
	  Persona persona2 = (Persona) appContext.getBean("persona");

	  System.out.println(persona);
	  System.out.println(persona2);
	  
	  //cerrando el contexto
	  ((ConfigurableApplicationContext)appContext).close();
	}

}
