
public class unit {
	/** @brief Constructor */
	public unit(int nhull,int npilot,int nshield, int nevasion, int nshooting){
		hull = nhull;
		pilotSkill = npilot;
		shield = nshield;
		evasion=nevasion;
		shooting=nshooting;
	}
	/** Perform a movement action */
	public void move(){
		return;
	}
	/** Perform a shooting action against a target*/
	public void attack(unit target){
		return;
	}
	/** TODO Perform an evasion roll in response to an attack */
	
	/** @brief Number of hull points */
	public int hull;
	/** @brief Pilot rating */
	public int pilotSkill;
	/** @brief Shield rating */
	public int shield;
	/** @brief Number of evasion die */
	public int evasion;
	/** @brief Number of shooting die */
	public int shooting;
}