package basics_Vers_1;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.print("Hello world");
		System.out.print("without ln");
		System.out.println(); //prints nothing but throws the cursor to the next line  
		System.out.print("hello"+"\n");   
		System.out.print("world" +"\n");   
		
		//String Formatting
		System.out.printf("'%s' %n", "javatpoint");  
		System.out.printf("'%S' %n", "Jack"); 
		
		//Line Separator
		System.out.printf("baeldung%nline%nterminator");
		
		//for more formating visit https://www.baeldung.com/java-printstream-printf
		
		
		
		
//We can also use the methods of the BufferedWriter class or PrintWriter class for performing the output. 
//The performance of these class methods is fast in comparison to PrintStream class method.



	}

}
