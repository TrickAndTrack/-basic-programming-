 import java.util.Scanner;

class into_days{
	
   public static void main(String[] args){
	   double a,c;
	   double d;
	   double e;
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter temperature in °fahrenheit: ");
    a = sc.nextInt();
        
	sc.close();
    c = a/7.0;
	d = a/30;
	e = a/365;
    System.out.println( c);
	System.out.println( d);
	System.out.println( e);
		}

}