package mod1.day2;

public class IfStatemnet {

	public static void main(String[] args) {
	    int number=10;
	    
	    if(number<0) {
	    	System.out.println("postivive number");
	    }
	    else if(number>10) {
	    	System.out.println("negative number");
	    		
	    }
	    else {
	    	System.out.println("else block");
	    }
	    
	    System.out.println("outside block");//it will always print even above statement satisfies
	    

	}

}
