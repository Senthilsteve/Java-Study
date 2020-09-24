package lex_execise;

 enum Day {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
    private int value;
    private Day(int value) {
          this.value = value;
    }

    public int getValue() {
          return this.value;
    }
}
	class Test<y> 
	{ 
	    // An object of type T is declared 
	    y obj5; 
	    Test(y obj5) {  this.obj5 = obj5;  }  // constructor 
	    public y getObject()  { return this.obj5; } 
	} 
public class TestEnum {

	
    public static void main(String[] args) {
          //for(D000ay day:Day.values()) {
                 // Line 1
        	  //System.out.print(day.name ()+"-");
    	
        // instance of String type 
        Test <Integer> sObj =  new Test<Integer>(15);
         sObj =  new Test<Integer>(18);
        System.out.println(sObj.getObject());
        
    	try {
    		int a = 10/0;
    		System.out.println(a);
    	}
    	catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
    		System.out.println(e.getMessage());
    		System.out.println(e.toString());
    		e.printStackTrace();
    		System.out.println("hi");
    		System.out.println("hi"+e);
		}
    	finally {
			System.out.println("HI");
		}
    	
        try {       
            if(0 == 0)
            throw new Exception("The divisor should not be zero");
        }
        catch(Exception e) {
            System.out.println(e.getMessage()); 
        }
/*        	 // String firstString/* = "String";
        	  StringBuilder secondString = new StringBuilder("String");
        	  
        	  StringBuffer secondString_ = new StringBuffer("String");
        	  System.out.println(firstString.equals(secondString));
        	  System.out.println(secondString.equals(firstString));
        	  
        	  System.out.println(firstString.contains(secondString));
        	  
        	  System.out.println(firstString.equals(secondString_));
        	  System.out.println(secondString_.equals(firstString));
        	  
        	  System.out.println(firstString.contains(secondString_));*/
         //}
    	}
}