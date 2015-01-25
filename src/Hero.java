/**
 * @author Chandan Dadral
 * Program Description: Creating Hero Class with generating random abilities to Hero 
 * and performing fight and damage.
 * @version: 1.1 (January 24, 2015)
 */

public class Hero{
	// PRIVATE PROPERTIES ////////////////////////
	private int strength;
	private int speed;
	private int health;
	
	
	// PUBLIC PROPERTIES /////////////////////////
	public String name;
	
	// CONSTRUCTOR //////////////////////////////
	/**
	 * Constructor initiates the class and calls generate abilities method as well
	 * @param name Takes the name of the hero
	 * 
	 */
	public Hero(String name) {
		this.name = name;
		
		generateAbilties();
	}
	
	
	// PRIVATE METHODS /////////////////
	/**
	 * This methods randomly generates abilities of heros 
	 */
	private void generateAbilties() {
		this.strength = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
	}
	
	/**
	 * This method generates random possibilities so that hero can hit of or
	 * which is 20 % chances 
	 * @return true or false
	 */
	private boolean hitAttempt(){
		
		if(Math.random()*10 >= 8){
			
			return true;
		}
		else{
			return false;
		}
		
	}
	/**
	 * This methods calculated how much damage occurs if hero hits
	 * @return damageSuffer 
	 */
	private int hitDamage(){
		
		int damageOccur=0;
		int damageSuffer=0;
		
		damageOccur = (int)(Math.random()*6 +1);
		damageSuffer = this.strength * damageOccur;
		return damageSuffer;
			
	}
	
	//PUBLIC METHODS ///////////////////////////////
	/**
	 * This methods calls hitAttemps which means it checks if hitAttempts in true 
	 * then shows damage occurred.
	 */
	public void fight() {
		if(hitAttempt()==true){
			System.out.println(this.name + " attacked and did damage of "+ hitDamage() );
			
		}
		
		else{
			System.out.println(this.name + " missed the attack.. Better Luck Next time");
		}
		
	}
	
	/**
	 * This method prints name , strength, speed and health of hero 
	 */
	public void show(){
		System.out.println("Name: " + this.name + "\nStrength: " + this.strength + "\nSpeed: " + this.speed + "\nHealth: " + this.health);
	}
	
	
	

}