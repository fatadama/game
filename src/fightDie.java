import java.util.Random;
import java.util.Vector;

/** Template class for generic 8-sided die */
class fightDie {
	private Random roller = new Random();
	int roll_me(){
		int val = roller.nextInt(8);
		return val;
	}
}

/** Die pool used for evaluating a game. Is a property of the ``game'' not of individual units. Uses a hard limit to the pool size for laziness */
class dicePool{
	private Vector<evadeDie> evadep = new Vector<evadeDie>();
	private Vector<attackDie> attackp = new Vector<attackDie>();
	/** Constructor */
	dicePool(int poolLimit){
		for(int k = 0;k<poolLimit;k++){
			evadep.addElement(new evadeDie());
			attackp.addElement(new attackDie());
		}
	}
	/** Perform an evade roll and return a vector of the results.*/
	Vector<Die> evade(int dice){
		Vector<Die> out  = new Vector<Die>();
		for(int k = 0;k<dice;k++){
			// roll and add to the results
			out.addElement(evadep.get(k).roll());
		}
		return out;
	}
	/** Perform an attack roll and return a vector of the results.*/
	Vector<Die> attack(int dice){
		Vector<Die> out  = new Vector<Die>();
		for(int k = 0;k<dice;k++){
			// roll and add to the results
			out.addElement(attackp.get(k).roll());
		}
		return out;
	}
}

/** Evade die class */
class evadeDie extends fightDie {
	/** Roll a d8 and return a Die Enum value */
	Die roll(){
		// get superclass roll
		int val = super.roll_me();
		if(val < 3){
			//EVADE
			return Die.EVADE;
		}
		else if(val < 5){
			return Die.FOCUS;
			//FOCUS
		}
		else{
			//BLANK
			return Die.BLANK;
		}
	}
}

/** attack die class */
class attackDie extends fightDie {
	/** Roll a d8 and return a Die Enum value */
	Die roll(){
		// get superclass roll
		int val = super.roll_me();
		if(val < 3){
			//HIT
			return Die.HIT;
		}
		else if (val < 4){
			return Die.CRIT;
		}
		else if(val < 6){
			return Die.FOCUS;
			//FOCUS
		}
		else{
			//BLANK
			return Die.BLANK;
		}
	}
}