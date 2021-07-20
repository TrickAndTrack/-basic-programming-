import java.util.Scanner;

class find_area{
	
   public static void main(String[] args){
	double a;

	Scanner sc = new Scanner(System.in);
    System.out.println("Enter side: ");
    a = sc.nextInt();
        
	sc.close();
	double  area=(Math.sqrt(3)/4)*(a*a);
     System.out.println("Total area : "+ area);
		}

}