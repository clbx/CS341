package com.clbx.DesignPatterns;


/**
 * Worker Ant
 * @author clbx
 *
 */
public class Worker implements Ant{

	/**
	 * Prints out the ant's job
	 */
	@Override
	public void work() {
		System.out.println("Worker ants get food");		
	}

}
