package org.springframework.spring_context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myclasses.Telephone;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring_bean.xml");
    	Telephone tel = (Telephone)context.getBean("phone");
    	tel.call();
    	Telephone tel1 = (Telephone)context.getBean("phone1");
    	tel1.call();
    	Telephone tel2 = (Telephone)context.getBean("videoPhone");
    	tel2.call();
    	Telephone tel3 = (Telephone)context.getBean("mySuperPh");
    	tel3.call();
    	Telephone tel4 = (Telephone)context.getBean("SuperPuperPhone");
    	tel4.call();
    	Telephone tel5 = (Telephone)context.getBean("SuperPuperPhoneNew");
    	tel5.call();
    	
    	
    }
}
