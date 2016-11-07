
public class driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unit u1 = new unit(9,3,3,3,3);
		evadeDie d1 = new evadeDie();
		//System.out.printf("health1=%d, health2=%d\n",u1.hull,u2.hull);
		System.out.printf("%d\n", d1.roll());
	}

}
