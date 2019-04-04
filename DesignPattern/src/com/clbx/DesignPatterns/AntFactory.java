package com.clbx.DesignPatterns;

import java.util.HashMap;

/**
 *
 * Ant factory for creating ants
 * 
 * @author clbx
 *
 */
public class AntFactory {
	
	/**
	 * The map used to record created ants
	 */
	private final HashMap<String,Ant> ants = new HashMap<String,Ant>();
	
	
	/**
	 * Creates an ant based on the type given. If an ant of the type given has already been created
	 * reference that one instead of making a new object. This is possible since all of the ants in our
	 * program all do the same thing
	 * 
	 * @param type   The type of ant to be created
	 * @return       The new baby ant
	 */
	Ant createAnt(String type) {
		
		Ant ant = null;
		
		//Check to see if that kind of ant has already been created.
		//This way instead of creating a new object each time, it just references the one in the map.
		if(ants.containsKey(type)) {
			ant = ants.get(type);
		}
		else {
			switch(type) {
				case "worker":{
					System.out.println("A new worker ant has been born");
					ant = new Worker();
				}break;
				
				case "soldier":{
					System.out.println("A new soldier ant has been born");
					ant = new Soldier();
				}break;
				
				case "queen":{
					System.out.println("A new queen ant has been born");
					ant = new Queen();
				}break;
				
				default:{
					System.out.print("Invalid Ant Type");
				}
			}
			ants.put(type, ant); //Put in the map for future use
		}
		
		return ant;
	}
}
