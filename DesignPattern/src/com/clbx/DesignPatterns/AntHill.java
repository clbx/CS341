package com.clbx.DesignPatterns;

/**
 * 
 * @author clbx
 *
 */
public class AntHill {
		
	public static void main(String[] args) {
		AntFactory factory = new AntFactory();
		
		//Create our ants using the antfactory
		Ant Charles = factory.createAnt("worker");
		Ant Sally = factory.createAnt("queen");
		Ant Richard = factory.createAnt("soldier");
		Ant Kevin = factory.createAnt("queen");
		
		//Print their jobs like you do
		Charles.work();
		Sally.work();
		Richard.work();
		Kevin.work();
		
		//These show that Kevin and Sally are the same object
		System.out.println(Sally);
		System.out.println(Kevin);
		
	}
	
	
	
}
