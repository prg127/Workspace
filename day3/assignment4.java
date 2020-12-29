package day3;
import java.util.Scanner;
public class assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char food;
		int quantity, distance, vf=0, nf=0;
		
		System.out.println("Enter Food Type");
		food = sc.next().charAt(0);
		System.out.println("Enter quantity");
		quantity = sc.nextInt();
		System.out.println("Enter distance");
		distance = sc.nextInt();
		 if(quantity >0 && distance>0){
		switch(distance){
		case 1 : vf = 12*quantity + 0;
				nf = 15*quantity+0;
				break;
		case 2 :  vf = 12*quantity + 0;
				nf = 15*quantity+0;
				break;
		case 3: vf = 12*quantity + 0;
				nf = 15*quantity+0;
				break;
		case 4: vf = 12*quantity + 1;
				nf = 15*quantity + 1;
				break;
		case 5: vf = 12*quantity + 2;
				nf = 15*quantity + 2;
				break;
		case 6: vf = 12*quantity + 3;
				nf = 15*quantity + 3;
				break;
		default: vf = 12*quantity + 2*distance;
				nf = 15*quantity + 2*distance;
				break;
		}
		 	}
		 else
			 System.out.println("-1");
		
		 	if(food=='v')
		 	{
		 			System.out.println(vf);	
		 	}
		 		else if(food=='n')
		 			System.out.println(nf);
		 		else
		 			System.out.println("-1");
	}

}
