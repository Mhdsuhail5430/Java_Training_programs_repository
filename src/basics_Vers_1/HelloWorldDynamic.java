package basics_Vers_1;

import java.util.Scanner;

public class HelloWorldDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the name ");
		String myname=scan.next();//This will wait for keyboard input from you
		
		System.out.println("welcom to java.."+ myname);
		
	   System.out.println("please input no_1 = ");
	   int no_1=scan.nextInt();
	   
	   System.out.println("please input no_2 = ");		
	   int no_2=scan.nextInt();
	   
	   System.out.println("addition of two no "+no_1+"+"+no_2+"="+(no_1+no_2));

	}

}
