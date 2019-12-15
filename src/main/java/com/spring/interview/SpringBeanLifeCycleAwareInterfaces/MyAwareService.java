package com.spring.interview.SpringBeanLifeCycleAwareInterfaces;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;

public class MyAwareService implements ApplicationContextAware,ApplicationEventPublisherAware,
BeanClassLoaderAware,BeanFactoryAware,BeanNameAware,EnvironmentAware,ImportAware, ResourceLoaderAware
{

	public void setResourceLoader(ResourceLoader resourceLoader) {
		
		
		System.out.println("SetResourceLoder is invoked");
		Resource resource=resourceLoader.getResource("classpath:appcon.xml");
		System.out.println("resourceLOader: Resource file name is: "+resource.getFilename());
		
	}

	public void setImportMetadata(AnnotationMetadata importMetadata) {
		// TODO Auto-generated method stub
		System.out.println("setImportMetaData");
		System.out.println("Import metaxata is Called");
		
	}

	public void setEnvironment(Environment environment) {
		// TODO Auto-generated method stub
		
		System.out.println("Environment is called");
		
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		
		System.out.println("Bena name is defined in context : "+name);
		
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("Employee bean is singelton :"+beanFactory.isSingleton("employee"));
		
	}

	public void setBeanClassLoader(ClassLoader classLoader) {
		// TODO Auto-generated method stub
		
		System.out.println("ClassLoader name : "+classLoader.getClass().getName());
		
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		
		System.out.println("ApplicationEventPUblisher is invoked");
		
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		
		
		System.out.println("ApplicationContext : Bean Definition names : "+Arrays.toString(applicationContext.getBeanDefinitionNames()));
	}

	
	
}
