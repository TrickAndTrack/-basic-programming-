import java.util.Scanner;
/* five subjects Physics, Chemistry, Biology,
Mathematics and Computer. Calculate percentage and grade according */
class find_Percen{
	
   public static void main(String[] args){
	double P,Ch,B,M,C,Total,Avg,Percentage;
	
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter Physics Marks:");
    P = sc.nextInt();
	System.out.println("Enter Chemistry Marks:");
    Ch = sc.nextInt();
	System.out.println("Enter Biology Marks: ");
    B = sc.nextInt();
	System.out.println("Enter Mathematics Marks: ");
    M = sc.nextInt();
	System.out.println("Enter Computer Marks: ");
    C = sc.nextInt();

	sc.close();
    
	Percentage = ((P+Ch+B+M+C)/550)*100;
    System.out.println("Percentage Marks: "+ Percentage +"%");
	
	if(Percentage >= 90){
		System.out.println("Percentage Grade : Grade A");
	}
	else if(Percentage>= 80){
		System.out.println("Percentage Grade : Grade B");
	}
	else if(Percentage >= 70){
		System.out.println("Percentage Grade : Grade C");
	}
	else if(Percentage >= 60){
		System.out.println("Percentage Grade : Grade D");
	}
	else if(Percentage >= 40){
		System.out.println("Percentage Grade : Grade E");
	}
	else{
		System.out.println("Percentage Grade : Grade F");
		}
  }
}
