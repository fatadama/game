import java.util.Vector;


public class unit {
	/** @brief Constructor */
	unit(int nhull,int npilot,int nshield, int nevasion, int nshooting){
		hull = nhull;
		pilotSkill = npilot;
		shield = nshield;
		evasion=nevasion;
		shooting=nshooting;
		X = 0.0f;
		Y = 0.0f;
		heading=0.0f;
	}
	/** @brief Set the position and heading of this guy */
	void setState(float Xi, float Yi, float hdg){
		X = Xi;
		Y = Yi;
		heading = hdg;
	}
	/** Perform a movement action */
	void move(){
		return;
	}
	/** @brief Perform a shooting action against a target
	 * @param[in] d : a dicePool object for making the rolls
	 * @param[in] mod : modifier indicating if we're at long range, short range
	 * @param[out] a Vector of Die enums indicating the result
	 * */
	Vector<Die> attack(dicePool d, int mod){
		return d.attack(mod + shooting);
	}
	/** @brief Perform an evasion roll in response to an attack
	 *  
	 * @param[in] d - a dicePool object for evaluating the roll
	 * @param[in] mod : modifier indicating if we're at long range, short range
	 * @param[out] - a Vector of Die enums
	 * */
	Vector<Die> evade(dicePool d, int mod){
		Vector<Die> result = d.evade(evasion+mod);
		return result;
	}
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
	/** @brief X position */
	private float X;
	private float Y;
	private float heading;
}