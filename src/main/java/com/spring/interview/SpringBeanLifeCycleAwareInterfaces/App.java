package com.spring.interview.SpringBeanLifeCycleAwareInterfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello *Aware ---" );
        
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("appcon.xml");
        
        context.getBean("myawareservice",MyAwareService.class);
        context.close();
        
    }
}
