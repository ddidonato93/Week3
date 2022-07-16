package myfirstassignment;

public class DoublesAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr = { 4.5, 30.6, 20.25, 5.66, 6.22, 10.73}; {
			double counter = 0.0;
			for (int i = 0; i < arr.length; i++ ) {
				counter += arr[i];
			}
			double avg = counter / arr.length; {
				System.out.println(avg);
			}
		}
	}

}
