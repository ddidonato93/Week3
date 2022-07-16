package myfirstassignment;

import java.util.Arrays;

public class names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" }; 
		
		double totalLength = 0.0;
		for (String s : names) {
			totalLength += s.length();
			
		}
		double avg = totalLength / names.length; {
			System.out.println(avg);
		}
		
		  {
			System.out.println(Arrays.toString(names));
		}
	
		
		int[] nameLengths = new int[names.length];
		for ( int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); 
		
		}
		System.out.println(Arrays.toString(nameLengths));
		int sum = 0;
		for( int j = 0; j < nameLengths.length; j++) {
			
			sum = sum + nameLengths[j]; }
		{
			System.out.println(sum);
			
		}
		
		}
	 	
	 		
	 		
	 	 
	 		
	 				
	 		
	 	} 
	 	
	 	
	 	
	 	
	 			
	 	
	
		
	
		
		
		
		

