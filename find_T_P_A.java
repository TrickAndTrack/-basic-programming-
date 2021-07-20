import java.util.Scanner;
/*Write a Java program to enter marks of five subjects and calculate total, average and percentage.*/
class find_T_P_A{
	
   public static void main(String[] args){
	double P,C,M,E,H,Total,Avg,Percentage;
	
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter Physics Marks:");
    P = sc.nextInt();
	System.out.println("Enter Chemistry Marks:");
    C = sc.nextInt();
	System.out.println("Enter Math Marks: ");
    M = sc.nextInt();
	System.out.println("Enter English Marks: ");
    E = sc.nextInt();
	System.out.println("Enter Hindi Marks: ");
    H = sc.nextInt();

	sc.close();
    Total = P+C+M+E+H;
    System.out.println("Total Marks: "+ Total);
	Avg = (P+C+M+E+H)/5;
    System.out.println("Avg. Marks: "+ Avg);
	Percentage = ((P+C+M+E+H)/550)*100;
    System.out.println("Percentage Marks: "+ Percentage);
		}

}