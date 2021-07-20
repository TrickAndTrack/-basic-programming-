import java.util.Scanner;

public class digits_sum {

public static void main(String[] args) {
	int n ;
	Scanner sc = new Scanner(System.in);
    n= sc.nextInt();    
	
    int  reversed = 0;
lllo 
    while(n != 0) {
    
      int digit= n%10;
       reversed = reversed * 10 + digit;]

        n  /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}