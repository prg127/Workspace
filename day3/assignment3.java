package day3;
import java.util.Scanner;
public class assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Enter a");
		a = sc.nextInt();
		System.out.println("Enter b");
		b = sc.nextInt();
		System.out.println("Enter c");
		c = sc.nextInt(); 
		
		if(a==7){
			System.out.println(b*c);
		}
		else if(b==7){
			System.out.println(c);
		}
		else if(c==7){
			System.out.println("-1");
		}
		else
			System.out.println(a*b*c);
			
	}

}
