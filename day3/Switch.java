package day3;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice");
		int num = sc.nextInt();
		int no = num;
		
		int number1 = 100;
		int number2 = 20;
		int result = 0;
		switch(num)
		{
		case 1 : result = number1 + number2;
			System.out.println("total: "+result);
			break;
		case 2: result = number1 - number2;
			System.out.println("TOTAL: "+result);
			break;
		case 3: result = number1 * number2;
			System.out.println("total: "+result);
			break;
		case 4: result = number1/number2;
			System.out.println("total: "+result);
			break;
		default: System.out.println("Invalid Choice");
		}

	}

}
