 import java.util.Scanner;

class into_Fahrenheit{
	
   public static void main(String[] args){
	   double a,c;
	   double d = 9.0;
	   double e = 5.0;
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter temperature in °Celsius: ");
    a = sc.nextInt();
        
	sc.close();
    c = (a*(d/e))+32;
    System.out.println("Tempretucher get in °fahrenheit: "+ c);
		}

}