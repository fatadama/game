import java.util.Random;

/** Template class for generic 8-sided die */
class fightDie {
	private Random roller = new Random();
	int roll(){
		int val = roller.nextInt(8);
		return val;
	}
}

class evadeDie extends fightDie {
	
}