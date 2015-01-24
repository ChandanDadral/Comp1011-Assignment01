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
	
	//
	public void fight() {
		if(hitAttempt()==true){
			System.out.println(this.name + " attcked and did damage");
			
		}
		
		else{
			System.out.println(this.name + " missed the attack.. Better Luck Next time");
		}
		hitAttempt();
	}
	
	//
	public boolean hitAttempt(){
		
		if((int)Math.random()*10  >= 8){
		
			return true;
		}
		else {
		
			return false;
		}
		
	}
	
	//
	public int hitDamage(){
		
		int damageOccur=0;
		int damageSuffer=0;
		
		damageOccur = (int)(Math.random()*6 +1);
		damageSuffer = this.strength + damageOccur;
		return damageSuffer;
		
		
	}
	
	
	
	
	

}