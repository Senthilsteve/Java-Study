 package lex_execise;

  

  
 class Loan { 
	  public int tenure;
	  public double principal;
	  Loan(){
		  
	  }
	  public Loan(int a , int b) {
	  System.out.println("Constructor loan"); 
	  } 
	  // ... 
	}
  
  class HomeLoan extends Loan {
	  int a = 10;
	  public HomeLoan() {
		  System.out.println("hi  ->Home");
		// TODO Auto-generated constructor stub
	}
	  HomeLoan(int a , int b ) {
		//  super(a,b);
  System.out.println("Constructor HomeLoan");
  } // ...
	  void displsy() {
		  System.out.println("Indide Homelaon");
	  }
}
  
  class   lex_inheritacnce_execrise_loan extends HomeLoan {
	  int a = 15;
	  
	  public lex_inheritacnce_execrise_loan() {
		  //System.out.println("befre call");
		  super();
		  
		  System.out.println("after call");
		// TODO Auto-generated constructor stub
	}
	  lex_inheritacnce_execrise_loan(int a , int b) {
		  //super(3,10,34);
		  System.out.println("Constructor lex_inheritacnce_execrise_loan"+ a);
  } // ... 
	  void disply() {
		  System.out.println("Indide lex");
	  }
  public static void main (String args[]) { 
	  //PlotLoan plot = new PlotLoan();
	  lex_inheritacnce_execrise_loan homelex = new lex_inheritacnce_execrise_loan();
	  System.out.println(homelex.a);
	  homelex.displsy();
	 // lex_inheritacnce_execrise_loan lex = new HomeLoan(3,6);
	  //HomeLoan home = new HomeLoan();
	  //Loan loan = new Loan();
  
  }
  }
  
    
 


 
	/*
	 * class lex_inheritacnce_execrise_loan{ float salary=40000; }
	 * 
	 * class Programmer extends lex_inheritacnce_execrise_loan{ int bonus=10000;
	 * public static void main(String args[]){ Programmer p=new Programmer();
	 * System.out.println("Programmer salary is:"+p.salary);
	 * System.out.println("Bonus of Programmer is:"+p.bonus); } }
	 */
