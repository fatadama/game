import java.util.Random;

/** Template class for generic 8-sided die */
class fightDie {
	private Random roller = new Random();
	int roll_me(){
		int val = roller.nextInt(8);
		return val;
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