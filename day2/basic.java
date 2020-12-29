package day2;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,s;
		a=100;
		b=200;
		System.out.println(s=a+b);
		System.out.println("s");
		System.out.println("Sum is " + a +" " + b);
		int []mark=new int[5];
		mark[0]=90;
		mark[1]=20;
		mark[2]=30;
		mark[3]=50;
		mark[4]=10;
		for(int counter=0; counter<mark.length; counter++)
		{
			System.out.println(mark[counter]);
		}
		String[] biscuit = {"goodday", "tiger", "oreo"};
//		for(int count=0;count<biscuit.length;count++)
//		{
//			System.out.println(biscuit[count]);
//		}
		for(String name:biscuit)
		{
			System.out.println(name);
		}
	}

}
