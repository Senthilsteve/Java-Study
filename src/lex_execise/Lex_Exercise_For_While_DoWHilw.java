package lex_execise;

/**
 * @author Senthil.Aruchamy
 *
 */
public class Lex_Exercise_For_While_DoWHilw {
	
	public static void main (String args[]) {

		/// Three types of loops to find reverse of a number
		
		// For loop  //version 1 
		int num = 712; 
		
		int reverse_number  =  0;
		
		int i = num;
		
		for(;i != 0 ;i/= 10 ) {
			
			int temp = i%10;
			reverse_number=  reverse_number *10 + temp;
					
			
		}
		
		System.out.println("Using for"+reverse_number);
		
		// WHILE LOOP  //version 1
		int temp = 0;
		reverse_number = 0;
		i = num;
		//System.out.println((i<=0));
		while(i>0 ) {
			//System.out.println("True"+i);
			 temp = i%10;
			reverse_number =  reverse_number *10  + temp ;
			i = i/10;
		}
		System.out.println("Using While"+reverse_number);
		
		// DO WHILE LOOP  //version 1
		
		i = num;
		reverse_number = 0;
		temp = 0;
		do {
			//System.out.println("True"+i);
			 temp = i%10;
			reverse_number =  reverse_number *10  + temp ;
			i = i/10;
			
		}while(i>0 );
		System.out.println("Using do ..While"+reverse_number);
	}

}
