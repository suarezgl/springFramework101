package com.spring101.spring;
								   
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.AppConfig;
import com.spring.beans.Mundo;
import com.spring.beans.Persona;

public class App {

	public static void main(String[] args) {
	
	  //XML
	  ApplicationContext appContext = new ClassPathXmlApplicationContext("com/spring/xml/beans.xml");
	  
	  Persona persona = (Persona) appContext.getBean("persona");
	  
	  System.out.print(persona.toString());
	  
	  //cerrando el contexto
	  ((ConfigurableApplicationContext)appContext).close();
	}

}
