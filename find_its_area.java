import java.util.Scanner;

class find_its_area{
	
   public static void main(String[] args){
	double a,b,c;

	Scanner sc = new Scanner(System.in);
    System.out.println("Enter Height: ");
    a = sc.nextInt();
	
	System.out.println("Enter Base: ");
    b = sc.nextInt();
        
	sc.close();
    c = 0.5*a*b;
    System.out.println("Total area : "+ c);
		}

}