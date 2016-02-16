package myclasses;

import org.aspectj.lang.annotation.*;

@Aspect
public class Aspect_test {
	@Pointcut("execution(* myclasses.Telephone.call(..))")
	public void Smth(){}
	
	@Before("Smth()")
	public void startConnection(){
		System.out.println("Connection started");
	}
	
	@AfterReturning("Smth()")
	public void endConnection(){
		System.out.println("end of connection");
	}
	
	@AfterThrowing("Smth()")
	public void errorOfConnection(){
		System.out.println("Failed connection");
	}
	

}
