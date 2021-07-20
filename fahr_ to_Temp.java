 import java.util.Scanner;

class into_celsius{
	
   public static void main(String[] args){
	   double a,c;
	   double d = 9.0;
	   double e = 5.0;
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter temperature in °fahrenheit: ");
    a = sc.nextInt();
        
	sc.close();
    c = (a - 32)*(e/d);
    System.out.println("Tempretucher get in °celsius: "+ c);
		}

}