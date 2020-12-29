package day2;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//passing two numbers from command line
		//and swaping them through third
		
		int a,b,s;
		a= Integer.parseInt(args[0]);
		b= Integer.parseInt(args[1]);
		//c= Integer.parseInt(arg0)
		s=a;
		a=b;
		b=s;
		System.out.println("New a is "+a);
		System.out.println("New b is "+b);
	}

}
