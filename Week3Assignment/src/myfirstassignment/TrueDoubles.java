package myfirstassignment;

public class TrueDoubles {

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] cookieCosts = {2.39, 1.99, 5.99, 3.99};
		
		double[] candyBarCosts = {3.40, 5.30, 1.00, 1.76};
		
		double counter = 0.0;
		for (int i = 0; i < cookieCosts.length; i++ ) {
			counter += cookieCosts[i];
		}
		double avg1 = counter / cookieCosts.length; 
		
		for (int i = 0; i < candyBarCosts.length; i++ ) {
			counter += candyBarCosts[i];
		}
		double avg2 = counter / candyBarCosts.length; {
		
		if (avg1 > avg2) {
			return true;
		}
		else {
			return false;
		}
	}

} }
