import java.util.Scanner;

public class first_last {

public static void main(String[] args) {
	int first = 0; 
	int last = 0; 
	int n ;
	int sum;	
	  
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter");
    n = sc.nextInt();    
	
	last = n%10;
	
	while(n != 0)
        {
            first = n % 10;
            n = n / 10;
        }
        System.out.println("First Digit is: " + first);
		
		System.out.println("last Digit is: " + last);
		
		sum = first + last;
		
		System.out.println("sum Digit is: " + sum);
		
		
        }
}

