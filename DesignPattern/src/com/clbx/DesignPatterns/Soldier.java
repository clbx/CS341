package com.clbx.DesignPatterns;


/**
 * Soldier Ant
 * @author clbx
 *
 */
public class Soldier implements Ant{

	/**
	 * Prints out the ant's job
	 */
	@Override
	public void work() {
		System.out.println("Soldier Ants fight other ants");
	}

}
