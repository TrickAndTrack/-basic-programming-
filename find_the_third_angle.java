import java.util.Scanner;

class find_the_third_angle{
	
   public static void main(String[] args){
	double a,b,c;

	Scanner sc = new Scanner(System.in);
    System.out.println("Enter first angle: ");
    a = sc.nextInt();
	
	System.out.println("Enter seconde angle: ");
    b = sc.nextInt();
        
	sc.close();
    c = 180 - b - a;
    System.out.println("Threed angle is : "+ c);
		}

}