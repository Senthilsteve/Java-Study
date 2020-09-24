package lex_execise;

// A Java program to demonstrate working on enum 
// in switch case (Filename Test. Java) 
import java.util.Scanner; 

public class class_enum {

			public int a = 8 ;
	// An Enum class 
	enum Day 
	{ 
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
		THURSDAY, FRIDAY, SATURDAY; 
		  Day() 
		    { 
		        System.out.println("Constructor called for : " + 
		        this.toString()); 
		    } 
	} 

	// Driver class that contains an object of "day" and 
	// main(). 
/*	public class Test 
	{ */
		Day day; 

		// Constructor 
		public class_enum(Day day) 
		{ 
     			this.day = day; 
		} 

		// Prints a line about Day using switch 
		public void dayIsLike() 
		{ 
			switch (day) 
			{ 
			case MONDAY: 
				System.out.println("Mondays are bad."); 
				break; 
			case FRIDAY: 
				System.out.println("Fridays are better."); 
				break; 
			case SATURDAY: 
			case SUNDAY: 
				System.out.println("Weekends are best."); 
				break; 
			default: 
				System.out.println("Midweek days are so-so."); 
				break; 
			} 
		} 

		// Driver method 
		public static void main(String[] args) 
		{ 
			String str = "MONDAY"; 
			//System.out.println(Day.valueOf(str));
			class_enum t1 = new class_enum(Day.valueOf(str)); 
			t1.dayIsLike(); 
			 Integer i = Integer.parseInt("7");
			 //Integer i = Integer.valueOf("7");
			 System.out.println(i);

			//System.out.println(Day.valueOf(str));
			 t1 = new class_enum(Day.valueOf(str)); 
			 Class  c = t1.getClass();
			 System.out.println(c.getName());
			t1.dayIsLike();
			System.out.println(t1);
			System.out.println(t1.toString());
			System.out.println(t1.hashCode());
			System.out.println(t1.a);
		} 
	} 

//}

