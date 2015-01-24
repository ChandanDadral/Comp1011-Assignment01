/**
 * @author Chandan Dadral
 * Program Description: Creating Hero Class with generating random abilities to Hero 
 * and performing fight and damage.
 * @version: 1.0 (January 24, 2015)
 */

public class Hero{
	// PRIVATE PROPERTIES ////////////////////////
	private int strength;
	private int speed;
	private int health;
	
	
	// PUBLIC PROPERTIES /////////////////////////
	public String name;
	
	// CONSTRUCTOR //////////////////////////////
	public Hero(String name) {
		this.name = name;
		
		generateAbilties();
	}
	
	
	// PRIVATE METHODS /////////////////
	private void generateAbilties() {
		this.strength = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
	}
	
	public void fight() {
		if(hitAttempt()==true){
			
		}
		hitAttempt();
	}
	
	public boolean hitAttempt(){
		
		if(Math.random()*10  >= 8){
		
			return true;
	}
		else {
		
			return false;
		}
		
	}
	
	
	

}