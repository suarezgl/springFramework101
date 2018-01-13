package com.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessorBean implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String nombre) throws BeansException {
		System.out.println("Despues de Inicializar :" + nombre );
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String nombre) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Antes de Inicializar :" + nombre );
		return bean;
	}

}
