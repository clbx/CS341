package com.clbx.DesignPatterns;


/**
 * Worker Ant
 * @author clbx
 *
 */
public class Worker implements Ant{

	@Override
	public void work() {
		System.out.println("Worker ants get food");		
	}

}
