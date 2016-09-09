package easylevel;

import java.util.Scanner;

public class Calculate {
	public static Scanner read = new Scanner(System.in);
	private double summa(double first){
    System.out.println("Enter summand");
    double second = read.nextDouble();
		return first + second;
	}
	private double divine(double first){
		System.out.println("Enter divider");
		double second  = read.nextDouble();
		return first/second;
	}

	public static void main(String[] args) {
		Calculate cal = new Calculate();
		String exit = ""; 
		int n = 0;
		System.out.println("Enter value");
		double first = read.nextDouble();
		while(!exit.equals("q")){
			System.out.println("1.Summa");
			System.out.println("2.divine");
			n = read.nextInt();
		switch(n){ 
		case 1:
			first = cal.summa(first);
			break;
		case 2:
			first = cal.divine(first);
			break;
			default : 
				System.out.println("Vvedite pravilno");
		}
		System.out.println("Result = "+first);
		System.out.println("Do you want to continue(if not enter q)?");
		exit = read.next();
		}
	}

}
