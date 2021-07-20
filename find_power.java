 /*import java.util.Scanner;

class find_power{
   public static void main(String[] args){
	double x,y;
	double  r = 1;
    double i = 1;
	   
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    x = sc.nextInt();
    y = sc.nextInt();    
	sc.close(); 
	while(i <= y)
        {
            r *= x;
            i++;
        }

        System.out.println("\nResult:: " + x + "^" + y + " = " + r + "\n");
	
}

}*/
import java.util.Scanner;

public class find_power{

    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);

        System.out.println("Enter the base & exponent values::\n");

        int b = in.nextInt();
        int e = in.nextInt();
        int r ;

        // b = base
        // e = exponent
        // r = result

        /* finding power of base value by equiping exponent value */
        r = (int)Math.pow(b, e);

        // Output
        System.out.println("\nResult:: " + b + "^" + e + " = " + r + "\n");
    }
}