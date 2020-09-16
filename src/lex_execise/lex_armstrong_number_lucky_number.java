package lex_execise;

import java.util.*;

public class lex_armstrong_number_lucky_number {
	
	public static void main(String args[]) {
		int i ;		
		System.out.println("Enter the choice \n 1.To check Armstrong Number \n2.To check lucky number ");
				Scanner input = new Scanner(System.in);
				i = input.nextInt();
				int num = 153;
				
				if (i == 1) {
					
					int temp = 0;
					int temp_1;

					while(num>0 ) {
						
						 temp_1 = num%10;

						 temp = temp + (temp_1*temp_1*temp_1);

						 num = num/10 ;
						 
					}
					
					System.out.println("Using Armstrong "+temp);

				}
				else if (i == 2) {

					int temp = 0;
					int temp_1;

					while(num>0 ) {
						
						temp_1 = num%10 ;

						temp = temp + (temp_1*temp_1) ;

						num = num/10 ;
						 
					}
					
					System.out.println("Using Lucky number"+temp);

				}
				else {
					System.out.println("Invalid input");
				}
					
										
				}
				
					
				
				
}

