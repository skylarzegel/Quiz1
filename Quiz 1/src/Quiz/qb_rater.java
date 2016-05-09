package Quiz;

import java.util.Scanner;

public class qb_rater {

	public static void main(String[] args){
	
	System.out.println("how many completions?");
	Scanner scan = new Scanner(System.in);
	int z = scan.nextInt();
	System.out.println("how many attempts?");
	int y = scan.nextInt();
	double a = (((z/y) -.3) * 5);
	System.out.println("how many yards?");
	double x = scan.nextDouble();
	double b = (((x/y) - 3) * .25);
	System.out.println("how many touchdowns?");
	int v = scan.nextInt();
	double c = ((v/y) * 20);
	System.out.println("how many interceptions?");
	int t = scan.nextInt();
	double d = (2.375 - (t/y));
	double rating = (((a + b + c + d) / 6) * 100);
	System.out.println("The QB rating is:" + rating);
	}
}
